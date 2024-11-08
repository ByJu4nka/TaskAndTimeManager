import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click me!");

        // Create a label
        JLabel label = new JLabel("Welcome to my simple GUI");

        // Add the button and label to the frame
        frame.add(button, BorderLayout.SOUTH);
        frame.add(label, BorderLayout.CENTER);

        // Set the size of the frame and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

class Task {
    private String name;
    private String category;
    private String deadline;
    private String priority;
    private boolean completed;

    public Task(String name, String category, String deadline, String priority) {
        this.name = name;
        this.category = category;
        this.deadline = deadline;
        this.priority = priority;
        this.completed = false;
    }

    // Mark task as completed
    public void completeTask() {
        this.completed = true;
    }

    // Display task details
    public void displayTask() {
        System.out.println("Task: " + name);
        System.out.println("Category: " + category);
        System.out.println("Deadline: " + deadline);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + (completed ? "Completed" : "Pending"));
        System.out.println();
    }

    // Getter methods
    public boolean isCompleted() {
        return completed;
    }

    public String getPriority() {
        return priority;
    }
}

