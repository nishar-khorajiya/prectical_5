import java.io.*;

// Main class
public class prec_5_2 {
    // Main driver method
    public static void main(String[] args)
            throws IOException {

        // Initially assigning null as we have not read
        // anything
        FileReader sourceStream = null;

        // Try block to check for exceptions
        try {

            // Reading from file
            sourceStream = new FileReader(
                    "/Users/mayanksolanki/Desktop/demo.rtf");

            // Reading sourcefile and writing content to
            // target file character by character.

            int temp;

            // If there is content inside file
            // than read
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);

            // Display message for successful execution of program
            System.out.print("Program successfully executed");
        }

        // finally block that executes for sure
        // where we are closing file connections
        // to avoid memory leakage
        finally {

            // Closing stream as no longer in use
            if (sourceStream != null)
            sourceStream.close();
        }
    }
}
