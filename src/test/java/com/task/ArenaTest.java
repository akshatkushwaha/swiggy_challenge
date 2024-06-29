package com.task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArenaTest {
    @Test
    public void testFight() {
        Player playerA = new Player("A", 50, 5, 10);
        Player playerB = new Player("B", 100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        Player winner = arena.startFight();

        assertTrue(winner.isAlive());
        assertTrue(winner == playerA || winner == playerB);
    }

    @Test
    public void testFightWithEqualHealth() {
        Player playerA = new Player("A", 100, 10, 5);
        Player playerB = new Player("B", 100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        Player winner = arena.startFight();

        assertTrue(winner.isAlive());
        assertTrue(winner == playerA || winner == playerB);
    }
}