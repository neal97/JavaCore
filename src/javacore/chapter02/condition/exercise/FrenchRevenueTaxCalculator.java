package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args){

        double salary = 20000;
        double impot ;

        double trancheMax1 = 0;
        double trancheMax2 = 1925;
        double trancheMax3 = 16063.2;
        double trancheMax4 = 38853.65;


        if (salary > 177106) {

            impot = (salary - 177106) * 0.45 + trancheMax1 + trancheMax2 + trancheMax3 + trancheMax4;
            System.out.println("avec un salaire de " + salary + " euros vous aurez " + impot + " d'euros a payer" );
        }

        if (salary <= 177106) {

            impot = (salary - 82342) * 0.41 + trancheMax1 + trancheMax2 + trancheMax3;
            System.out.println("avec un salaire de " + salary + " euros vous aurez " + impot + " d'euros a payer" );
        }

        if (salary < 82342) {

            impot = (salary - 28797) * 0.3 + trancheMax1 + trancheMax2;
            System.out.println("avec un salaire de " + salary + " euros vous aurez " + impot + " d'euros a payer" );
        }

        if (salary < 28798) {

            impot = (salary - 11294) * 0.11 + trancheMax1;
            System.out.println("avec un salaire de " + salary + " euros vous aurez " + impot + " d'euros a payer" );
        }

        if (salary < 11295) {
            System.out.println("vous n'avez pas d'impot a payer" );
        }
    }
}
