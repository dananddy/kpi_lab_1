package ua.kpi.lab1.controller;

import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.model.ProcceesModel;
import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.view.OutputData;
import ua.kpi.lab1.view.View;

import java.util.List;


public class Controller {
    Model model;
    View view;
    ProcceesModel procceesModel;

    List<Zalikovka> zalikovkas;
    List<String> studentGoodGradeList;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void proccesUser(){
        OutputData outputData = new OutputData(view,model);



        model.createZalikovkas();

        zalikovkas = model.getZalikovkas();

        outputData.outZalikovka(zalikovkas);

//        studentGoodGradeList = procceesModel.getAllStudentsAverGrade(zalikovkas);
        procceesModel.getAllStudentsAverGrade(zalikovkas);
        outputData.outStudentGoodGradeShow(studentGoodGradeList);

    }
}
