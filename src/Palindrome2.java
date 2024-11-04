import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int a;
        int reversed=0;
        int num=number;

        while(num>0){
            a=num%10;
            reversed=reversed*10+a;
            num/=10;
        }
        if(reversed==number){
            System.out.println("number is polindrome");
        }else {
            System.out.println("number is not polindrome");
        }
//        System.out.println(reversed);

    }
}
