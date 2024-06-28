package com.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TAKING INPUT FROM USER FOR PLAYER A
        System.out.println("Enter attributes values for Player A: ");
        System.out.print("Enter health: ");
        int healthOfPlayerA = sc.nextInt();
        System.out.print("Enter Strength: ");
        int strengthOfPlayerA = sc.nextInt();
        System.out.print("Enter Attack: ");
        int attackOfPlayerA = sc.nextInt();

        // TAKING INPUT FROM USER FOR PLAYER B
        System.out.println("Enter attributes values for Player B: ");
        System.out.print("Enter health: ");
        int healthOfPlayerB = sc.nextInt();
        System.out.print("Enter Strength: ");
        int strengthOfPlayerB = sc.nextInt();
        System.out.print("Enter Attack: ");
        int attackOfPlayerB = sc.nextInt();

        // CREATING INSTANCE OF PLAYER CLASS FOR PLAYER A AND PLAYER B
        Player playerA = new Player("A", healthOfPlayerA, strengthOfPlayerA, attackOfPlayerA);
        Player playerB = new Player("B", healthOfPlayerB, strengthOfPlayerB, attackOfPlayerB);

        // CREATING OBJECT OF ARENA CLASS
        Arena arena = new Arena(playerA, playerB);

        // CALLING FIGHT METHOD
        Player winner = arena.startFight();

        System.out.println("Winner: Player" + winner.getTitle());

        sc.close();
    }
}