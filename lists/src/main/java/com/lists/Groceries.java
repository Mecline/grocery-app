package com.lists;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
//commiting to Git maybe
public class Groceries {

	public static void mealPlanner(String... args) {

		ArrayList<String> combined = new ArrayList<String>();
		ArrayList<String> cleaned = new ArrayList<String>();

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("C://Users//Maggie//Projects//Grocery//grocerytest.txt"), "utf-8"))) {
			
			for (String meal : args) {
				String[] ingrediants = Customer.chooseMeal(meal);

				if (ingrediants != null) {

					for (int i = 0; i < ingrediants.length; i++) {
						combined.add(ingrediants[i]);
					}
					
				} else {
					System.out.println("Ingrediant skipped.");
				}
				
				for (String item : combined){
					
					if(!cleaned.contains(item)){
						cleaned.add(item);
						writer.write(item + "\n");
					}
					
				}
				
			}

		} catch (UnsupportedEncodingException e) {
			System.out.println("File NOT written.");
		} catch (FileNotFoundException e) {
			System.out.println("File NOT written.");
		} catch (IOException e) {
			System.out.println("File NOT written.");
		}
		System.out.println("File written.");
	}

}
