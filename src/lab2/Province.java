package lab2;

import java.util.Arrays;

public class Province {

  private static final int MINIMUM_POPULATION_ACCEPTED = 30000;
  private static final int MAXIMUM_POPULATION_ACCEPTED = 15000000;

  private static final String DEFAULT_PROVINCE_NAME = "British Columbia";
  private static final String DEFAULT_PROVINCE_CAPITAL = "Victoria";
  private static final long DEFAULT_PROVINCE_POPULATION = 4648055L;

  private String name;
  private String capital;
  private long population;

  public Province() {
    this(DEFAULT_PROVINCE_NAME, DEFAULT_PROVINCE_CAPITAL, DEFAULT_PROVINCE_POPULATION);
  }

  public Province(String provinceName, String provinceCapital, long provincePopulation) {
    setName(provinceName);
    setCapital(provinceCapital);
    setPopulation(provincePopulation);
  }

  private static boolean isValidProvinceName(String provinceName) {
    String[] provinceNames = {"Alberta", "British Columbia", "Manitoba", "New Brunswick",
        "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec",
        "Saskatchewan"};

    return Arrays.asList(provinceNames).contains(provinceName);
  }

  private static boolean isValidCapitalCity(String capitalName) {
    String[] capitalNames = {"Edmonton", "Victoria", "Winnipeg", "Fredericton", "St. John's",
        "Halifax", "Toronto", "Charlottetown", "Quebec City", "Regina"};

    return Arrays.asList(capitalNames).contains(capitalName);
  }

  private static boolean isValidPopulation(long population) {
    return population >= MINIMUM_POPULATION_ACCEPTED && population <= MAXIMUM_POPULATION_ACCEPTED;
  }

  public String getDetails() {
    return String.format("The capital of %s (population. %o) is %s",
        getName(), getPopulation(), getCapital());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(isValidProvinceName(name)) {
      this.name = name;
    } else {
      System.out.println("The entered province name is not valid. "
          + "Setting default province name instead...");
      this.name = DEFAULT_PROVINCE_NAME;
    }
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    if(isValidCapitalCity(capital)) {
      this.capital = capital;
    } else {
      System.out.println("The entered capital name is not valid. "
          + "Setting default capital name instead...");
      this.capital = DEFAULT_PROVINCE_CAPITAL;
    }
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    if(isValidPopulation(population)) {
      this.population = population;
    } else {
      System.out.println("The entered province population is not valid. "
          + "Setting default province population instead...");
      this.population = DEFAULT_PROVINCE_POPULATION;
    }
  }
}
