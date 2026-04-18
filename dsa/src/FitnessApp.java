import java.util.*;
import java.sql.*;

// Parent Class
class Tracking {

    private int steps;
    private int time;
    private int calories;
    protected int goal;
    private ArrayList<String> activities;

    // Constructor
    Tracking(int steps, int time, int calories) {
        this.steps = steps;
        this.time = time;
        this.calories = calories;
        activities = new ArrayList<>();
    }

    // getters
    public int getSteps() {
        return steps;
    }

    public int getTime() {
        return time;
    }

    public int getCalories() {
        return calories;
    }

    // goal setter
    public void setGoal(int goal) {
        this.goal = goal;
    }

    // add steps
    public void addSteps(int s) {
        steps += s;
    }

    // add time
    public void addTime(int t) {
        time += t;
    }

    // add activity
    public void addActivity(String act) {
        activities.add(act);
    }

    // calorie calculation
    public void calculateCalories(int steps) {
        calories += steps * 2;
    }

    // goal checking
    public void checkGoal() {
        if (steps >= goal) {
            System.out.println("Daily Goal Completed 🎉");
        } else {
            System.out.println("Goal not completed. Keep moving!");
        }
    }

    // show activities
    public void showActivities() {
        System.out.println("Activities Done Today:");
        for (String a : activities) {
            System.out.println("- " + a);
        }
    }

    // report
    public void dailyReport() {
        System.out.println("Steps : " + steps);
        System.out.println("Time  : " + time + " minutes");
        System.out.println("Calories : " + calories);
        System.out.println("Activities : " + activities);
    }
}


// Child Class
class User extends Tracking {

    private String username;
    private int age;

    User(String username, int age, int steps, int time, int calories, int goal) {
        super(steps, time, calories);
        this.username = username;
        this.age = age;
        setGoal(goal);
    }

    public String getUsername() {
        return username;
    }

    public void userDetails() {
        System.out.println("\nUser : " + username);
        System.out.println("Age  : " + age);
        System.out.println("Goal Steps : " + goal);
    }
}


// Main System Class
public class FitnessApp {
    // Database credentials
    static final String URL = "jdbc:mysql://localhost:3306/FitnessDB";
    static final String USER = "root";
    static final String PASS = "12341234";

    static Scanner sc = new Scanner(System.in);

    public static void addUser() {
        System.out.print("Enter username: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter step goal: ");
        int goal = sc.nextInt();

        String query = "INSERT INTO Users (username, age, goal) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, goal);
            pstmt.executeUpdate();
            System.out.println("User saved to Database.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void addActivity() {
        System.out.print("Enter username: ");
        String name = sc.next();
        System.out.print("Enter activity: ");
        String act = sc.next();
        System.out.print("Enter steps: ");
        int steps = sc.nextInt();

        // Logic: Update existing record
        String query = "UPDATE Users SET steps = steps + ?, calories = calories + ?, " +
                "activities = CONCAT(IFNULL(activities,''), ?) WHERE username = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, steps);
            pstmt.setInt(2, steps * 2); // Calorie logic
            pstmt.setString(3, act + ", ");
            pstmt.setString(4, name);

            int rows = pstmt.executeUpdate();
            if (rows > 0) System.out.println("Activity recorded!");
            else System.out.println("User not found.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        while (true) {

            System.out.println("\n---- FITNESS TRACKING SYSTEM ----");
            System.out.println("1 Add User");
            System.out.println("2 Add Activity");
            System.out.println("3 Show Report");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addUser();
                    break;

                case 2:
                    addActivity();
                    break;


                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}