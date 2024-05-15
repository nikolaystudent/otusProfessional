package homework3.nikolaygarvat;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static List<Task> listOfTasks = new ArrayList<>();

    //Получение списка задач по выбранному статусу;
    public static List<Task> tasksByStatus(String status){
        return listOfTasks.stream().filter(x -> x.getStatus().equals(status)).toList();
    }

    //Проверка наличия задачи с указанным ID;
    public static boolean isTaskID(int ID){
        return listOfTasks.stream().anyMatch(x -> x.getID() == ID);
    }

    //Получение списка задач в отсортированном по статусу виде:
    // открыта, в работе, закрыта;
    public static List<Task> sortedByStatus(){
        return listOfTasks.stream().sorted(new TaskComparator()).toList();
    }

    //Подсчет количества задач по определенному статусу
    public static Long countOfTasksByStatus(String status){
        return listOfTasks.stream().filter(x -> x.getStatus().equals("closed")).count();
    }

    public static void main(String[] args) {

        listOfTasks.add(new Task(1, "Task 1", "opened"));
        listOfTasks.add(new Task(2, "Task 2", "in process"));
        listOfTasks.add(new Task(3, "Task 3", "closed"));
        listOfTasks.add(new Task(4, "Task 4", "in process"));
        listOfTasks.add(new Task(5, "Task 5", "closed"));
        listOfTasks.add(new Task(6, "Task 6", "in process"));
        listOfTasks.add(new Task(7, "Task 7", "opened"));
        listOfTasks.add(new Task(8, "Task 8", "closed"));
        listOfTasks.add(new Task(9, "Task 9", "opened"));
        listOfTasks.add(new Task(10, "Task 10", "in process"));

        System.out.println("Список задач со статусом opened: " +
                tasksByStatus("opened").stream().map(x->x.getName()).toList());

        System.out.println("Проверка наличия задачи с ID 6: " + isTaskID(6));

        System.out.println("Список задач отсортированный по статусу: " +
                sortedByStatus().stream().map(x->x.getName()).toList());

        System.out.println("Кол-во задач со статусом closed: " +
                countOfTasksByStatus("closed"));

    }

}