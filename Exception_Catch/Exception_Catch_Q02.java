// Step 1 引入輸入模組
import java.util.Scanner;

public class Exception_Catch_Q02 {

          public static void main(String[] args) {

                    // Step 1 讀取連續輸入的數組數字
                    Scanner input_number = new Scanner(System.in);

                    // Step 2 輸入三組數字
                    for (int i = 0; i < 3; i++) {

                              // Step 3 將所有輸入內容依 Enter 做分割，並以字串形式儲存
                              String line = input_number.nextLine();

                              // Step 4 分割後仍為字串形式，因此將其儲存於一維陣列的字串 tokens 當中
                              String[] tokens = line.trim().split("\\s+");

                              // Step 5  判斷輸入是否非數字或除數為 0 
                              int result = 0;
                              try {
                                        // Step 5.1 確保輸入剛好為三個
                                        if (tokens.length != 3) {
                                                  throw new NumberFormatException();
                                        }

                                        // Step 5.2 將 tokens 字串轉為整數，若轉型失敗則會發生 NumberFormatException
                                        int[] count = new int[3];
                                        for (int j = 0; j < tokens.length; j++) {
                                                  // 失敗則進入 catch 
                                                  count[j] = Integer.parseInt(tokens[j]);
                                        }

                                        // Step 6 計算並列印餘數
                                        result = (count[0] + count[1]) % count[2];
                                        System.out.println(result);

                              } catch (NumberFormatException e) {
                                        System.out.println("請檢查是否輸入非數字或非三個數字");
                              } catch (Exception e) {
                                        System.out.println("出現其他錯誤，請檢查除數是否為 0 ");
                              }
                    }
          }
}
