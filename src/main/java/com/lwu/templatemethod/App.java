package com.lwu.templatemethod;

public class App {

    public static void main(String[] args) {
        HalfingThief thief = new HalfingThief(new HitAndRunMethod());
        thief.steal();;
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
