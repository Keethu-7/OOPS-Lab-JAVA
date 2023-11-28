import java.io.*;

public class FileNumbers {
    public static void main(String[] args) {
        String file = "input.txt";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int charCount = 0, lines = 0, words = 0;
            String line;
            while ((line = br.readLine()) != null) {
                charCount += line.length();
                lines++;
                String[] str = line.split("\\s");
                words += str.length;
            }
            fr.close();
            br.close();
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of lines: " + lines);
            System.out.println("Number of words: " + words);

        }
        catch (IOException e) {
            System.out.println("An error occurred during file reading: " + e.getMessage());
        }
    }
}

/*
I am studying java.
JAVA is an object oriented language.
Studying in mec.
Father of java is James Gosling.
*/
