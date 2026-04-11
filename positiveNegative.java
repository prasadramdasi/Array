   public static void posNeg(int a[]){
        int pos=0;
        int neg=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println("Positive " + pos);
        System.out.println("Negative " + neg);

    }
