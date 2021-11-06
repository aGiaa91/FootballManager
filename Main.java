package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Marija", "beginner");
        User user2 = new User("Nikola", "Expert");
        User user3 = new User("Matej", "Legend");
        User user4 = new User("Vasilije", "Beginner");
        User user5 = new User("Luka", "expert");

        Player p1 = new Player("Messi", 9);
        Player p2 = new Player("Ronaldo", 9);
        Player p3 = new Player("Neymar", 7);
        Player p4 = new Player("Mbappe", 8);
        Player p5 = new Player("Salah", 3);
        Player p6 = new Player("Lewandowski", 5);
        Player p7 = new Player("Haaland", 4);
        Player p8 = new Player("Bruyne", 6);
        Player p9 = new Player("Kane", 7);
        Player p10 = new Player("Maradona", 10);
        Player p11 = new Player("Pogba", 3);
        Player p12 = new Player("Lukaku", 5);
        Player p13 = new Player("Ibrahimovic", 8);
        Player p14 = new Player("Sancho", 6);
        Player p15 = new Player("Zidane", 9);
        Player p16 = new Player("Bale", 2);
        Player p17 = new Player("Pele", 7);
        Player p18 = new Player("Sterling", 5);
        Player p19 = new Player("Aguero", 4);
        Player p20 = new Player("Ronaldinho", 10);
        Player p21 = new Player("Hazard", 1);
        Player p22 = new Player("Modric", 9);
        Player p23 = new Player("Guardiola", 3);
        Player p24 = new Player("Fernandes", 8);
        Player p25 = new Player("Benzema", 1);
        Player p26 = new Player("Maldini", 6);
        Player p27 = new Player("Mane", 7);
        Player p28 = new Player("Griezmann", 2);
        Player p29 = new Player("Felix", 5);
        Player p30 = new Player("Davies", 8);

        Club club1 = new Club(user1, "Manchester United", new ArrayList<>(Arrays.asList(p2, p30, p1, p10, p4, p6, p5, p28, p25, p17, p18, p19, p3, p4, p7, p8, p9, p11, p12, p14)));
        Club club2 = new Club(user2, "Crvena Zvezda", new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20)));
        Club club3 = new Club(user3, "Partizan", new ArrayList<>(Arrays.asList(p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30)));
        Club club4 = new Club(user4, "Atletico Madrid", new ArrayList<>(Arrays.asList(p5, p10, p15, p20, p25, p30, p3, p6, p9, p12, p15, p18, p21, p24, p27, p7, p14, p28, p19, p23)));
        Club club5 = new Club(user5, "Real Madrid", new ArrayList<>(Arrays.asList(p5, p10, p15, p20, p25, p30, p3, p6, p9, p12, p15, p18, p21, p24, p27, p7, p14, p28, p19, p23)));

        HashMap<Club, Club> clubs = match(new ArrayList<>(Arrays.asList(club1, club2, club3, club4, club5)));
        for(Map.Entry<Club, Club> el : clubs.entrySet()) {
            System.out.println(el.getKey() + " - " + el.getValue());
        }
    }
    public static HashMap<Club, Club> match(List<Club> clubs) {
        HashMap<Club, Club> pairs = new HashMap<>();
        for(int j = 0; j < clubs.size(); j++) {
            Club club1 = clubs.get(j);
            for(int i = 0; i < clubs.size(); i++) {
                Club club2 = clubs.get(i);
                if(club1.getUser().getLevel().equals(club2.getUser().getLevel()) && club1.getUser().getUserId() != club2.getUser().getUserId()) {
                    pairs.put(club1, club2);
                    clubs.remove(club1);
                    clubs.remove(club2);
                    j--;
                    break;
                }
            }
        }
        return pairs;
    }
}
