package exception_catch_q01;

// Step 1 引入輸入模組
import java.util.Scanner;

public class Exception_Catch_Q01 {

          public static void main(String[] args) {
                    // 水果名稱索引
                    String[] fruits = {"apple", "banana", "mango", "peach", "kiwi", "grape"};

                    // Step 1 讀取連續輸入的數組數字
                    Scanner input_number = new Scanner(System.in);

                    String line = input_number.nextLine();
                    String[] fruit_index = line.trim().split("\\s+");

                    if (fruit_index.length != 6) {
                              System.out.println("輸入錯誤超過 6 個水果索引");
                              return; // 結束程式
                    }

                    for (int i = 0; i < fruit_index.length; i++) {
                              try {
                                        int number = Integer.parseInt(fruit_index[i]);

                                        if (number < 0 || number >= fruits.length) {
                                                  System.out.println("索引異常");
                                        } else {
                                                  System.out.println(fruits[number]);
                                        }
                              } catch (NumberFormatException e) {
                                        System.out.println("索引異常");
                              } catch (Exception e) {
                                        System.out.println("出現其他錯誤");
                              }

                              if ((i + 1) % 3 == 0) {
                                        System.out.println("--- 拼盤完成 ---");
                              }
                    }
          }
}
