public class QuickSort implements Sortable {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
		
       if (left >= right)
			return;

		int start = left;
		int end = right;
		int mid = (start + end) / 2;
		int pivot = nums[mid];
		while (start <= end) {

			while (nums[start] < pivot) {
				start++;
			}
			while (nums[end] > pivot) {
				end--;
			}
			if (start <= end) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				start++;
				end--;
			}
		}
		quickSort(nums, left, end);
		quickSort(nums, start, right);
    }
}
