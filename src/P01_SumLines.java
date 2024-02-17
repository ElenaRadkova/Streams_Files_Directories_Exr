import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class P01_SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\admin\\Desktop\\Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));
        for (String line:allLines) {
            int sum = 0;

            for (int index = 0; index < line.length(); index++) {
                char currentSymbol = line.charAt(index);
                sum += currentSymbol;
            }
            System.out.println(sum);
        }

    }
}
