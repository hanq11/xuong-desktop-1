/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.java19318buoi3;

/**
 *
 * @author syn
 */
public class EpKieu {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.6;
//        // Ép kiểu tự động, từ int sang double
//        b = a;
        // Ép kiểu tường minh, từ double sang int
        a = (int) b;
        System.out.println(a);
    }
}
