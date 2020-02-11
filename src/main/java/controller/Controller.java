package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller implements GlobalConstants {

    private Model model;
    private View view;
    private String input;

    public Controller(View view, Model model) {

        this.view = view;
        this.model = model;

    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);


        view.printMessage(View.INPUT_SURNMANE);
        checkForValue(scanner,surname);

        view.printMessage(View.INPUT_LOGIN);
        checkForValue(scanner,nickname);

    }

    private void checkForValue(Scanner scanner,String form){
        this.input = scanner.nextLine();

        while (!(input.matches(form))){
            view.printMessage(View.WRONG_INPUT_SURNAME);
            this.input = scanner.nextLine();
        }


    }


}
