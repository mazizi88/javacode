import java.util.*;

public class PowersOfTwo {

    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean isPowersOfTwo = checkPowersOfTwo(input);
        System.out.println("The number is powers of two: " + isPowersOfTwo);
    }

    static boolean checkPowersOfTwo(String input) {
        boolean flag = false;

        try {
            int i = Integer.parseInt(input);

            //int i2=(i & (i - 1));
            if ((i > 0) && ((i & (i - 1)) == 0))
                flag = true;
            else
                flag = false;
        } catch (java.lang.Exception ex) {
            System.out.println("The number is incorrect.");
        }

        return flag;
    }
}
