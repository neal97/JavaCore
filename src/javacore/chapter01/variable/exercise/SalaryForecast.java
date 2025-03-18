package javacore.chapter01.variable.exercise;

public class SalaryForecast {
        public static void main(String[] args){
            double cadre = 25;
            double ouvrier = 23;
            double impot = 10.5;

            double salaryHour = 25;
            double salaryDay = salaryHour * 7.7;
            double salaryWeek = salaryDay * 5;
            double salaryMonth = salaryWeek * 4;
            double salaryYear = salaryMonth * 12;

            double salaryNetMonthly = salaryMonth - (salaryMonth * cadre / 100 ) ;
            double salaryNetYearly = salaryNetMonthly * 12;

            double salaryNetMonthlyImpot = salaryNetMonthly - (salaryNetMonthly * impot / 100);
            double salaryNetYearlyImpot = salaryNetYearly - (salaryNetYearly * impot / 100);

            System.out.println(salaryDay + "€ Brut par jour");
            System.out.println(salaryWeek + "€ Brut par semaine");
            System.out.println(salaryMonth + "€ par mois");
            System.out.println(salaryYear + "€ par an");
            System.out.println(salaryNetMonthly + "€ net par mois");
            System.out.println(salaryNetYearly + "€ net par an");
            System.out.println(salaryNetMonthlyImpot + "€ net par mois apres impot");
            System.out.println(salaryNetYearlyImpot + "€ net par an apres impot");

        }

}
