package ajbc.exam5.runner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import ajbc.exam5.q1.classes.BadEnemyToEnemyAdapter;
import ajbc.exam5.q1.classes.BadHelicopter;
import ajbc.exam5.q1.classes.EnemyTank;
import ajbc.exam5.q2.Apartment;

public class Runner {
	
	// Design pattern: Adapter
	public static void main(String[] args) {
		System.out.println("---------Q1---------");
		EnemyTank enemyTank = new EnemyTank();
		BadHelicopter badHelicopter = new BadHelicopter();
		BadEnemyToEnemyAdapter toEnemyAdapter = new BadEnemyToEnemyAdapter(badHelicopter);

		enemyTank.turnRight();
		enemyTank.turnLeft();
		enemyTank.driveForward();
		enemyTank.driveBackward();
		enemyTank.fireWeapon();

		badHelicopter.yawsRight();
		toEnemyAdapter.turnRight();
		toEnemyAdapter.driveBackward();
		toEnemyAdapter.fireWeapon();
		
		System.out.println("---------Q2---------");

		System.out.println("Read apartments list from file: ");
		List<Apartment> apartments = readApartmentListFromJSONFile("jsonFiles//JSONfile.json");
		System.out.println("Apartment list: ");
		apartments.forEach(System.out::println);
	}
	
	private static List<Apartment> readApartmentListFromJSONFile(String fileStr) {
		List<Apartment> apartments = new ArrayList<Apartment>();

		try (FileReader fileReader = new FileReader(fileStr)) {
			
			JsonReader jsonReader = new JsonReader(fileReader);
			Gson gson = new Gson();
			
			Type apartmentListType = new TypeToken<ArrayList<Apartment>>() {
			}.getType();
			apartments = gson.fromJson(jsonReader, apartmentListType);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return apartments;
	}
}
