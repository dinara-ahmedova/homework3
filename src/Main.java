public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача 1");
        byte people = 10;
        int oranges = 100;
        short seeds = 1000;
        long cells = 1000000L;
        System.out.println("Значение переменной " + people + " с типом byte равно 10");
        System.out.println("Значение переменной " + oranges + " с типом int равно 100");
        System.out.println("Значение переменной " + seeds + " с типом short равно 1000");
        System.out.println("Значение переменной " + cells + " с типом long равно 1000000");

        System.out.println("Задача 2");
        float one = 27.12f;
        System.out.println(one);
        long two = 987678965549L;
        System.out.println(two);
        float three = 2.786f;
        System.out.println(three);
        short four = 569;
        System.out.println(four);
        short five = -159;
        System.out.println(five);
        short six = 27897;
        System.out.println(six);
        byte seven = 67;
        System.out.println(seven);

        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int allStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int sheetsForEveryStudents = paper / allStudents;
        System.out.println("На каждого ученика расчитано " + sheetsForEveryStudents + " листов бумаги");

        System.out.println("Задача 4");
        byte bottlesIn2Min = 16;
        int bottlesPerMin = bottlesIn2Min / 2;
        byte time20 = 20;
        int bottlesPer20Min = bottlesPerMin * time20;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Min + " штук бутылок");
        short minIn24Hours = 1440;
        int bottlesPer24Hours = bottlesPerMin * minIn24Hours;
        System.out.println("За сутки машина произвела " + bottlesPer24Hours + " штук бутылок");
        short minInThreeDays = 4320;
        int bottlesPerThreeDays = minInThreeDays * bottlesPerMin;
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        int minPerMonth = 43200;
        int bottlesPerMonth = minPerMonth * bottlesPerMin;
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        System.out.println("Задача 5");
        byte allCans = 120;
        byte cansOfWhitePaintForClass = 2;
        byte cansOfBrownPaintForClass = 4;
        byte cansOfPaintForClass = (byte) (cansOfWhitePaintForClass + cansOfBrownPaintForClass);
        byte allClasses = (byte) (allCans / cansOfPaintForClass);
        byte cansOfWhitePaintPerClass = (byte) (allClasses * cansOfWhitePaintForClass);
        byte cansOfBrownPaintPerClass = (byte) (allClasses * cansOfBrownPaintForClass);
        System.out.println("В школе, где " + allClasses + " классов, нужно " + cansOfWhitePaintPerClass + " банок белой краски и " + cansOfBrownPaintPerClass + " банок коричневой краски");

        System.out.println("Задача 6");
        byte bananas = 5;
        byte oneBananaGr = 80;
        short bananasGr = (short) (bananas * oneBananaGr);
        byte milk100InGr = 105;
        short milk200InGr = (short) (milk100InGr * 2);
        byte iceCream = 2;
        byte oneIceCreamInGr = 100;
        short iceCreamInGr = (short) (iceCream * oneIceCreamInGr);
        byte eggs = 4;
        byte oneEggInGr = 70;
        short eggsInGr = (short) (eggs * oneEggInGr);
        int allIngredients = bananasGr + milk200InGr + iceCreamInGr + eggsInGr;
        float allIngredientsInKg = allIngredients / 1000f;
        System.out.println(allIngredients + " г.");
        System.out.println(allIngredientsInKg + " кг.");

        System.out.println("Задача 7");
        byte goalKg = 7;
        short goalGr = (short) (goalKg * 1000);
        short loseWeightForDayGr1 = 250;
        int daysToTheGoalOf250Gr = goalGr / loseWeightForDayGr1;
        System.out.println( daysToTheGoalOf250Gr + " дней уйдёт на похудение,если терять по 250г в день");
        short loseWeightForDayGr2 = 500;
        int daysToTheGoalOf500Gr = goalGr / loseWeightForDayGr2;
        System.out.println( daysToTheGoalOf500Gr + " дней уйдёт на похудение, если терять по 500 г в день");
        byte daysAverage = (byte) ((daysToTheGoalOf250Gr + daysToTheGoalOf500Gr) / 2);
        System.out.println(daysAverage + " дней в среднем потребуется, чтобы добиться результатов похудения");

        System.out.println("Задача 8");
        int mashaGets = 67760;
        float mashaMonthPrize = mashaGets * 0.1f;
        byte monthsOfTheYear = 12;
        int mashaYearPrize = (int) (mashaMonthPrize * monthsOfTheYear);
        int mashaGetsWithMonthPrize = (int) (mashaGets + mashaMonthPrize);
        System.out.println("Маша теперь получает " + mashaGetsWithMonthPrize + " рублей в месяц. Годовой доход вырос на " + mashaYearPrize + " рублей.");
        int denisGets = 83690;
        float denisMonthPrize = denisGets * 0.1f;
        int denisYearPrize = (int) (denisMonthPrize * monthsOfTheYear);
        int denisGetsWithMonthPrize = (int) (denisGets + denisMonthPrize);
        System.out.println("Денис теперь получает " + denisGetsWithMonthPrize + " рублей в месяц. Годовой доход вырос на " + denisYearPrize + " рублей.");
        int kristinaGets = 76230;
        float kristinaMonthPrize = kristinaGets * 0.1f;
        int kristinaYearPrize = (int) (kristinaMonthPrize * monthsOfTheYear);
        int kristinaGetsWithMonthPrize = (int) (kristinaGets + kristinaMonthPrize);
        System.out.println("Кристина теперь получает " + kristinaGetsWithMonthPrize + " рублей в месяц. Годовой доход вырос на " + kristinaYearPrize + " рублей.");
        int annualIncomeBeforeTheIncreaseMasha = 81312;
        float mashaMonthPrizeAfterThePromotion = mashaGetsWithMonthPrize * 0.1f;
        float annualIncomeAfterTheIncreaseMasha = mashaMonthPrizeAfterThePromotion * monthsOfTheYear;
        float differenceInAnnualIncomeMasha = annualIncomeAfterTheIncreaseMasha - annualIncomeBeforeTheIncreaseMasha;
        System.out.println("Разница между годовым доходом до и после повышения Машы составляет " + differenceInAnnualIncomeMasha + " рублей.");
        int annualIncomeBeforeTheIncreaseDenis = 100428;
        float denisMonthPrizeAfterThePromotion = denisGetsWithMonthPrize * 0.1f;
        float annualIncomeAfterTheIncreaseDenis = denisMonthPrizeAfterThePromotion * monthsOfTheYear;
        float differenceInAnnualIncomeDenis = annualIncomeAfterTheIncreaseDenis - annualIncomeBeforeTheIncreaseDenis;
        System.out.println("Разница между годовым доходом до и после повышения Дениса составляет " + differenceInAnnualIncomeDenis + " рублей.");
        int annualIncomeBeforeTheIncreaseKristina = 91476;
        float kristinaMonthPrizeAfterThePromotion = kristinaGetsWithMonthPrize * 0.1f;
        float annualIncomeAfterTheIncreaseKristina = kristinaMonthPrizeAfterThePromotion * monthsOfTheYear;
        float differenceInAnnualIncomeKristina = annualIncomeAfterTheIncreaseKristina - annualIncomeBeforeTheIncreaseKristina;
        System.out.println("Разница между годовым доходом до и после повышения Кристины составляет " + differenceInAnnualIncomeKristina + " рублей.");
































    }
}
