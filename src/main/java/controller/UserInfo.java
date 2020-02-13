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


        noteBook.setName(checkForCorrectInfo(scanner,lang,View.INPUT_NAME));
        noteBook.setSurname(checkForCorrectInfo(scanner,lang,View.INPUT_SURNAME));
        noteBook.setNickname(checkForCorrectInfo(scanner,NICKNAME,View.INPUT_NICKNAME));
        noteBook.setPhoneNumber(checkForCorrectInfo(scanner,PHONE_NUMBER,View.INPUT_PHONE_NUMBER));
        noteBook.setHomePhoneNumber(checkForCorrectInfo(scanner,HOME_PHONE_NUMBER,View.INPUT_HOME_PHONE_NUMBER));
        noteBook.setEmail(checkForCorrectInfo(scanner,EMAIL,View.INPUT_EMAIL));
        noteBook.setIndex(checkForCorrectInfo(scanner,INDEX,View.INPUT_INDEX));
        noteBook.setCshf(checkForCorrectInfo(scanner,lang1,View.INPUT_CSHF));


    }

    private String checkForCorrectInfo(Scanner scanner,String languageRegex,String bundleMessage) {
        view.printBundleMessage(bundleMessage);
        while (!(scanner.hasNext() && ( (text = scanner.nextLine()).matches(languageRegex))) ){
            view.printBundleMessage(View.INPUT_WRONG);
            view.printBundleMessage(bundleMessage);
        }
        return text;
    }
}
