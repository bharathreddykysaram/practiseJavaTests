package PvanSirJavInterviewQuestions;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String args[])
    {


        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        StringBuffer sb= new StringBuffer(String.valueOf(num));
        StringBuffer rev= sb.reverse();
        System.out.println(rev);



        int i=Integer.parseInt(String.valueOf(rev));

        if(i==(num)){

            System.out.println("its paladrum");
        }
        else {
            System.out.println("its not paladrum");

        }
    }
}
