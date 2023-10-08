package lab2;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		int h;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào chiều cao của tam giác: ");
		h = scanner.nextInt();
		int x, output;

		for (int i = 1; i <= h; i++) {
			for (int j = 0; j <= 2 * h; j++) {
				x = j - h;
				if (x < 0) {
					x *= -1;
				}
				output = i - x;

				if (output > 0) {
					System.out.printf("%3d", output);
				} else {
					System.out.printf("   ");
				}
			}
			System.out.println();

		}
		System.out.println("----------------------------");
		System.out.println("Chương trình này được đăng tại Freetuts.net");
	}
}
	