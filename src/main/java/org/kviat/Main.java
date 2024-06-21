package org.kviat;

public class Main {
    public static void main(String[] args) {

        FootballPlayer player = new FootballPlayer("Іван", "Іваненко", 25, "Нападник");

        FootballPlayer player2 = new FootballPlayer("Ліонель", "Мессі", 37, "Нападник");

        System.out.println(player.toString());

        System.out.println(player2.toString());
    }
}