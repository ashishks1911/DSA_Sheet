package org.codingblocks.arrays;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Is_Boston(n));

    }
    public static int Is_Boston(int n){
        int temp1 =sumofprime(n);
        int temp2=sumofdigits(n);
        if(temp1==temp2){
            return 1;

        }else{
            return 0;
        }

    }
public static int sumofprime(int n ){
    int sum1=0;
    int number =n;
    for(int  j=2;j<=number ;j++){
        int rem1=number%j;
        int i=j;
        if(rem1==0){while (i>0) {
            sum1+=i%10;
            i=i/10;
        }
            number/=j;
            j--;
        }
    }

    return sum1;
}
    public static int sumofdigits(int n ){
        int sum2=0;
        while (n>0){
            int rem2=n%10;
            sum2+=rem2;
            n/=10;
        }
        return sum2;

    }


}