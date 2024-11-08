import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager
{
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Task Manager - Choose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskCompleted();
                    break;
                case 4:
                    System.out.println("Exiting Task Manager...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Add a new task
    private static void addTask() {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter task category: ");
        String category = scanner.nextLine();

        System.out.println("Enter task deadline (e.g., YYYY-MM-DD):");
        String deadline = scanner.nextLine();

        System.out.println("Enter task priority (e.g., High, Medium, Low):");
        String priority = scanner.nextLine();

        Task newTask = new Task(name, category, deadline, priority);
        tasks.add(newTask);
        System.out.println("Task added successfully!\n");
    }

    // View all tasks
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.\n");
            return;
        }

        System.out.println("Task List:");
        for (Task task : tasks) {
            task.displayTask();
        }
    }

    // Mark a task as completed
    private static void markTaskCompleted() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to complete.\n");
            return;
        }

        System.out.println("Enter the task number to mark as completed:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).getPriority() + " - " + tasks.get(i).isCompleted());
        }

        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.\n");
        } else {
            tasks.get(taskNumber - 1).completeTask();
            System.out.println("Task marked as completed!\n");
        }
    }
}