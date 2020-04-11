package com.cybertek.tests.day19_excel_io;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;

public class ReadExcelExample {
    // path to the location of the excel file.
    private String filePath = "src/test/resources/Vytrack testusers.xlsx";

    // creates connection between jvm and the file.
    private FileInputStream fileInputStream;

    // represents the excel file
    private Workbook workbook;

    // represents the sheet that contains the actual data
    private Sheet workSheet;

    @BeforeMethod
    public void setUp(){

    }

}