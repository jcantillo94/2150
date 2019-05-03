import java.util.Random;

public class SortTimes {

    /** Void methods of arrays containing specified amounts of Elements to perform each type of sort
     * algorithm are performed in main method
     */
    public static void main(String[] args) {
        FiveKElements();
        OneHundredKElements();
        OneHundredFiftyKElements();
        TwoHundredKElements();
        TwoHundredFiftyKElements();
        ThreeHundredKElements();
        }

        // void method creating an array of 50000 random int elements to be copied into
        // 'Sortlist'. After each subsequent sort method is performed, 'Sortlist' is redefined and sorted by the next
        // sort algorithm until whole void method is complete. Each sort prints execution time once completed.
        public static void FiveKElements() {
            Random rand = new Random();
            int[] list = new int[50000];

            for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(list.length);
            }


        System.out.println("Array Size: " + list.length + " elements");
        int[] Sortlist = new int[50000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        long startTime = System.currentTimeMillis();
        selectionSort(Sortlist);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for Selection sort: " + executionTime);


        Sortlist = new int[50000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        bubbleSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Bubble sort: " + executionTime);

        Sortlist = new int[50000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        mergeSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Merge sort: " + executionTime);

        Sortlist = new int[50000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        quickSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Quick sort: " + executionTime);

        System.out.println(" ");

    }

    // void method creating an array of 100000 random int elements
    public static void OneHundredKElements() {
        Random rand = new Random();
        int[] list = new int[100000];

        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(list.length);
        }


        System.out.println("Array Size: " + list.length + " elements");
        int[] Sortlist = new int[100000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        long startTime = System.currentTimeMillis();
        selectionSort(Sortlist);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for Selection sort: " + executionTime);


        Sortlist = new int[100000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        bubbleSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Bubble sort: " + executionTime);

        Sortlist = new int[100000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        mergeSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Merge sort: " + executionTime);

        Sortlist = new int[100000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        quickSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Quick sort: " + executionTime);

        System.out.println(" ");
    }

    // void method creating an array of 150000 random int elements
    public static void OneHundredFiftyKElements() {
        Random rand = new Random();
        int[] list = new int[150000];

        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(list.length);
        }


        System.out.println("Array Size: " + list.length + " elements");
        int[] Sortlist = new int[150000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        long startTime = System.currentTimeMillis();
        selectionSort(Sortlist);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for Selection sort: " + executionTime);


        Sortlist = new int[150000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        bubbleSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Bubble sort: " + executionTime);

        Sortlist = new int[150000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        mergeSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Merge sort: " + executionTime);

        Sortlist = new int[150000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        quickSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Quick sort: " + executionTime);

        System.out.println(" ");
    }


    // void method creating an array of 200000 random int elements
    public static void TwoHundredKElements() {
        Random rand = new Random();
        int[] list = new int[200000];

        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(list.length);
        }


        System.out.println("Array Size: " + list.length + " elements");
        int[] Sortlist = new int[200000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        long startTime = System.currentTimeMillis();
        selectionSort(Sortlist);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for Selection sort: " + executionTime);


        Sortlist = new int[200000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        bubbleSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Bubble sort: " + executionTime);

        Sortlist = new int[200000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        mergeSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Merge sort: " + executionTime);

        Sortlist = new int[200000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        quickSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Quick sort: " + executionTime);

        System.out.println(" ");
    }

    // void method creating an array of 250000 random int elements
    public static void TwoHundredFiftyKElements() {
        Random rand = new Random();
        int[] list = new int[250000];

        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(list.length);
        }


        System.out.println("Array Size: " + list.length + " elements");
        int[] Sortlist = new int[250000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        long startTime = System.currentTimeMillis();
        selectionSort(Sortlist);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for Selection sort: " + executionTime);


        Sortlist = new int[250000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        bubbleSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Bubble sort: " + executionTime);

        Sortlist = new int[250000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        mergeSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Merge sort: " + executionTime);

        Sortlist = new int[250000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        quickSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Quick sort: " + executionTime);

        System.out.println(" ");
    }

    // void method creating an array of 300000 random int elements
    public static void ThreeHundredKElements() {
        Random rand = new Random();
        int[] list = new int[300000];

        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(list.length);
        }


        System.out.println("Array Size: " + list.length + " elements");
        int[] Sortlist = new int[300000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        long startTime = System.currentTimeMillis();
        selectionSort(Sortlist);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for Selection sort: " + executionTime);


        Sortlist = new int[300000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        bubbleSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Bubble sort: " + executionTime);

        Sortlist = new int[300000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        mergeSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Merge sort: " + executionTime);

        Sortlist = new int[300000];
        System.arraycopy(list, 0, Sortlist, 0, list.length);
        startTime = System.currentTimeMillis();
        quickSort(Sortlist);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Quick sort: " + executionTime);

        System.out.println(" ");
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }



    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }


    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0,
                    secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }


    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }


    private static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {

            while (low <= high && list[low] <= pivot)
                low++;


            while (low <= high && list[high] > pivot)
                high--;


            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;


        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

}

