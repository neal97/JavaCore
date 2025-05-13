package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {
    public static void main(String[] args){

        int totalBill = 66 ;

        int ammountPaid = 100 ;

        int change = ammountPaid - totalBill ;
        int monnaie = change ;

        int billet50 = 9 ;
        int billet20 = 1 ;
        int billet10 = 9 ;
        int billet2 = 9 ;
        int billet1 = 9 ;


        if (change >= 50){
            if (billet50 >  0) {
                int reste = change / 50;
                change -= reste * 50;

                System.out.println("il y'a " + reste + " billet de 50 euros");
            }else {
                System.out.println("il n'y a plus de billet de 50 disponible");
            }
        }

        if (change >= 20){
            if (billet20 > 0) {
                int reste = change / 20;
                change -= reste * 20;

                System.out.println("il y'a " + reste + " billet de 20 euros");
            }else {
                System.out.println("il n'y a plus de billet de 20 disponible");
            }
        }

        if (change >= 10){
            if (billet10 > 0) {
                int reste = change / 10;
                change -= reste * 10;

                System.out.println("il y'a " + reste + " billet de 10 euros");
            }else {
                System.out.println("il n'y a plus de billet de 10 disponible");
            }
        }

        if (change >= 2){
            if (billet2 > 0) {
                int reste = change / 2;
                change -= reste * 2;

                System.out.println("il y'a " + reste + " piece de 2 euros");
            }else {
                System.out.println("il n'y a plus de piece de 2 disponible");
            }
        }

        if (change >= 1){
            if (billet1 > 0) {

                int reste = change / 1;
                change -= reste * 1;

                System.out.println("il y'a " + reste + " piece de 1 euros");
            }else {
                System.out.println("il n'y a plus de piece de 1 euro disponible");
            }
        }

        System.out.println("avec une monnaie de " + monnaie + " euros");
    }

}
