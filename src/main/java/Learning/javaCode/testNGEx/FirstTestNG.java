package Learning.javaCode.testNGEx;

//import com.google.common.annotations.VisibleForTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FirstTestNG {

    @Test(priority = 1)
    public void c() throws InterruptedException {
//        FirstSeleniumEx ex= new FirstSeleniumEx();
//        ex.test1();
        System.out.println("In method1 ");
    }

    @Test(priority = 2)
    public void b() throws InterruptedException {
        System.out.println("In method2 ");
    }

    public int add(int a, int b) {
        return a+b;
    }



    @Test()
    public void m31() throws IOException {
        System.out.println(add(5,5));
        dataP();
    }



    @Test(dataProvider = "data1")
    public void a(String ab, String b) {
        System.out.println("In method4");
        System.out.println(ab+" "+b);

    }

    @DataProvider(name="data1")
    public Object[][] dataP() throws IOException {
        String[][]res = new String[2][2];
        FileInputStream file = new FileInputStream(new File("C:\\Users\\thiru\\Desktop\\Data1.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        int s= sheet.getLastRowNum();
        for(int i=1; i< s+1; i++){
            String user = sheet.getRow(i).getCell(0).getRichStringCellValue().toString();
            String pwd = sheet.getRow(i).getCell(1).getRichStringCellValue().toString();
            System.out.println(user+" "+pwd);
            res[i-1][0]= user;
            res[i-1][1]= pwd;
        }
        return res;
    }

//    @BeforeSuite
//    public void s1() {
//        System.out.println("In before suite");
//    }
//    @BeforeTest
//    public void t1() {
//        System.out.println("In before test");
//    }
//
//    @BeforeClass
//    public void c1() {
//        System.out.println("In before class");
//    }
//
//    @BeforeMethod
//    public void bm1() {
//        System.out.println("In before method");
//    }
//
//    @AfterMethod
//    public void bm2() {
//        System.out.println("In after method");
//    }
//
//    @AfterClass
//    public void c2() {
//        System.out.println("In after class");
//    }
//
//    @AfterTest
//    public void t2() {
//        System.out.println("In after test");
//    }
//
//    @AfterSuite
//    public void s2() {
//        System.out.println("In after suite");
//    }
}
