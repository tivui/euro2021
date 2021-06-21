<%-- 
    Document   : groupes
    Created on : 16 juin 2021, 17:46:09
    Author     : stag
--%>

<%@page import="fr.menu.modele.EquipeComparator"%>
<%@page import="java.util.Collections"%>
<%@page import="fr.menu.modele.ClassementComparator"%>
<%@page import="fr.menu.modele.TeamsBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <title>Groupes</title>
    </head>
    <body>
        <%@ include file="entete.jsp" %>
        <%
            TeamsBean equipes = (TeamsBean) application.getAttribute("equipes");

        %>
        <h1>Groupes et classements</h1>

        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-6 col-md-6 col-12">
                    <div class="classement">
                        <h3>Groupe A</h3>
                        <%@ include file="enteteTableau.html" %>
                        <tbody>
                            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                            <c:set var="count" value="0" scope="page" />
                            <c:forEach items="${equipes.equipesClassementListe}" var="equipe">
                                <c:if test="${equipe.groupe == 'A'}"> 
                                    <%@ include file="contenuTableau.html" %>
                                </c:if> 
                            </c:forEach>
                        </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-12">
                    <div class="classement">
                        <h3>Groupe B</h3>
                        <%@ include file="enteteTableau.html" %>
                        <tbody>
                            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                            <c:set var="count" value="0" scope="page" />
                            <c:forEach items="${equipes.equipesClassementListe}" var="equipe">
                                <c:if test="${equipe.groupe == 'B'}"> 
                                    <%@ include file="contenuTableau.html" %>
                                </c:if> 
                            </c:forEach>
                        </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-12">
                    <div class="classement">
                        <h3>Groupe C</h3>
                        <%@ include file="enteteTableau.html" %>
                        <tbody>
                            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                            <c:set var="count" value="0" scope="page" />
                            <c:forEach items="${equipes.equipesClassementListe}" var="equipe">
                                <c:if test="${equipe.groupe == 'C'}"> 
                                    <%@ include file="contenuTableau.html" %>
                                </c:if> 
                            </c:forEach>
                        </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-12">
                    <div class="classement">
                        <h3>Groupe D</h3>
                        <%@ include file="enteteTableau.html" %>
                        <tbody>
                            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                            <c:set var="count" value="0" scope="page" />
                            <c:forEach items="${equipes.equipesClassementListe}" var="equipe">
                                <c:if test="${equipe.groupe == 'D'}"> 
                                    <%@ include file="contenuTableau.html" %>
                                </c:if> 
                            </c:forEach>
                        </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-12">
                    <div class="classement">
                        <h3>Groupe E</h3>
                        <%@ include file="enteteTableau.html" %>
                        <tbody>
                            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                            <c:set var="count" value="0" scope="page" />
                            <c:forEach items="${equipes.equipesClassementListe}" var="equipe">
                                <c:if test="${equipe.groupe == 'E'}"> 
                                    <%@ include file="contenuTableau.html" %>
                                </c:if> 
                            </c:forEach>
                        </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-12">
                    <div class="classement">
                        <h3>Groupe F</h3>
                        <%@ include file="enteteTableau.html" %>
                        <tbody>
                            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                            <c:set var="count" value="0" scope="page" />
                            <c:forEach items="${equipes.equipesClassementListe}" var="equipe">
                                <c:if test="${equipe.groupe == 'F'}"> 
                                    <%@ include file="contenuTableau.html" %>
                                </c:if> 
                            </c:forEach>
                        </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
