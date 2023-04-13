/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8a3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */

public class dssanpham {
    ArrayList<sanpham> list = new ArrayList<>();
    
    public void nhap() {
    while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham : ");
        String x = sc.nextLine();
        System.out.println("Nhap gia san pham : ");
        double y = sc.nextDouble(); sc.nextLine();
        sanpham sanpham =  new sanpham(x,y);
        list.add(new sanpham(x,y));
        
        System.out.println("Nhap them (Y/N)");
        if(sc.nextLine().equals("N")) {
            break;
        }
    }
    }
    
    public void xuat() {
        System.out.println("Thong tin vua nhap : ");
    for (sanpham sp : list) {
        System.out.println(sp);
    }   
    }
    
    public void sapXep() {
        Comparator<sanpham> comp = new Comparator<sanpham>() {
            @Override
            public int compare(sanpham o1, sanpham o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(list,comp);
        xuat();
    }
    
    public void timVaXoa() {
        Scanner input =  new Scanner(System.in);
        System.out.println("Nhap ten san pham can tim : ");
        String ten = input.nextLine();
        
        sanpham sp = null;
        
        for (sanpham sp1 : list) {
            if (sp1.getTen().equals(ten)) {
                sp = sp1;
                break;
            }
        }
        if (sp!= null) {
            list.remove(sp);
            System.out.println("Da xoa san pham");
        } else {
            System.out.println("Khong tim thay san pham");
        }
    }
    
    public void tinhTb(){
        double avg =0, sum =0;
        for(sanpham sp : list) {
            sum+= sp.getGia();
        }
        avg = sum/list.size();
        System.out.println("Gia trung binh : " + avg);
    }
    
    public void menu() {
        Scanner input = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.Nhap danh sach ho ten ");
            System.out.println("2.Hien thi danh sach ho ten");
            System.out.println("3.Sap xep san pham theo gia");
            System.out.println("4.Tim kiem san pham");
            System.out.println("5.Tinh gia trung binh");
            System.out.println("0.Thoat");
            System.out.println("Chon: ");
            chon = input.nextInt(); input.nextLine();
            switch(chon) {
                case 0:
                    break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    timVaXoa();
                    break;
                case 5:
                    tinhTb();
                    break;
            }
        }while(chon !=0);
    }
}
