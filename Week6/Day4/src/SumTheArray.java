public class SumTheArray {
    public static void main(String[] args) {

        Integer[] myArray = {3,5,7,2,8,3,6,8};

        try {
            System.out.println(sumArray(myArray, 14));
        } catch (ArrayIndexOutOfBoundsException e) {
        } finally {
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
        }
    }

    public static <T extends Number> int sumArray(T[] inputArray, int length) throws ArrayIndexOutOfBoundsException {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += inputArray[i].intValue();
        }
        return sum;
    }

}
