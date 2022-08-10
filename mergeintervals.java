class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int st=intervals[0][0];
        int en=intervals[0][1];
        
        for(int []i:intervals){
            if(i[0]<=en){
                en=Math.max(i[1],en);
            }else{
                res.add(new int[]{st,en});
                st=i[0];
                en=i[1];
            }
        }
        res.add(new int[]{st,en});
        return res.toArray(new int[0][]);
    }
}
