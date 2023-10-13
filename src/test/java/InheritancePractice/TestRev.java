package InheritancePractice;

public class TestRev {






        public static void main(String[] args) {


            String s1="Bala";
            String s2="aB";

            String test="";
            String test1="";



            for(int i=s1.length();i<=s1.length()-1;i--){

                test+=s1.charAt(i);

                System.out.println("from s1"+test);
            }

            for(int j=s1.length();j<=s1.length()-1;j--){

                test1+=s2.charAt(j);

                System.out.println("from s2"+test1);

            }


            if(test.equals(test1)){

                System.out.println("string s1 contains elemnnts in s2"+test);

            }
            else{

                System.out.println("string s1 not  contains elemnnts in s2");

            }

        }









    }







