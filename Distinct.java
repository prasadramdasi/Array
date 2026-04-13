class FindDistinct{
    //Find all distinct elements in an array and store them in a new array.
    public static void main(String[] args) {
        int arr[] = {4,3,2,3,4,5,6,7};
        int newArray[]= new int[arr.length];
        int count=0;

        for(int i=0;i<arr.length;i++){
            Boolean duplicate = false;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    duplicate=true;
                    break;
                }
            }

            if (!duplicate) {
                newArray[count++]=arr[i];
            }
        }

        for(int i=0;i<count;i++){
            System.out.print(newArray[i]);
        }



    }
}
