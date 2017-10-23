package com.greenfox;

import java.time.LocalDateTime;
import java.util.ArrayList ;
import java.util.List;

public class TodoList extends FileManipulation implements Persistance {

    private List<Task> taskList;

    public TodoList() {
        loadFromFile();
        loadTasksList();
    }

    private void loadTasksList() {
        taskList = new ArrayList<>();
        for (int i = 0; i < getLinesOfFile().size(); i++) {
            taskList.add(new Task(getLinesOfFile().get(i)[2], i + 1, LocalDateTime.parse(getLinesOfFile().get(i)[0])));
            taskList.get(i).setCompletedAt(LocalDateTime.parse(getLinesOfFile().get(i)[1]));
        }
        getLinesOfFile().clear();
    }

    public void listTasks() {
        if (taskList.size() > 0) {
            for (Task t : taskList) {
                System.out.println(t);
            }
        }
    }

    public void addTask(String name) {
        taskList.add(new Task(name, setNewTaskId(), LocalDateTime.now()));
        loadLinesOfFile();
        saveToFile();
    }

    private int setNewTaskId() {
        return taskList.size() + 1;
    }

    public void removeTask(int taskID) {
        if (taskList.size() > 2) {
            try {
                taskList.remove(taskID - 1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to remove: index is out of bound");
            }
            loadLinesOfFile();
            saveToFile();
        }
    }

    public void completeTask(int taskID) {
        if (taskList.size() > 2) {
            try {
                taskList.get(taskID - 1).setCompletedAt(LocalDateTime.now());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to check: index is out of bound");
            }
            loadLinesOfFile();
            saveToFile();
        }
    }

    public void updateTask(int taskID, String name) {
        taskList.get(taskID - 1).setName(name);
        loadLinesOfFile();
        saveToFile();
    }

    private void loadLinesOfFile() {
        for (Task aTaskList : taskList) {
            setLineOfFile(aTaskList.getCreatedAt(), aTaskList.getCompletedAt(), aTaskList.getName(), aTaskList.getId());
        }
    }

    //interface implementation....

    @Override
    public void save(Task todo) {
        taskList.add(todo);
    }

    @Override
    public void saveAll(List<Task> todoList) {
        this.taskList.addAll(todoList);
    }

    @Override
    public Task load(int id) {
        Task task = new Task();
        for (Task t : taskList) {
            if(t.getId() == id) {
                task = t;
            }
        }
        return task;
    }

    @Override
    public Task load(String name) {
        Task task = new Task();
        for (Task t : taskList) {
            if(t.getName().equals(name)) {
                task = t;
            }
        }
        return task;
    }

    @Override
    public List<Task> loadAll() {
        return taskList;
    }
}