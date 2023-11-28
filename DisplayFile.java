import java.io.*;

public class DisplayFile {
    public static void main(String[] args) throws IOException{
        String file = "input.txt"; 
        try {
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            int lineNumber = 1;
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
            fr.close();
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

/*
I am studying java.
JAVA is an object-oriented language.
Studying in mec.
Father of JAVA is James Gosling.
*/
