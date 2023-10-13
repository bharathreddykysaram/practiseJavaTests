package PvanSirJavInterviewQuestions;

public class Swapping2Numbers {

    public static void main(String args[])
    {

        //5different ways of swapping numbers

        //logic 1 -third variable
        int a=10,b=20;
        System.out.println("before swapping values are.."+a+" "+b);


        int t=a;
        a=b;
        b=t;


        System.out.println("after swapping values are.."+a+" "+b);


        //logic 2 -without third variable

        int c=10,d=20;
        System.out.println("before swapping values are.."+c+" "+d);

        c=c+d;
        c=c-d;
        d=c-d;

        System.out.println("after swapping values are.."+c+" "+d);





    }
}
