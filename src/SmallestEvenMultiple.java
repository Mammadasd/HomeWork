import java.util.Scanner;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int answer=(number%2==0)? number : number*2;
        System.out.println(answer);

    }
}
