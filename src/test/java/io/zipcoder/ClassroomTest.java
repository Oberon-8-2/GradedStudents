package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;
import static javafx.scene.input.KeyCode.A;
import static javafx.scene.input.KeyCode.F;
import static javax.print.attribute.standard.MediaSizeName.D;

public class ClassroomTest {

        @Test
        public void examScoreTest() {
            // : Given
            Double expected = 125.0;
            Double[] s1Scores = {100.0, 150.0};
            Double[] s2Scores = {205.0, 25.0};

            Student s1 = new Student("student", "one", s1Scores);
            Student s2 = new Student("student", "two", s2Scores);

            Student[] students = new Student[]{s1, s2};
            Classroom classroom = new Classroom ();

            // When
            double output = classroom.getAverageExamScore();

            // Then
            System.out.println(output);
            //return output;
        }

        @Test
        public void addStudentTest() {
            // : Given
            int students =0;
            int maxNumberOfStudents = 1;
            Classroom classroom = new Classroom();
            Double[] examScores = {100.0, 150.0, 250.0, 0.0};
            Student student = new Student("Leon", "Hunter", examScores);

            // When
            Student[] preEnrollment = classroom.getStudents();
            classroom.addStudent(student);
            Student[] postEnrollment = classroom.getStudents();

            // Then
            String preEnrollmentAsString = Arrays.toString(preEnrollment);
            String postEnrollmentAsString = Arrays.toString(postEnrollment);

            System.out.println("===========================");
            System.out.println(preEnrollmentAsString);
            System.out.println("===========================");
            System.out.println(postEnrollmentAsString);

        }

        @Test
        public void removeStudentTest() {
            //Given

            // : Given

            Double[] s1Scores = {100.0, 150.0};
            Double[] s2Scores = {205.0, 25.0};


            Student s1 = new Student("Leon", "Hunter", s1Scores);
            Student s2 = new Student("Aishwarya", "Rai", s2Scores);

            Student[] students = new Student[]{s1, s2};
            Classroom classroom = new Classroom(students);

            classroom.removeStudent("Leon", "Hunter");

            // When
            Student[] retrievedStudents = classroom.getStudents();

            String output = Arrays.asList(retrievedStudents).toString();

            System.out.println(Arrays.asList(retrievedStudents));

        }

        @Test
        public void getStudentByScoreTest() {
            Double[] s1Scores = {100.0, 150.0};
            Double[] s2Scores = {205.0, 25.0};
            Double[] s3Scores = {100.0, 150.0};
            Double[] s4Scores = {89.0, 95.0};


            Student s1 = new Student("Leon", "Hunter", s1Scores);
            Student s2 = new Student("Aishwarya", "Rai", s2Scores);
            Student s3 = new Student("Priyanka", "Chopra", s3Scores);
            Student s4 = new Student("Diana", "Haiden", s4Scores);

            Student[] students = new Student[]{s1, s2, s3, s4};
            Classroom classroom = new Classroom(students);

            classroom.getStudentByScore();
        }

        @Test
        public void getGradeBookTest() {
            Double[]  s1Scores = { 1000.0, 1000.0 };
            Double[]  s2Scores = {  900.0,  900.0 };
            Double[]  s3Scores = {  700.0,  700.0 };
            Double[]  s4Scores = {  600.0,  600.0 };
            Double[]  s5Scores = {  700.0,  700.0 };
            Double[]  s6Scores = {  200.0,  200.0 };
            Double[]  s7Scores = {  900.0,  900.0 };
            Double[]  s8Scores = {  750.0,  750.0 };
            Double[]  s9Scores = {  600.0,  600.0 };
            Double[] s10Scores = {  600.0,  600.0 };

            Student  s1 = new Student("Name1", "LastName1",   s1Scores);
            Student  s2 = new Student("Name2", "LastName2",   s2Scores);
            Student  s3 = new Student("Name3", "LastName3",   s3Scores);
            Student  s4 = new Student("Name4", "LastName4",   s4Scores);
            Student  s5 = new Student("Name5", "LastName5",   s5Scores);
            Student  s6 = new Student("Name6", "LastName6",   s6Scores);
            Student  s7 = new Student("Name7", "LastName7",   s7Scores);
            Student  s8 = new Student("Name8", "LastName8",   s8Scores);
            Student  s9 = new Student("Name9", "LastName9",   s9Scores);
            Student s10 = new Student("Name10", "LastName10",s10Scores);

            Student[] students = new Student[]{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

            Classroom classroom = new Classroom(students);

            classroom.getGradeBook();
        }
    }

