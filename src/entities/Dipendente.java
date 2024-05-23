package entities;

import Enums.Dipartimenti;
import Interfaces.CheckIn;

import java.util.Random;

public abstract class Dipendente implements CheckIn {

    private String matricola;
    private double stipendio;
    private Dipartimenti dipartimento;

    public Dipendente(String dipartimento) {
        Random rndm = new Random();
        int matricola = rndm.nextInt(100000, 900000);

        this.dipartimento = Dipartimenti.valueOf(dipartimento);
        this.stipendio = 1500;
        this.matricola = String.valueOf(matricola);

    }

    public String getMatricola() {
        return matricola;
    }


    public double getStipendio() {
        return stipendio;
    }


    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void printMatricola() {
        System.out.println("Matricola N°: " + this.matricola);
    }

    public void checkIn() {
        System.out.println("Check In effettuato");
    }
}
