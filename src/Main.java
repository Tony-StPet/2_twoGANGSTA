//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Два бандита");
        System.out.println();
        System.out.println("Гарри начал простреливать банки по порядку, начиная с самой левой, " +
                "Ларри — с самой правой. В какой-то момент получилось так, что они одновременно прострелили одну и ту же последнюю банку");
        int g = 4;
        System.out.println("Гарри прострелил " + g + " банки");
        int l = 7;
        System.out.println("Ларри прострелил " + l + " банки");
        System.out.println("Сколько банок не прострелил каждый бандит?");
        System.out.println("ОТВЕТ");
        g = 10 - g;
        System.out.println("Гарри не прострелил " + g + " банки");
        l = 10 - l;
        System.out.println("Ларри не прострелил " + l + " банки");

    }
}