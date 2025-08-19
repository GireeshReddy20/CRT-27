class linear{
    public static int linearsearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        int target=7;
        int result=linearsearch(arr,target);
        if(result==-1){
            System.out.println("element not found :");
        }
        else{
            System.out.println("element found at index:"+result);
        }
    }
}