/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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
        Equipe france = TeamsBean.equipesMap.get("france");
        Equipe allemagne = TeamsBean.equipesMap.get("allemagne");
        Equipe portugal = TeamsBean.equipesMap.get("portugal");
        Equipe hongrie = TeamsBean.equipesMap.get("hongrie");
        Equipe italie = TeamsBean.equipesMap.get("italie");
        Equipe paysDeGalles = TeamsBean.equipesMap.get("paysDeGalles");
        Equipe suisse = TeamsBean.equipesMap.get("suisse");
        Equipe turquie = TeamsBean.equipesMap.get("turquie");
        Equipe danemark = TeamsBean.equipesMap.get("danemark");
        Equipe finlande = TeamsBean.equipesMap.get("finlande");
        Equipe russie = TeamsBean.equipesMap.get("russie");
        Equipe belgique = TeamsBean.equipesMap.get("belgique");
        Equipe ukraine = TeamsBean.equipesMap.get("ukraine");
        Equipe paysBas = TeamsBean.equipesMap.get("paysBas");
        Equipe autriche = TeamsBean.equipesMap.get("autriche");
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
        Match match16 = new Match(bucarest, "Jeu. 17/06", horairesMap.get(1), ukraine, macedoineDuNord, 2, 1);
        Match match17 = new Match(copenhague, "Jeu. 17/06", horairesMap.get(2), danemark, belgique, 1, 2);
        Match match18 = new Match(amsterdam, "Jeu. 17/06", horairesMap.get(3), paysBas, autriche, 2, 0);
        Match match19 = new Match(stPetersbourg, "Ven. 18/06", horairesMap.get(1), suede, slovaquie, 1, 0);
        Match match20 = new Match(glasgow, "Ven. 18/06", horairesMap.get(2), croatie, republiqueTcheque, 1, 1);
        Match match21 = new Match(londres, "Ven. 18/06", horairesMap.get(3), angleterre, ecosse, 0, 0);
        Match match22 = new Match(budapest, "Sam. 19/06", horairesMap.get(1), hongrie, france);
        Match match23 = new Match(munich, "Sam. 19/06", horairesMap.get(2), portugal, allemagne);
        Match match24 = new Match(seville, "Sam. 19/06", horairesMap.get(3), espagne, pologne);
        Match match25 = new Match(rome, "Dim. 20/06", horairesMap.get(2), italie, paysDeGalles);
        Match match26 = new Match(bakou, "Dim. 20/06", horairesMap.get(2), suisse, turquie);
        Match match27 = new Match(bucarest, "Lun. 21/06", horairesMap.get(2), ukraine, autriche);
        Match match28 = new Match(amsterdam, "Lun. 21/06", horairesMap.get(2), macedoineDuNord, paysBas);
        Match match29 = new Match(copenhague, "Lun. 21/06", horairesMap.get(3), russie, danemark);
        Match match30 = new Match(stPetersbourg, "Lun. 21/06", horairesMap.get(3), finlande, belgique);
        Match match31 = new Match(glasgow, "Mar. 22/06", horairesMap.get(3), croatie, ecosse);
        Match match32 = new Match(londres, "Mar. 22/06", horairesMap.get(3), republiqueTcheque, angleterre);
        Match match33 = new Match(stPetersbourg, "Mer. 23/06", horairesMap.get(2), suede, pologne);
        Match match34 = new Match(seville, "Mer. 23/06", horairesMap.get(2), slovaquie, espagne);
        Match match35 = new Match(budapest, "Mer. 23/06", horairesMap.get(3), portugal, france);
        Match match36 = new Match(munich, "Mer. 23/06", horairesMap.get(3), allemagne, hongrie);

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
        matchsMap.put(16, match16);
        matchsMap.put(17, match17);
        matchsMap.put(18, match18);
        matchsMap.put(19, match19);
        matchsMap.put(20, match20);
        matchsMap.put(21, match21);
        matchsMap.put(22, match22);
        matchsMap.put(23, match23);
        matchsMap.put(24, match24);
        matchsMap.put(25, match25);
        matchsMap.put(26, match26);
        matchsMap.put(27, match27);
        matchsMap.put(28, match28);
        matchsMap.put(29, match29);
        matchsMap.put(30, match30);
        matchsMap.put(31, match31);
        matchsMap.put(32, match32);
        matchsMap.put(33, match33);
        matchsMap.put(34, match34);
        matchsMap.put(35, match35);
        matchsMap.put(36, match36);

        //stockage Equipes dans la liste Classement
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

        //Tri des équipes par points et différence de buts
        Collections.sort(equipes.equipesClassementListe, new ClassementComparator());

        //stockage dans une Hashmap de liste d'équipes triées par groupe et classées
        String[] groupesTab = {"A", "B", "C", "D", "E", "F"};
        for (String groupe : groupesTab) {
            equipes.equipesClassementParGroupesMap.put(groupe, new ArrayList<>());
            for (Equipe equipe : equipes.equipesClassementListe) {
                if (equipe.getGroupe().equals(groupe)) {
                    equipes.equipesClassementParGroupesMap.get(groupe).add(equipe);
                }
            }
        }

        //affichage test des classements par groupe
        for (HashMap.Entry<String, List<Equipe>> entry : equipes.equipesClassementParGroupesMap.entrySet()) {
            System.out.println("Groupe " + entry.getKey());
            for (Equipe equipe : entry.getValue()) {
                System.out.println(equipe.getCountry());
            }
        }

        //stockage dans une arraylist des 3èmes de groupe
        for (HashMap.Entry<String, List<Equipe>> entry : equipes.equipesClassementParGroupesMap.entrySet()) {
            equipes.classement3emesListe.add(entry.getValue().get(2));
        }

        //tri des 3èmes
        Collections.sort(equipes.classement3emesListe, new ClassementComparator());

        //Affichage test des 3èmes de groupes
        for (Equipe equipe : equipes.classement3emesListe) {
            System.out.println(equipe);
        }

        //Générer une liste des groupes des 4 meilleurs troisièmes
        String[] meilleurs3emesListeGroupes = new String[4];
        for (int i = 0; i < 4; i++) {
            meilleurs3emesListeGroupes[i] = equipes.classement3emesListe.get(i).getGroupe();
        }

        //Affichage de la liste des groupes des meilleurs troisièmes
        for (String groupe : meilleurs3emesListeGroupes) {
            System.out.println(groupe);
        }

        //Répartition des meilleurs 3èmes
        String best3liste[] = meilleurs3emesListeGroupes;
        Equipe best3_1B = null, best3_1C = null, best3_1E = null, best3_1F = new Equipe();

        if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("D")) {
            best3_1B = equipes.equipesClassementParGroupesMap.get("A").get(2);
            best3_1C = equipes.equipesClassementParGroupesMap.get("D").get(2);
            best3_1E = equipes.equipesClassementParGroupesMap.get("E").get(2);
            best3_1F = equipes.equipesClassementParGroupesMap.get("F").get(2);
        } else {
            if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("E")) {
                best3_1B = equipes.equipesClassementParGroupesMap.get("A").get(2);
                best3_1C = equipes.equipesClassementParGroupesMap.get("E").get(2);
                best3_1E = equipes.equipesClassementParGroupesMap.get("B").get(2);
                best3_1F = equipes.equipesClassementParGroupesMap.get("C").get(2);
            } else {
                if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("F")) {
                    best3_1B = equipes.equipesClassementParGroupesMap.get("A").get(2);
                    best3_1C = equipes.equipesClassementParGroupesMap.get("F").get(2);
                    best3_1E = equipes.equipesClassementParGroupesMap.get("B").get(2);
                    best3_1F = equipes.equipesClassementParGroupesMap.get("C").get(2);
                } else {
                    if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("E")) {
                        best3_1B = equipes.equipesClassementParGroupesMap.get("D").get(2);
                        best3_1C = equipes.equipesClassementParGroupesMap.get("E").get(2);
                        best3_1E = equipes.equipesClassementParGroupesMap.get("A").get(2);
                        best3_1F = equipes.equipesClassementParGroupesMap.get("B").get(2);
                    } else {
                        if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("F")) {
                            best3_1B = equipes.equipesClassementParGroupesMap.get("D").get(2);
                            best3_1C = equipes.equipesClassementParGroupesMap.get("F").get(2);
                            best3_1E = equipes.equipesClassementParGroupesMap.get("A").get(2);
                            best3_1F = equipes.equipesClassementParGroupesMap.get("B").get(2);
                        } else {
                            if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("E") && Arrays.asList(best3liste).contains("F")) {
                                best3_1B = equipes.equipesClassementParGroupesMap.get("E").get(2);
                                best3_1C = equipes.equipesClassementParGroupesMap.get("F").get(2);
                                best3_1E = equipes.equipesClassementParGroupesMap.get("B").get(2);
                                best3_1F = equipes.equipesClassementParGroupesMap.get("A").get(2);
                            } else {
                                if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("E")) {
                                    best3_1B = equipes.equipesClassementParGroupesMap.get("E").get(2);
                                    best3_1C = equipes.equipesClassementParGroupesMap.get("D").get(2);
                                    best3_1E = equipes.equipesClassementParGroupesMap.get("C").get(2);
                                    best3_1F = equipes.equipesClassementParGroupesMap.get("A").get(2);
                                } else {
                                    if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("F")) {
                                        best3_1B = equipes.equipesClassementParGroupesMap.get("F").get(2);
                                        best3_1C = equipes.equipesClassementParGroupesMap.get("D").get(2);
                                        best3_1E = equipes.equipesClassementParGroupesMap.get("C").get(2);
                                        best3_1F = equipes.equipesClassementParGroupesMap.get("A").get(2);
                                    } else {
                                        if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("E") && Arrays.asList(best3liste).contains("F")) {
                                            best3_1B = equipes.equipesClassementParGroupesMap.get("E").get(2);
                                            best3_1C = equipes.equipesClassementParGroupesMap.get("F").get(2);
                                            best3_1E = equipes.equipesClassementParGroupesMap.get("C").get(2);
                                            best3_1F = equipes.equipesClassementParGroupesMap.get("A").get(2);
                                        } else {
                                            if (Arrays.asList(best3liste).contains("A") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("E") && Arrays.asList(best3liste).contains("F")) {
                                                best3_1B = equipes.equipesClassementParGroupesMap.get("E").get(2);
                                                best3_1C = equipes.equipesClassementParGroupesMap.get("F").get(2);
                                                best3_1E = equipes.equipesClassementParGroupesMap.get("D").get(2);
                                                best3_1F = equipes.equipesClassementParGroupesMap.get("A").get(2);
                                            } else {
                                                if (Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("E")) {
                                                    best3_1B = equipes.equipesClassementParGroupesMap.get("E").get(2);
                                                    best3_1C = equipes.equipesClassementParGroupesMap.get("D").get(2);
                                                    best3_1E = equipes.equipesClassementParGroupesMap.get("B").get(2);
                                                    best3_1F = equipes.equipesClassementParGroupesMap.get("C").get(2);
                                                } else {
                                                    if (Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("F")) {
                                                        best3_1B = equipes.equipesClassementParGroupesMap.get("F").get(2);
                                                        best3_1C = equipes.equipesClassementParGroupesMap.get("D").get(2);
                                                        best3_1E = equipes.equipesClassementParGroupesMap.get("C").get(2);
                                                        best3_1F = equipes.equipesClassementParGroupesMap.get("B").get(2);
                                                    } else {
                                                        if (Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("E") && Arrays.asList(best3liste).contains("F")) {
                                                            best3_1B = equipes.equipesClassementParGroupesMap.get("F").get(2);
                                                            best3_1C = equipes.equipesClassementParGroupesMap.get("E").get(2);
                                                            best3_1E = equipes.equipesClassementParGroupesMap.get("C").get(2);
                                                            best3_1F = equipes.equipesClassementParGroupesMap.get("B").get(2);
                                                        } else {
                                                            if (Arrays.asList(best3liste).contains("B") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("E") && Arrays.asList(best3liste).contains("F")) {
                                                                best3_1B = equipes.equipesClassementParGroupesMap.get("F").get(2);
                                                                best3_1C = equipes.equipesClassementParGroupesMap.get("E").get(2);
                                                                best3_1E = equipes.equipesClassementParGroupesMap.get("D").get(2);
                                                                best3_1F = equipes.equipesClassementParGroupesMap.get("B").get(2);
                                                            } else {
                                                                if (Arrays.asList(best3liste).contains("C") && Arrays.asList(best3liste).contains("D") && Arrays.asList(best3liste).contains("E") && Arrays.asList(best3liste).contains("F")) {
                                                                    best3_1B = equipes.equipesClassementParGroupesMap.get("F").get(2);
                                                                    best3_1C = equipes.equipesClassementParGroupesMap.get("E").get(2);
                                                                    best3_1E = equipes.equipesClassementParGroupesMap.get("D").get(2);
                                                                    best3_1F = equipes.equipesClassementParGroupesMap.get("C").get(2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Génération des matchs de 8èmes de finale
        HashMap<String, List<Equipe>> classMap = equipes.equipesClassementParGroupesMap;
        //1er du groupe A contre le 2ème du groupe C
        Match match37 = new Match(londres, "Sam. 26/06", horairesMap.get(2), classMap.get("A").get(0), classMap.get("C").get(1));
        matchsMap.put(37, match37);
        //2ème du groupe A contre le 2ème du groupe B
        Match match38 = new Match(amsterdam, "Sam. 26/06", horairesMap.get(3), classMap.get("A").get(1), classMap.get("B").get(1));
        matchsMap.put(38, match38);
        //1er du groupe B contre le meilleur 3ème 1B
        Match match39 = new Match(seville, "Dim. 27/06", horairesMap.get(2), classMap.get("B").get(0), best3_1B);
        matchsMap.put(39, match39);
        //1er du groupe C contre le meilleur 3ème 1C
        Match match40 = new Match(budapest, "Dim. 27/06", horairesMap.get(3), classMap.get("C").get(0), best3_1C);
        matchsMap.put(40, match40);
        //2ème du groupe D contre le 2ème du groupe E
        Match match41 = new Match(copenhague, "Lun. 28/06", horairesMap.get(2), classMap.get("D").get(1), classMap.get("E").get(1));
        matchsMap.put(41, match41);
        //1er du groupe F contre le meilleur 3ème 1F
        Match match42 = new Match(bucarest, "Lun. 28/06", horairesMap.get(3), classMap.get("F").get(0), best3_1F);
        matchsMap.put(42, match42);
        //1er du groupe D contre le 2ème du groupe F
        Match match43 = new Match(londres, "Mar. 29/06", horairesMap.get(2), classMap.get("D").get(0), classMap.get("F").get(1));
        matchsMap.put(43, match43);
        //1er du groupe E contre le meilleur 3ème 1E
        Match match44 = new Match(glasgow, "Mar. 29/06", horairesMap.get(3), classMap.get("E").get(0), best3_1E);
        matchsMap.put(44, match44);
        

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
