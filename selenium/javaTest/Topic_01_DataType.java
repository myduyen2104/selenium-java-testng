package javaTest;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Topic_01_DataType {
    //Du lieu nguyen thuy (Primitive Type)

    //Ki tu
    //char
    char d = 'D';

    //So nguyen
    //byte
    byte bNumber = 12;

    //short
    short sNumber = 21;

    //int
    int iNumber = 04;

    //long
    long lNumber = 07;

    //So thuc
    //float
    float fNumber = 8.9f;

    //double
    double dNumber = 9.9;

    //Logic: Gioi tinh/ cau tra loi/..
    //boolean
    boolean sex = true;

    //Du lieu tham chieu (Reference Type)

    //Chuoi
    //String
    String fullname = "Nguyen Ngoc My Duyen";

    //Array
    String[] student = {"Le Thi A", "Le Thi B", "Le Thi C", "Le Thi D"};

    //Collection: List/ Set/ Queue
    List<String> studentAddress = new ArrayList<String>();

    //Class/ Object
    FirefoxDriver ffDriver = new FirefoxDriver();

    public static void main(String[] args){

    }

}
