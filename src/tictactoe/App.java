package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {
		Matchfield m1 = new Matchfield();
		while(m1.turns!= 0){
			m1.printMatchfield();
			BufferedReader reader = new BufferedReader(
		            new InputStreamReader(System.in));
		 
		        // Reading data using readLine
		        String field = reader.readLine();
		        int f = Integer.parseInt(field);
		        if(field.equals("")) {   	System.out.println("please type in a value between 0-8");}		        
		        else if(field.equals("quit")) {System.exit(0);}
		        else{m1.setVal(f);}
		    }
	}
}
