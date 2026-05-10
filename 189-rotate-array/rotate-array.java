class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        int[] temp = new int[k];

        // Store last k elements
        for(int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift elements to right
        for(int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Put temp elements at front
        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}