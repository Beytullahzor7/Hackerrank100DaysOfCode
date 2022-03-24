package HackerRank;

import java.util.Scanner;

public class StudentDay12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }

    static class Person{
        protected String firstName;
        protected String lastName;
        protected int identification;

        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.identification = identification;
        }

        public void printPerson(){
            System.out.println("Name:" + lastName + ", " + firstName + "\nID: " + identification);
        }
    }

    static class Student extends Person{
        private int[] testScores;

        public Student(String firstName, String lastName, int identification, int[] testScores){
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        public char calculate(){
            int average = 0;
            for(int i = 0; i < testScores.length; i++){
                average += testScores[i];
            }
            average = average / testScores.length;
            char grade;

            if(average >= 90){
                grade = 'O'; // Outstanding
            }
            else if(average >= 80){
                grade = 'E'; // Exceeds Expectations
            }
            else if(average >= 70){
                grade = 'A'; // Acceptable
            }
            else if(average >= 55){
                grade = 'P'; // Dreadful
            }
            else if(average >= 40){
                grade = 'D'; // Dreadful
            }
            else{
                grade = 'T'; // Troll
            }
            return grade;
        }
    }
}
