package ClassIfAndElse;

import java.util.Scanner;

public class Test1 {
    public static void main(String args[]) {

        //int  [] a={1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter value ");
        int j = sc.nextInt();

// 34  -->33 34 35 lb-1 lb lb+1
// 100  -->99 100 101 ub-1 ub ub+1


        if(j>=0&&j<=34){


            System.out.println("student gets fail");


        } else if (j>=35&&j<=60) {

            System.out.println("student gets second class ");

        }else if(j>60&&j<=100) {


            System.out.println("student gets first class ");
        }
        else {
            System.out.println("invalid marks");

        }

    }
}
