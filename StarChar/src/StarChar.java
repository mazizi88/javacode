import java.util.*;

public class StarChar {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        printChar(base);
    }
    static void printChar(int base) {
        for (int i = 0; i < base; i += 1) {
            for (int j = 0; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }

//        byte mod =(byte)( base % 2);
//        if(mod ==0)
//            base -= 3;
//        else if (mod ==1)
//            base -= 2;

        base -= 1;
        for (int i = base; i > 0; i -= 1) {
            for (int j = 0; j < i; j++)
                System.out.print('*');
            System.out.println();
        }
        //System.out.print('*');
    }
}
