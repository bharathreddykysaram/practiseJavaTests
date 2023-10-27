package InheritancePractice;

public class TestFinalMethod3 extends TestFinalMethod1{

    public void method3() {
        System.out.println("in 3 method");
    }

    public static void main(String args[]) {

        TestFinalMethod1 ts=new TestFinalMethod1(); //
        ts.method2();
        ts.method1();
        ts.method1();


        TestFinalMethod t1=new TestFinalMethod();//so here it is parent it will print only parent method only
        t1.method1();


        TestFinalMethod3 t3=new TestFinalMethod3();//here it will print only left side class methods only i.e., TestFinalMethod3
        t3.method2();
        t3.method1();
        t3.method3();

        TestFinalMethod t4 =new TestFinalMethod3();//
        t4.method1();
        //so here it will print only parent methods only

     //   TestFinalMethod3 t5=new TestFinalMethod(); here we will get cast expression error we cant take like this




    }


}
