package com.lwu.strategy;

public class SpellStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
}
