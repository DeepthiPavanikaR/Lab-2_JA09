package lab2;

import java.util.Arrays;

public class UpperLowerCase {
	public static void sortString(String arr[]) {
		String uc;
		String lc;
		String a[] = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
		String str = arr[i];
		if(str.length() %2==0) {
		 uc = str.substring(0, str.length() / 2);
		 lc = str.substring((str.length() / 2) , str.length());
		}
		else {
			 uc = str.substring(0, (str.length() / 2) + 1);
			 lc = str.substring((str.length() / 2)+1 , str.length());
			
		}
	    a[i]=uc.toUpperCase()+lc.toLowerCase();
		
	}
		for(int i=0;i<a.length;i++) {
			System.out.println(" "+a[i]);
		}
		
	}

	public static void main(String[] args) {
		String arr[]= {"abcdef","refdtyu","bckigh"};
		Arrays.sort(arr);
		sortString(arr);

	}

}
