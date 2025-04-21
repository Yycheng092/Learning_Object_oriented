package javaapplication4;

// 輸入模組
import java.util.Scanner;

public class Exception_Catch_Q04 {

          public static void main(String[] args) {

                    // 輸入連續三組數字
                    Scanner input_number = new Scanner(System.in);

                    // 將輸入的數字分成三組，一組兩個數字
                    for (int i = 0; i < 3; i++) {

                              // 將輸入是為字串讀取並依照空白分割成兩個索引陣列
                              String line = input_number.nextLine();
                              String[] split = line.trim().split("\\s+");

                              try {
                                        // 將 split 陣列分別轉換成整數，若過程中發生錯誤則會進入例外處理
                                        int a = Integer.parseInt(split[0]) % Integer.parseInt(split[1]);
                                        System.out.println(a);
                              } catch (Exception e) {
                                        System.out.println("input error");
                              }
                    }
          }
}