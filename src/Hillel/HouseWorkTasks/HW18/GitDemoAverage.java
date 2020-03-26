package Hillel.HouseWorkTasks.HW18;

public class GitDemoAverage {
    public GitDemoAverage() {
    }

    public static void main(String[] args) {
        int start = 15;
        int end = 2;
        if (start > end) {
            int sum = start;

            int number;
            for(number = start - end + 1; start != end; sum += start) {
                --start;
            }

            System.err.println("Average is = " + (double)sum / (double)number);
        }

    }
}
