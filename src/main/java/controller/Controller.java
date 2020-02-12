package controller;

import model.entity.NoteBook;
import view.View;

import java.util.Scanner;

public class Controller implements GlobalConstantsRegex {

    private NoteBook noteBook;
    private View view;
    private String input;


    public Controller(View view, NoteBook noteBook) {

        this.view = view;
        this.noteBook = noteBook;

    }

    public void processUser(){

        Scanner scanner = new Scanner(System.in);
        view.printMessage(View.urkEngInput);

        view.languageChoice(checkIntValueForLanguage(scanner));

        UserInfo userInfo = new UserInfo(view,scanner);
        userInfo.inputInformation();

    }

    private int checkIntValueForLanguage(Scanner scanner) {
        this.input = scanner.nextLine();

        while (!(input.equals("1") || input.equals("0"))){
            view.printMessage(View.wrongEngUkrInput);
            this.input = scanner.nextLine();
        }

        return Integer.parseInt(input);

    }



   /* private void checkForValue(Scanner scanner,String form){
        this.input = scanner.nextLine();

        while (!(input.matches(form))){
            //view.printMessage(View.WRONG_INPUT_SURNAME);
            this.input = scanner.nextLine();
        }

    }*/


}
