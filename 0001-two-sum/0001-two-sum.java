class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> luna = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if(luna.containsKey(diff)) {
                return new int[]{luna.get(diff), i};
            }
            luna.put(nums[i], i);
        }
        
        return new int[]{};
    }
}