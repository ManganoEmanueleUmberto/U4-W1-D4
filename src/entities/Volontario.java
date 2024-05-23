package entities;

import Interfaces.CheckIn;

public class Volontario implements CheckIn {
    String nome;
    int età;
    String CV;

    public Volontario(String nome, int età, String CV) {
        this.nome = nome;
        this.età = età;
        this.CV = CV;
    }

    public void checkIn() {
        System.out.println("Check In effettuato");
    }
}
