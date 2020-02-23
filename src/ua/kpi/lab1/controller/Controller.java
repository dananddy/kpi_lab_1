package ua.kpi.lab1.controller;

import javafx.util.Pair;
import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.model.ProcceesModel;
import ua.kpi.lab1.model.Zalikovka;
import ua.kpi.lab1.view.OutputData;
import ua.kpi.lab1.view.View;

import java.util.List;
import java.util.Scanner;


public class Controller {
    Model model;
    View view;
    ProcceesModel procceesModel = new ProcceesModel();

    List<Zalikovka> zalikovkas;
    List<Pair> studentGoodGradeList;
    List<String> isExamSubjectList;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void proccesUser(){
        OutputData outputData = new OutputData(view,model);



        model.createZalikovkas();

        zalikovkas = model.getZalikovkas();

        outputData.outZalikovka(zalikovkas);

        studentGoodGradeList = procceesModel.getAllStudentsAverGrade(zalikovkas);
        outputData.outStudentGoodGradeShow(studentGoodGradeList);

        isExamSubjectList = inputUserZalikovka();
        outputData.outSubjectsIsExamShow(isExamSubjectList);

    }

    private List<String> inputUserZalikovka() {
        Scanner scanner = new Scanner(System.in);

        List<String> isExamSubjectList;
        view.printMessage(View.INPUT_NUMBER_ZALIKOVKA);
        int numberOfZalikovka = scanner.nextInt();
        isExamSubjectList = procceesModel.getSubjectExamList(numberOfZalikovka,zalikovkas);
        return isExamSubjectList;
    }
}
