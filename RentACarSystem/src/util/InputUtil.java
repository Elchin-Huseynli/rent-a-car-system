package util;

import java.util.Scanner;

public class InputUtil {
    public static String inputTypeString(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextLine();
    }

    public static int inputTypeInteger(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextInt();
    }
    public static long inputTypeLong(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextLong();
    }
}
