package homeworks.writer_reader.new_write_read.writer;

/**
 * Created by Shaddowrunner on 25.05.2017.
 */
public abstract class Writer implements Writable {

    public String modifyText(String text) {
        return text.concat(" I'm ready for writting to file");
    }

}
