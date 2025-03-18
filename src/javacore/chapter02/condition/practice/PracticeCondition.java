package javacore.chapter02.condition.practice;

public class PracticeCondition {

    public static void main(String[] args){

        int age = 18 ;

        if ( age < 18 ) {

            System.out.println("vous etes mineur");
        }
        else if ( age == 18) {
            System.out.println("vous etes tout juste majeur");
        }
        else {
            System.out.println("vous etes majeur");
        }

    }
}
