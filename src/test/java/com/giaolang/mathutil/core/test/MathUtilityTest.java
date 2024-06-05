/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//　Quy ước đặt tên package của Java
// tên miền đảo ngược, chữ thường 100%
// com.mycompany trên mạng
// com.ten-cty.ten-dự-án.tên-module.tên-class-sẽ-dùng
// com.microsoft.sqlserver.jdbc
// org.junit.jupiter.api.Test
// com.giaolang.mathutil.core

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
    // ở đây chứa các lệnh các hàm dùng để đi test hàm chính ở bên code chính
    // ở bên thư mục source phía trên coi hàm chạy ôn không
    // ở đây ta làm các hàm ứng với các test case để test code chính ở bên đây
    // MathUtility. ví dụ .getFactorial()

    //TEST CASE: bộ data đưa vào hàm, app để veryfy hàm , app có xử lí
    // đúng hay không, nó đi kèm theo cách xài hàm, trình tự xài app + expected
    // value + status test case passed hay failed
    //TEST CASE #1 : Check getfactorial() with N = 0, 0!
    //hopes to see 1 returned
    @Test
    //tên hàm mang ý nghĩa của test case luôn
    public void testFactorialGivenRightArg0ReturnsWell() {
        int n = 0;
        long expectedValue = 1; // hy vọng n! 0! >= 1
        long actualValue;

        actualValue = MathUtility.getFactorial(n);

        assertEquals(expectedValue, actualValue);
        // cách cũ là phải sout() tùng cái 1 và dùng mắt để nhìn đúng sai

    }

    //TEST CASE #2 : check gettfatorial with n = 1, expected => 1! =1
    @Test
    public void testFactorialGivenRightArg1ReturnsWell() {
        int n = 1;
        long expectedValue = 1; // 1 giai thừa thì hy vọng 1
        long actualValue; // chờ
        actualValue = MathUtility.getFactorial(n);

        assertEquals(expectedValue, actualValue);
    }

    //TEST CASE #3 : check gettfatorial with n = 2, expected => 2! =2
    //                                       n = 3, expected => 3! =6
    //                                       n = 5, expected => 5! =120
    @Test
    public void testFactorialGivenRightArg235ReturnsWell() {
        int n = 2;
        long expectedValue = 2; // 1 giai thừa thì hy vọng 1
        long actualValue; // chờ
        actualValue = MathUtility.getFactorial(n);

        assertEquals(expectedValue, actualValue); //2! =2??

        assertEquals(6, MathUtility.getFactorial(3)); //3! = 6 ??

        assertEquals(120, MathUtility.getFactorial(5)); //5! = 120?
    }

    //TEST #4: CHECK IF GETFACTORIAL RETURN EXCEPTIONS IF WE PASS N < 0
    @Test
    public void testFactorialGivenWrongArg_1ThrowException() {
        //Input n<0 , n = -1
        // Exception result: Illegal Argument Exception
        // nhớ quy ước màu xanh ứng với trả về như kì vọng
        // màu đỏ: actual không như kì vọng
        // Ngoại lệ Exception không là value, ta k kkhai báo biến để = ngoại lệ
        // kh assertEquals(value value value)
        assertThrows(IllegalArgumentException.class,
                () -> {MathUtility.getFactorial(-1);});
    }

}


// PHẦN KIẾN THỨC BỔ SUNG VÀO CV
//TDD - TEST-DRIVEN-DEVELOPMENT
// KĨ THUẬT VIẾT CODE CỦA DÂN DEV ĐI KÈM VỚI VIỆC VIẾT CÁC TEST CASE
// ĐỂ KIỂM THỬ NGAY NHỮNG DÒNG CODE VỪA VIẾT
// TỨC LÀ CODE MỖI HÀM, LUÔN ĐI KÈM CODE KIỂM THỬ
//  KÊT QUẢ KIỂM THỬ HIỂN THỊ THEO 2 MÀU XANH - CODE NGON, PASS CÁC TEST CASE
// MÀU ĐỎ , CODE CÓ LỖI
// VIỆC NÀY CỨ LIÊN TỤC NHƯ VẬY, VIẾT CODE, VIẾT TEST CASE, RUN TEST
// CASE ĐỂ XEM XANH ĐỎ, KĨ THUẬT NÀY GỌI LÀ TDD

// MỌI NGÔN NGỮ LẬP TRÌNH ĐỀU HỖ TRỢ CÁC BỘ THƯ VIỆN, FRAMEWORK GIÚP
// TEST CODE 2 MÀU XANH ĐỎ, GỌI LÀ UNIT TESTING FRAMEWORK
// MỌI NGÔN NGỮ ĐIỀU HỖ TRỢ TDD, VẤN ĐỀ LÀ DEV TEAM CÓ XÀI HAY K
// NHÓM LÀM OBS CÓ XÀI

// ĐỀ TÀI THUYẾT TRÌNH NHÓM
// NHÓM HÃY CHỌN 1 UNIT TESTING FRAMEWORK ĐỂ DEMO
// VÀO GG : UNIT TESTTING FRAMEWORK FOR <NNLLT>, RA THƯ VIỆN
// C#, NUNIT, XUNIT, MS TEST,..
// JAVA: TESTIGN,...
// JS: MOCHA, JASMINE

// DÒNG THỨ 2 TRONG CV
// DDT- DATA DRIVEN TESTING (KHÔNG ĐƯỢC NHẦM TDD Ở TRÊN) | TỪ TƯƠNG ĐƯƠNG
//                                                         PARAMETERIZED
//                                                         VIẾT TEST CASE THEO STYLE THAM SỐ HÓA
// DDT LÀ PHÀN MỞ RỘNG THÊM, KĨ THUẬT NÂNG CAO GIÚP TỔ CHỨC KHI VIẾT TEST CASE UNIT CODE
// NÓ CÓ BÀ CON TDD 
// 
// DDT- PARAMETERIZED TESTTING LÀ KĨ THUẬT VIẾT CÁC TEST CASE
// MÀ TA TÁCH RIÊNG PHẦN DATA RA KHỎI CÁC CÂU LỆNH assert()
// CHO DỄ QUÁN LÍ TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
// DỄ THEO DÕI CÁC PHẦN CODE LIÊN QUAN ĐẾN TEST HÀM
// 
//DDT: TA
