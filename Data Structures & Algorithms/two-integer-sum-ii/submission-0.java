class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0; int r = numbers.length - 1;

        while(l < r) {
            int tmp = numbers[l] + numbers[r];
            if (tmp > target) {
                r--;
            } else if (tmp < target) {
                l++;
            } else {
                return new int[] {l + 1, r + 1};
            }
        }

        return new int[0];
    }
}