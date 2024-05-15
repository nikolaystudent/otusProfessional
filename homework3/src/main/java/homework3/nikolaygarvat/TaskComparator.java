package homework3.nikolaygarvat;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        if ((o1.getStatus().equals("opened") && o2.getStatus().equals("opened")) ||
                (o1.getStatus().equals("in process") && o2.getStatus().equals("in process")) ||
                (o1.getStatus().equals("closed") && o2.getStatus().equals("closed"))) {
            return 0;
        } else if (o1.getStatus().equals("opened") && (o2.getStatus().equals("in process")) || o2.getStatus().equals("closed")) {
            return -1;
        } else if (o1.getStatus().equals("in process") && o2.getStatus().equals("closed")) {
            return -1;
        } else return 1;

    }
}
