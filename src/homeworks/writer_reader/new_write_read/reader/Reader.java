package homeworks.writer_reader.new_write_read.reader;

/**
 * Created by Shaddowrunner on 25.05.2017.
 */
public abstract class Reader implements Readable {

    protected String modifyText(String text) {
        return text.replace("I'm ready for writting to file", "I'm from file");
    }
}
