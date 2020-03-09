package ua.kpi.lab1.model;

import javafx.util.Pair;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;
import ua.kpi.lab1.view.View;

import java.util.ArrayList;
import java.util.List;

import static ua.kpi.lab1.view.View.NUMBER_GOOD_GRADE_STUDENT;


public class ProcceesModel {

    private List<Pair> studentGoodGradeList= new ArrayList<>();
    View view;

    public ProcceesModel(View view ){
        this.view = view;
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
            view.printMessage(View.NONE_STUDENT_GOOD_GRADE);
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

        return ((numberZalikovka-1 >= zalikovkas.size()) || (numberZalikovka-1 <0)) ?
                subjectExamList(View.NONE_ZALIKOVKA): subjectExamList(zalikovkas.get(numberZalikovka-1));


    }
    private List<String> subjectExamList(Zalikovka zalikovka){
        List<String> isExamSubjectsList = new ArrayList<>();
        for(Course course: zalikovka.getCourse()){
            for (Subjects subject: course.getSubject()){
                if(subject.getExamSubject()) isExamSubjectsList.add(view.getExamList(course.getCourseNumber(),subject.getNameSubject()));
            }
        }
        if(isExamSubjectsList.isEmpty()) {
            view.printMessage(View.NONE_EXAMS);
            return isExamSubjectsList;
        }
        return isExamSubjectsList;
    }
    private List<String> subjectExamList(String message){
        List<String> list = new ArrayList<>();
        list.add(message);
        return list;
    }


}
