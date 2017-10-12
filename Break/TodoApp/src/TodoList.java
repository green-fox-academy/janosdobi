import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Task> taskList;
    private Path myPath;

    public TodoList() {
        myPath = Paths.get("C:/Users/PC-DJ/Documents/GreenFox/TodoApp/src/Data.txt");
        readFile();
    }

    public void addTask(String name) {
        taskList.add(new Task(name, taskList.size()));
        writeFile();
    }

    public void listTasks() {
        if (taskList.size() != 0) {
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println(taskList.get(i));
            }
        } else {
            System.out.println("No todos for today! :)");
        }
    }

    public void removeTask(int taskID) {
        if (taskList.size() > 2) {
            try {
                taskList.remove(taskID - 1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to remove: index is out of bound");
            }
            writeFile();
        }
    }

    public void completeTask(int taskID) {
        if (taskList.size() > 2) {
            try {
                taskList.get(taskID - 1).setCompleted();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to check: index is out of bound");
            }
            writeFile();
        }
    }

    public void readFile() {
        taskList = new ArrayList<>();
        try {
            List<String> myList =  Files.readAllLines(myPath);
            for (int i = 0; i < myList.size(); i++) {
                taskList.add(new Task((myList.get(i).startsWith("&&") ? myList.get(i).substring(2) : myList.get(i)), i + 1));
                if (myList.get(i).startsWith("&&")) {
                    taskList.get(i).setCompleted();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile() {
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < taskList.size(); i++) {
            myList.add((taskList.get(i).getCompleted() ? "&&" : "") + taskList.get(i).getName());
        }
        try {
            Files.write(myPath, myList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}