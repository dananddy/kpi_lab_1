package ua.kpi.lab1;

import ua.kpi.lab1.controller.Controller;
import ua.kpi.lab1.controller.DataGen;
import ua.kpi.lab1.view.View;


public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new View(),new DataGen());

        controller.proccesUser();

    }
}
