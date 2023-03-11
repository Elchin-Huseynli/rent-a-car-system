package util;

import static util.InputUtil.inputTypeInteger;

public class MenuUtil {
    public static Integer entry() {
        System.out.println("\n------ RENT A CAR SYSTEM ------\n" +
                "\n[0] Exit System" +
                "\n[1] Order car" +
                "\n[2] Show orders" +
                "\n[3] Add Car"
        );
        return inputTypeInteger("Choose option: ");
    }
}
