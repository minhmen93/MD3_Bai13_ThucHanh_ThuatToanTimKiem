import java.util.Scanner;

public class TH2_TinhDoPhucTapCuaThuatToan {

import java.util.Scanner;
    public class AlgorithmComplexityTest {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chuỗi: ");
            String inputString = scanner.nextLine();

            int[] frequentChar = new int[255];
            for (int i = 0; i < inputString.length(); i++) {
                int ascii = inputString.charAt(i);
                frequentChar[ascii] += 1;
            }
            int max = 0;
            char character = (char) 255;
            for (int j = 0; j < 255; j++) {
                if (frequentChar[j] > max) {
                    max = frequentChar[j];
                    character = (char) j;
                }
            }
            System.out.println("chữ cái xuất hiện nhiều nhất là : " + character + " với tần suất xuất hiện : " + max);

        }
    }
}
