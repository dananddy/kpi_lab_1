package ua.kpi.lab1.model.course;

import java.util.ArrayList;
import java.util.Random;

public enum CourseName {

    PHYSICS,
    CHEMISTRY,
    HISTORY,
    UKRAINIAN,
    ENGLISH,
    PROGRAMMING,
    PSYCHOLOGY,
    PHILOSOPHY,
    OOP,
    COMPUTER_SCIENCE,
    SPORT,
    ART,
    IPZ,
    ENGINEERING
    ;
    private static final CourseName[] COURSE_NAMES = values();
    private static final int SIZE = COURSE_NAMES.length;
    private static final Random RANDOM = new Random();




    /*for(int i = 1; i <= SIZE; i++) {
        list.add(i);
    }*/
    //can return same subject if: return COURSE_NAMES[RANDOM.nextInt(SIZE)];
    public static String getRandomNameCourseAsString(){

        return String.valueOf(COURSE_NAMES[RANDOM.nextInt(SIZE)]);
    }



    //want it to not return same subject
    /*private static int randSubjectNumber(){

        int index = RANDOM.nextInt(list.size());//
        list.remove(index);
        return index;

    }*/
}
