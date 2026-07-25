import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {

    public static void main(String[] args) {
        String option;
        Boolean isRunning = true;

        while (isRunning) {
            System.out.println("File Manager: Create, Read, Edit, and Exit");
            option = readConsole();
            switch (option) {
                case "Create" -> {
                    String fileName = readConsole();
                    createFile(fileName);
                }
                case "Edit" -> {
                    String fileName = readConsole();
                    String content = readConsole();
                    editFile(fileName, content);
                }
                case "Read" -> {
                    String fileName = readConsole();
                    System.out.println(readFile(fileName));
                }
                case "Exit" -> isRunning = false;
                default -> System.out.println("Error: Invalid Option");
            }
        }

    }

    private static String readConsole() {
        Console console = System.console();
        if (console == null) {
            System.err.println("Error: readConsole error: Console doesn't exist.");
            return "Error";
        }
        String string = console.readLine("Enter your Option: ");
        return string;
    }

    private static void createFile(String file) {
        String filePath = file;
        try {
            File fileAddress = new File(filePath);
            if (fileAddress.createNewFile()) {
                System.out.println("File " + fileAddress.getName() + " has been created.");
            } else {
                System.out.println("File " + fileAddress.getName() + " already exists.");
            }
        } catch (IOException e) {
            System.err.println("An Error Occurred");
            e.printStackTrace();
        }
    }

    private static void editFile(String file, String fileContent) {
        String filePath = file;
        try (FileWriter fileWriter = new FileWriter(filePath, true);) {
            fileWriter.write(fileContent + "\n");
            System.out.println("File Successfully Edited: " + filePath);
        } catch (IOException e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }

    private static String readFile(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            while (fileScanner.hasNextLine()) {
                fileContent.append(fileScanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "Error: File not found.";
        }
        return fileContent.toString();
    }

}
