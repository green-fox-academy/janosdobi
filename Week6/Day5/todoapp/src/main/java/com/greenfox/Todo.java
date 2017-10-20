package com.greenfox;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Todo {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();

        OptionParser parser = new OptionParser();
        parser.accepts("l");
        parser.accepts("a").withRequiredArg();
        parser.accepts("r").withRequiredArg();
        parser.accepts("c").withRequiredArg();
        parser.accepts("u").withRequiredArg();
        OptionSet options = parser.parse(args);

        if (options.has("a")) {
            todoList.addTask(options.valueOf("a").toString());
        } else if (options.has("l")) {
            todoList.listTasks();
        } else if (options.has("r")) {
            todoList.removeTask(Integer.parseInt(options.valueOf("r").toString()));
        } else if (options.has("c")) {
            todoList.completeTask(Integer.parseInt(options.valueOf("c").toString()));
        } else if (options.has("u")) {
            todoList.updateTask(Integer.parseInt(options.valueOf("u").toString()), args[2]);
        } else {
            System.out.println("Unsupported argument\n" + "\n" +
                    "Command line arguments:\n" + "\n" +
                    "-l   Lists all the tasks\n" +
                    "-a   Adds a new task\n" +
                    "-r   Removes a task\n" +
                    "-c   Completes a task\n" +
                    "-u   Updates a task");
        }
    }
}