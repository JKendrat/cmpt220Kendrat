import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1213 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		if (args.length != 1) {
            System.out.println("This is an invalid statement.");
            System.out.println("Used for: java Chapter_12._13 filename");
            System.exit(1);
        }
        File filename = new File(args[0]);
        if (!filename.exists()) {
            System.out.println(filename + " does not exist.");
            System.exit(2);
        }

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                String name = input.nextLine();
                lines++;
                characters += name.length();
                String[] split = name.split(" ");
                for (String word : split) {
                    words++;
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);


    }
        

	}

