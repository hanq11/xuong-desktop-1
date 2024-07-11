/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.fptpolytechnic.java19318buoi3;

import java.util.Scanner;

/**
 *
 * @author syn
 * Nhập số từ bàn phím. 
 * Nếu số dương thì tính và xuất căn bậc 2 
 * của số đó ra màn hình
 * 
 */
public class NhapVaTinh {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập một số dương: ");
        int so = sc.nextInt();
        if(so > 0) {
            System.out.println(Math.sqrt(so));
        } else {
            System.out.println("Số được nhập phải lớn hơn 0");
        }
    }
}
