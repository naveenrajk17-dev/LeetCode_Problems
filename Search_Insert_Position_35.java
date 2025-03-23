class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Found target, return index
            }
            else if (nums[mid] > target) {
                end = mid - 1; // Search left
            }
            else {
                start = mid + 1; // Search right
            }
        }

        return start; // ✅ Correct return value
    }

    public static void main(String[] args) {
        Search_Insert_Position solution = new Search_Insert_Position();

        int[] nums1 = {1, 3, 5, 6};
        System.out.println(solution.searchInsert(nums1, 5)); // Output: 2
        System.out.println(solution.searchInsert(nums1, 2)); // Output: 1
        System.out.println(solution.searchInsert(nums1, 7)); // Output: 4
        System.out.println(solution.searchInsert(nums1, 0)); // Output: 0
    }
}