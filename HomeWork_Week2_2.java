import java.util.Scanner;
import java.util.HashMap;

public class HomeWork_Week2_2 {

    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> months = new HashMap<Integer, String>();
        Scanner scanner = new Scanner(System.in);
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
        for (int i = 1; i != 0;) {
            System.out.println("請輸入1~12?");
            int num = scanner.nextInt();
            if (num >= 1 && num <= 12) {
                System.out.println("第" + num + "月的英文單字為" + months.get(num));
                break;
            } else {
                System.out.println("範圍錯誤!");
            }
        }
    }
}
