package controller;

public interface GlobalConstantsRegex {
    String NAME_ENG = "[A-Z][a-z]{2,20}";
    String NAME_UKR = "[А-ЯІЩЄҐЇ][а-ящєґ'ії]+";
    String NICKNAME = "[A-Za-z_0-9.]{8,20}";
    String PHONE_NUMBER = "(\\+380)[0-9]{9}";
    String HOME_PHONE_NUMBER = "(4)[0-9]{4}";
    String EMAIL = "[A-Za-z0-9._]{6,20}@[a-z]{2,10}\\.[a-z]{2,6}";
    String INDEX = "[0-9]{5}";
    /*String CITY_ENG = "[A-Z][a-z]{2,20}";
    String CITY_UKR = "[А-ЯІЩЄҐЇ][а-ящєґ'ії]+";*/
    String CITY_STREET_HOUSE_FLAT_ENG = "[A-Z][a-z]{2,20}\\s[A-Z][a-z]+\\s[0-9]{2,4}\\s[0-9]{1,3}";
    String CITY_STREET_HIUSE_FLAT_UKR = "[А-ЯІЩЄҐЇ][а-ящєґ'ії]{2,20}\\s[А-ЯІЩЄҐЇ][а-ящєґ'ії]+\\s[0-9]{2,4}\\s[0-9]{1,3}";

    //String EMAIL = "[A-Za-z0-9._]{6,20}@(gmail\\.|mail\\.)[a-z]{2,3}";






}
