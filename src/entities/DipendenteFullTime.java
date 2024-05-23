package entities;

import Interfaces.SalaryCalculator;

public class DipendenteFullTime extends Dipendente implements SalaryCalculator {
    public DipendenteFullTime(String dipartimento) {
        super(dipartimento);

    }

    public double salaryCalc() {
        return getStipendio();
    }
}
