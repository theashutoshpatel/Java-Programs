// Write a function that takes in age as input and returns if that person is eligible to vote or not.
//  A person of age > 18 is eligible to vote.

import java.util.Scanner;
class Q5 {
    public static boolean age(int n){
        return n>=18;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age: ");
        int n=sc.nextInt();

        if(age(n))
            System.out.println("Yes aligible");
        else
            System.out.println("Not elegible");
    }
}
