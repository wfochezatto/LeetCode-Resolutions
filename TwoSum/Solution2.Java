class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i;
        int complement;
        for(i=0; i<nums.length; i++){
            
            complement = target - nums[i];

            if(map.containsKey(complement)){
                int j = map.get(complement);
                return new int[] {i, j};
            }

            map.put(nums[i], i);
        }
        return new int[0];
    }
}