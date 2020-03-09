package ua.kpi.lab1.view;

import javafx.util.Pair;
import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;


import java.util.List;

import static ua.kpi.lab1.view.View.*;

public class OutputData {

    View view;
    public OutputData(View view){
        this.view = view;
    }

    public void outZalikovka(List<Zalikovka> zalikovkas){

        zalikovkaZalikovkaShow(zalikovkas);

    }
    public void zalikovkaZalikovkaShow(List<Zalikovka> zalikovkas) {
        view.printAllZalikovkas();
        view.printMessage(TABLE_SIGN);
        for (Zalikovka zalikovka: zalikovkas){
            System.out.format (FORMATED_TOP_TABLE,zalikovka.getNumZalikovka(),zalikovka.getIdStudent(),
                    zalikovka.getNameStudent());
            zalikovkaCourseShow(zalikovka.getCourse());
            view.printMessage(TABLE_SIGN);
        }
    }

    private void zalikovkaCourseShow(List<Course> courses) {
        for (Course course: courses){
            System.out.format(FORMATED_COURSE_DISPLAY,EMPTY,EMPTY,course.getCourseNumber());
            zalikovkaSubjectShow(course.getSubject());
        }
    }

    private void zalikovkaSubjectShow(List<Subjects> subjects) {
        for (Subjects subject: subjects){
            System.out.format (FORMATED_SUBJECT_DISPLAY,EMPTY,EMPTY,EMPTY,subject.getNameSubject(),getExamOfSubject(subject),subject.getGradeSubject());

        }
    }

    private String getExamOfSubject(Subjects subject) {
        return (subject.getExamSubject()) ? IF_EXAM: IF_TEST;
    }

    public void outStudentGoodGradeShow(List<Pair> students) {
        for (Pair student: students){ System.out.format (FORMATED_GRADE_DISPLAY,student.getKey(),student.getValue());}
    }

    public void outSubjectsIsExamShow(List<String> subjects) {

        for (String subject: subjects){
            view.printMessage(subject);
        }
    }


}
