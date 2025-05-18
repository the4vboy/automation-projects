package DataValues;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Signupcrm {
	public static String First_Name;
	public static String Last_Name;
	public static String Email;
	public static String Confirm_Email;
	public static String Username;
	public static String Password;
	public static String confirm_password;
	public static String company_name;
	public static String phone_number;
	public static String company_email;
	public static String Address;
	public static String city;
	public static String state;
	public static String postcode;
	public static String value;
	
	
public static String readJSONFile(String keyword) {

   JSONParser parser = new JSONParser();
   FileReader reader;

try {
       reader = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\signup.json");
       JSONArray jsonArr = (JSONArray) parser.parse(reader);
       for(Object obj : jsonArr) {
          JSONObject jo = (JSONObject)obj;
          value = (String) jo.get(keyword);
       }
    } catch(FileNotFoundException e) {
         e.printStackTrace();
    } catch(ParseException e) {
         e.printStackTrace();
    } catch(IOException e){
         e.printStackTrace();
    }
    return value;
   }
}


