package homeworks.writer_reader.new_write_read.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Shaddowrunner on 25.05.2017.
 */

public class ChildWrite extends Writer {

    public static final String PATH_TO_FILE = "./Poem.txt";

    @Override
    public void write(String text) {

        Path path = Paths.get(PATH_TO_FILE);

//        Path path = FileSystems.getDefault().getPath(PATH_TO_FILE);

        text = modifyText(text);

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE)) {
            writer.write(text, 0, text.length());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
