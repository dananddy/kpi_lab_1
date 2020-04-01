package ua.kpi.lab1.controller;

import javafx.util.Pair;
import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.Entities.Zalikovka;
import ua.kpi.lab1.view.OutputData;
import ua.kpi.lab1.view.View;

import java.util.List;
import java.util.Scanner;


public class Controller {
    private DataGen dataGen;
    private View view;


    private List<Zalikovka> zalikovkas;

    public Controller(View view, DataGen dataGen){
        this.view = view;
        this.dataGen = dataGen;
    }

    public void proccesUser(){

        Scanner scanner = new Scanner(System.in);
        OutputData outputData = new OutputData(view);
        Model model = new Model(view);

        List<Pair> studentGoodGradeList;
        List<String> isExamSubjectList;


        dataGen.createZalikovkas();

        zalikovkas = dataGen.getZalikovkas();

        outputData.outZalikovka(zalikovkas);

        studentGoodGradeList = model.getAllStudentsAverGrade(zalikovkas);
        outputData.outStudentGoodGradeShow(studentGoodGradeList);

        view.printMessageInputNumberZalikovka(zalikovkas);

        while (scanner.hasNextInt()){
            int numberZalikovka = scanner.nextInt();
            isExamSubjectList = inputUserZalikovka(model, numberZalikovka);
            outputData.outSubjectsIsExamShow(isExamSubjectList);
            view.printMessageInputNumberZalikovkaIfAgain(zalikovkas);
        }


    }

    private List<String> inputUserZalikovka(Model model, int numberZalikovka) {
        List<String> isExamSubjectList;

        isExamSubjectList = model.getSubjectExamList(numberZalikovka,zalikovkas);
        return isExamSubjectList;
    }
}
