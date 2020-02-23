package ua.kpi.lab1.model.StudentNames;

import static ua.kpi.lab1.model.StudentNames.StudentFirstName.getRandomFirstNameStudentAsString;
import static ua.kpi.lab1.model.StudentNames.StudentLastName.getRandomLastNameStudentAsString;
import static ua.kpi.lab1.model.StudentNames.StudentMiddleName.getRandomMiddleNameStudentAsString;

public class StudentFullName {
    private String nameStudentFull;


    public String getNameStudentFull(){
        nameStudentFull =getRandomLastNameStudentAsString()+' '+
                getRandomFirstNameStudentAsString()+' '+
                getRandomMiddleNameStudentAsString();
        return nameStudentFull;
    }
}
