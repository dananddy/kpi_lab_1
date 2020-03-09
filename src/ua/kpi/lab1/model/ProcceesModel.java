package ua.kpi.lab1.model;

import javafx.util.Pair;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;

import java.util.ArrayList;
import java.util.List;

import static ua.kpi.lab1.view.View.NUMBER_GOOD_GRADE_STUDENT;


public class ProcceesModel {

    private List<Pair> studentGoodGradeList= new ArrayList<>();

    public ProcceesModel( ){

    }

    public List<Pair> getAllStudentsAverGrade(List<Zalikovka> zalikovkas){

        Pair nameStudentAndAverGrade;

        for(Zalikovka zalikovka: zalikovkas){
            nameStudentAndAverGrade = averageGradeStudent(zalikovka);
            if (((double) nameStudentAndAverGrade.getValue()) >= NUMBER_GOOD_GRADE_STUDENT){
                studentGoodGradeList.add(nameStudentAndAverGrade);
            }
        }
        if(studentGoodGradeList.isEmpty()) {
            System.out.println("None of the Students have average grade higher then 4.5");
            return studentGoodGradeList;
        }
        else return studentGoodGradeList;
    }

    private Pair averageGradeStudent(Zalikovka zalikovka){
        Pair nameStudentAndAverGrade;
        int countSubjects =0;
        double averageGrade = 0;
        for(Course course: zalikovka.getCourse()){
            for (Subjects subject: course.getSubject()){
                averageGrade +=subject.getGradeSubject();
                countSubjects++;
            }
        }
        averageGrade= averageGrade / countSubjects;
        nameStudentAndAverGrade = new Pair(zalikovka.getNameStudent(), averageGrade);
        return nameStudentAndAverGrade;
    }

    public List<String> getSubjectExamList(int numberZalikovka,List<Zalikovka> zalikovkas){
        Zalikovka zalikovka = zalikovkas.get(numberZalikovka - 1);

        return subjectExamList(zalikovka);
    }
    private List<String> subjectExamList(Zalikovka zalikovka){
        List<String> isExamSubjectsList = new ArrayList<>();
        for(Course course: zalikovka.getCourse()){
            for (Subjects subject: course.getSubject()){
                if(subject.getExamSubject()) isExamSubjectsList.add("(Year: "+course.getCourseNumber()+")"+subject.getNameSubject());
            }
        }
        if(isExamSubjectsList.isEmpty()) {
            System.out.println("Student had not any exams!");
            return isExamSubjectsList;
        }
        return isExamSubjectsList;
    }


}
