package ua.kpi.lab1.model.StudentNames;

import static ua.kpi.lab1.model.StudentNames.StudentFirstName.getRandomFirstNameStudentAsString;
import static ua.kpi.lab1.model.StudentNames.StudentLastName.getRandomLastNameStudentAsString;
import static ua.kpi.lab1.model.StudentNames.StudentMiddleName.getRandomMiddleNameStudentAsString;

public class StudentFullName {

    public String getNameStudentFull(){
        String nameStudentFull;

        nameStudentFull =getRandomLastNameStudentAsString()+' '+
                         getRandomFirstNameStudentAsString()+' '+
                         getRandomMiddleNameStudentAsString();
        return nameStudentFull;
    }
}
