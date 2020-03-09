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
    private Model model;
    private View view;


    private List<Zalikovka> zalikovkas;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void proccesUser(){

        Scanner scanner = new Scanner(System.in);
        OutputData outputData = new OutputData(view);
        ProcceesModel procceesModel = new ProcceesModel(view);

        List<Pair> studentGoodGradeList;
        List<String> isExamSubjectList;


        model.createZalikovkas();

        zalikovkas = model.getZalikovkas();

        outputData.outZalikovka(zalikovkas);

        studentGoodGradeList = procceesModel.getAllStudentsAverGrade(zalikovkas);
        outputData.outStudentGoodGradeShow(studentGoodGradeList);

        view.printMessageInputNumberZalikovka(zalikovkas);

        while (scanner.hasNextInt()){
            int numberZalikovka = scanner.nextInt();
            isExamSubjectList = inputUserZalikovka(procceesModel, numberZalikovka);
            outputData.outSubjectsIsExamShow(isExamSubjectList);
            view.printMessageInputNumberZalikovkaIfAgain(zalikovkas);
        }


    }

    private List<String> inputUserZalikovka(ProcceesModel procceesModel, int numberZalikovka) {
        List<String> isExamSubjectList;

        isExamSubjectList = procceesModel.getSubjectExamList(numberZalikovka,zalikovkas);
        return isExamSubjectList;
    }
}
