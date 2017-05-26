package homeworks.writer_reader.new_write_read.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Shaddowrunner on 25.05.2017.
 */
public class ChildReader extends Reader {
    public static final String PATH_TO_FILE = "./Poem.txt";

    @Override
    public String read() {
        Path path = Paths.get(PATH_TO_FILE);

        String result = "";

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;

            while ((line = reader.readLine()) != null) {
                result = result.concat(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return modifyText(result);
    }
}
