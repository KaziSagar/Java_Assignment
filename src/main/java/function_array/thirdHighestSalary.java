// 3. Suppose, in a company , here are some employee salaries in an array
//[35000, 25000, 28000, 32500, 44000, 32800]
//Find out the 3rd highest salary

package function_array;

class Quicksort {
    static int partition(int array[], int low, int high) {

        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
}

class Main {
    public static void main(String args[]) {

        int[] arr = {35000, 25000, 28000, 32500, 44000, 32800};
        int size = arr.length;

        Quicksort.quickSort(arr, 0, size - 1);

        int salary = arr[size - 3];
        System.out.println("\nThe third highest salary is: " + salary);
    }
}