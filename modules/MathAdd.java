package modules;

public class MathAdd {
    public static double add(int[] array) {
        /**
         * Adds all ints in an array.
         * 
         * @param int[] array: an array full of int
         * @return double result: the result
         **/
        validateArray(array);
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static double add(float[] array) {
        /**
         * Adds all floats in an array.
         * 
         * @param floats[] array: an array full of floats
         * @return double result: the result
         **/
        validateArray(array);
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static double add(double[] array) {
        /**
         * Adds all doubles in an array.
         * 
         * @param doubles[] array: an array full of doubles
         * @return double result: the result
         **/
        validateArray(array);
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
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
