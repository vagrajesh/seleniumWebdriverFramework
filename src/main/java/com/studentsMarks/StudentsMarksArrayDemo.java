package com.studentsMarks;

public class StudentsMarksArrayDemo {
    public static void main(String[] args) {
        System.out.println("START");
        marksCalculation(10,20,30,40,50);
        schoolMarksCalculation();
        System.out.println("END");
    }
    public static void marksCalculation(int a, int b, int c, int d, int e){
        int total = 0;
        int[] subjectMarks = new int[5]; //Single dimension array
        subjectMarks[0] = a;
        subjectMarks[1] = b;
        subjectMarks[2] = c;
        subjectMarks[3] = d;
        subjectMarks[4] = e;
        System.out.println(subjectMarks.length);
        for (int subjectMark : subjectMarks) {
            total = total + subjectMark;
            System.out.println("Subject " + subjectMark);
            System.out.println("Total: " + total);
        }
        System.out.println("Final Total: " + total);
    }
    public static void schoolMarksCalculation(){
        System.out.println("TEST");
        int[] totalSchools = new int[10];
        System.out.println(totalSchools.length);
        for (int totalSchool : totalSchools) {
            System.out.println("TEST 1");
        }
    }
}