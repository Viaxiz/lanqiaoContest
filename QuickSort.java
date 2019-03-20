
class QuickSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		quickSort(arr, 0, arr.length - 1);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void quickSort(int arr[], int left, int right) {
		if (left > right)
			return;
		int x = left;
		int y = right;
		int pivot = arr[left];
		while (x < y) {
			while (pivot <= arr[y] && x < y) {
				y--;
			}
			while (pivot >= arr[x] && x < y) {
				x++;
			}
			swap(arr, x, y);
		}
		arr[left] = arr[x];
		arr[x] = pivot;
		quickSort(arr, left, x - 1);
		quickSort(arr, x + 1, right);
	}

	/*public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}*///之前我错的位置就是在这，换的只是形参，所以才会导致有bug
	
	public static void swap(int arr[],int x,int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
}