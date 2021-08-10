package Generics.UPL;

import java.util.ArrayList;

public class Team <T extends Player>{
    String name;
    ArrayList<Player> temsUPL= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayerInTeam (Player p){
        temsUPL.add(p);
    }

    public void printTeams (){
        for (int i = 0; i <temsUPL.size() ; i++) {
            temsUPL.get(i).printPlayer();
        }
    }
}
