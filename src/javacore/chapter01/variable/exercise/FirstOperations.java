package javacore.chapter01.variable.exercise;

public class FirstOperations {

        public static void main(String[] args) {
//N°1--------------------------------------------------------------------------------------------------------------

  //1--------------------------------------------------
            int a = 5;
            int b = 9;

  //2--------------------------------------------------
            int sum = a + b;

 //3-------------------------------------------------
            int substraction = a - b;

 //4-------------------------------------------------
            int  multiplication = a * b ;

//5----------------------------------------------------

            int division = a / b ;
//6----------------------------------------------------------------

            System.out.println("la somme de a et b = " + sum);
            System.out.println("la soustraction de a et b = " + substraction);
            System.out.println("la multiplication de a et b = " + multiplication);
            System.out.println("la division de a et b = " + division);

//N°2--------------------------------------------------------------------------------------------------------------

//1----------------------------------------------------------
            int c = 8;
            int d = 6;

//2----------------------------------------------------------
            c += d ;
//3---------------------------------------------------
            System.out.println(c);

 //4------------------------------------------------
            d -= 5 ;

//5------------------------------------------------
            System.out.println(d);

//6-----------------------------------------------
            c *= 3;

//7-----------------------------------------------

            System.out.println(c);

//8-----------------------------------------------

            d /= 3;

//9-----------------------------------------------
            System.out.println(d);



//N°3--------------------------------------------------------------------------------------------------------------

//1-----------------------------------------------
            int e = 1 * 5 + 2 ;

//2-----------------------------------------------
            System.out.println(e);

//3-----------------------------------------------

        int f =  1 * (5 + 2) ;

//4-----------------------------------------------
            System.out.println(f);

//5-----------------------------------------------

        int g = ((2 * 5) - 2 / (4 - 2)) - 1;

//6-----------------------------------------------

            System.out.println(g);

        }
}
