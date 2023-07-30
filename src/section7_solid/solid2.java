package section7_solid;

/**
 * S - Single Responsibility Principle - A Class should have one and only one reason to change
 * O - Open-closed Principle - Objects or entities should be open for extension but closed for modification
 *
 *
 */

public class solid2 {
    public static void main(String[] args) {
        int arr[] = {5,2,1,4,6,3};
        ArrayUtil.sort(arr, new DescComparator());
        for (int e : arr)
            System.out.println(e);

    }
}

interface ValueComparator {
    int compare(int val1, int val2);
}

class AscComparator implements ValueComparator {

    @Override
    public int compare(int val1, int val2) {
        return val1 - val2;
    }
}

class DescComparator implements ValueComparator {

    @Override
    public int compare(int val1, int val2) {
        return val2 - val1;
    }
}

class ArrayUtil {
    public static final void sort(int arr[], ValueComparator comparator){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(comparator.compare(arr[i], arr[j]) > 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
