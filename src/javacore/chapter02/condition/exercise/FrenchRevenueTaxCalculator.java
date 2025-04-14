package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args){

        double salary = 20000;
        double impot = 0 ;

        if (salary > 177106){

            impot += (salary - 177105) * 0.45;
        }

        if (salary > 82342){

            impot += (salary - 82341) * 0.41;
        }

        if (salary > 28798){

            impot += (salary - 28797) * 0.3;
        }

        if (salary > 11295){

            impot += (salary - 11294) * 0.11;
        }

        if (salary < 11295){
            System.out.println("avec un salaire de " + salary + " euros vous aurez 0 euros d'impot a payer" );
        }

        System.out.println("avec un salaire de " + salary + " euros vous aurez " + impot + " d'euros a payer");

    }
}
