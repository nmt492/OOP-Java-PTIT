package javabase;

import java.util.Scanner;

public class J01024_SoTamPhan {
	public static boolean Check(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++)
			if (s.charAt(i) > '2')
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			if (Check(s) == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
