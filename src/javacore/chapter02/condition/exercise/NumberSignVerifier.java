package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {
    public static void main(String[] args){

        double number = 25 ;

        if (number < 0){
            System.out.println("la valeur de number est négative");
        }
        else if (number > 0) {
            System.out.println("la valeur de number est positive");

        }
        else {
            System.out.println("la valeur de number est neutre");
        }
/**** methode sans else

        if (number < 0){
            System.out.println("la valeur de number est négative");
        }
        if (number > 0) {
            System.out.println("la valeur de number est positive");

        }
        if (number == 0){
            System.out.println("la valeur de number est neutre");
        }
****/

    }
}
