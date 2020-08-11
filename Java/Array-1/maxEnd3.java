// Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all 
// the other elements to be that value. Return the changed array.

public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[nums.length - 1]);
  return new int[] {max, max, max};
}