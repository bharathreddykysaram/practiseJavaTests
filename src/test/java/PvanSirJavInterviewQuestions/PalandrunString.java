package PvanSirJavInterviewQuestions;

import java.util.Scanner;

public class PalandrunString {

    public static void main(String args[]) {



        Scanner sc=new Scanner(System.in);

        String num=sc.next();

        int test=num.length();

        String rev="";

        for(int i=test-1;i>=0;i--)
        {

           rev=rev+num.charAt(i);


        }

        System.out.println("after reverse+"+ rev);

        if(num.equals(rev)){

            System.out.println("palandrum");
        }

        else

        {
            System.out.println("its not palandrum");
        }

    }



}
