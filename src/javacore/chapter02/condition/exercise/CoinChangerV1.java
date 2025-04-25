package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main(String[] args){

        int totalBill = 66 ;

        int ammountPaid = 100 ;

        int change = ammountPaid - totalBill ;
        int monnaie = change ;


        if (change >= 50){

           int reste = change / 50 ;
           change -= reste * 50;

            System.out.println("il y'a " + reste + " billet de 50 euros");

            }

        if (change >= 20){

            int reste = change / 20 ;
            change -= reste * 20;

            System.out.println("il y'a " + reste + " billet de 20 euros");
        }

        if (change >= 10){

            int reste = change / 10 ;
            change -= reste * 10;

            System.out.println("il y'a " + reste + " billet de 10 euros");
        }

        if (change >= 2){
            int reste = change / 2 ;
            change -= reste * 2;

            System.out.println("il y'a " + reste + " piece de 2 euros");
        }

        if (change >= 1){

            int reste = change / 1 ;
            change -= reste * 1;

            System.out.println("il y'a " + reste + " piece de 1 euros");
        }

        System.out.println("avec une monnaie de " + monnaie + " euros");
    }
}
