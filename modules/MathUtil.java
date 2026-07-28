package modules;

public class MathUtil {
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

    public static int getMax(int[] arrayValue) {
        /**
         * To get a max *int* from an array
         * 
         * @param int[] listValue: the array full of int (Values)
         * @return maxValue: the maximum int (Value) of listValue
         */

        validateArray(arrayValue);

        int maxElement = arrayValue[0];
        for (int e = 1; e < arrayValue.length; e++) {
            if (arrayValue[e] > maxElement) {
                maxElement = arrayValue[e];
            }
        }
        return maxElement;
    }

    public static float getMax(float[] arrayValue) {
        /**
         * To get a max *float* from an array
         * 
         * @param float[] listValue: the array full of float (Values)
         * @return maxValue: the maximum float (Value) of listValue
         */

        validateArray(arrayValue);

        float maxElement = arrayValue[0];
        for (int e = 1; e < arrayValue.length; e++) {
            if (arrayValue[e] > maxElement) {
                maxElement = arrayValue[e];
            }
        }
        return maxElement;
    }

    public static double getMax(double[] arrayValue) {
        /**
         * To get a max *double* from an array
         * 
         * @param double[] listValue: the array full of doubles (Values)
         * @return maxValue: the maximum doubles (Value) of listValue
         */

        validateArray(arrayValue);

        double maxElement = arrayValue[0];
        for (int e = 1; e < arrayValue.length; e++) {
            if (arrayValue[e] > maxElement) {
                maxElement = arrayValue[e];
            }
        }
        return maxElement;
    }

    public static int getMin(int[] arrayValue) {
        /**
         * To get a min *int* from an array
         * 
         * @param int[] listValue: the array full of int (Values)
         * @return maxValue: the minimum int (Value) of listValue
         */

        validateArray(arrayValue);

        int minElement = arrayValue[0];
        for (int e = 1; e < arrayValue.length; e++) {
            if (arrayValue[e] < minElement) {
                minElement = arrayValue[e];
            }
        }
        return minElement;
    }

    public static float getMin(float[] arrayValue) {
        /**
         * To get a min *float* from an array
         * 
         * @param float[] listValue: the array full of float (Values)
         * @return maxValue: the minimum float (Value) of listValue
         */

        validateArray(arrayValue);

        float minElement = arrayValue[0];
        for (int e = 1; e < arrayValue.length; e++) {
            if (arrayValue[e] < minElement) {
                minElement = arrayValue[e];
            }
        }
        return minElement;
    }

    public static double getMin(double[] arrayValue) {
        /**
         * To get a min *double* from an array
         * 
         * @param double[] listValue: the array full of doubles (Values)
         * @return maxValue: the minimum doubles (Value) of listValue
         */

        validateArray(arrayValue);

        double minElement = arrayValue[0];
        for (int e = 1; e < arrayValue.length; e++) {
            if (arrayValue[e] < minElement) {
                minElement = arrayValue[e];
            }
        }
        return minElement;
    }

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
