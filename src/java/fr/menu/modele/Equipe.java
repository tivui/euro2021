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
    private String groupe;
    private int nbPoints;
    private int nbButsPour;
    private int nbButsContre;
    private int diffButs;
    private int nbMatchsPlayed;
    private int nbMatchsWon;
    private int nbMatchsDraw;
    private int nbMatchsLost;
    

    public Equipe() {
        
    }
    
    public Equipe (String country, String flagName) {
        this.country = country;
        this.flagName = flagName;
    }

    public Equipe(String country, String flagName, String groupe) {
        this.country = country;
        this.flagName = flagName;
        this.groupe = groupe;
    }
    


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

    public int getNbMatchsPlayed() {
        return nbMatchsPlayed;
    }

    public void setNbMatchsPlayed(int nbMatchsPlayed) {
        this.nbMatchsPlayed = nbMatchsPlayed;
    }

    @Override
    public String toString() {
        return "Equipe{" + "country=" + country + ", flagName=" + flagName + '}';
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public int getDiffButs() {
        return diffButs;
    }

    public void setDiffButs(int diffButs) {
        this.diffButs = diffButs;
    }
    
    public void updateNbMatchs(int scoreEquipe, int scoreAdversaire) {
        this.nbMatchsPlayed++;
        if (scoreEquipe < scoreAdversaire) {
            this.nbMatchsLost++;
        } else {
            if (scoreEquipe == scoreAdversaire) {
                this.nbMatchsDraw++;
            } else {
                this.nbMatchsWon++;
            }
        }
    }
    
    public void updateNombreButs(int ButsPour, int ButsContre) {
        this.nbButsPour += ButsPour;
        this.nbButsContre += ButsContre;
    }
    
    public void updateNombrePoints(int scoreEquipe, int scoreAdversaire) {
        if (scoreEquipe > scoreAdversaire) {
            this.nbPoints += 3;
        } else {
            if (scoreEquipe == scoreAdversaire) {
                this.nbPoints += 1;
            } 
        }
    }
    
    public void updateDifferenceButs(int butsEnPlus, int butsEnMoins) {
        this.diffButs += (butsEnPlus - butsEnMoins);
    }

    public int getNbButsPour() {
        return nbButsPour;
    }

    public void setNbButsPour(int nbButsPour) {
        this.nbButsPour = nbButsPour;
    }

    public int getNbButsContre() {
        return nbButsContre;
    }

    public void setNbButsContre(int nbButsContre) {
        this.nbButsContre = nbButsContre;
    }

    public int getNbMatchsWon() {
        return nbMatchsWon;
    }

    public void setNbMatchsWon(int nbMatchsWon) {
        this.nbMatchsWon = nbMatchsWon;
    }

    public int getNbMatchsDraw() {
        return nbMatchsDraw;
    }

    public void setNbMatchsDraw(int nbMatchsDraw) {
        this.nbMatchsDraw = nbMatchsDraw;
    }

    public int getNbMatchsLost() {
        return nbMatchsLost;
    }

    public void setNbMatchsLost(int nbMatchsLost) {
        this.nbMatchsLost = nbMatchsLost;
    }
    
    
}