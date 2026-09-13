public class Labsheet2Q25 {
    public static void main(String[] args) {
            double[][] studentMarks = {
            {85.5, 90.0, 78.0},
            {92.0, 88.5, 95.0}, 
            {65.0, 70.0, 72.5}    
      };

        double totalSum = 0;
        int totalSubjects = 0;

        for (double[] student : studentMarks) {
            for (double mark : student) {
                totalSum += mark;
                totalSubjects++;
            }
        }

        double average = totalSum / totalSubjects;
        System.out.printf("Total Marks Accumulated: %.2f\n", totalSum);
        System.out.printf("Average Marks across all students: %.2f\n", average);
    }
}
