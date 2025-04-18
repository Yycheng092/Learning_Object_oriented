// Step 1 引入 Scanner 輸入類別
import java.util.Scanner;
// Step 4 引入 字串陣列類別
import java.util.ArrayList;

public class Exception_Catch_Q01 {
          
          // 方法 multiply2x2
          public static int[][] multiply2x2(int[][] a, int[][] b) {
                    // 宣告一個二維陣列用來存放陣列結果
                    int[][] result = new int[2][2];
                    
                    for (int i = 0; i < 2; i++) {
                              for (int j = 0; j < 2; j++) {
                                        result[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
                              }
                    }
                    return result;
          }

          public static void main(String[] args) {

                    // Step 1 讀取使用者的輸入內容
                    Scanner input_number = new Scanner(System.in);

                    // Step 2 輸入矩陣數字
                    System.out.println("請先輸入 n 組矩陣，再輸入矩陣數字，結束後請輸入 EOF : ");

                    // Step 3 輸入 n 組矩陣，並判斷輸入格式是否錯誤
                    int n = 0;
                    try {
                              n = input_number.nextInt();
                              input_number.nextLine();
                    } catch (Exception e) {
                              System.out.println("input error");
                              return;
                    }

                    // Step 4  宣告 ArrayList <String> 陣列用來儲存每一行的矩陣元素
                    ArrayList<String> matrixLines = new ArrayList<>();

                    // Step 5 開始讀取每一行輸入，直到遇到 EOF
                    while (true) {
                              // Step 5.1 讀取到Enter就把前面所輸入的數字轉成字串形式
                              String line = input_number.nextLine();

                              // Step 5.2 先判斷輸入是否為 EOF
                              if (line.equals("EOF")) {
                                        break;
                              }

                              // Step 5.3 若非 EOF 則將輸入的字串存入 matrixLines
                              matrixLines.add(line);

                    }

                    // Step 5.4 查看儲存的每行矩陣數字
                    System.out.println("儲存的矩陣數據如下：");
                    for (int i = 0; i < n; i++) {
                              System.out.println("第 " + (i + 1) + " 組：" + matrixLines.get(i));
                    }

                    // Step 6 查驗是否 IllegalArgumentException e 與 NumberFormatException
                    // Step 6.1 宣告 ArrayList<int[][]> 儲存二維陣列內容
                    ArrayList<int[][]> matrices = new ArrayList<>();

                    // Step 6.2 捕捉例外
                    try {
                              for (int i = 0; i < n; i++) {

                                        // Step 6.3 一一讀取 matrices 儲存格並依照空白格將其分割
                                        String line = matrixLines.get(i);
                                        String[] parts = line.trim().split("\\s+");

                                        // Step 6.4 判斷是不是四個數字
                                        if (parts.length != 4) {
                                                  throw new IllegalArgumentException();
                                        }

                                        // Step 6.4.1 查看是否存取正確
                                        for (int j = 0; j < parts.length; j++) {
                                                  System.out.print(parts[j] + " ");
                                        }
                                        System.out.println();

                                        // Step 6.5 判斷是否存在非數字
                                        int[][] matrix = {
                                                  {Integer.parseInt(parts[0]), Integer.parseInt(parts[1])},
                                                  {Integer.parseInt(parts[2]), Integer.parseInt(parts[3])}
                                        };

                                        // Step 6.5.1 查看存入數字的狀況
                                        System.out.println("這組矩陣內容為：");
                                        System.out.println("| " + matrix[0][0] + " " + matrix[0][1] + " |");
                                        System.out.println("| " + matrix[1][0] + " " + matrix[1][1] + " |");

                                        // Step 7 將正確的數字存入 matrices 中
                                        matrices.add(matrix);
                              }
                              // 針對不同例外狀況列印出對應的提示
                    } catch (NumberFormatException e) {
                              System.out.println("數字格式有誤，請確保所有輸入都是數字");
                              return;
                    } catch (IllegalArgumentException e) {
                              System.out.println("格式錯誤，請輸入 4 個數字");
                              return;
                    } catch (Exception e) {
                              System.out.println("其他未知錯誤");
                              return;
                    }

                    // Step 8 將矩陣相互相乘
                    if (!matrices.isEmpty()) {
                              int[][] result = new int[2][2];
                              
                              // Step 8.1 將矩陣一一丟給 multiply2x2 方法計算 
                              for (int i = 1; i < matrices.size(); i++) {
                                        result = multiply2x2(matrices.get(i - 1), matrices.get(i));
                              }

                              // Step 9: 輸出結果
                              System.out.println("矩陣相乘結果為：");
                              System.out.println("| " + result[0][0] + " " + result[0][1] + " |");
                              System.out.println("| " + result[1][0] + " " + result[1][1] + " |");
                    }

          }

}
