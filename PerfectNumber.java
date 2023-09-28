package Letcode;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number;
        int total=0;
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Sayıyı giriniz : ");
        number= sc.nextInt();
        while(i < number){
           if(number%i==0){
               total+=i;
           }

            i++;
        }
        if(total==number){
            System.out.println(i+" Mükemmel sayıdır.");
        }else{
            System.out.println(i+" Mükemmel sayı değildir.");
        }
    }
}
