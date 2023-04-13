/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class SanPham {
    public String tenSp;
    public double donGia, giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp,donGia, 0);
    }
    
    

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    private double getThueNhapKhau() {
        return this.donGia*10/100;
    }
    
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten san pham : ");
        tenSp = input.nextLine();
        System.out.println("Nhap don gia : ");
        donGia = input.nextDouble(); input.nextLine();
        System.out.println("Nhap giam gia : ");
        giamGia = input.nextDouble(); input.nextLine(); 
    }
    
    public void xuat() {
        System.out.println("---Thong tin---");
        System.out.println("Ten san pham : " + this.tenSp + "\ndon gia : " + this.donGia + "\ngiam gia :" + this.giamGia);
    }
}
