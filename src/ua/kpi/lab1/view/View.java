package ua.kpi.lab1.view;

import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.model.course.Subjects;

import java.util.List;

public class View {

    public static final int NUMBER_OF_COURSES = 4;


    public static final int NUMBER_MAX_GRADE = 5;

    public static final int NUMBER_MIN =3;

    public static final double NUMBER_GOOD_GRADE_STUDENT = 4.5;

    public static final int NUMBER_ID_MIN = 10000;
    public static final int NUMBER_ID_MAX = 99999;

    public static final int NUMBER_SUBJECT_MIN = 1;
    public static final int NUMBER_SUBJECT_MAX =5;

    public static final int NUMBER_COURSES_MIN = 1;
    public static final int NUMBER_COURSES_MAX =4;

    public static final int NUMBER_ZALIKOVKA_MIN = 5;
    public static final int NUMBER_ZALIKOVKA_MAX =10;

    public static final String TABLE_OF_ZALIKOVKA = "№\t\tID\t\t\tNAME\t\t\t\t\t\t\tCOURSE\tSUBJECT\t\t\tGRADE\n";
    public static final String TABLE_SIGN = "______________________________________________________";

    public static final String INPUT_NUMBER_ZALIKOVKA= "Enter the number of zalikovka to find your exams.\n";

    public void printMessage(String message){System.out.println(message);}

    public void printAllZalikovkas()  {printMessage(TABLE_OF_ZALIKOVKA+TABLE_SIGN);}



}
