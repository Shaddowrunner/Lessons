package homeworks.writer_reader.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Shaddowrunner on 25.05.2017.
 */

public class Write extends Writer {

    private String content;
    private String add;

    public Write() {
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void modifyText(String add) {
       this.add = add;
    }

    @Override
    public void write() {
        try(FileWriter writer = new
                FileWriter("C:/Users/Shaddowrunner/IdeaProjects/Lessons/src/homeworks/writer_reader/poem.txt", true)) {

            Write writeContent = new Write();
           writeContent.setContent("test");


            modifyText(" I'm ready for writting to file ");
            String content = getContent();
            writer.write(add + content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
