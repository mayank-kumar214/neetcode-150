class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int needed = target - curr;
            if (map.containsKey(needed)){
                int a = map.get(needed);
                return new int[] { a,i };
            }else{
                map.put(curr, i );
            }
        }
        return new int[] {};
    }
}
