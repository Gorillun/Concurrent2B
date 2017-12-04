import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by keith on 11/2/16.
 */
public class Courses {

    private int seatsAvailable, capacity;
    private String name;
    private Courses next = null;
    private Courses parent =null;

    Courses(String name)
    {
        this.name = name;
        capacity = 30;
        seatsAvailable = capacity;
    }
    public String getName()
    {
        return name;
    }

    public boolean getSeat()
    {
        boolean seats = false;
            if (seatsAvailable > 0) {
                seatsAvailable = seatsAvailable -1;
                seats = true;
            }
        return seats;
    }

    public int seatsAvailable()
    {

            return seatsAvailable;

    }
    public Courses getParent()
    {
        return parent;
    }
    public Courses getNext()
    {
        return next;
    }
    public void setNext(Courses c)
    {
        next = c;
    }
    public void setParent(Courses c)
    {
        parent = c;
    }
    public boolean hasNext()
    {
        if(next!=null)
            return true;
        else
            return false;
    }

}
