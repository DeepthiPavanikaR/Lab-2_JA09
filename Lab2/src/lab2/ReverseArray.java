package lab2;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {

	public void getSorted(int[] arr) {
		Arrays.sort(arr);
	}

	public static void main(String[] args) {

		ReverseArray obj = new ReverseArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size  of array");
		int len = Integer.parseInt(sc.nextLine());
		int[] arr = new int[len];
		System.out.println("Enter array elements");
		for (int i = 0; i < len; i++) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			arr[i] = Integer.parseInt(sb.toString());
		}
		obj.getSorted(arr);
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
	}
}
