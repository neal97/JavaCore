package javacore.chapter02.condition.exercise;

public class AgeCategorization {
    public static void main(String[]  args){

        int age = 64;

        if (age < 10 ){
            System.out.println("Catégorie enfant");
        }
        else if (age < 18) {
            System.out.println("Catégorie Ado");
        }
        else if (age < 25) {
            System.out.println("Catégorie Jeune Adulte");
        }
        else if (age < 65) {
            System.out.println("Catégorie Adulte");
        }
        else {
            System.out.println("Catégorie Senior");
        }

    }
}
