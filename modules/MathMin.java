package modules;

public class MathMin {
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
