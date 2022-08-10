class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] c=new int[m+n];
        
        int i=0,j=0,k=0;
        
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                c[k]=nums1[i];
                k++;
                i++;
            }else if(nums2[j]<nums1[i]){
                c[k]=nums2[j];
                j++;
                k++;
            }
        }
        
        
        while(i<m){
            c[k]=nums1[i];
            k++;
            i++;
        }
        
        
        
        while(j<n){
            c[k]=nums2[j];
            j++;
            k++;
        }
            
        
        for(i=0;i<m+n;i++){
            nums1[i]=c[i];
        }
    }
}
