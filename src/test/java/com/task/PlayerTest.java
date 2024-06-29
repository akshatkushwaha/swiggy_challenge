package com.task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player("A", 100, 10, 5);
        assertEquals("A", player.getTitle());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(5, player.getAttack());
    }

    @Test
    public void testDoDamage() {
        Player player = new Player("A", 100, 10, 5);
        player.doDamage(30);
        assertEquals(70, player.getHealth());

        player.doDamage(70);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player("A", 100, 10, 5);
        assertTrue(player.isAlive());

        player.doDamage(100);
        assertFalse(player.isAlive());
    }
}