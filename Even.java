 public static void even(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        int emptyarr[]=new int[count];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                emptyarr[index++]=a[i];
            }
        }
         for(int i=0;i<count;i++){
             System.out.print(emptyarr[i]);
         }
}
