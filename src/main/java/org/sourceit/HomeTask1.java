package org.sourceit;

public class HomeTask1 {

 public static void main(String[] args) {
        isEven(7);
        findHypotenuse(3, 4);
        perimeter(4, 3, 5);
        area(3, 4);
        generateNumberFromRange(10, 75);
        calculateSum(1234);
        fibonacci(10);
        isHappy(111111);

        }

  /**
         * Проверить, является ли число четным.
         */

      public static boolean isEven(int z) {
      System.out.print("Число " + z + " ");
      if (z % 2 == 0) {
    System.out.println("четное");
       } else System.out.println("нечетное");
      return z % 2 == 0;
      }

   /**
         * Метод возвращает значение гипотенузы.
         */
      public static double findHypotenuse(double a, double b) {
      double c;
       c = Math.sqrt(a * a + b * b);
      System.out.println("Гипотенуза c = " + c);
   return c;
        }

    /**
         * Метод находит периметр треугольника.
         */
        public static double area(double s1, double s2) {
        double s3 = Math.sqrt(s1 * s1 + s2 * s2);
        double pp = (s1 + s2 + s3)/2;
        double pl = Math.sqrt((pp*(pp-s1)*(pp-s2)*(pp-s3)));
       System.out.println("Площадь прямоугольного треугольника равна " + pl);
        return 0D;
        }

   /**
         * Метод находит площадь прямоугольного треугольника.
         */
        public static double perimeter(double s, double l, double m) {
        double pTrial = s + l + m;
        System.out.println("Периметр прямоугольного треугольника равен " + (double) pTrial);
        return 0D;
        }

  /**
         * Генерирует случайное число в заданных пределах.
         */
       public static int generateNumberFromRange(int min, int max) {
       int rnd = rnd(min, max);
        System.out.println("Псевдослучайное целое число: " + rnd);
       return rnd;
        }

  /**
         * Метод получения псевдослучайного целого числа от min до max (включая max);
         */
      public static int rnd(int min, int max) {
        max -= min;
       return (int) (Math.random() * ++max) + min;
        }

 /**
         * Считает сумму цифр числа.
         */
        public static int calculateSum(long number) {
        long s = 0L; // сумма цифр
        for (long i = number; i > 0; i /= 10){ // делим нацело на 10
           s += i % 10; }
        System.out.println("Сумма цифр в " + number + " равна " + s);
        return 0;
        }

    /**
         * Считает элемент последовательности Фибоначчи.
         */
        public static int fibonacci(int num) {

        System.out.println("Элементы последовательности Фибоначчи:");
        int f1, f2=0, f3=1;
        for(int i=1;i<=num;i++) {
            System.out.print(" "+f3+" ");
           f1 = f2;
         f2 = f3;
           f3 = f1 + f2;
           }
        return num;
        }

    /**
         * Проверить, является ли билет счастливым
         */
        public static boolean isHappy(int t) {

            int number1 = t / 100000;
            int number2 = (t / 10000) % 10;
            int number3 = (t / 1000) % 10 % 10;
            int number4 = (t / 100) % 10 % 10 % 10;
            int number5 = (t / 10) % 10 % 10 % 10 % 10;
            int number6 = t % 10 % 10 % 10 % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                System.out.println("Счастливый билет");
            } else {
                System.out.println("Несчастливый билет");
            }
            if (t < 1 || t > 999999) {
                return false;
            }
            return true;
        }
        }
