 public static void findFrequency(int a[]){

        boolean visited[]=new boolean[a.length];

        for(int i=0;i<a.length;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;

            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                        count++;
                        visited[j]=true;
                }
            }
            System.out.println(a[i]+" :"+count);
            
            
        }

    }
