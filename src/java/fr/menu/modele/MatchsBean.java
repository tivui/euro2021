/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author stag
 */
public class MatchsBean {

    public HashMap<Integer, Match> matchsMap;
    public HashMap<String, Stade> stadesMap;
    public HashMap<Integer, String> horairesMap;
    public TeamsBean equipes;

    public MatchsBean() {
        //Stockage des horaires
        horairesMap = new HashMap<>();
        horairesMap.put(1, "15:00");
        horairesMap.put(2, "18:00");
        horairesMap.put(3, "21:00");

        //création des stades
        Stade rome = new Stade("Rome", "Stadio Olimpico", 72698);
        Stade bakou = new Stade("Bakou", "Stade Olympique de Bakou", 69870);
        Stade copenhague = new Stade("Copenhague", "Parken", 38065);
        Stade londres = new Stade("Londres", "Wembley", 90000);
        Stade munich = new Stade("Munich", "Allianz Arena", 70000);
        Stade stPetersbourg = new Stade("St-Pétersbourg", "Gazprom Arena", 67800);
        Stade amsterdam = new Stade("Amsterdam", "Johan Cruyff Arena", 55500);
        Stade budapest = new Stade("Budapest", "Puskas Arena", 67215);
        Stade bucarest = new Stade("Bucarest", "National Arena", 55634);
        Stade glasgow = new Stade("Glasgow", "Hampden Park", 51866);
        Stade seville = new Stade("Séville", "La Cartuja", 60000);

        //stockage des stades
        stadesMap = new HashMap<>();
        stadesMap.put("rome", rome);
        stadesMap.put("bakou", bakou);
        stadesMap.put("copenhague", copenhague);
        stadesMap.put("londres", londres);
        stadesMap.put("munich", munich);
        stadesMap.put("stPetersbourg", stPetersbourg);
        stadesMap.put("amsterdam", amsterdam);
        stadesMap.put("budapest", budapest);
        stadesMap.put("bucarest", bucarest);
        stadesMap.put("glasgow", glasgow);
        stadesMap.put("seville", seville);

        //création des équipes de la Map, c'est dans cette Map que seront stockés les points
        equipes = new TeamsBean();
        Equipe france = equipes.equipesMap.get("france");
        Equipe allemagne = equipes.equipesMap.get("allemagne");
        Equipe portugal = equipes.equipesMap.get("portugal");
        Equipe hongrie = equipes.equipesMap.get("hongrie");
        Equipe italie = equipes.equipesMap.get("italie");
        Equipe paysDeGalles = equipes.equipesMap.get("paysDeGalles");
        Equipe suisse = equipes.equipesMap.get("suisse");
        Equipe turquie = equipes.equipesMap.get("turquie");
        Equipe danemark = equipes.equipesMap.get("danemark");
        Equipe finlande = equipes.equipesMap.get("finlande");
        Equipe russie = equipes.equipesMap.get("russie");
        Equipe belgique = equipes.equipesMap.get("belgique");
        Equipe ukraine = equipes.equipesMap.get("ukraine");
        Equipe paysBas = equipes.equipesMap.get("paysBas");
        Equipe autriche = equipes.equipesMap.get("autriche");
        Equipe macedoineDuNord = TeamsBean.equipesMap.get("macedoineDuNord");
        Equipe angleterre = TeamsBean.equipesMap.get("angleterre");
        Equipe croatie = TeamsBean.equipesMap.get("croatie");
        Equipe ecosse = TeamsBean.equipesMap.get("ecosse");
        Equipe republiqueTcheque = TeamsBean.equipesMap.get("republiqueTcheque");
        Equipe suede = TeamsBean.equipesMap.get("suede");
        Equipe pologne = TeamsBean.equipesMap.get("pologne");
        Equipe espagne = TeamsBean.equipesMap.get("espagne");
        Equipe slovaquie = TeamsBean.equipesMap.get("slovaquie");

        //création des matchs
        Match match01 = new Match(rome, "Ven. 11/06", horairesMap.get(3), turquie, italie, 0, 3);
        Match match02 = new Match(bakou, "Sam. 12/06", horairesMap.get(1), paysDeGalles, suisse, 1, 1);
        Match match03 = new Match(copenhague, "Sam. 12/06", horairesMap.get(2), danemark, finlande, 0, 1);
        Match match04 = new Match(stPetersbourg, "Sam. 12/06", horairesMap.get(3), belgique, russie, 3, 0);
        Match match05 = new Match(londres, "Dim. 13/06", horairesMap.get(1), angleterre, croatie, 1, 0);
        Match match06 = new Match(bucarest, "Dim. 13/06", horairesMap.get(2), autriche, macedoineDuNord, 3, 1);
        Match match07 = new Match(amsterdam, "Dim. 13/06", horairesMap.get(3), paysBas, ukraine, 3, 2);
        Match match08 = new Match(glasgow, "Lun. 14/06", horairesMap.get(1), ecosse, republiqueTcheque, 0, 2);
        Match match09 = new Match(stPetersbourg, "Lun. 14/06", horairesMap.get(2), pologne, slovaquie, 1, 2);
        Match match10 = new Match(seville, "Lun. 14/06", horairesMap.get(3), espagne, suede, 0, 0);
        Match match11 = new Match(budapest, "Mar. 15/06", horairesMap.get(2), hongrie, portugal, 0, 3);
        Match match12 = new Match(munich, "Mar. 15/06", horairesMap.get(3), france, allemagne, 1, 0);
        Match match13 = new Match(stPetersbourg, "Mer. 16/06", horairesMap.get(1), finlande, russie, 0, 1);
        Match match14 = new Match(bakou, "Mer. 16/06", horairesMap.get(2), turquie, paysDeGalles, 0, 2);
        Match match15 = new Match(rome, "Mer. 16/06", horairesMap.get(3), italie, suisse, 3, 0);

        //stockage des matchs
        matchsMap = new HashMap<>();
        matchsMap.put(1, match01);
        matchsMap.put(2, match02);
        matchsMap.put(3, match03);
        matchsMap.put(4, match04);
        matchsMap.put(5, match05);
        matchsMap.put(6, match06);
        matchsMap.put(7, match07);
        matchsMap.put(8, match08);
        matchsMap.put(9, match09);
        matchsMap.put(10, match10);
        matchsMap.put(11, match11);
        matchsMap.put(12, match12);
        matchsMap.put(13, match13);
        matchsMap.put(14, match14);
        matchsMap.put(15, match15);

        //stockage Equipes dans la liste Classement
        TeamsBean.equipesClassementListe = new ArrayList<>();
        equipes.equipesClassementListe.add(portugal);
        equipes.equipesClassementListe.add(hongrie);
        equipes.equipesClassementListe.add(italie);
        equipes.equipesClassementListe.add(paysDeGalles);
        equipes.equipesClassementListe.add(suisse);
        equipes.equipesClassementListe.add(turquie);
        equipes.equipesClassementListe.add(danemark);
        equipes.equipesClassementListe.add(finlande);
        equipes.equipesClassementListe.add(russie);
        equipes.equipesClassementListe.add(belgique);
        equipes.equipesClassementListe.add(ukraine);
        equipes.equipesClassementListe.add(paysBas);
        equipes.equipesClassementListe.add(autriche);
        equipes.equipesClassementListe.add(macedoineDuNord);
        equipes.equipesClassementListe.add(angleterre);
        equipes.equipesClassementListe.add(croatie);
        equipes.equipesClassementListe.add(ecosse);
        equipes.equipesClassementListe.add(republiqueTcheque);
        equipes.equipesClassementListe.add(suede);
        equipes.equipesClassementListe.add(pologne);
        equipes.equipesClassementListe.add(espagne);
        equipes.equipesClassementListe.add(france);
        equipes.equipesClassementListe.add(allemagne);
        equipes.equipesClassementListe.add(slovaquie);

    }

    public HashMap<Integer, String> getHorairesMap() {
        return horairesMap;
    }

    public void setHorairesMap(HashMap<Integer, String> horairesMap) {
        this.horairesMap = horairesMap;
    }

    public HashMap<Integer, String> getHoraireMap() {
        return horairesMap;
    }

    public void setHoraireMap(HashMap<Integer, String> horaireMap) {
        this.horairesMap = horaireMap;
    }

    public HashMap<Integer, Match> getMatchsMap() {
        return matchsMap;
    }

    public void setMatchsMap(HashMap<Integer, Match> matchsMap) {
        this.matchsMap = matchsMap;
    }

    public HashMap<String, Stade> getStadesMap() {
        return stadesMap;
    }

    public void setStadesMap(HashMap<String, Stade> stadesMap) {
        this.stadesMap = stadesMap;
    }

}
