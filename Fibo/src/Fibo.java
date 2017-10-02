public class Fibo {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        if(n3 <= 1000) {
            System.out.print(" " + n3);
            printFibonacci();
        }
    }
    public static void main(String args[]){
        System.out.print(n1+" "+n2);
        printFibonacci();
    }
}
