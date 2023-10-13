package PvanSirJavInterviewQuestions;

import java.util.Scanner;

public class ReverseNumbers {

    //3diffeent ways of reverse of numbers


    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();//1234
        //1.

        int rev=0;
        while(num!=0)
        {

            rev=rev*10+num%10; //0+1234%10=4  40+3=43    430+2=432   4320+1=4321

            num=num/10;  ////1234/10=123   123/10=12  12/10=1  1/10=0
        }

        System.out.println("reverse num"+ rev);



        //2 using string buffer class

        Scanner sc1=new Scanner(System.in);
        int num1=sc1.nextInt();//1234

        StringBuffer sb=new StringBuffer(String.valueOf(num1));
        StringBuffer test=sb.reverse();
        System.out.println("reverse num"+ test);


        //3 using string builder class

        Scanner sc2=new Scanner(System.in);
        int num2=sc2.nextInt();//1234

        StringBuilder sbl=new StringBuilder();
        sbl.append(num2);
        StringBuilder rev1=new StringBuilder();
        StringBuilder  test12=rev1.reverse();
        System.out.println("reverse num in string builder"+ test12);












    }

}