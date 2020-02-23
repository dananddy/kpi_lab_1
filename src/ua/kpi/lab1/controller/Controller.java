package ua.kpi.lab1.controller;

import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.view.View;



public class Controller {
    Model model;
    View view;

    private int averageGradeStudent;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void proccesUser(){
        OutputData outputData = new OutputData(view);

        outputData.outData();

    }
}
