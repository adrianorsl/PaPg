import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class Program {

	public static void main(String[] args) throws IOException {
		
		
       
		PaPg papg = new PaPg();
		papg.setTipo(Menu.Pg);
		papg.setA1(1);
		papg.setRazao(3);
		papg.setQuantidade(10);

	    System.out.print(papg);
	    
	    
		
	    
	    Gson builder = new Gson();
	    Gson gson = builder;
		FileWriter writer = new FileWriter("lib/PaPg.json");
		writer.write(gson.toJson(papg.getX()));
		writer.close();
		
		System.out.println(gson.toJson(papg.getX()));
		


		
	}

}
