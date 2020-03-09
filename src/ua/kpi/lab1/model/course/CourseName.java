package ua.kpi.lab1.model.course;

import java.util.ArrayList;
import java.util.List;
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
    private static final Random RANDOM = new Random();
    private static final int SIZE = COURSE_NAMES.length;

    public static ArrayList<String> getRandomNameCourseAsString(int numberOfSubjects){

        ArrayList<String> subjectList = new ArrayList<>();
        ArrayList<Integer> listOfValuesOfSubjectRandom = getRandomSubject();

        for (int count=0; count<numberOfSubjects; count++)subjectList.add(
                String.valueOf(COURSE_NAMES[listOfValuesOfSubjectRandom.get(count)]));
        return subjectList;
    }

    private static ArrayList<Integer> getRandomSubject(){

        ArrayList<Integer> listOfValuesOfSubjectInOrder = new ArrayList<>();
        ArrayList<Integer> listOfValuesOfSubjectRandom = new ArrayList<>();

        for(int i = 0; i < SIZE; i++) {
            listOfValuesOfSubjectInOrder.add(i);
        }
        while (!listOfValuesOfSubjectInOrder.isEmpty()){
            int index =listOfValuesOfSubjectInOrder.get(RANDOM.nextInt(listOfValuesOfSubjectInOrder.size()));
            listOfValuesOfSubjectRandom.add(index);
            listOfValuesOfSubjectInOrder.remove(new Integer(index));
        }
        return listOfValuesOfSubjectRandom;
    }

}
