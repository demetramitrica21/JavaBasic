package oop.mostenire;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class MainTest extends BaseTest {
    @BeforeClass
    public void initTest(){
        System.out.println("Initializare MainTest");
    }

    @Test
    public void baseTest(){
        System.out.println("Executare MainTest");
    }
}
