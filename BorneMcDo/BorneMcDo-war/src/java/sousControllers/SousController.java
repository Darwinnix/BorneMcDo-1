package sousControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface SousController {
    
    public String Execute(HttpServletRequest request, HttpServletResponse response);

}
