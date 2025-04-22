
// 輸入模組
import java.util.ArrayList;
import java.util.Scanner;

public class Exception_Catch_Q04 {

          public static void main(String[] args) {

                    Scanner input_number = new Scanner(System.in);

                    System.out.println("請輸入圓形個數：");
                    // 有 n 個圓半徑
                    int n = input_number.nextInt();

                    ArrayList<Integer> circleindex = new ArrayList<>();
                    int r;
                    for (int i = 1; i <= n; i++) {
                              System.out.printf("請輸入第 %d 個圓形的半徑：\n", i);
                              r = input_number.nextInt();
                              circleindex.add(r);
                    }

                    double maxArea = 0;
                    int max = 0;
                    for (int i = 1; i <= n; i++) {
                              int a = circleindex.get(i - 1);
                              Circle c = new Circle(a);

                              if (c.getArea() > maxArea) {
                                        max = i;
                              }
                              System.out.printf("圓形 %d : 半徑=%d，面積=%.2f，周長=%.2f\n", i, c.getRadius(), c.getArea(), c.getPerimeter());
                    }

                    int max_radius = circleindex.get(max - 1);
                    Circle c = new Circle(max_radius);
                    System.out.printf("面積最大的圓形為第 %d 個，半徑為 %d，面積為 %.2f\n", max, c.getRadius(), c.getArea());
          }
}

class Circle {

          private int radius;

          public Circle(int r) {
                    radius = r;
          }

          public double getArea() {
                    return radius * radius * Math.PI;
          }

          public double getPerimeter() {
                    return radius * 2 * Math.PI;
          }

          public int getRadius() {
                    return radius;
          }

}
