package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args){

        double salary = 40000;
        double impot ;
        double salaryNet;
        double impotNet;

        double trancheMax1 = 0;
        double trancheMax2 = 1925;
        double trancheMax3 = 16063.2;
        double trancheMax4 = 38853.65;


        if (salary > 177106) {

            impot = (salary - 177106) * 0.45;
            salaryNet = salary - impot;
            impotNet = salary - salaryNet;
            System.out.println("avec un salaire de " + salary + " euros vous aurez " + impotNet + " d'euros a payer" );
        }

        if (salary <= 177106) {

            impot = (salary - 82342) * 0.41;
            salaryNet = salary - impot;
            impotNet = salary - salaryNet;
            System.out.println("avec un salaire de " + salary + " euros vous aurez " + impotNet + " d'euros a payer" );
        }

        if (salary < 82342) {

            impot = (salary - 28797) * 0.3;
            salaryNet = salary - impot;
            impotNet = salary - salaryNet;
            System.out.println("avec un salaire de " + salary + " euros vous aurez " + impotNet + " d'euros a payer" );
        }

        if (salary < 28798) {

            impot = (salary - 11294) * 0.11 ;
            salaryNet = salary - impot;
            impotNet = salary - salaryNet;
            System.out.println("avec un salaire de " + salary + " euros vous aurez " + impotNet + " d'euros a payer" );
        }

        if (salary < 11295) {
            System.out.println("vous n'avez pas d'impot a payer" );
        }
    }
}
