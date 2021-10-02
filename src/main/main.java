package main;

import static main.egglatin.egglatin;

public class main {
    public static void main(String[] args) {
        System.out.println("Problem 1");
        egglatin();

        System.out.println("\nProblem 2");
        String info = "Jam Turlo jturlo weR1#pYx$";
        User user = new User(info);
        System.out.println(user.getName());
        System.out.println(user.toString());

        System.out.println("\nProblem 3");
        String buy = "Jol Ley purchased #3 of the @washers at the price $0.25";
        item item = new item("Jol Ley purchased #3 of the @washers at the price $0.25");
        System.out.println("Total: " + item.getTotal());
        System.out.println(item.toString());
    }
}
