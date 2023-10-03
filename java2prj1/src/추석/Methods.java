package 추석;

import java.util.Arrays;

public class Methods {

	public int Add_int(int a, int b) {
		return a+b;
	}
	public double Add_double(double a, double b) {
		return a+b;
	}
	public int Sub(int a, int b) {
		return a-b;
	}
	public double divide(double a, double b) {
		return a/b;
	}
	public String sentence() {
		return "다섯번째";
	}
	public void anyting() {
		System.out.println("아직도 14개나...");
	}
	public char[]	character(char a, char b, char c) {
		char[] C= {a, b, c};
		return C;
	}
	public int square(int a) {
	    return a * a;
	}
	public int bigger(int a, int b) {
	    return (a > b) ? a : b;
	}
	public int abs(int a) {
	    return (a < 0) ? -a : a;
	}
	public int modulus(int a, int b) {
	    return a % b;
	}
	public boolean compareString(String str1, String str2) {
	    return str1.equals(str2);
	}
	public String intToString(int a, int b) {
	    int c = a * b;
	    return Integer.toString(c);
	}
	public int StringLength(String a) {
		return a.length();
	}
	public int power(int a, int b) {
	    int c = 1;
	    for (int i = 0; i < b; i++) {
	        c *= a;
	    }
	    return c;
	}
	public boolean compareInt(int a, int b) {
	    if(a==b) {
	    	return true;
	    } else {
	    	return false;
	    }
	}
	public void num(int a) {
		System.out.println(a);
	}
	public String union(String a, String b) {
		return a+b;
	}
	public String removeSpaces(String str) {
	    return str.replaceAll(" ", "");
	}
	public double average(int[] arr) {
	    int sum = 0;
	    for (int num : arr) {
	        sum += num;
	    }
	    return (double) sum / arr.length;
	}
	public void reverse(int[] arr) {
	    int left = 0;
	    int right = arr.length - 1;
	    while (left < right) {
	        int temp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = temp;
	        left++;
	        right--;
	    }
	}
	public static void main(String[] args) {
		
		Methods a = new Methods();
		
		int result1 = a.Add_int(3, 6);	// 9
		System.out.println(result1);
		double result2 = a.Add_double(3.14, 2.25);
		System.out.println(result2);
		int result3 = a.Sub(10, 290);
		System.out.println(result3);
		double result4 = a.divide(10, 3);
		System.out.println(result4);
		String result5 = a.sentence();
		System.out.println(result5);
		a.anyting();
		char[] result7 = a.character('c', 'u', 'p');
		System.out.println(result7);
		int result8 = a.square(8);
		System.out.println(result8);
		int result9 = a.bigger(456566841, 456766899);
		System.out.println(result9);
		int result10 = a.abs(-4576);
		System.out.println(result10);
		int result11 = a.modulus(35, 4);
		System.out.println(result11);
		boolean result12 = a.compareString("asdjfoewl", "asjdfowef");
		System.out.println(result12);
		String result13 = a.intToString(20, 22);
		System.out.println(result13);
		int result14 = a.StringLength(result13);
		System.out.println(result14);
		int result15 = a.power(5, 3);
		System.out.println(result15);
		boolean result16 = a.compareInt(10, 10);
		System.out.println(result16);
		a.num(22);
		String result17 = a.union("그만", "먹어");
		System.out.println(result17);
		String result18 = a.removeSpaces("It is an apple");
		System.out.println(result18);
		int[] arr = {10, 33, 30, 44, 45};
		double result19 = a.average(arr);
		System.out.println(result19);
		a.reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

}
