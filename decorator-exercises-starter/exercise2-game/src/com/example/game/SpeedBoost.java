package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int bonusSpeed;

    public SpeedBoost(Character ch, int bonusSpeed) {
        super(ch);
        this.bonusSpeed = bonusSpeed;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + bonusSpeed;
    }

    @Override
    public void move() {
        System.out.println("Moving at boosted speed " + getSpeed() + " with sprite " + getSprite());
    }
}
