class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        
        int[] arr = new int[n];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < nums1.length && j < nums2.length) {
            int val1 = nums1[i];
            int val2 = nums2[j];
            
            if(val1 < val2) {
                arr[k] = val1;
                i++;
            } else {
                arr[k] = val2;
                j++;
            }
            k++;
        }
        
        while(i<nums1.length) {
            arr[k++] = nums1[i++];
        }
        
        while(j<nums2.length) {
            arr[k++] = nums2[j++];
        }
        
        
        
        double ans = 0;
        
        int mid = n/2;
        
        if(n % 2 == 0) {
            ans = arr[mid] + arr[mid-1];
            ans = ans/2;
        } else {
            ans = arr[mid];
        }
        return ans;
    }
}