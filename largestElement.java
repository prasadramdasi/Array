 public static void maxElement(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("largest element is:"+ max);
    }
