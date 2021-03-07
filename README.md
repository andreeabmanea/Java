# Optional - Lab 3
- In order to filter the Visitable, but not Payable locations, we use the instanceof operator to check if a Location object respects the conditions. We override (in Location class) compareTo such that it compares two Location objects by their opening hours. In City class, we have a method sortByOpeningHours that makes use of Collections.sort which we "tell" to sort our Locations using our overriden compareTo.
- In interface Visitable, we add two default methods which set opening and closing time as 9:30 and 20:00, if we do not set them ourselves.
- The static method getVisitingDuration from Visitable interface returns how long is a location open daily. 
- TravelPlan class is used for storing an array of locations' name from a given city, where index 0 represents the most preffered location, index 1 the following and so on. 
