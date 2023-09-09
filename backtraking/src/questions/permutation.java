package questions;

import java.util.ArrayList;

public class permutation {
	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void permute(int[] arr , int idx) {
		if(idx == arr.length) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(int i = 0; i < arr.length ; i++) {
				temp.add(arr[i]);
			}
			System.out.println(temp);
			return;
		}
		for(int i = idx ; i < arr.length ; i++) {
			swap(arr , idx , i);
			permute(arr , idx + 1);
			swap(arr , idx , i);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1 , 2 , 3};
		permute(arr , 0);
	}
}
