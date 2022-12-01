import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReeder {
    public static void main(String args[]) {

        File file;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        String command = inputs[0];
        String pattern = inputs[1];
        String theFile = inputs[2];

        file = new File(theFile);
        if (command.equals("search")) {
            try {
                Scanner fileSC = new Scanner(file);
                while (fileSC.hasNextLine()) {
                    String line = fileSC.nextLine();
                    if (line.contains(pattern)) {
                        System.out.println(line);
                    }
                }
                fileSC.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}