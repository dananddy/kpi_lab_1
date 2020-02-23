package ua.kpi.lab1.model;

import javafx.util.Pair;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;

import java.util.ArrayList;
import java.util.List;

import static ua.kpi.lab1.view.View.NUMBER_GOOD_GRADE_STUDENT;


public class ProcceesModel {



    public ProcceesModel( ){

    }

    public void getAllStudentsAverGrade(List<Zalikovka> zalikovkas){
        List<String> studentGoodGradeList= null;
        Pair nameStudentAndAverGrade;

        for(Zalikovka zalikovka: zalikovkas){
            nameStudentAndAverGrade = getAverageGradeStudent(zalikovka);
            if (((double) nameStudentAndAverGrade.getValue()) >= NUMBER_GOOD_GRADE_STUDENT){
                studentGoodGradeList.add((String)nameStudentAndAverGrade.getKey());
            }
        }
        for (String student: studentGoodGradeList){
            System.out.println (student+'\n');

        }
        //return studentGoodGradeList;
    }

    private Pair getAverageGradeStudent(Zalikovka zalikovka){
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

}
