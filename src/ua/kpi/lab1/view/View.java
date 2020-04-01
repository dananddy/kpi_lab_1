package ua.kpi.lab1.view;

import ua.kpi.lab1.Entities.Zalikovka;

import java.util.List;

import static ua.kpi.lab1.view.DataConst.*;

public class View {




    public void printTableOfZalikovka(){System.out.format("%-2s|%-8s|%-24s%5s|%3s  %3s\n","№","ID","STUDENT NAME","COURSE","SUBJECT","","GRADE");}

    public void printMessageInputNumberZalikovka(List<Zalikovka> zalikovkas){System.out.println(INPUT_NUMBER_ZALIKOVKA+"(1 - "+zalikovkas.size()+"):");}
    public void printMessageInputNumberZalikovkaIfAgain(List<Zalikovka> zalikovkas){System.out.println(INPUT_NUMBER_ZALIKOVKA_AGAIN+"(1 - "+zalikovkas.size()+"):");}

    public void printMessage(String message){System.out.println(message);}

    public void printAllZalikovkas()  {printTableOfZalikovka();}



}
