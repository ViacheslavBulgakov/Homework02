public class Main {
    public static void main(String[] args) {

        //задача 1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println();
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //задача2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println();
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //задача3

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println();
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //задача4

        var friend = 19;
        System.out.println();
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        //задача5

        var frog = 35.0;
        System.out.println();
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        //задача6

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        System.out.println();
        System.out.println("Суммарный вес = " + (weightBoxer1 + weightBoxer2));
        System.out.println("Разница в весе = " + (weightBoxer2 - weightBoxer1));

        //задача7

        System.out.println();
        System.out.println("Разница в весе = " + (weightBoxer2 - weightBoxer1));
        System.out.println("Разница в весе = " + weightBoxer2 % weightBoxer1);

        //задача8

        var numbrEmpl = 0;
        var timeTotal = 640;
        var timeEmpl = 8;
        System.out.println();
        System.out.println("Всего работников в компании - " + timeTotal/timeEmpl + " человек.");
        numbrEmpl = timeTotal/timeEmpl;
        numbrEmpl = numbrEmpl + 94;
        System.out.println("Если в компании работает " + numbrEmpl + " человек, то всего " + numbrEmpl * timeEmpl +
                " часа работы может быть поделено между сотрудниками.");

    }
}