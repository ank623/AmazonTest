package json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJson {

	public static void main(String args[]) throws IOException, ParseException
	{
		JSONParser jsonparser = new JSONParser();
		
		FileReader fis = new FileReader(".\\jsonfiles\\employee.json");
	
		Object obj =jsonparser.parse(fis);
		
		JSONObject empJson = (JSONObject)obj;
		
		String fname =(String) empJson.get("FirstName");
		
		System.out.println("First Name is :"+fname);
		
		JSONArray jsonArray= (JSONArray) empJson.get("phoneNumber");
		
		for(int i=0;i<jsonArray.size();i++)
		{
			JSONObject phoneNumber = (JSONObject) jsonArray.get(i);
		String number=	(String) phoneNumber.get("number");
		String type = (String) phoneNumber.get("type");
		
		System.out.println("phone number of " +i+ " is");
		System.out.println(number+ " "+type);
		}
	}
}
