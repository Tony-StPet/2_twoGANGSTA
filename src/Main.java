//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Два бандита");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите количество банок по которым бандиты стреляют");
        int can = scan.nextInt();
        System.out.println("Количество банок = " + can);
        System.out.println("Гарри начал простреливать банки по порядку, начиная с самой левой, " +
                "Ларри — с самой правой. В какой-то момент получилось так, что они одновременно прострелили одну и ту же последнюю банку");
        System.out.println("Введите количество выстрелов Гарри");
        int g = scan.nextInt();
        System.out.println("Гарри прострелил " + g + " банки");
        System.out.println("Введите количество выстрелов Ларри");
        int l = scan.nextInt();
        System.out.println("Ларри прострелил " + l + " банки");
        System.out.println("Сколько банок не прострелил каждый бандит?");
        System.out.println("ОТВЕТ");
        g = can - g;
        System.out.println("Гарри не прострелил " + g + " банки");
        l = can - l;
        System.out.println("Ларри не прострелил " + l + " банки");

    }
}