import java.util.Scanner;
public class CompareTwoArray {
    public static void main(String[] args) {
        System.out.println("Please enter length of arrays:");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Please enter numbers of array1:");
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < len; i++) {
            System.out.println("Please enter numbers of array2:");
            arr2[i] = sc.nextInt();
        }

        boolean flag = compareTwoArray(arr1, arr2);
        System.out.println("Compare two arrays is: "+ flag);
    }

    static boolean compareTwoArray(int[] arr1, int[] arr2) {
        boolean flag = false;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]== arr2[i]){
                    flag=true;
                    continue;
                }
                else {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }

}
