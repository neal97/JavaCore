package javacore.chapter02.condition.exercise;

public class FirstBooleanCondition {

    public static  void main(String[] args){

        byte age = 23;
        boolean isAdult = age >= 18;

        if (isAdult){
            System.out.println("vous etes majeur");
        }
        else {
            System.out.println("vous etes mineur");
        }

    }
}
