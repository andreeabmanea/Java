package com.company;
import java.time.LocalTime;
public class Main {

    public static void main(String[] args) {

    	City myCity = new City("Paris");

		Hotel v1 = new Hotel();
		v1.setName("Best Western Hotel");
		v1.setAddress("3 Rue De Montenotte");
		v1.setOpeningTime(LocalTime.of(6,00));
		v1.setClosingTime(LocalTime.of(23,30));
		v1.setRanking(9.2);
		v1.displayInfo();

    	Museum v2 = new Museum();
    	v2.setName("Louvre Museum");
    	v2.setAddress("Rue de Rivoli, 75001");
		v2.setOpeningTime(LocalTime.of(9,00));
		v2.setClosingTime(LocalTime.of(18,00));
		v2.setTicketPrice(4.50);
		v2.displayInfo();

		Museum v3 = new Museum();
		v3.setName("Musee de Orsay");
		v3.setAddress("1 Rue de la Légion d'Honneur");
		v3.setOpeningTime(LocalTime.of(11,30));
		v3.setClosingTime(LocalTime.of(19,00));
		v3.setTicketPrice(8.50);
		v3.displayInfo();

		Church v4 = new Church();
		v4.setName("Notre Dame de Paris");
		v4.setAddress("6 Parvis Notre-Dame");
		v4.setOpeningTime(LocalTime.of(12, 00));
		v4.setClosingTime(LocalTime.of(16, 00));
		v4.displayInfo();

		Church v5 = new Church();
		v5.setName("Saint Eustache");
		v5.setAddress("2 Impasse Saint-Eustache, 75001");
		v5.setOpeningTime(LocalTime.of(10, 30));
		v5.setClosingTime(LocalTime.of(14, 30));
		v5.displayInfo();

		Restaurant v6 = new Restaurant();
		v6.setName("La Demesure Sur Seine Restaurant");
		v6.setAddress("69 Port de la Rapée");
		v6.setOpeningTime(LocalTime.of(16,00));
		v6.setClosingTime(LocalTime.of(23,00));
		v6.addToMenu("pizza");
		v6.addToMenu("lasagna");
		v6.displayInfo();

		// We add the locations name to our List
		myCity.addLocation(v1);
		myCity.addLocation(v2);
		myCity.addLocation(v3);
		myCity.addLocation(v4);
		myCity.addLocation(v5);
		myCity.addLocation(v6);
		myCity.setNodes(myCity.getNodes());

		// We set the cost between locations
		v1.setCost(v2, 10);
		v1.setCost(v3, 50);
		v2.setCost(v3, 20);
		v3.setCost(v2, 20);
		v2.setCost(v4, 20);
		v2.setCost(v5, 10);
		v3.setCost(v4, 20);
		v4.setCost(v5, 30);
		v5.setCost(v4, 30);
		v4.setCost(v6, 10);
		v5.setCost(v6, 20);

		//We sort Visitable, but not Payable Locations by opening time
		myCity.sortByOpeningHours(myCity.visitableNotPayable);
		myCity.printFreeLocations(myCity.visitableNotPayable);

		//We create a museum which will use the default methods for setting opening and closing time
		Museum regularMuseum = new Museum();
		regularMuseum.setName("Rodin Museum");
		System.out.println();
		System.out.println(" - This museum has the default schedule:");
		System.out.print(regularMuseum.getOpeningTime() + " - " + regularMuseum.getClosingTime());
		System.out.println();

		//We compute how long the museum is open daily
		System.out.println();
		System.out.println(" - " + regularMuseum.getName() + " is opened for " + Visitable.getVisitingDuration(regularMuseum));

		TravelPlan myPlan = new TravelPlan("Paris");
		System.out.println();
		//We set our preferences
		myPlan.setPreferences(v5);
		myPlan.setPreferences(v1);
		myPlan.setPreferences(v2);
		myPlan.setPreferences(v3);
		myPlan.setPreferences(v4);
		myPlan.setPreferences(v6);
		System.out.println(" - The top locations in the city " + myPlan.cityName + " are as following:");
		myPlan.printPreferences();



    }


}
