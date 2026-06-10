public class MarksArrayAverage {
    public static void main(String[] args) {


        int marks[] = {50,80,87,89,90};
        int sum = 0,avg;
        for (int i = 0; i < marks.length; i++) {

            sum += marks[i];
        }

        avg = sum / marks.length;

        System.out.println("Total Marks = " + sum);
        System.out.println("Average Marks = " + avg);
    }
}