package com.example;

import java.util.ArrayList;

public class Etiqueta {
    private String lenguaje;

    public Etiqueta() {
    }

    public Etiqueta(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Etiqueta{" +
                "lenguaje='" + lenguaje + '\'' +
                '}';
    }
}
