
public class Main {


        public static void findDuplicate(int a[]){

            for (int i=0;i<a.length;i++ ) {

                boolean isDuplicate = false;

                // check if already printed
                for (int k = 0; k < i; k++) {
                    if (a[i] == a[k]) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) continue;

                // check duplicates ahead

                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){

                        System.out.print(a[i]);
                        break;

                    }
                }
            }

        }


        public static void main(String[] args) {

            int a[]= {1,2,3,2,4,2,3,3,5};

            findDuplicate(a);
        }
    }


