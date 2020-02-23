package ua.kpi.lab1.model.StudentNames;

import ua.kpi.lab1.model.course.CourseName;

import java.util.Random;

public enum StudentFirstName {
    MICKEL,
    DANIELL,
    VIKTOR,
    MIKHAYLO,
    ROMAN,
    LESTER,
    ASTER,
    PETER,
    VAZOV,
    BOHDAN;
    private static final StudentFirstName[] STUDEN_NAME = values();
    private static final int SIZE = STUDEN_NAME.length;
    private static final Random RANDOM = new Random();

    public static StudentFirstName getRandomStudentName()  {
        return STUDEN_NAME[RANDOM.nextInt(SIZE)];
    }
    public static String getRandomFirstNameStudentAsString(){
        return String.valueOf(StudentFirstName.getRandomStudentName());
    }
}
