package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args){

        double salary = 40000;
        double salaryNet = salary - (salary * 0.1);
        double impot = 0 ;

        if (salaryNet > 177106) {

            impot += (salaryNet - 177105) * 0.45;
            salaryNet -= (salaryNet - 177105);
        }

        if (salaryNet > 82342){

            impot += (salaryNet - 82341) * 0.41;
            salaryNet -= (salaryNet - 82341);
        }

        if (salaryNet > 28798){

            impot += (salaryNet - 28797) * 0.3;
            salaryNet -= (salaryNet - 28797);
        }

        if (salaryNet > 11295){

            impot += (salaryNet - 11294) * 0.11;
            salaryNet -= (salaryNet - 11294);
        }
        else {
            System.out.println("avec un salaire de " + salary + " euros vous aurez 0 euros d'impot a payer" );
        }

        System.out.println("avec un salaire de " + salary + " euros vous aurez " + impot + " d'euros a payer");

    }
}

