package com.sathya.collectinslabqestions;

import java.util.HashMap;
import java.util.Map;

public class combineMaps {

    public static void main(String[] args) {
        Map<Integer, String> data1 = new HashMap<Integer, String>();
        data1.put(101, "ratan");
        data1.put(102, "sathya");
        data1.put(103, "sathya");
        data1.put(104, "sathya");

        Map<Integer, String> data2 = new HashMap<Integer, String>();
        data2.put(101, "CSE");
        data2.put(102, "ECE");
        data2.put(103, "CSE");
        data2.put(104, "EEE");

        Map<Integer, Student> combinedMap = new HashMap<Integer, Student>();

        for (Map.Entry<Integer, String> entry : data1.entrySet()) {
            int studentId = entry.getKey();
            String studentName = entry.getValue();
            String studentBranch = data2.get(studentId); // Fix: Use data2 instead of data1
            combinedMap.put(studentId, new Student(studentId, studentName, studentBranch));
        }

        String search = "CSE";
        for (Map.Entry<Integer, Student> entry : combinedMap.entrySet()) {
            Student student = entry.getValue();
            if ( student.getBranch().equals(search)) {
                Integer studentId = student.getId();
                String studentName = student.getName();
                System.out.println("Student id: " + studentId + ", Student name: " + studentName);
            }
        }
    }
}