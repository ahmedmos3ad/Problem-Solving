class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0 || nums == null)
            return null;
        if (nums.length == 2)
        {
            int toReturn[] = {0,1};
            return toReturn;
        }
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++)
        {
            Integer requiredNum= (Integer) target - nums[i];
            if (indexMap.containsKey(requiredNum))
            {
                int toReturn[] = {indexMap.get(requiredNum),i};
            return toReturn;
        }
        indexMap.put(nums[i],i);
    }
    return null;
	}
}