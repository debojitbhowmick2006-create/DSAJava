public class BiSearchusingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,54,56,89,98};
        int target = 1;
        int ans = search(arr, target, 0, arr.length);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = (start + (end-start)/2);
        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return search(arr, target, mid+1, end);
        }
        return search(arr,target, start, mid -1);
    }
}
