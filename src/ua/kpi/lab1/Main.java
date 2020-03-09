package ua.kpi.lab1;

import ua.kpi.lab1.controller.Controller;
import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.view.View;


public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new View(),new Model());

        controller.proccesUser();

    }
}
