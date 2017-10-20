package com.greenfox;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Task> taskList;
    private FileManipulation myOperations;

    public TodoList() {
        myOperations = new FileManipulation();
        myOperations.load();
        uploadTasksList();
    }

    public void addTask(String name) {
        taskList.add(new Task(name));
        setNewTaskId();
        myOperations.getLinesOfFile().add(new String[] {taskList.get(taskList.size() - 1).getCompleted() ? "&&" : "", taskList.get(taskList.size() - 1).getName(), String.valueOf(taskList.get(taskList.size() - 1).getId())}); //to be replaced
        myOperations.save();
    }

    private void setNewTaskId () {
        taskList.get(taskList.size() - 1).setId(taskList.size());
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
            myOperations.getLinesOfFile().remove(taskID - 1); // to be replaced
            myOperations.save();
        }
    }

    public void completeTask(int taskID) {
        if (taskList.size() > 2) {
            try {
                taskList.get(taskID - 1).setCompleted();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to check: index is out of bound");
            }
            myOperations.getLinesOfFile().set(taskID - 1, new String[] {taskList.get(taskID - 1).getCompleted() ? "&&" : "", taskList.get(taskID - 1).getName(), String.valueOf(taskList.get(taskID - 1).getId())});
            myOperations.save();
        }
    }

    public void updateTask(int taskID, String name) {
        taskList.get(taskID - 1).setName(name);
        for (int i = 0; i < taskList.size(); i++) {
            myOperations.getLinesOfFile().set(taskID - 1, new String[] {taskList.get(taskID - 1).getCompleted() ? "&&" : "", taskList.get(taskID - 1).getName(), String.valueOf(taskList.get(taskID - 1).getId())});
            myOperations.save();
        }
    }

    private void uploadTasksList() {
        taskList = new ArrayList<>();
        for (int i = 0; i < myOperations.getLinesOfFile().size(); i++) {
            taskList.add(new Task((myOperations.getLinesOfFile().get(i)[1])));
            setTaskStatusWhenLoading(myOperations.getLinesOfFile(), i);
            setTaskIdWhenLoading(myOperations.getLinesOfFile(), i);
        }
    }

    private void setTaskStatusWhenLoading(List<String[]> linesOfFile, int i) {
        if (linesOfFile.get(i)[0].equals("&&")) {
            taskList.get(i).setCompleted();
        }
    }

    private void setTaskIdWhenLoading(List<String[]> linesOfFile, int i) {
        taskList.get(i).setId(Integer.parseInt(linesOfFile.get(i)[2]));
    }
}