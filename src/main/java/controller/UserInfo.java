package controller;

import model.entity.NoteBook;
import view.View;

import java.util.Scanner;

public class UserInfo implements GlobalConstantsRegex{

    private View view;
    private Scanner scanner;
    private NoteBook noteBook;

    private String text;
    private String lang;
    private String lang1;


    public UserInfo(View view, Scanner scanner, NoteBook noteBook) {
        this.view = view;
        this.scanner = scanner;
        this.noteBook = noteBook;
    }


    public void inputInformation() {
        lang = (View.bundle.getLocale().toString()).equals("ua_UA") ? NAME_UKR : NAME_ENG;
        lang1 = (View.bundle.getLocale().toString()).equals("ua_UA")
                ? CITY_STREET_HIUSE_FLAT_UKR : CITY_STREET_HOUSE_FLAT_ENG;

        view.printBundleMessage(View.INPUT_NAME);
        noteBook.setName(checkForCorrectInfo(scanner,lang));

        view.printBundleMessage(View.INPUT_SURNAME);
        noteBook.setSurname(checkForCorrectInfo(scanner,lang));

        view.printBundleMessage(View.INPUT_NICKNAME);
        noteBook.setNickname(checkForCorrectInfo(scanner,NICKNAME));

        view.printBundleMessage(View.INPUT_PHONE_NUMBER);
        noteBook.setPhoneNumber(checkForCorrectInfo(scanner,PHONE_NUMBER));


        view.printBundleMessage(View.INPUT_HOME_PHONE_NUMBER);
        noteBook.setHomePhoneNumber(checkForCorrectInfo(scanner,HOME_PHONE_NUMBER));

        view.printBundleMessage(View.INPUT_EMAIL);
        noteBook.setEmail(checkForCorrectInfo(scanner,EMAIL));


        view.printBundleMessage(View.INPUT_INDEX);
        noteBook.setIndex(checkForCorrectInfo(scanner,INDEX));

        view.printBundleMessage(View.INPUT_CSHF);
        noteBook.setCshf(checkForCorrectInfo(scanner,lang1));


    }

    private String checkForCorrectInfo(Scanner scanner,String languageRegex) {
        while (!(scanner.hasNext() && ( (text = scanner.nextLine()).matches(languageRegex))) ){
            view.printBundleMessage(View.INPUT_WRONG);
        }
        return text;
    }
}
