package entities;

import Interfaces.SalaryCalculator;

public class Dirigente extends Dipendente implements SalaryCalculator {
    public Dirigente(String dipartimento) {
        super(dipartimento);
    }

    public double salaryCalc() {
        return getStipendio() + 550;
    }

}
