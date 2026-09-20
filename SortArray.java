class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low >= high) return; 

        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);      
        mergeSort(array, mid + 1, high); 
        merge(array, low, mid, high);    
    }

    private void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, k = 0;

        
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp[k++] = array[left++];
            } else {
                temp[k++] = array[right++];
            }
        }

        
        while (left <= mid) temp[k++] = array[left++];


        while (right <= high) temp[k++] = array[right++];


        System.arraycopy(temp, 0, array, low, temp.length);
    }
}
