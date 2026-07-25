import java.io.Console;

public class InputCompare {
    private static final int ERROR_VALUE = -1;
    private static final int CHILD_THRESHOLD = 13;
    private static final int TEEN_THRESHOLD = 18;
    private static final int YOUNG_ADULT_THRESHOLD = 25;
    private static final int ADULT_THRESHOLD = 64;

    public enum AGEGROUP {
        CHILD("Child"),
        TEENAGER("Teenager"),
        YOUNGADULT("Young Adult"),
        ADULT("Adult"),
        SENIOR("Senior"),
        ERROR("Error Occurred");

        private final String labelString;

        AGEGROUP(String labelString) {
            this.labelString = labelString;
        }

        public String getLabel() {
            return this.labelString;
        }
    }

    public static void main(String[] args) {
        System.out.println("Age Group Finder");
        System.out.println("What is your Age-Group?");
        // Method Calling
        int userAge = readConsole();
        String ageGroup = ageGroupAssigner(userAge);

        System.out.println("Your age is " + userAge + " ,and your age group is " + ageGroup);

    }

    private static int readConsole() {

        try {
            Console console = System.console();
            if (console == null) {
                System.err.println("Error: readConsole error: Console doesn't exist.");
                return ERROR_VALUE;
            }
            String strAge = console.readLine("Enter your Age: ");
            return Integer.parseInt(strAge);
        } catch (NumberFormatException e) {
            System.err.println("Error: Read Console Error");
            return ERROR_VALUE;
        }
    }

    private static String ageGroupAssigner(int age) {
        /**
         * Determines what age is inputed belongs to which age group and returns it
         * 
         * @param a int of a age
         * @return The AGEGROUP label/string
         **/
        if (age == ERROR_VALUE) {
            return AGEGROUP.ERROR.getLabel();
        } else if (age < CHILD_THRESHOLD) {
            return AGEGROUP.CHILD.getLabel();
        } else if (age < TEEN_THRESHOLD) {
            return AGEGROUP.TEENAGER.getLabel();
        } else if (age < YOUNG_ADULT_THRESHOLD) {
            return AGEGROUP.YOUNGADULT.getLabel();
        } else if (age < ADULT_THRESHOLD) {
            return AGEGROUP.ADULT.getLabel();
        } else {
            return AGEGROUP.SENIOR.getLabel();
        }

    }

}
