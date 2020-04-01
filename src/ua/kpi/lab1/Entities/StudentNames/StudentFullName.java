package ua.kpi.lab1.Entities.StudentNames;

import static ua.kpi.lab1.Entities.StudentNames.StudentFirstName.getRandomFirstNameStudentAsString;
import static ua.kpi.lab1.Entities.StudentNames.StudentLastName.getRandomLastNameStudentAsString;
import static ua.kpi.lab1.Entities.StudentNames.StudentMiddleName.getRandomMiddleNameStudentAsString;

public class StudentFullName {

    public String getNameStudentFull(){
        String nameStudentFull;

        nameStudentFull =getRandomLastNameStudentAsString()+' '+
                         getRandomFirstNameStudentAsString()+' '+
                         getRandomMiddleNameStudentAsString();
        return nameStudentFull;
    }
}
