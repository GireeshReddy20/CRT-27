public class binary {
    public static int binarysearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=high+low/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(mid<arr[target]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        int target=7;
        int result=binarysearch(arr,target);
        if(result==-1){
            System.out.println("element not found :");
        }
        else{
            System.out.println("element found at index:"+result);
        }
    }
}