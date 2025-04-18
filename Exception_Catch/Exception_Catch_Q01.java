

// 引入 字串陣列類別
import java.util.ArrayList;
// 引入 Scanner 輸入類別
import java.util.Scanner;

public class Exception_Catch_Q01 {

    public static void main(String[] args) {

        Scanner input_number = new Scanner(System.in);
        System.out.println("請輸入一行文字，並按下 Enter：");

        // 用來儲存每一行的矩陣元素
        ArrayList<String> matrixLines = new ArrayList<>();

        while (true) {
            // 讀取到Enter就把前面所輸入的文字轉成字串形式
            String line = input_number.nextLine();

            // Step 1 先判斷輸入是否為 EOF
            if (line.equals("EOF")) {
                break;
            }

            // Step 2 輸入的字串存入 matrixLines
            matrixLines.add(line);

        }

        System.out.println("Hello World!");
    }
}
