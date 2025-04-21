// 輸入模組
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Catch_Q01 {

          public static void main(String[] args) {

                    // 已知水果名稱與價格陣列
                    String[] productNames = {"Strawberry", "Apple", "Orange"};
                    int[] productPrices = {159, 20, 17};

                    // 輸入連續五個索引編號
                    Scanner input_number = new Scanner(System.in);

                    // 計算總價
                    int sum = 0;
                    // 讀取輸入的五個索引編號並偵錯
                    for (int i = 0; i < 5; i++) {
                              
                              int number = 0;
                              try {
                                        // 輸入編號，若產生錯誤則會進入 InputMismatchException e
                                        number = input_number.nextInt();
                                        
                                        // 判斷輸入編號是否超過索引
                                        if (number > productNames.length) {
                                                  throw new ArrayIndexOutOfBoundsException();
                                        }
                                        
                                        System.out.printf("%s:%d\n", productNames[number], productPrices[number]);
                                        sum += productPrices[number];
                                        
                              } catch (ArrayIndexOutOfBoundsException e) {
                                        System.out.println("索引錯誤:" + number);
                              } catch (InputMismatchException e) {
                                        System.out.println("輸入格式異常:" + input_number.next());
                              }
                    }
                    System.out.println("Total:" + sum);
          }
}
