public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i = sc.nextInt();
        long output = factorialRecursive(i);
        System.out.println("Recursive is: " +output);
        long output2 = factorialLoop(i);
        System.out.println("Loop is: " +output2);
    }

    static long factorialRecursive (int i) {
        if (i <= 1)
            return 1;
        return i * factorialRecursive(i - 1);
    }

    static long factorialLoop (int i) {
        if (i <= 1)
            return 1;
        long output = 1;
        for (int x=i;x>0;x--)
            output *=x;
        return output;
    }

}
