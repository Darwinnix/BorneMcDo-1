package sousControllers;

import ejb.CreationJeuEssaiLocal;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CreationJeuEssaiCtrl implements SousController, Serializable{

    CreationJeuEssaiLocal creationJeuEssai = lookupCreationJeuEssaiLocal();

    private CreationJeuEssaiLocal lookupCreationJeuEssaiLocal() {
        try {
            Context c = new InitialContext();
            return (CreationJeuEssaiLocal) c.lookup("java:global/BorneMcDo/BorneMcDo-ejb/CreationJeuEssai!ejb.CreationJeuEssaiLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    @Override
    public String Execute(HttpServletRequest request, HttpServletResponse response) {
        CreationJeuEssaiLocal jeu = lookupCreationJeuEssaiLocal();
        jeu.creerDonnees();
        request.setAttribute("message", "création des données réussie");
        return "/WEB-INF/Accueil.jsp";
    }
    
    

    
}
