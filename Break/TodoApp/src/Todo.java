public class Todo {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();
        if (args.length < 1) {
            System.out.println("Command Line Todo application\n" +
                    "=============================\n" +
                    "\n" +
                    "Command line arguments:\n" +
                    " -l   Lists all the tasks\n" +
                    " -a   Adds a new task\n" +
                    " -r   Removes an task\n" +
                    " -c   Completes an task");
        } else if (args[0].equals("-l")) {
            todoList.listTasks();
        } else if (args[0].equals("-a")) {
            try {
                todoList.addTask(args[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unable to add: no task provided");
            }
        } else if (args[0].equals("-r")) {
            try {
                todoList.removeTask(Integer.parseInt(args[1]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unable to remove: no index provided");
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove: index is not a number");
            }
        } else if (args[0].equals("-c")) {
            try {
                todoList.completeTask(Integer.parseInt(args[1]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unable to check: no index provided");
            } catch (NumberFormatException e) {
                System.out.println("Unable to check: index is not a number");
            }
        } else {
            System.out.println("Unsupported argument\n" + "\n" +
                    "Command line arguments:\n" + "\n" +
                    "-l   Lists all the tasks\n" +
                    "-a   Adds a new task\n" +
                    "-r   Removes an task\n" +
                    "-c   Completes an task");
        }
    }
}