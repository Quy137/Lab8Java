/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8a;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class main1 {
    public static void main(String[] args) {
//    Double x = new Double();
    double number, sum = 0;
    ArrayList<Double> arrListDouble = new ArrayList<Double>();
    Scanner scanner =  new Scanner(System.in);
         
    
         
    while(true){
        System.out.println("Nhap so thuc : ");
        Double x = scanner.nextDouble(); scanner.nextLine();
        arrListDouble.add(x);
        
        System.out.println("Nhap them (Y/N)");
        if(scanner.nextLine().equals("N")) {
            break;
        }
    }
         
    // tính tổng các phần tử của arrListDouble
    for (Double tong : arrListDouble) {
        System.out.println(" " + tong);
        sum += tong;
    }   
    System.out.println("tong cac so da nhap :  " + sum);
}
}
