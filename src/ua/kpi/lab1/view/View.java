package ua.kpi.lab1.view;

import ua.kpi.lab1.model.Zalikovka;

import java.util.List;

public class View {

    public static final int NUMBER_MAX_GRADE = 5;

    public static final int NUMBER_MIN_GRADE =3;

    public static final double NUMBER_GOOD_GRADE_STUDENT = 4.5;

    public static final int NUMBER_ID_MIN = 10000;
    public static final int NUMBER_ID_MAX = 99999;

    public static final int NUMBER_SUBJECT_MIN = 3;
    public static final int NUMBER_SUBJECT_MAX =5;

    public static final int NUMBER_COURSES_MIN = 1;
    public static final int NUMBER_COURSES_MAX =4;

    public static final int NUMBER_ZALIKOVKA_MIN = 80;
    public static final int NUMBER_ZALIKOVKA_MAX =100;

    public static final String TABLE_SIGN = "_____________________________________________________________________________";

    public static final String INPUT_NUMBER_ZALIKOVKA= "Enter the number of zalikovka to find your exams ";
    public static final String INPUT_NUMBER_ZALIKOVKA_AGAIN= "\nIf you want to see exmas of other student\nenter the number of zalikovka\nIf you want to exit - press any non-numirical symbol\nEnter the number of zalikovka to find your exams ";
    public static final String NONE_STUDENT_GOOD_GRADE = "None of the Students have average grade higher then 4.5";
    public static final String NONE_ZALIKOVKA = "No such Zalikovka!\n";
    public static final String NONE_EXAMS = "Student had not any exams!";

    public static final String FORMATED_TOP_TABLE = "%-3s|%-8s|%-30s|\n";
    public static final String FORMATED_COURSE_DISPLAY ="%3s|%8s|%30s: \n";
    public static final String FORMATED_SUBJECT_DISPLAY ="%3s|%8s|%30s|%-20s (%4s) - %3d\n";
    public static final String FORMATED_GRADE_DISPLAY ="%-30s  %.1f\n";

    public static final String IF_EXAM ="Exam";
    public static final String IF_TEST ="Test";

    public static final String EMPTY ="";

    public String getExamList(int courseNumber, String subjectName){
        return "(Year "+courseNumber+")"+subjectName;
    }

    public void printTableOfZalikovka(){System.out.format("%-2s|%-8s|%-24s%5s|%3s  %3s\n","№","ID","STUDENT NAME","COURSE","SUBJECT","","GRADE");}

    public void printMessageInputNumberZalikovka(List<Zalikovka> zalikovkas){System.out.println(INPUT_NUMBER_ZALIKOVKA+"(1 - "+zalikovkas.size()+"):");}
    public void printMessageInputNumberZalikovkaIfAgain(List<Zalikovka> zalikovkas){System.out.println(INPUT_NUMBER_ZALIKOVKA_AGAIN+"(1 - "+zalikovkas.size()+"):");}

    public void printMessage(String message){System.out.println(message);}

    public void printAllZalikovkas()  {printTableOfZalikovka();}



}
