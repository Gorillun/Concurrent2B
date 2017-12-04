/**
 * Created by keith on 11/13/16.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
public class Initialize {
    private ConcurrentHashMap<String, Courses> hashMap = new ConcurrentHashMap();
    private BufferedReader br = null;
    private String[] courses = new String[200];

    Initialize()
    {
        readFile();
    }

    public void readFile()
    {
        ClassLoader cl = getClass().getClassLoader();
        String currentLine;
        try
        {
            br = new BufferedReader(new FileReader(cl.getResource("courses.txt").getFile()));
            int i =0;
            while((currentLine = br.readLine()) != null)
            {
                courses[i] = currentLine;
                System.out.println(currentLine);
                Courses c = new Courses(currentLine);
                hashMap.put(currentLine,c);
                ++i;
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public ConcurrentHashMap getHashMap()
    {
        return hashMap;
    }
    public String[] getCourses()
    {
        return courses;
    }
}
