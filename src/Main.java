public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        byte peas = 120;
        short chery = 32023;
        int apple = 100500800;
        long coconut = 9008007006005004000l;
        double size = 7.00062;
        float temp = 36.6f;
        // Объявляем переменные и инициализируем их.
        System.out.println("Значение переменной peas c типом byte равно: " + peas);
        System.out.println("Значение переменной chery c типом short равно: " + chery);
        System.out.println("Значение переменной apple c типом int равно: " + apple);
        System.out.println("Значение переменной coconut c типом long равно: " + coconut);
        System.out.println("Значение переменной size c типом double равно: " + size);
        System.out.println("Значение переменной temp c типом float равно: " + temp);
        // Выводим переменные и их значения в консоль.
    }

    public static void task2() {
        System.out.println("Задача 2.");
        float f = 27.12f;
        long l = 987678965549l;
        double d = 2.786;
        short s = 569;
        short sh = -159;
        int i = 27897;
        System.out.println("float: " + f + "\nlong: " + l + "\ndouble: " + d + "\nshort: " + s + "\nshort: " + sh + "\nint: " + i);
    }

    public static void task3() {
        System.out.println("Задача 3.");
        byte classStudents_1 = 23;
        byte classStudents_2 = 27;
        byte classStudents_3 = 30;
        int countStudents = classStudents_1 + classStudents_2 + classStudents_3;
        short paper = 480;
        int paperStudents = paper / countStudents;
        System.out.println("На каждого ученика расчитано " + paperStudents + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача 4.");
        byte productMinute = 8;
        int bottleMinute20 = productMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottleMinute20 + " штук бутылок.");
        int minuteOfDays = 1440;
        int bottleDays = productMinute * minuteOfDays;
        System.out.println("За сутки машина произвела " + bottleDays + " штук бутылок.");
        bottleDays *= 3;
        System.out.println("За 3 дня машина произвела " + bottleDays + " штук бутылок.");
        bottleDays *= 31;
        System.out.println("За месяц машина произвела " + bottleDays + " штук бутылок.");
    }

    public static void task5() {
        System.out.println("Задача 5.");
        byte paintWhite = 2;
        byte paintBrown = 4;
        int x = 120;
        int classOfschool = x / (paintBrown + paintWhite);
        int countPaintWhite = paintWhite * classOfschool;
        int countPaintBrown = paintBrown * classOfschool;
        System.out.println("В школе, где " + classOfschool + " классов, нужно " + countPaintWhite + " банок белой краски и " + countPaintBrown + " банок коричневой краски.");
    }

    public static void task6() {
        System.out.println("Задача 6.");
        short banana = 80;
        banana *= 5;
        short milk = 105;
        milk *= 2;
        short iceCream = 100;
        iceCream *= 2;
        short egg = 70;
        egg *= 4;
        int countGrams = banana + milk + iceCream + egg;
        double countKilograms = (double) countGrams / 1000;
        System.out.println("Вес завтрака в граммах: " + countGrams + "\nВес завтрака в килограммах: " + countKilograms);
    }

    public static void task7() {
        System.out.println("Задача 7.");
        short targetKg = 7;
        int targetOfGrams = targetKg * 1000;
        short diet1 = 250;
        short diet2 = 500;
        int daysToTarget1 = targetOfGrams / diet1;
        int daysToTarget2 = targetOfGrams / diet2;
        int avgDays = (daysToTarget1 + daysToTarget2) / 2;
        System.out.println("Нужно дней для похудения при первом варианте диеты: " + daysToTarget1 + "\nНужно дней для похудения при втором варианте диеты: " + daysToTarget2 + "\nСреднее кол-во дней: " + avgDays);
    }

    public static void task8() {
        System.out.println("Задача 8.");
        int k = 10;
        int mashaBefore = 67760;
        float mashaAfter = (mashaBefore * k) / 100 + mashaBefore;
        float mashaDifference = mashaAfter - mashaBefore;
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaDifference + " рублей.");
        int denisBefore = 83690;
        float denisAfter = (denisBefore * k) / 100 + denisBefore;
        float denisDifference = denisAfter - denisBefore;
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");
        int kristinaBefore = 76230;
        float kristinaAfter = (kristinaBefore * k) / 100 + kristinaBefore;
        float kristinaDifference = kristinaAfter - kristinaBefore;
        System.out.println("Кристина теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей.");
    }
}