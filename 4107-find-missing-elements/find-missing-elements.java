class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    
        List<Integer> li=new ArrayList<>();
        Arrays.sort(nums);
        int st=nums[0];
        st++;
        for(int i=1;i<nums.length;i++){
            if(st!=nums[i]){
                li.add(st);
                i--;
            }
            st++;
        }
        return li;
    }

}