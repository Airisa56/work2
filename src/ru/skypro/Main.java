package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        int dog = 12;
        byte fish = 20;
        short mouse = 15;
        long hamster = 5L;
        double orangeIsPart = 0.5;
        float potatoes = 1.20F;
        boolean dogIsAdult = dog > 10;
        char bar = 35;

    // Задание 2
        double boxerWight1 = 78.2;
        double boxerWight2 = 82.7;
        double AllWightBoxer = boxerWight1 + boxerWight2;
        double BoxerDifference = boxerWight2 - boxerWight1;
        System.out.println("Общий вес боксеров"+ AllWightBoxer +"кг" );
        System.out.println("Разница в весе"+ BoxerDifference +"кг");

    // Задание 3
         byte Bananas = 5;
         byte milk = 2;
         byte IceCream = 2;
         byte eggs = 4;
         int BananasWight = 5*80;
         int milkWight = 2*105;
         int IceCreamWight = 2*100;
         int eggsWight = 4* 70;
         int AllWightBreakfast = BananasWight + milkWight+ IceCreamWight+ eggsWight;
         double breakfast = AllWightBreakfast/ 1000;
         System.out.println( "Общий вес завтрака "+ AllWightBreakfast+ "грамм");
         System.out.println( "Общий вес завтрака"+breakfast+ "в кг");

         // Задание 4
           byte AllWightReset=7;
           int AllWightReset1= 250;
           int AllWightReset2 = 500;
           double a = AllWightReset*1000;
           double b = a/AllWightReset1;
           double c = a/AllWightReset2;
           System.out.println("Столько уйдет дней на похудению, при потере 250 гр в день" +b+"дней");
           System.out.println( "При похудении на 500гр" +c+"дней");

        //Задание 5
          int WageMasha = 67760;
          int WageDenis = 83690;
          int WageKristina = 76230;
          double DifferenceMasha = WageMasha/100*10;
          double DifferenceDenis = WageDenis/100*10;
          double DifferenceKristina = WageKristina/100*10;
          double Masha = WageMasha+ DifferenceMasha;
          double Denis = WageDenis + DifferenceDenis;
          double Kristina = WageKristina + DifferenceKristina;
          System.out.println("Годовой доход Маши вырос на" + DifferenceMasha);
          System.out.println("Теперь Маша получает" + Masha);
          System.out.println ("Годовой доход Дениса вырос на " + DifferenceDenis);
          System.out.println("Теперь Денис получает" + Denis);
          System.out.println( "Годовой доход Кристины вырос на " + DifferenceKristina);
          System.out.println( "Теперь Кристина получает " + Kristina);




    }
}
