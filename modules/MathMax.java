package modules;

import java.lang.reflect.Array;

public class MathMax {
    public int getMax(int[] arrayValue) {
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

    public float getMax(float[] arrayValue) {
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

    public double getMax(double[] arrayValue) {
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

    private void validateArray(Object array) {
        if (array == null || Array.getLength(array) == 0) {
            throw new IllegalArgumentException("Argument cannot be empty!");
        }
    }

}
