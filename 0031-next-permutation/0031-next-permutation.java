class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // 1) find pivot
       int i = n-2;
       while(i >= 0 && nums[i] >= nums[i +1])
       i --;
       // 2) if pivot exists, find rightmost successor j > i with nums[j]
       if(i >= 0) {
        int j = n-1;
        while(nums[j] <= nums[i]) j--;
        swap(nums,i,j);
       }
       // 3) reverse the suffix starting at i + 1 to get the next samllest permutation
       reverse(nums, i+1, n-1);
    }

    private void swap(int[] a, int x, int y){
        int t = a[x];
           a[x] = a[y];
           a[y] = t;
    }

    private void reverse(int[] a, int l, int r){
        while(l<r) swap(a, l++, r--);
    }
}