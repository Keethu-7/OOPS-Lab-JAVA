import java.io.*;
public class FileHandling {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            FileInputStream input = new FileInputStream(inputFile);
            FileOutputStream output = new FileOutputStream(outputFile);
            int c;
            while ((c=input.read()) != -1) {
                output.write(c);
            }
            input.close();
            output.close();
            System.out.println("File content copied successfully");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
