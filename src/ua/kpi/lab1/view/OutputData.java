package ua.kpi.lab1.view;

import javafx.util.Pair;
import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;
import ua.kpi.lab1.view.View;

import java.util.List;

import static ua.kpi.lab1.view.View.*;

public class OutputData {

    View view;
    Model model;

    public OutputData(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void outZalikovka(List<Zalikovka> zalikovkas){

        zalikovkaZalikovkaShow(zalikovkas);

    }
    public void zalikovkaZalikovkaShow(List<Zalikovka> zalikovkas) {
        view.printAllZalikovkas();
        for (Zalikovka zalikovka: zalikovkas){
            System.out.println (zalikovka.getNumZalikovka()+"\t\t"+zalikovka.getIdStudent()+"\t\t"+
                    zalikovka.getNameStudent());
            zalikovkaCourseShow(zalikovka.getCourse());
            view.printMessage(TABLE_SIGN);
        }
    }

    private void zalikovkaCourseShow(List<Course> courses) {
        for (Course course: courses){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t"+course.getCourseNumber()+"\t\t\t");
            zalikovkaSubjectShow(course.getSubject());
        }
    }

    private void zalikovkaSubjectShow(List<Subjects> subjects) {
        for (Subjects subject: subjects){
            System.out.println ("\t\t\t\t\t\t\t\t\t\t\t\t\t"+subject.getNameSubject()+" ("+getExamOfSubject(subject)+")"+"\t\t"+subject.getGradeSubject());

        }
    }

    private String getExamOfSubject(Subjects subject) {
        return (subject.getExamSubject()) ? "Exam" : "Test";
    }

    public void outStudentGoodGradeShow(List<Pair> students) {

        if(students == null) System.out.println("None of the Students have average grade higher then 4.5");
        else{
            for (Pair student: students){
                System.out.println (student.getKey()+" Grade: "+student.getValue()+'\n');

            }
        }

    }

    public void outSubjectsIsExamShow(List<String> subjects) {

        for (String subject: subjects){
            System.out.println (subject);

        }
    }


}
