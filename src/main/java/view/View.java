package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {





        //ResourceBundle bundleEN = ResourceBundle.getBundle("messageEN", Locale.ENGLISH);
        //ResourceBundle bundleUA = ResourceBundle.getBundle("messageUA",new Locale("uk","UA"));

        //System.out.println(bundleUA.getString("input"));



   public static final String INPUT_SURNMANE = "Input your SurName: ";
   public static final String INPUT_LOGIN = "Input your LOGIN: ";
   public static final String WRONG_INPUT_SURNAME = "Wrong Input! (Input only english letters)! Try again: ";
   public static final String WRONG_INPUT_NICKNAME = "Wrong Input! Try again: ";

   public void printMessage(String message){
       System.out.println(message);
   }


}
