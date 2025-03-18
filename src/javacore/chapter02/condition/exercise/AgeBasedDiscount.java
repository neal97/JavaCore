package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {
    public static void main(String[] args){

        //
        int age = 65;
        //
        double price = 50;

        if (age <= 25){
            price = price - (price * 25 / 100);
            System.out.println("Vous benéficiez du forfait Jeune de -25 ans qui est de : " + price + "euros");
        }
        else if (age >= 65) {

            price = price -(price * 75 / 100);
            System.out.println("Vous benéficiez du forfait Senior de +65 ans qui est de : " + price + "euros");

        }
        else {
            System.out.println("Vous benéficiez du forfait Basique qui est de : " + price + "euros");
        }
    }
}
