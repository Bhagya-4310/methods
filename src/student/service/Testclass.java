package student.service;

import student.model.Student;
import student.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class Testclass {
    public static void main(String[] args) {


        Subject[] sub=new Subject[6];
        sub[0]=new Subject();
        sub[0].subjectName="a";
        sub[0].marks=40;
        sub[1]=new Subject();
        sub[1].subjectName="b";
        sub[1].marks=50;
        sub[2]=new Subject();
        sub[2].subjectName="c";
        sub[2].marks=40;
        sub[3]=new Subject();
        sub[3].marks=50;
        sub[3].subjectName="d";
        sub[4]=new Subject();
        sub[4].subjectName="e";
        sub[4].marks=50;
        sub[5]=new Subject();
        sub[5].marks=60;
        sub[5].subjectName="f";
        Student st=new Student();
        st.name="bhagi";
        st.subjects=sub;
        StudentTest studentTest=new StudentTest();
        studentTest.result(st);


       /* List<Subject> sublist=new ArrayList<>();

        Subject sub1=new Subject();
        sub1.subjectName="telugu";
        sub1.marks=40;
        Subject sub2=new Subject();
        sub2.subjectName="hindi";
        sub2.marks=42;
        Subject sub3=new Subject();
        sub3.subjectName="english";
        sub3.marks=40;
        Subject sub4=new Subject();
        sub4.subjectName="maths";
        sub4.marks=40;
        Subject sub5=new Subject();
        sub5.subjectName="science";
        sub5.marks=30;
        Subject sub6=new Subject();
        sub6.subjectName="social";
        sub6.marks=40;
        sublist.add(sub1);
        sublist.add(sub2);
        sublist.add(sub3);
        sublist.add(sub4);
        sublist.add(sub5);
        sublist.add(sub6);
       Student st=new Student();
        st.name="bhagi";
        st.rollNumber="1";
        st.subjects=sublist;
        StudentTest studentTest=new StudentTest();
        studentTest.result(st);
     */
    }
}
