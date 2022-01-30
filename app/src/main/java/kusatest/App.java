package kusatest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        String input_str = file_read();
        input_str += "\n追記!";
        file_output(input_str);
    }

    public static String file_read() throws IOException {
        Path file = Paths.get("src/main/resources/input/test.txt");
        return Files.readString(file, Charset.forName("UTF-8"));
    }

    public static void file_output(String value) throws IOException {
        File output_file = new File("src/main/resources/output/test.txt");
        FileWriter filewriter = new FileWriter(output_file);          
        filewriter.write(value);
        filewriter.close();
    }
}
