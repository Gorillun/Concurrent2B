import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by keith on 11/13/16.
 */
public class Assignment2B
{
    public static void main(String [] arg)
    {
        Initialize init = new Initialize();
        ConcurrentHashMap hm = init.getHashMap();
        String[] courses = init.getCourses();
        ReadAndWrite rW = new ReadAndWrite(courses,hm);
        rW.runThreads();
    }
}
