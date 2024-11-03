package csYa_ronny;

public class PairFinder {
    public static int[] findPairWithSum(int[] array, int target) {
        // TODO: Implement the logic to find two numbers that sum up to the target
        return new int[]{};
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        PairFinder pairFinder = new PairFinder();
        int[] array = {1, 2, 3, 4, 5};
        int target = 9;
        int[] result = findPairWithSum(array, target);

        // הדפסת התוצאה (תצוגה צפויה - זוג מספרים שסכומם שווה למטרה)
        System.out.println("Pair with target sum: ");
        printArray(result);
    }
}