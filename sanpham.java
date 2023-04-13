/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8a3;

/**
 *
 * @author Wys.Dao
 */
public class sanpham {
    
    private String ten;
    private double gia;
    
    public sanpham (String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public sanpham() {
        this.ten = null;
        this.gia = 0;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    
    
}
