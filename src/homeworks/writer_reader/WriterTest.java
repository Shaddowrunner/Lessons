package homeworks.writer_reader;

import homeworks.writer_reader.writer.Write;

/**
 * Created by Shaddowrunner on 25.05.2017.
 */
public class WriterTest {

    public static void main(String[] args) {
        Write test = new Write();
        test.setContent("test string");
        test.write();
    }
}
