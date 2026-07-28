import modules.MathUtil;
import modules.FileUtil;

public class ArrayMath {
    private static boolean isRunning;

    public static void main(String[] args) {
        /**
         * Runs a while loop and keeps the app running
         * 
         * 
         **/
        isRunning = true;

        while (isRunning) {
            String userPath = FileUtil.readConsole();
            Double userFile = Double.parseDouble(FileUtil.readFile(userPath));

            System.out.println(MathUtil.add(userFile));
            System.out.println(MathUtil.getAverage(userFile));
            
        }

    }

    private static double[] readFileArray(Double) {
        int 
    }
}
