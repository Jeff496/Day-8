public class Country {
  //we want the name, capital, and population of the Country

  private String name;
  private String capital;
  private double population; // in terms of millions

  public Country(){
    this.name = "United States";
    this.capital = "Washington  D.C.";
    this.population = 328.2;
  }

  public Country(String name, String capital, double population){
    this.name = name;
    this.capital = capital;
    this.population = population;
  }

  public String getName(){
    return this.name;
  }
  public String getCapital(){
    return this.capital;
  }
  public double getPopulation(){
    return this.population;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setCapital(String capital){
    this.capital = capital;
  }
  public void setPopulation(double population){
    this.population = population;
  }
}