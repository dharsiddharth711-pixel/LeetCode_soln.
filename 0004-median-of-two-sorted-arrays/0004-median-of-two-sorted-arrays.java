class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;
        int arr[]= new int[n+m];
        for(int i=0; i<m; i++)
            arr[i]= nums1[i];
        for(int i=0; i<n; i++)
            arr[i+m]= nums2[i];
        int t; 
        for(int i=0; i<(m+n); i++){
            for (int j=0; j<(m+n-i-1); j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= t;
                }
            }
        }
        double median;
        int index;
        if((m+n)%2==0){
            index= (m+n)/2;
            median= (arr[index]+ arr[index-1])/2.0;
            return median;
        }
        else{
            index= (m+n)/2;
            return arr[index];
        }
    }
}