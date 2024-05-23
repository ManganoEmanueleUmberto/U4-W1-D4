package entities;

import Interfaces.SalaryCalculator;

public class DipendentePartTime extends Dipendente implements SalaryCalculator {

    int oreLavorate;

    public DipendentePartTime(String dipartimento, int oreLavorate) {
        super(dipartimento);
        this.oreLavorate = oreLavorate;
    }

    public double salaryCalc() {
        int salarioOrario = 25;
        return oreLavorate * salarioOrario;
    }
}
