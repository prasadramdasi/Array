int binarySearch(int arr[], int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2; // avoid overflow

        if (arr[mid] == target) {
            return mid; // element found
        } 
        else if (arr[mid] < target) {
            left = mid + 1; // search right side
        } 
        else {
            right = mid - 1; // search left side
        }
    }

    return -1; // element not found
}
