package Generics.Game;

import java.util.ArrayList;
import java.util.Random;

public class Team <T extends Player> {
    private String name;
    private ArrayList<T> gameTeam = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewPlayer (T p){
        gameTeam.add(p);
//        System.out.println("В команду "+ name + " добавлен игрок "+ p.getName());
   }

    public void printTeam (){
        System.out.println("Команда: "+name);
        for (int i = 0; i <gameTeam.size() ; i++) {
            ((Player)gameTeam.get(i)).printPlayer();
        }
    }

    public void playGame(Team<T> team){
        Random rnd = new Random();
        int a = rnd.nextInt(2);
        if (a==0) System.out.println("Выиграла комагда " + name);
        else System.out.println("Выиграла комагда "+team.name);
    }
}
