package controller;

import view.View;

import java.util.Scanner;

public class UserInfo implements GlobalConstantsRegex{

    private View view;
    private Scanner scanner;
    private String text;
    private String lang;

    private String name;
    private String surname;
    private String nickname;

    public UserInfo(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;

    }


    public void inputInformation() {
        lang = (View.bundle.getLocale().toString()).equals("ua_UA") ? NAME_UKR : NAME_ENG;

        view.printBundleMessage(View.INPUT_NAME);
        this.name = checkForCorrectInfo(scanner,lang);

        view.printBundleMessage(View.INPUT_SURNAME);
        this.surname = checkForCorrectInfo(scanner,lang);

        view.printBundleMessage(View.INPUT_NICKNAME);
        this.nickname = checkForCorrectInfo(scanner,NICKNAME);
    }

    private String checkForCorrectInfo(Scanner scanner,String languageRegex) {
        while (!(scanner.hasNext() && ( (text = scanner.nextLine()).matches(languageRegex))) ){
            view.printBundleMessage(View.INPUT_WRONG);
        }
        return text;
    }
}
