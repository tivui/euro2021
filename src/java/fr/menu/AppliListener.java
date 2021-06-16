/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu;

import fr.menu.modele.MatchsBean;
import fr.menu.modele.TeamsBean;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author stag
 */
public class AppliListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext ctx = servletContextEvent.getServletContext();
    	// String url = ctx.getInitParameter("nomDuInitParam");

        TeamsBean equipes = new TeamsBean();
        MatchsBean matchs = new MatchsBean();
        
        ctx.setAttribute("equipes", equipes);
        ctx.setAttribute("matchs", matchs);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
