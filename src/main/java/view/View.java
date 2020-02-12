package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View implements TextConstants {

    public static ResourceBundle bundle;





   public void printMessage(String message){
       System.out.println(message);
   }

   public void printBundleMessage(String message){

       System.out.println(bundle.getString(message));
   }


   public void languageChoice(int checkIntValueForLanguage) {
        if (checkIntValueForLanguage == 1){
            bundle = ResourceBundle.getBundle(BUNDLE_NAME,new Locale("ua","UA"));
        }else {
            bundle = ResourceBundle.getBundle(BUNDLE_NAME,Locale.ENGLISH);
        }
   }
}
