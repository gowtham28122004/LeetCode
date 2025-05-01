class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length-2;i >= 0;i--) {
            if(arr[i] > max) {
                max = arr[i]+max;
                arr[i] = max-arr[i];
                max = max-arr[i];
            }
            else {
                arr[i] = max;
            }
        }
        return arr;
    }
}