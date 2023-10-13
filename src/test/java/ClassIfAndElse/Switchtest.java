package ClassIfAndElse;

import java.util.Scanner;

public class Switchtest {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter value ");
        int day = sc.nextInt();

        String dayString;


        switch (day) {

            case 1:

                //System.out.println("its a monday");
                dayString="monday";
                break;


            case 2:

                dayString="tuesday";
                break;


            case 3:

                System.out.println("its a wednesday");
                break;


            case 4:

                System.out.println("its a thruesday");
                break;

            case 5:

                System.out.println("its a friday");
                break;

            default:

                System.out.println("its weekend");



        }


    }

}
