package org.example;

public class MissningNumbersArray {


    public static void main(String args[]) {

        int a[] = {1, 2, 5 };

      //  int a[] = {1, 2, 5, 7, 9, 10, 15};
        int sum=0;
        for(int i=0;i<a.length;i++){



           sum =sum+a[i];

        }
        System.out.println(sum);


        int sum1=0;
        for(int i=1;i<=5;i++){

            sum1 =sum1+i;
        }
        System.out.println(sum1);
        System.out.println(sum1-sum);










    }


}
