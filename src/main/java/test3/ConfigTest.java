package test3;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ConfigTest {
    public static void main (String[] args) {

        String file = "sample";
        try {
        	ResourceBundle bundle = ResourceBundle.getBundle(file);

            // ’l‚ÌŽæ“¾
            System.out.println(bundle.getString("id"));
            System.out.println(bundle.getString("password"));
            

        } catch (MissingResourceException ex) {
            System.out.println(ex.getMessage());

        }

    }
}