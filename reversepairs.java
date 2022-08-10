class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    int mergesort(int [] nums,int low,int high){
        if(low>=high) return 0;
        int mid=(low+high)/2;
        int inv=mergesort(nums,low,mid);
        inv+=mergesort(nums,mid+1,high);
        inv+=merge(nums,low,mid,high);
        return (int)inv;
    }
    int merge(int [] nums,int low,int mid,int high){
        int inv=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && (long)nums[i]> (long)(2*nums[j])){
                j++;
            }
            inv+=(j-(mid+1));
        }
        ArrayList<Integer> list=new ArrayList<>();
        int i=low;
        j=mid+1;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                list.add(nums[i++]);
            }else{
                list.add(nums[j++]);
            }
        }
        while(i<=mid){
            list.add(nums[i++]);
        }
        while(j<=high){
            list.add(nums[j++]);
        }
        for(i=low;i<=high;i++){
            nums[i]=list.get(i-low);
        }
        return (int)inv;
    }
}
class Solution {
    public int reversePairs(int[] nums) {
        int[] ans = new int[nums.length] ;
        int ans2 = mergeSort(nums,ans,0,nums.length-1) ;
        
        for(int i=0;i<nums.length;i++) System.out.print(nums[i]+" ") ;
        
        return ans2 ;
    }
    public int mergeSort(int[] arr,int[] ans,int left,int right){
        int mid = 0 ;
        int count = 0 ;
        
        if(left<right){
            mid = (left+right)/2 ;
            
            count += mergeSort(arr,ans,left,mid) ;
            count += mergeSort(arr,ans,mid+1,right) ;
            
            count += merge(arr,ans,left,mid+1,right) ;
        }
        
        return (int)count ;
    }
    public long merge(int[] arr,int[] ans,int left,int mid,int right){
        int count = 0 ;
        int i = left ;
        int j = mid ;
        
        for(int a=left;a<mid;a++){
            while(j<=right && (long)arr[a]>(2*((long)arr[j]))) j++ ;
            
            count += (j - mid) ;
        }
        
        j = mid ;
        
        int k = left ;
        
        while(i<mid && j<=right){
            if(arr[i]<=arr[j]){
                ans[k++] = arr[i++] ;
            }
            else{
                //if(arr[i]>(2*arr[j]))count += (mid - i) ;
                ans[k++] = arr[j++] ;
            }
        }
        
        while(i<mid){
            ans[k++] = arr[i++] ;
        }
        while(j<=right){
            ans[k++] = arr[j++] ;
        }
        
        for(i=left;i<=right;i++) arr[i] = ans[i] ;
        
        return (int)count ;
    }
}
