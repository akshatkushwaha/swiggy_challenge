package com.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void resultTesting() {
        Player playerA = new Player("A", 50, 5, 10);
        Player playerB = new Player("B", 100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        Player winner = arena.startFight();

        assertEquals("B", winner.getTitle());
    }

    @Test
    void resultTesting2() {
        Player playerA = new Player("A", 50, 5, 12);
        Player playerB = new Player("B", 80, 8, 7);

        Arena arena = new Arena(playerA, playerB);
        Player winner = arena.startFight();

        assertEquals("A", winner.getTitle());
    }
}