package sousControllers;

import ejb.GestionCommandeLocal;
import ejb.GestionPanierLocal;
import entites.Choix;
import entites.Commande;
import entites.Preference;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ScCommande implements SousController {

    GestionPanierLocal gestionPanier = lookupGestionPanierLocal();

    GestionCommandeLocal gestionCommande = lookupGestionCommandeLocal();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String url = "/WEB-INF/ConfCommande.jsp";
        GestionCommandeLocal command = lookupGestionCommandeLocal();
        GestionPanierLocal panier = lookupGestionPanierLocal();
        List<Commande> lc = command.recupererCommandesEnPrep();
        request.setAttribute("comEnPrepa", lc);
        HttpSession session = request.getSession();
        Preference p = (Preference) session.getAttribute("prefConso");
        String ref = request.getParameter("ref");
        if (ref == null) {
            url = "/WEB-INF/ConfCommande.jsp";
        }
        if ("conf".equals(ref)) {
            url = "/WEB-INF/Paiement.jsp";
        }
        if ("cancel".equals(ref)) {
            url = "/WEB-INF/Catalogue.jsp";
        }
        if ("control".equals(ref)) {
            url = "/WEB-INF/EcranBack.jsp";
        }

        if (session.getAttribute("panier") == null) {
            session.setAttribute("panier", panier);
        } else {
            panier = (GestionPanierLocal) session.getAttribute("panier");
        }

        List<Choix> lch = new ArrayList();
//
//        if (panier.getMonPanier().isEmpty()) {
//            request.setAttribute("panierVide", "Aucune commande en cours");
//        } else {
        lch = panier.getMonPanier();
        request.setAttribute("panier", lch);
//        }

        List<Choix> lesBurgers = command.GetChoixBurger(lch);
        request.setAttribute("sandwichs", lesBurgers);
        request.setAttribute("noSandwich", lesBurgers.isEmpty());
        request.setAttribute("nbSandwichs", lesBurgers.size());

        List<Choix> lesAccomp = command.getChoixAccomp(lch);
        request.setAttribute("frites", lesAccomp);
        request.setAttribute("noFrites", lesAccomp.isEmpty());
        request.setAttribute("nbFrites", lesAccomp.size());

        List<Choix> lesDesserts = command.getChoixDessert(lch);
        request.setAttribute("desserts", lesDesserts);
        request.setAttribute("noDesserts", lesDesserts.isEmpty());
        request.setAttribute("nbDesserts", lesDesserts.size());

        List<Choix> lesCadeaux = command.getChoixCadeau(lch);
        request.setAttribute("cadeaux", lesCadeaux);
        request.setAttribute("noCadeaux", lesCadeaux.isEmpty());
        request.setAttribute("nbCadeaux", lesCadeaux.size());

        List<Choix> lesBoissons = command.getChoixBoisson(lch);
        request.setAttribute("boissons", lesBoissons);
        request.setAttribute("noBoissons", lesBoissons.isEmpty());
        request.setAttribute("nbBoissons", lesBoissons.size());

        List<Choix> lesSauces = command.getChoixSauce(lch);
        request.setAttribute("sauces", lesSauces);
        request.setAttribute("noSauces", lesSauces.isEmpty());
        request.setAttribute("nbSauces", lesSauces.size());

        List<Choix> lesSalades = command.getChoixSalade(lch);
        request.setAttribute("salades", lesSalades);
        request.setAttribute("noSalades", lesSalades.isEmpty());
        request.setAttribute("nbSalades", lesSalades.size());

        String idCourt = command.genererIdCourt();
        request.setAttribute("idCourt", idCourt);

        if ("payOk".equals(ref)) {
            command.creerCommande(lch, idCourt, p);
            url = "WEB-INF/CommandeOk.jsp";
        }
        if ("quit".equals(ref)) {
            session.removeAttribute("panier");
            url = "/WEB-INF/PrefSurPlace.jsp";
        }

        List<Commande> lesCom = command.recupererCommandesEnPrep();
        for (Commande co : lesCom) {
            co.setLesChoix(command.recupererChoixCommande(co.getId()));
        }
        request.setAttribute("comEnPrepa", lesCom);
        if (lesCom.isEmpty()) {
            request.setAttribute("panierVide", "Aucune commande en cours");
        } else {
            request.setAttribute("panierVide", "");
        }

        if ("comLivree".equals(ref)) {
            command.updateCommandeLivree(Long.valueOf(request.getParameter("comId")));
            url = "/WEB-INF/EcranBack.jsp";
        }

        return url;
    }

    private GestionCommandeLocal lookupGestionCommandeLocal() {
        try {
            Context c = new InitialContext();
            return (GestionCommandeLocal) c.lookup("java:global/BorneMcDo/BorneMcDo-ejb/GestionCommande!ejb.GestionCommandeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private GestionPanierLocal lookupGestionPanierLocal() {
        try {
            Context c = new InitialContext();
            return (GestionPanierLocal) c.lookup("java:global/BorneMcDo/BorneMcDo-ejb/GestionPanier!ejb.GestionPanierLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
