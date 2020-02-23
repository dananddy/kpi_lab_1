package ua.kpi.lab1.model.StudentNames;

import java.util.Random;

public enum StudentLastName {
    OPANASENKO,
    IVANOV,
    SMITH,
    JOHNSONS,
    VENSOM,
    WAYNE,
    MUSK,
    RABINOVICH,
    ZELENSKIY,
    POROSHENKO;
    private static final StudentLastName[] STUDEN_NAME = values();
    private static final int SIZE = STUDEN_NAME.length;
    private static final Random RANDOM = new Random();

    public static StudentLastName getRandomStudentName()  {
        return STUDEN_NAME[RANDOM.nextInt(SIZE)];
    }
    public static String getRandomLastNameStudentAsString(){
        return String.valueOf(StudentLastName.getRandomStudentName());
    }
}
