import java.util.Scanner;
public class Library {
    static Scanner sc=new Scanner(System.in);
    static String[] names;
    static int[] memberIds,ages;
    static char[] genders;
    static boolean[] flags;
    static int lastMemberId =0;

    public static void main(String[] args) {
        System.out.println("Please enter number of members:");
        int len=sc.nextInt();

        names = new String[len];
        memberIds = new int[len];
        genders= new char[len];
        ages=new int[len];
        flags =new boolean[len];

        printMenu();
    }

    static void printMenu(){
        System.out.println("------Please enter a number between 1 to 5------");
        System.out.println("1)Add member");
        System.out.println("2)Delete member");
        System.out.println("3)Edit member");
        System.out.println("4)Show member");
        System.out.println("5)Exit");

        int input =sc.nextInt();
        switch (input){
            case 1:
                addMember();
                break;
            case 2:
                deleteMember();
                break;
            case 3:
                editMember();
                break;
            case 4:
                showMember();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    static void addMember(){
        System.out.print("Name: ");
        names[lastMemberId] =sc.next();
        System.out.print("Gender(F for female or M for male: ");
        genders[lastMemberId]=sc.next().charAt(0);
        System.out.print("Age: ");
        ages[lastMemberId] =sc.nextInt();
        System.out.println("New member ID: "+lastMemberId);

        flags[lastMemberId] = true;
        memberIds[lastMemberId] =lastMemberId;
        lastMemberId++;
        printMenu();
    }

    static void deleteMember() {

        System.out.print("Please enter ID of member: ");
        int deleteId = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < memberIds.length; i++) {
            if (memberIds[i] == deleteId && flags[deleteId] == true){
                flag = true;
                break;
            }
        }
        if (flag) {
            names[deleteId] ="";
            genders[deleteId]='a';
            ages[deleteId]=0;
            memberIds[deleteId]=lastMemberId+1;
            flags[deleteId] =false;
            System.out.println("Member "+deleteId+" Removed!");
        } else {
            System.out.println("Member not found!");
        }

        printMenu();
    }

    static void showMember(){
        System.out.print("Please enter ID of member: ");
        int showId =sc.nextInt();

        boolean flag =false;
        for (int i=0;i<memberIds.length;i++){
            if(memberIds[i] == showId && flags[showId] == true){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.print("Name: "+names[showId]+"\n");
            System.out.print("Gender: "+genders[showId]+"\n");
            System.out.print("Age: "+ages[showId]+"\n");
            System.out.print("ID: "+memberIds[showId]+"\n");
        }
        else {
            System.out.println("Member not found!");
        }

        printMenu();
    }

    static void editMember(){
        System.out.print("Please enter ID of member: ");
        int editId =sc.nextInt();

        boolean flag =false;
        for (int i=0;i<memberIds.length;i++){
            if(memberIds[i] == editId && flags[editId] == true){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.print("Name: ");
            names[editId] =sc.next();
            System.out.print("Gender(F for female or M for male: ");
            genders[editId]=sc.next().charAt(0);
            System.out.print("Age: ");
            ages[editId] =sc.nextInt();
            System.out.print("New member ID: "+lastMemberId);
        }
        else {
            System.out.println("Member not found!");
        }

        printMenu();
    }
}
