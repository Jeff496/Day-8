import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // The other data structure 
    // ArrayList
    // Need an import statement
    // Some differences from arrays:
    // ArrayLists are dynamic in size 
    // Meaning you can keep adding elements inside
    // - arrays have length; ArrayLists have size()
    // - ArrayLists cannot be accessed by []
    // - ArrayLists can only hold objects 
    //    No primitive (no int, double, or boolean)
    

    //{"Hello", "Good bye, "See"}
    ArrayList<String> words = new ArrayList<String>(); // Makes and empty ArrayList
    words.add("Good bye");
    words.add("See");
    words.add(0, "Hello");
    System.out.println(words); // Prints the entire Array
    System.out.println(words.get(2));
    words.remove(1);//removes the word at index 1
    words.set(0, "New word"); // replaces 0th index with the following
    words.size(); // reutrns the size of the ArrayList (length for the array)

    //Java has classes for int and double, respectively
    // This wway we can put primitives int the list
    ArrayList<Integer> num = new ArrayList<Integer>();
    num.add(7);
    num.add(10);
    num.add(4);
    // return the sum  of the ArrayList
    int sum = 0;
    for (int i = 0; i < num.size(); i++){
      sum = num.get(i) + sum; 
    }
    System.out.println(sum);
    
    //using the words ArrayList, print only the fist letter of each word

    System.out.println(words);
    for (int i = 0; i < words.size(); i++){
      String firstLetter = words.get(i);
      System.out.println(firstLetter.substring(0,1));
    }

    Country usa = new Country("USA", "Washington DC", 329.9);
    Country canada = new Country("Canada", "Ottawa", 37.5);
    Country france = new Country("France", "Paris", 66.99);
    Country australia = new Country("Australia", "Canberra", 24.9);

    //put countries into ArrayList
    ArrayList<Country> list = new ArrayList<Country>();
    list.add(usa);
    list.add(canada);
    list.add(france);
    list.add(australia);

    //print the name of the country with the lowest population
    double lowPop = Double.MAX_VALUE;
    String countName = "default";
    for (int i = 0; i < list.size(); i++){
      if (list.get(i).getPopulation() < lowPop){
        countName = list.get(i).getName();
      }
    }
    System.out.println(countName);

    //reorganize the list into alphabetical order of their capital to a new list
    ArrayList<Country> ordered = new ArrayList<Country>();
    String placeHold;
    String hold;
    for (int i = 0;  i < list.size(); i++){
      placeHold = list.get(i).getCapital();
      ordered.add(0, placeHold);
      if (placeHold.compareTo(list(i + 1) < 0)){
        ordered.add(list(i).getCapital());
      }else{
        for (int j = 0; j < ordered.size(); j++){
          hold = ordered.get(i);
        }
        ordered.add(0, list(i).getCapital());
        ordered.add(hold);
      }
    }
  }
}