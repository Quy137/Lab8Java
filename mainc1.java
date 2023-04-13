/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8c1;

import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class mainc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        String hoTen = input.nextLine();
        hoTen.trim();
        
        String ho = hoTen.substring(0, hoTen.indexOf(""));
        String tenDem = hoTen.substring(hoTen.indexOf(""), hoTen.lastIndexOf(""));
        String ten = hoTen.substring(hoTen.lastIndexOf(""));
        
        System.out.printf("%s %s %s " , ho.toUpperCase() , tenDem , ten.toUpperCase());
    }
}
