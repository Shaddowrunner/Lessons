package homeworks.writer_reader.new_write_read;

import homeworks.writer_reader.new_write_read.reader.ChildReader;
import homeworks.writer_reader.new_write_read.writer.ChildWrite;

import java.io.IOException;

/**
 * Created by Shaddowrunner on 26.05.2017.
 */
public class TestNewFile {
    public static void main(String[] args) throws IOException {
        ChildWrite writer = new ChildWrite();
        writer.write("Hello, Slava");
        ChildReader reader = new ChildReader();
        System.out.println(reader.read());
    }
}
