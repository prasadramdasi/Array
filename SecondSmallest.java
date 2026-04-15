 int arr[]= {7, 84, 21,5,35,3};
        // smallestElement(arr);


        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }

        System.out.println(second);
