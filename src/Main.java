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

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


    }
    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);


    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        var dog = 12;
        var cat = 7.6;
        var paper = 763793;
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 9;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        var frog = 3.5;
        System.out.println(frog);
        frog =frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        System.out.println(frog + 4);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var totalWeight = (fighterWeight1 + fighterWeight2);
        System.out.println(totalWeight);
        var weightDifference = (fighterWeight2 - fighterWeight1);
        System.out.println(weightDifference);

    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var liftingCapacity = 160.9;
        var weightDifference = (fighterWeight2 - fighterWeight1);
        System.out.println(weightDifference);
        var overload = (fighterWeight2 - fighterWeight1) % liftingCapacity;
        System.out.println(overload);

    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
    var totalNumberOfHoursWorked = 640;
    var totalNumberOfHoursWorked1Employee = 8;
    var totalEmployees = (totalNumberOfHoursWorked / totalNumberOfHoursWorked1Employee);
    System.out.println("Всего работников " + totalEmployees);
    var additionalWorkers = 94;
    var totalNumberOfHoursWorkedEmployee = (additionalWorkers + totalEmployees);
    System.out.println(totalNumberOfHoursWorkedEmployee);
    var totalNumberOfHoursWorked1Employee1 = (totalNumberOfHoursWorkedEmployee / totalNumberOfHoursWorked1Employee);
    System.out.println("Если в компании работает "   + totalNumberOfHoursWorkedEmployee + " человека то всего " + totalNumberOfHoursWorked1Employee1 + " часов работы может быть поделено между сотрудниками!");



    }}





