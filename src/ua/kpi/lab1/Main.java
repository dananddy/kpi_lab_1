package ua.kpi.lab1;

import ua.kpi.lab1.controller.Controller;
import ua.kpi.lab1.model.Model;
import ua.kpi.lab1.view.View;

import javax.naming.ldap.Control;

public class Main {

    public static void main(String[] args) {

        Controller controller =
                new Controller(new View(),new Model());
        // Run
        controller.proccesUser();

    }
}
