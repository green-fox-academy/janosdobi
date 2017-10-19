package sortthearray;

public class SortTheArray {
    public static void main(String[] args) {

        Integer[] myArray = {3,5,7,2,8,3,6,8};

        try {
            sort(myArray);
        } catch (Exception e) {
        } finally {
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
        }
    }

    public static <T extends Number> T[] sort(T[] inputList) throws Exception {
        T temp;
        for (int i = 0; i < inputList.length; i++) {
            for (int j = 0; j < inputList.length - i - 1; j++) {
                if (inputList[j].intValue() < inputList[j + 1].intValue()) {
                    temp = inputList[j];
                    inputList[j] = inputList[j + 1];
                    inputList[j + 1] = temp;
                }
            }
        }
        return inputList;
    }
}