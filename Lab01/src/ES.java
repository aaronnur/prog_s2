import java.util.Scanner;
public class ES{
    static Scanner scanner = new Scanner(System.in);
    public static void print(String msg) {
        System.out.println(msg);
    }
    public static String input(String msg) {
        System.out.print(msg);
        String s;
        s= scanner.nextLine();
        return s;
    }
    public static double toDouble(String s) {
        return Double.parseDouble(s);
    }
    public static int toInt(String s) {
        return Integer.parseInt(s);
    }
}