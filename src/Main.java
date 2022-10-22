public class Main {

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int applesCount = 5;
        System.out.println("Значение переменной applesCount с типом  int равно " + applesCount);
        byte orangesCount = 4;
        System.out.println("Значение переменной orangesCount с типом byte равно " + orangesCount);
        short catsCount = 3;
        System.out.println("Значение переменной catsCount с типом short равно " + catsCount);
        long peopleCount = 7_500_000_000L;
        System.out.println("Значение переменной peopleCount с типом long равно " + peopleCount);
        float pi = 5.141592F;
        System.out.println("Значение переменной pi с типом float равно " + pi);
        double e = 2.8;
        System.out.println("Значение переменной e с типом double равно " + e);

        //Задача 2
        System.out.println("Задача 2");
        float variable1 = 27.12F;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.876;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

        //Задача 3
        System.out.println("Задача 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 39;
        int papersCount = 480;
        int papersPerPupil = papersCount / (pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + productivityPerMinute * twentyMinutes + " штук");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минут машина произвела бутылок " + productivityPerMinute * minutesInDay + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + productivityPerMinute * minutesInThreeDays + " штук");
        int minutesInMonth = 10 * minutesInThreeDays; // в месяце 30 дней
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок " + productivityPerMinute * minutesInMonth + " штук");

        //Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задача 6
        System.out.println("Задача 6");
        int bananas = 5;
        int weightBananas1 = 80;
        int milk100ml = 2;
        int weightMilk100Ml = 105;
        int iceCream = 2;
        int weightIceCream1 = 100;
        int rawEggs = 4;
        int weightEgg1 = 70;
        int totalWeightInGrams = (bananas * weightBananas1) + (milk100ml * weightMilk100Ml) + (iceCream * weightIceCream1) + (rawEggs * weightEgg1);
        System.out.println(totalWeightInGrams);
        double doubleTotalWeightInGrams = totalWeightInGrams;
        double totalWeightInKilograms = doubleTotalWeightInGrams / 1000;
        double totalWeightInKilograms1 = (double) totalWeightInGrams / 1000;
        System.out.println(totalWeightInKilograms);
        System.out.println(totalWeightInKilograms1);

        //Задача 7
        System.out.println("Задача 7");
        int loseWeight = 7;
        int loseWeightInDayGrams = 250;
        int loseWeightInDayKilograms = 500;
        int dayForLosing1Kilograms = 1000 / loseWeightInDayGrams;
        int dayForLosing1Kilograms2 = 1000 / loseWeightInDayKilograms;
        int daysForLosingWeightInGrams = dayForLosing1Kilograms * 7;
        System.out.println(daysForLosingWeightInGrams);
        int daysForLosingWeightInKilograms = dayForLosing1Kilograms2 * 7;
        System.out.println(daysForLosingWeightInKilograms);
        int daysOnAverageForLosingWeight = (daysForLosingWeightInGrams + daysForLosingWeightInKilograms) / 2;
        System.out.println(daysOnAverageForLosingWeight);

        //Задача 8
        System.out.println("Задача 8");
        int MarysSalary = 67_760;
        int DensSalary = 83_690;
        int KrisSalary = 76_230;
        int indexingOfMarysSalary = MarysSalary * 10 / 100;
        int indexingOfDensSalary = DensSalary * 10 / 100;
        int indexingOfKrisSalary = KrisSalary * 10 / 100;
        int payRiseMary = MarysSalary + indexingOfMarysSalary;
        int payRiseDen = DensSalary + indexingOfDensSalary;
        int payRiseKris = KrisSalary + indexingOfKrisSalary;
        int MarysSalaryPerYear = MarysSalary * 12;
        int MarysSalaryPerYearNew = payRiseMary * 12;
        System.out.println("Маша теперь получает " + payRiseMary + " рублей. Годовой доход вырос на " + (MarysSalaryPerYearNew - MarysSalaryPerYear) + " рублей.");
        int DensSalaryPerYear = DensSalary * 12;
        int DensSalaryPerYearNew = payRiseDen * 12;
        System.out.println("Денис теперь получает " + payRiseDen + " рублей. Годовой доход вырос на " + (DensSalaryPerYearNew - DensSalaryPerYear) + " рублей.");
        int KrisSalaryPerYear = KrisSalary * 12;
        int KrisSalaryPerYearNew = payRiseKris * 12;
        System.out.println("Кристина теперь получает " + payRiseKris + " рублей. Годовой доход вырос на " + (KrisSalaryPerYearNew - KrisSalaryPerYear) + " рублей.");
















    }
}