class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int low =0, high = nums.length-1;
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[low] < nums[high]) {
                return nums[low];
            }

            if((mid == 0 || nums[mid] < nums[mid-1]) && (mid == nums.length-1 || nums[mid] < nums[mid+1]) ) {
                return nums[mid];
            }

            if(nums[low] <= nums[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}