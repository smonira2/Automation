package TestNGBasic;

import org.testng.annotations.Test;

public class BasicAction {

    @Test(priority = 2)
    public static void method1(){
        System.out.println("TestNG Awesome");
    }
    @Test(priority = 1)
    public static void method2(){
        System.out.println("TestNg Rocks");
    }
}
