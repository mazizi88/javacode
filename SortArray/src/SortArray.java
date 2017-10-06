import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        System.out.println("Please enter count of numbers:");
        Scanner sc =new Scanner(System.in);
        int numOfName = sc.nextInt();
        int[] numbers = new int[numOfName];

        for (int i=0;i < numOfName;i++){
            System.out.println("Please enter a number:");
            numbers[i] = sc.nextInt();
        }

        sort(numbers);
        System.out.println("Sorted Numbers that input:");
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

    static void sort(int[] array){
        int a, b;
        int temp;
        int count = array.length;

        for (a = 0; a < count; a++) {
            for (b = 0; b < count-1; b++) {
                if (array[b] < array[b + 1]) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }
}