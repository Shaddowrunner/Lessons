package homeworks.writer_reader.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Shaddowrunner on 25.05.2017.
 */
public class Read extends Reader {
    private static final String filePath = "C:/Users/Shaddowrunner/IdeaProjects/Lessons/src/homeworks/writer_reader/poem.txt";
    private String add;

    public Read() {
    }

    @Override
    public void modifyText(String add) {
        this.add = add;
    }

    @Override
    public void read() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            modifyText("I'm from file ");
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(add + currentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
