/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author ADMIN
 */

// Ta sẽ viết những ham toán học cung cấp cho bên ngoài sử dụng
    // giống như thư viện Math. của JDK
    // Các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi
    // thì sẽ đc thiết kế là static!!
    // static sẽ được gọi trực tiếp qua tên class
    // Hàm tính n! = 1.2.3.4..n
    // n: 0..20; do 21! tràn kiểu long, ko có âm giai thừa
    // 0! = 1;
public class MathUtility {
    public static long getFactorial (int n){
     
      // sửa lại từ 10 thành 1 để có màu xanh
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }
        if(n == 0 || n ==1)
            return 1; // diem dung cua de quy
        
        return n * getFactorial(n -1);
        // n! = n* (n-1)! // stack LFO - last in first out
        // USING RECUTION TO DEMONSTRATE REGRESSION TESTs
           
    }
}

// hoc ve REGRESSION TEST - kiem thu hoi quy
// kiem thu lai nhung thu da tung kiem thu. tai sao phai lam dieu nay
//ly do: code dang on, ma k dung vao no, thi no van on
//       nhung neu co fix bug, co sua ham, co toi uu thuat toan trong ham, thi ham can phai duoc test lai
//       -test lai thu da tung test
//       Test lai ham da tung test, de xac nhan rang no con ngon - con xanh hay k sau khi code duoc sua

// neu co unit test code (JUNIT) viec test lai code cuc nhanh
// chi can thay mau xanh cuar cac junit test case dc run la du
// nhanh nua: dua unit test le github, cai CI script (file yaml, yml) vao moi thu tu dong bao xanh do lun

// kiem thu lai nhung thu da kiem thu goi la test hoi quy - REGRESSSION TEST
// nen dung tu dong bang cach xai unit test framwork
// nhin = mat tu ham MIAN() cach truyen thong la k nen

// 5! = 1.2.3.4.5 <=> 4!.5
// N! = N x (N-1)!
// cong thuc de quy - RECURSION - goi lai chinh minh voi quy mo nho hon
// con bup be nguoi NGA
