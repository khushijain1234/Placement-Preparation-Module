class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> pre,curr;
        curr=new ArrayList<>();
        pre=new ArrayList<>();
        curr.add(1);
        ans.add(curr);
        int temp=2;
        for(int i=1;i<numRows;i++){
            curr=new ArrayList<>();
            for(int j=0;j<temp;j++){
                if(j==0 || j==temp-1){
                    curr.add(1);
                }else{
                    curr.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre=curr;
            ans.add(curr);
            temp++;
        }
        return ans;
    }
}
