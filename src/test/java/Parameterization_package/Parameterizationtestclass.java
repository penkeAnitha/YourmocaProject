package Parameterization_package;

import org.testng.annotations.Test;

public class Parameterizationtestclass {
    @Test
    public void parameterTest() {
        // Print or use the parameter in your test

    }
    @Test(groups = "sanity")
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups = "smoke")
    public void test2(){
        System.out.println("test2");
    }

    @Test(groups = "sanity")
    public void test3(){
        System.out.println("test3");
    }

    @Test(groups = "smoke")
    public void test4(){
        System.out.println("test4");
    }

}
