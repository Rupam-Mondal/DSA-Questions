package questions;
import java.util.*;

public class target {
    public static void targetPro(int[] arr, int idx, ArrayList<Integer> temp, int target1, boolean found) {
        if (idx == arr.length) {
            int ans = 1;
            for (int i = 0; i < temp.size(); i++) {
                ans *= temp.get(i);
            }
            if (ans == target1) {
                found = true; // Set the flag to true
                System.out.println("True");
            }
            return;
        }
        temp.add(arr[idx]);
        targetPro(arr, idx + 1, temp, target1, found);
        temp.remove(temp.size() - 1);
        targetPro(arr, idx + 1, temp, target1, found);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 5, 4 };
        boolean found = false;
        targetPro(arr, 0, new ArrayList<>(), 16, found);
        
        if (!found) {
            System.out.println("False");
        }
    }
}


