package org.example.clase10_ForEach;

import java.util.function.Consumer;

public class Consumidor implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println("Desde una clase normal: " +s);
    }
}
