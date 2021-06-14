/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.io.Serializable;

/**
 *
 * @author stag
 */
public class Equipe implements Serializable  {
    
    
    private String country;
    private String flagName;

    public Equipe() {
        
    }
    
    public Equipe (String country, String flagName) {
        this.country = country;
        this.flagName = flagName;
    }

//    public String getCountry() {
//        return country;
//    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    @Override
    public String toString() {
        return "Equipe{" + "country=" + country + ", flagName=" + flagName + '}';
    }
    
    
}