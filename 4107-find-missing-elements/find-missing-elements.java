class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<>();

        Arrays.sort(nums);
        
        for(int i = 1 ; i < nums.length ; i++){
            for(int j = nums[ i - 1] + 1 ; j < nums[i] ; j++){
                li.add(j);
            }
        }

    return li;

                
    }
}