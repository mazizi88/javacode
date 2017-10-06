import java.util.Scanner;

public class Seyyed {
    public static void main(String[] args) {
        System.out.println("Please enter number of names:");
        Scanner sc =new Scanner(System.in);
        int numOfName = sc.nextInt();
        String[] names = new String[numOfName];
        int countSeyyed = 0;
        for (int i=0;i < names.length;i++){
            System.out.println("Please enter a name:");
            names[i] = sc.next();
            if(names[i].toLowerCase().contains("seyyed"))
                countSeyyed++;
        }

        System.out.println("Count of Seyyed: "+countSeyyed);
    }
}
