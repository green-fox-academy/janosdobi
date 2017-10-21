package com.greenfox;

import java.time.LocalDateTime;
import java.util.ArrayList ;
import java.util.List;

public class TodoList {

    private List<Task> taskList;
    private FileManipulation myOperations;

    public TodoList() {
        myOperations = new FileManipulation();
        myOperations.loadFromFile();
        loadTasksList();
    }

    private void loadTasksList() {
        taskList = new ArrayList<>();
        for (int i = 0; i < myOperations.getLinesOfFile().size(); i++) {
            taskList.add(new Task(myOperations.getLinesOfFile().get(i)[2], i + 1, LocalDateTime.parse(myOperations.getLinesOfFile().get(i)[0])));
            taskList.get(i).setCompletedAt(LocalDateTime.parse(myOperations.getLinesOfFile().get(i)[1]));
        }
        myOperations.getLinesOfFile().clear();
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
        myOperations.saveToFile();
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
            myOperations.saveToFile();
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
            myOperations.saveToFile();
        }
    }

    public void updateTask(int taskID, String name) {
        taskList.get(taskID - 1).setName(name);
        loadLinesOfFile();
        myOperations.saveToFile();
    }

    private void loadLinesOfFile() {
        for (int i = 0; i < taskList.size(); i++) {
            myOperations.setLineOfFile(taskList.get(i).getCreatedAt(), taskList.get(i).getCompletedAt(), taskList.get(i).getName(), taskList.get(i).getId());
        }
    }
}