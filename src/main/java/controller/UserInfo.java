package controller;

import view.View;

import java.util.Scanner;

public class UserInfo implements GlobalConstantsRegex{

    private View view;
    private Scanner scanner;
    private String text;
    private String lang;
    private String lang1;

    private String name;
    private String surname;
    private String nickname;
    private String phoneNumber;
    private String homePhoneNumber;
    private String email;
    private String index;
    private String cshf;


    public UserInfo(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;


    }


    public void inputInformation() {
        lang = (View.bundle.getLocale().toString()).equals("ua_UA") ? NAME_UKR : NAME_ENG;
        lang1 = (View.bundle.getLocale().toString()).equals("ua_UA")
                ? CITY_STREET_HIUSE_FLAT_UKR : CITY_STREET_HOUSE_FLAT_ENG;

        view.printBundleMessage(View.INPUT_NAME);
        this.name = checkForCorrectInfo(scanner,lang);

        view.printBundleMessage(View.INPUT_SURNAME);
        this.surname = checkForCorrectInfo(scanner,lang);

        view.printBundleMessage(View.INPUT_NICKNAME);
        this.nickname = checkForCorrectInfo(scanner,NICKNAME);

        view.printBundleMessage(View.INPUT_PHONE_NUMBER);
        this.phoneNumber = checkForCorrectInfo(scanner,PHONE_NUMBER);

        view.printBundleMessage(View.INPUT_HOME_PHONE_NUMBER);
        this.homePhoneNumber = checkForCorrectInfo(scanner,HOME_PHONE_NUMBER);

        view.printBundleMessage(View.INPUT_EMAIL);
        this.email = checkForCorrectInfo(scanner,EMAIL);

        view.printBundleMessage(View.INPUT_INDEX);
        this.index = checkForCorrectInfo(scanner,INDEX);

        view.printBundleMessage(View.INPUT_CSHF);
        this.cshf = checkForCorrectInfo(scanner,lang1);


    }

    private String checkForCorrectInfo(Scanner scanner,String languageRegex) {
        while (!(scanner.hasNext() && ( (text = scanner.nextLine()).matches(languageRegex))) ){
            view.printBundleMessage(View.INPUT_WRONG);
        }
        return text;
    }
}
