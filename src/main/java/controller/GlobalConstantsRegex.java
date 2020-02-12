package controller;

public interface GlobalConstantsRegex {
    String nameEng = "[A-Z][a-z]{2,20}";
    String nameUkr = "^[А-ЯІЩЄҐЇ][а-ящєґ'ії]+$";
    String nickname = "[A-Za-z_0-9.]{8,20}";

}
