package PvanSirJavInterviewQuestions;

public class ReverseString {


    public static void main(String args[]){

       //1) using + (String concatentaion ) operator
        //here in this logic we need to get the length of the string and do charAt(i)

        String revTest="bharat";

        String testRev="";

        int lengthRevtest=revTest.length();
//
//        for(int i=lengthRevtest-1;i>=0;i--){
//            testRev=testRev+revTest.charAt(i);
//        }
//
//        System.out.println("revrsestring    "+testRev);
//

        //by using char array i.e., toChararray[]

        char a[]=revTest.toCharArray();

        for(int i=a.length-1;i>=0;i--){
            testRev=testRev+a[i];
        }
        System.out.println("testrev    "+testRev);


    }
}
