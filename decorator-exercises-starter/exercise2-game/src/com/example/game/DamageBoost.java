package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private final int bonusDamage;

    public DamageBoost(Character ch, int bonusDamage) {
        super(ch);
        this.bonusDamage = bonusDamage;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + bonusDamage;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with boosted damage " + getDamage() + " using sprite " + getSprite());
    }
}