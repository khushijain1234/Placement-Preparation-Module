class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1;
        int num2=-1;
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                c1++;
            }else if(nums[i]==num2){
                c2++;
            }else if(c1==0){
                num1=nums[i];
                c1++;
            }else if(c2==0){
                num2=nums[i];
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        List<Integer> ans=new ArrayList<Integer>();
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                c1++;
            }else if(nums[i]==num2){
                c2++;
            }
        }
        if(c1>nums.length/3) ans.add(num1);
        if(c2>nums.length/3) ans.add(num2);
        return ans;
    }
}
