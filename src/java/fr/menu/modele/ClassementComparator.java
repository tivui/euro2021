/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.util.Comparator;

/**
 *
 * @author stag
 */
public class ClassementComparator implements Comparator<Equipe> {

    @Override
    public int compare(Equipe e1, Equipe e2) {
        int nbPoints1 = e1.getNbPoints();
        int nbPoints2 = e2.getNbPoints();
        int compNbPoints = Integer.compare(nbPoints2, nbPoints1);
        if (compNbPoints != 0) {
            return compNbPoints;
        } else {
            int diffButs1 = e1.getDiffButs();
            int diffButs2 = e2.getDiffButs();
            return Integer.compare(diffButs2, diffButs1);
        }
    }
}
