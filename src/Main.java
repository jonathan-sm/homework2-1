public class Main { public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();

}



    public static void task1 () {
        System.out.println("Задача 1");
        int a = 300;
        byte b = 100;
        short c = 10000;
        long d = 200000;
        float e = 3.4F;
        double f = 2.5;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b c типом byte равно " + b);
        System.out.println("Значение переменной c c типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int a = 569;
        byte b = 67;
        short c = -159;
        long d = 987678965549L;
        float e = 27.12F;
        double f = 2.786;
        int h = 27897;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b c типом byte равно " + b);
        System.out.println("Значение переменной c c типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println("Значение переменной h с типом int равно " + h);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short totalList = 480;
        int eachStudent = totalList/ ( classAS + classEA + classLP);
        System.out.println(" На каждого ученика рассчитано " + eachStudent + " листов бумаги.");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte performance = 16;
        byte time= 2;
        int oneMinute = performance / time;
        int twentyMinutes = oneMinute * 20;
        int perDay = oneMinute * 60 * 24;
        int threeDays = perDay * 3;
        int oneMonth = perDay * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок.");
        System.out.println("За три дня машина произвела " + threeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок.");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte white = 2;
        byte brown = 4;
        int totalClass = totalCans  / (white+brown);
        int totalWhite = totalClass * 2;
        int totalBrown = totalClass * 4;
        System.out.println( "В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");
    }    public static void task6 () {
            System.out.println("Задача 6");
            byte bananas = 5;
            int milk =200;
            byte iceCream = 2;
            byte raweEggs = 4;
            int totalCoctel = bananas * 80 + milk * 105 + iceCream * 100 + raweEggs * 70;
            System.out.println("вес коктеля " + totalCoctel + " граммах.");
            float totalCoctel2 = totalCoctel / 1000f;
            System.out.println("вес коктеля " +totalCoctel2 + " кг");


    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte loseWeight = 7;
        int mihusGr = 250;
        int mihusGr2 =500;
        int result = loseWeight * 1000 / mihusGr ;
        System.out.println("Eсли спортсмен будет терять каждый день по 250 грамм, то ему понадобится " + result + " дней.");
        int result2 = loseWeight *1000 / mihusGr2;
        System.out.println("Eсли спортсмен будет терять каждый день по 500 грамм, то ему понадобится " + result2 + " дней");
         int average = (loseWeight * 1000) / ((mihusGr2 + mihusGr)/ 2);
        System.out.println("В среднем спортсмену может понадобится " + average + " дней для достижения результата");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denic =83690;
        int kristina = 76230;
        double mashaPremium = masha+ masha * 0.1;
        double denicPremium = denic + denic * 0.1;
        double  kristinaPremium = kristina + kristina * 0.1;
        double differenceMasha = mashaPremium * 12 - masha * 12;
        double differenceDenic = denicPremium * 12 - denic * 12;
        double differenceKric = kristinaPremium * 12 - kristina * 12;
        System.out.println("Маша теперь получает " + mashaPremium + " рублей, Годовой доход вырос " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + denicPremium + " рублей, Годовой доход вырос " + differenceDenic + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaPremium + " рублей, Годовой доход вырос " + differenceKric + " рублей.");
    }

}