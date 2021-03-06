/**
 * Given an array nums,
 * write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * For example,
 * given nums = [0, 1, 0, 3, 12],
 * after calling your function,
 * nums should be [1, 3, 12, 0, 0].
 *
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * Easy
 * array
 */
public class Movezeros {
    public int[] moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
