package ua.kpi.lab1.view;

public class View {

    public static final int NUMBER_MAX_GRADE = 5;

    public static final int NUMBER_MIN_GRADE =4;

    public static final double NUMBER_GOOD_GRADE_STUDENT = 4.5;

    public static final int NUMBER_ID_MIN = 10000;
    public static final int NUMBER_ID_MAX = 99999;

    public static final int NUMBER_SUBJECT_MIN = 1;
    public static final int NUMBER_SUBJECT_MAX =5;

    public static final int NUMBER_COURSES_MIN = 1;
    public static final int NUMBER_COURSES_MAX =4;

    public static final int NUMBER_ZALIKOVKA_MIN = 5;
    public static final int NUMBER_ZALIKOVKA_MAX =10;

    public static final String TABLE_SIGN = "_____________________________________________________________________________";

    public static final String INPUT_NUMBER_ZALIKOVKA= "Enter the number of zalikovka to find your exams:";
    public static final String NONE_STUDENT_GOOD_GRADE = "None of the Students have average grade higher then 4.5";
    public static final String NONE_ZALIKOVKA = "No such Zalikovka!";
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

    public void printTableOfZalikovka(){System.out.format("%3s|%8s|%29s|%20s (%4s) - %3s\n","№","ID","STUDENT NAME","COURSE","SUBJECT","","GRADE");}

    public void printMessageInputNumberZalikovka(){System.out.println(INPUT_NUMBER_ZALIKOVKA);}

    public void printMessage(String message){System.out.println(message);}

    public void printAllZalikovkas()  {printTableOfZalikovka();}



}
