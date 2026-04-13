public static void leftRotate(int a[],int k){
        int n = a.length;
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = a[(i + k) % 5];
        }

        for(int i=0;i<n;i++){
            System.out.print(result[i]+ " ");
        }


    }
