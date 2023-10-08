package lab2;

public class Task1_1 {
	public static int getSn1(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (int) ((Math.pow((-1),(n+1))) * n + getSn1(n - 1));
		}
	}

	public static int getSn2(int n) {
		if (n == 1) {
			return 1;
		} else {
			return getSn2(n - 1) + koBt(n);
		}
	}

	public static int koBt(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * koBt(n - 1);
		}
	}

	public static int getSn3(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (int) (getSn3(n - 1) + (Math.pow(n, 2)));
		}
	}
	public static double getSn4(float n) {
		if(n==1) {
			return 1;
		}else {
			return (double) ((1/(n*2))*koBt2(n)+getSn4(n-1));
		}
	}
	public static double koBt2(float n) {
		if (n==1) {
			return 1;
		}else {
			return (double) (1/((n-1)*2))+koBt2(n-1);
		}
	}

	public static void main(String[] args) {
		int n = 3;
		double result;
		result = getSn4(n);
		System.out.println("Sn = " + result);
	}

}
