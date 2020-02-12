package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller implements GlobalConstantsRegex {

    private Model model;
    private View view;
    private String input;


    public Controller(View view, Model model) {

        this.view = view;
        this.model = model;

    }

    public void processUser(){

        Scanner scanner = new Scanner(System.in);
        view.printMessage(View.urkEngInput);

        view.languageChoice(checkIntValueForLanguage(scanner));

        UserInfo userInfo = new UserInfo(view,scanner);
        userInfo.inputInformation();







        /*view.printMessage(View.INPUT_SURNMANE);
        checkForValue(scanner,surname);

        view.printMessage(View.INPUT_LOGIN);
        checkForValue(scanner,nickname);*/

    }

    private int checkIntValueForLanguage(Scanner scanner) {
        this.input = scanner.nextLine();

        while (!(input.equals("1") || input.equals("0"))){
            view.printMessage(View.wrongEngUkrInput);
            this.input = scanner.nextLine();
        }

        return Integer.parseInt(input);

    }



    private void checkForValue(Scanner scanner,String form){
        this.input = scanner.nextLine();

        while (!(input.matches(form))){
            //view.printMessage(View.WRONG_INPUT_SURNAME);
            this.input = scanner.nextLine();
        }

    }


}
