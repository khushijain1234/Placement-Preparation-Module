public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int ans1=0,ans2=0;
        for(int i=0;i<A.length;i++){
            int idx=Math.abs(A[i]);
            if(A[idx-1]<0){
                ans1=idx;
            }
            A[idx-1]=(-1)*A[idx-1];
        }
        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                ans2=i+1;
                break;
            }
        }
        return new int[]{ans1,ans2};
    }
}
