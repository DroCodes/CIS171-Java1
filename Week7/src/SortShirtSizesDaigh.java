
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 9, 2023
* MacOS 13.2
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class SortShirtSizesDaigh {
    public static void main(String[] args) {
        // Input file URL and output file names
        String inputFile = "https://bbmedia.dmacc.edu/CIS/CIS171/shirtsizes.txt";
        String smallFile = "smallshirts.txt";
        String mediumFile = "mediumshirts.txt";
        String largeFile = "largeshirts.txt";
        String extraLargeFile = "extralargeshirts.txt";

        try {
            // Open input file URL
            URL url = new URL(inputFile);
            // Create a scanner to read from file
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNextLine()) {
                // Read a line from the input file
                String line = scanner.nextLine();
                // Split the line into two parts: name and shirt size
                String[] parts = line.split(",");
                String name = parts[0];
                String size = parts[1];
                String outputFileName;
                // Determine the appropriate output file based on the shirt size
                if (size.equals("S")) {
                    outputFileName = smallFile;
                } else if (size.equals("M")) {
                    outputFileName = mediumFile;
                } else if (size.equals("L")) {
                    outputFileName = largeFile;
                } else if (size.equals("XL")) {
                    outputFileName = extraLargeFile;
                } else {
                    // If the shirt size is invalid, skip this name and print an error message
                    System.out.println("Invalid shirt size for " + name + ": " + size);
                    continue;
                }
                try (PrintWriter writer = new PrintWriter(new File(outputFileName))) {
                    // Write the name to the appropriate output file
                    writer.println(name);
                } catch (FileNotFoundException e) {
                    // prints error message if file isnt found
                    e.printStackTrace();
                }
            }
            // Close the scanner and print a message indicating that the program has finished
            scanner.close();
            System.out.println("Finished sorting shirt sizes.");
        } catch (Exception e) {
            // prints error message if the url can't be opened
            System.out.println(inputFile + " is not available.");
            e.printStackTrace();
        }
    }
}

