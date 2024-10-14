import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[] = {1,2,3};

//        subsequence(arr, 0, new ArrayList<>(), 3);
    }
    public static void subsequence(int []arr, int idx, List<Integer> li, int target){
        if(idx >= arr.length){
            System.out.println(li);
            return ;
        }
        li.add(arr[idx]);           //take
        subsequence(arr, idx + 1, li, target);
        li.remove(arr[idx]);        //don't take
        subsequence(arr, idx + 1, li, target);
    }
    private static void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean []freq) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }

        }
    }
}