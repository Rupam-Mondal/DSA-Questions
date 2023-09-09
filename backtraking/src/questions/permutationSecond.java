package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class permutationSecond {
	public static void permute(int[] arr , ArrayList<Integer> temp , boolean[] arr1) {
		if(arr.length == temp.size()) {
			ArrayList<Integer> temp1 = new ArrayList<>();
			for(int i = 0 ; i < temp.size() ; i++) {
				temp1.add(temp.get(i));
			}
			System.out.println(temp1);
			return;
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr1[i]) continue;
			if(i > 0 && arr1[i - 1] == false && arr[i] == arr[i - 1]) continue;
            arr1[i] = true;
            temp.add(arr[i]);
            permute(arr, temp , arr1);
            temp.remove(temp.size() - 1);
            arr1[i] = false;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1 , 1,  2};
		Arrays.sort(arr);
		permute(arr , new ArrayList<>() , new boolean[arr.length]);
	}
}
