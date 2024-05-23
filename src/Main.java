import Interfaces.CheckIn;
import entities.*;

public class Main {
    public static void main(String[] args) {
        DipendentePartTime dipendente1 = new DipendentePartTime("PRODUZIONE", 25);
        DipendenteFullTime dipendente2 = new DipendenteFullTime("VENDITE");
        Dirigente dipendente3 = new Dirigente("AMMINISTRAZIONE");
        Volontario volontario1 = new Volontario("Giacomo", 23, "Ciao");
        Dipendente[] arrayDipendenti = {dipendente1, dipendente2, dipendente3};
        CheckIn[] arrayCheckIn = {dipendente1, dipendente2, dipendente3, volontario1};
        double salarioTotale = 0;
        for (int i = 0; i < arrayDipendenti.length; i++) {
            arrayDipendenti[i].printMatricola();
            if (arrayDipendenti[i] instanceof DipendentePartTime) {
                System.out.println("Stipendio: " + ((DipendentePartTime) arrayDipendenti[i]).salaryCalc() + "€\n");
                salarioTotale = salarioTotale + ((DipendentePartTime) arrayDipendenti[i]).salaryCalc();
            } else if (arrayDipendenti[i] instanceof DipendenteFullTime) {
                System.out.println("Stipendio: " + ((DipendenteFullTime) arrayDipendenti[i]).salaryCalc() + "€\n");
                salarioTotale = salarioTotale + ((DipendenteFullTime) arrayDipendenti[i]).salaryCalc();
            } else {
                System.out.println("Stipendio: " + ((Dirigente) arrayDipendenti[i]).salaryCalc() + "€\n");
                salarioTotale = salarioTotale + ((Dirigente) arrayDipendenti[i]).salaryCalc();
            }

        }
        System.out.println("Salario Totale dei dipendenti: " + salarioTotale + "€\n");
        for (int i = 0; i < arrayCheckIn.length; i++) {
            arrayCheckIn[i].checkIn();
        }
    }


}

