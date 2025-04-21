// 輸入模組
import java.util.Scanner;

public class Exception_Catch_Q01 {

          public static void main(String[] args) {
                    
                    // 水果名稱索引
                    String[] fruits = {"apple", "banana", "mango", "peach", "kiwi", "grape"};

                    //  讀取連續輸入的數字
                    Scanner input_number = new Scanner(System.in);

                    // 將輸入視為字串讀取並依照空白分割成索引陣列
                    String line = input_number.nextLine();
                    String[] fruit_index = line.trim().split("\\s+");

                    // 先判斷索引格數是不是超過 6 格，超過則結束程式
                    if (fruit_index.length != 6) {
                              System.out.println("輸入錯誤超過 6 個水果索引");
                              return;
                    }

                    // 列印水果名稱索引，且捕捉例外
                    for (int i = 0; i < fruit_index.length; i++) {
                              
                              try {
                                        // 試著將 fruit_index 索引內的字串轉成整數，若發生錯誤則會進入 NumberFormatException 例外處理
                                        int number = Integer.parseInt(fruit_index[i]);
                                        
                                        // 若發生索引異常的情況則列印索引異常提示，避免提前結束程式未完成其他水果索引列印
                                        if (number < 0 || number >= fruits.length) {
                                                  System.out.println("索引異常");
                                        } else {
                                                  // 成功則列印結果
                                                  System.out.println(fruits[number]);
                                        }
                              } catch (NumberFormatException e) {
                                        System.out.println("索引異常");
                              } catch (Exception e) {
                                        System.out.println("出現其他錯誤");
                              }

                              // 當索引為 2 或 5 時列拼盤完成
                              if ((i + 1) % 3 == 0) {
                                        System.out.println("--- 拼盤完成 ---");
                              }
                    }
          }
}
