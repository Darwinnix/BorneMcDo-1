<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<div class="panier-lat">
    <p> Votre commande : </p>
    <p>Prix total : <fmt:formatNumber value="${prixTotal}" type="currency"/><br></p>
    <hr/>
    <p>${panierVide}</p>


    <c:forEach var="a" items="${listeArticle}">
        <p>${a.nom} <a class="btn btn-comlivre enlever" href="">X</a></p>
    </c:forEach>
        <a href='Controller?section=ScCommande' class="btn btn-comlivre" style="margin-top: 10px; margin-bottom: 10px;">Confirmer</a>
</div>