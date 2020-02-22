package ua.kpi.lab1.controller;


import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.model.course.Course;
import ua.kpi.lab1.view.View;

import java.util.List;

public class UtilityController {

    List<Zalikovka> zalikovkas;

    private List<Zalikovka> createZalikovkaBase(){
        for(int count = 0; count< View.NUMBER_OF_ZALIKOVKA; count++){
            Zalikovka zalikovka = new Zalikovka(creatorIid(),
                                                creatorListOfCourses(numberOfCourses()),
                                                creatorNameStudent());
        }
        return zalikovkas;
    }

    private int numberOfCourses() {

    }


    private List<Course> creatorListOfCourses(int numberOfCourses) {
    }

    private String creatorNameStudent() {
        return null;
    }

    private int creatorIid() {
        return 0;
    }


}
