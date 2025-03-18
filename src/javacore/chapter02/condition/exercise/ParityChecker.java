package javacore.chapter02.condition.exercise;

public class ParityChecker {

    public static void main(String[] args){
/*******
        int number = 15;
        int isPair = number / 2 ;

        if (isPair * 2 == number){
            System.out.println("ce nombre est pair");

        }
            else {
            System.out.println("ce nombre est impair");
        }
 ***/

//Vrai solution
        int number = 14;

        if (number % 2 == 0) {
            System.out.println("Ce nombre est pair");
        } else {
            System.out.println("Ce nombre est impair");
        }
    }
}
