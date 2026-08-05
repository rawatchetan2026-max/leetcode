class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Backtrack(nums , list , li , 0);
        return li ;
    }
    public static void Backtrack(int[] nums , List<Integer> list , List<List<Integer>> li , int idx ){
        if(idx == nums.length){
            li.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[idx]);
        Backtrack(nums, list ,li , idx + 1 );
        list.remove(list.size() - 1);
        Backtrack(nums, list ,li , idx + 1 );
    }
}