package ua.kpi.lab1.controller;

import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.view.View;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    private int averageGradeStudent;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void proccesUser(){
        Scanner scanner = new Scanner(System.in);


    }
}
