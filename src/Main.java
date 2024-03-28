//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var dog = 8.0;{
            System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxerOne = 78.2;
        System.out.println(weightBoxerOne + "кг");
        var weightBoxerTwo = 82.7;
        System.out.println(weightBoxerTwo + "кг");
        var sum = weightBoxerOne + weightBoxerTwo;
        System.out.println(sum + "кг");
        var difference = weightBoxerTwo - weightBoxerOne;
        System.out.println(difference + "кг");

        var remainder = weightBoxerTwo / weightBoxerOne;
        System.out.println(remainder);

        var workingHours = 640;
        var workingTimeEveryone = 8;
        var employees = workingHours / workingTimeEveryone;
        System.out.println("Всего работников в компании - " + employees + " человек");

        employees = employees + 94;
        System.out.println(employees + " сотрудника работает в компании теперь");
        var workingHoursNow = workingTimeEveryone * employees;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + workingHoursNow + " часов работы может быть поделено между сотрудниками");
        }
    }
}