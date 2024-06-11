package student.service;

import student.model.Student;
import student.model.Subject;

public class StudentTest {
    public Student result(Student student) {

        for (Subject sublist: student.subjects) {
            if (sublist.marks >= 35) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
        return student;
    }
}