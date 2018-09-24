package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sousControllers.SousController;


@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {
    HashMap<String, SousController> map;
    @Override
    public void init() throws ServletException {
        super.init();
        map = new HashMap();
        for (Enumeration<String> e = this.getInitParameterNames(); e.hasMoreElements();) {
            String name = e.nextElement();
            String value = this.getInitParameter(name);
            try {
                SousController sc = (SousController) Class.forName(value).newInstance();
                map.put(name, sc);
            } catch (ClassNotFoundException ex) {
                System.err.println(" !!! ERREUR >> CLASS NOT FOUND : " + ex.getMessage());
            } catch (InstantiationException ex) {
                System.err.println(" !!! ERREUR >> INSTANTIATION : " + ex.getMessage());
            } catch (IllegalAccessException ex) {
                System.err.println(" !!! ERREUR >> ILLEGAL ACCESS : " + ex.getMessage());
            }
            
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = "/WEB-INF/Accueil.jsp";
        if (request.getParameter("section") != null) {
            String name = request.getParameter("section");
            if (map.containsKey(name)) {
                SousController sc = map.get(name);
                url = sc.Execute(request, response);
            }
        }
        
        
        
        
        request.getRequestDispatcher(url).include(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
