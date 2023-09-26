package java2prj1.InterfaceEx.myarrays;

import java.util.Comparator;

interface MyComparable<T> {
	public int compareTo(T other); // 기준이 크면 양수, 작으면 음수, 깉으면 0 을 처리하는 메서드를 Score에서 오버라이드함
}

public class MyArrays {

	public static void sort(Object[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				MyComparable m = (MyComparable) arr[i];

				if (m.compareTo(arr[j]) > 0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}
		}
	}

	/*
	 * interface Comparator{ public int compare(Object o1, Object o2); }
	 */
	public static void sort(Object[] arr, Comparator c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
