package modules;

public class MathAverage {
    public static double getAverage(int[] array) {
        /**
         * Calculate the mean average within an array and give back the result.
         * 
         * @param int[] array: The array full of integers
         * @return double result: the mean average of the array
         **/
        validateArray(array);
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }

    public static double getAverage(float[] array) {
        /**
         * Calculate the mean average within an array and give back the result.
         * 
         * @param float[] array: The array full of floats
         * @return double result: the mean average of the array
         **/
        validateArray(array);
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }

    public static double getAverage(double[] array) {
        /**
         * Calculate the mean average within an array and give back the result.
         * 
         * @param double[] array: The array full of doubles
         * @return double result: the mean average of the array
         **/
        validateArray(array);
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }

    private static void validateArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Argument cannot be empty!");
        }
    }

    private static void validateArray(float[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Argument cannot be empty!");
        }
    }

    private static void validateArray(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Argument cannot be empty!");
        }
    }
}
