class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int count=0;
        for(int i:nums){
            if(!set.contains(i)) continue;
            set.remove(i);
            int l=i-1;
            int r=i+1;
            while(set.contains(l)){
                set.remove(l--);
            }
            while(set.contains(r)){
                set.remove(r++);
            }
            if(r-l-1>count){
                count=r-l-1;
            }
        }
        return count;
    }
}
