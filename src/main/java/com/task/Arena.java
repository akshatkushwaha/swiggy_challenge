package com.task;

public class Arena {
    private final Player playerA;
    private final Player playerB;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    private Player fight(Player attacker, Player defender) {
        Dice dice = new Dice();

        while(attacker.isAlive() && defender.isAlive()) {
            int attackPower = dice.roll() * attacker.getStrength();
            int defenderPower = dice.roll() * defender.getAttack();

            if(attackPower > defenderPower) {
                int damage = attackPower - defenderPower;
                defender.doDamage(damage);
            }

            Player temp = defender;
            defender = attacker;
            attacker = temp;
        }

        return attacker.isAlive() ? attacker : defender;
    }

    public Player startFight() {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = playerA.getHealth() < playerB.getHealth() ? playerB : playerA;

        return fight(attacker, defender);
    }
}
