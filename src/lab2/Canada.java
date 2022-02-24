package lab2;

public class Canada {

  private Province[] provinces;

  public Canada() {
    this.provinces = generateProvinces();
  }

  private Province[] generateProvinces() {
    Province[] canadianProvinces = new Province[10];

    canadianProvinces[0] =
        new Province("Alberta", "Edmonton", 4262635);
    canadianProvinces[1] =
        new Province("British Columbia", "Victoria", 5000879);
    canadianProvinces[2] =
        new Province("Manitoba", "Winnipeg", 1342153);
    canadianProvinces[3] =
        new Province("New Brunswick", "Fredericton", 775610);
    canadianProvinces[4] =
        new Province("Newfoundland and Labrador", "St. John's", 510550);
    canadianProvinces[5] =
        new Province("Nova Scotia", "Halifax", 969383);
    canadianProvinces[6] =
        new Province("Ontario", "Toronto", 14223942);
    canadianProvinces[7] =
        new Province("Prince Edward Island", "Charlottetown", 154331);
    canadianProvinces[8] =
        new Province("Quebec", "Quebec City", 8501833);
    canadianProvinces[9] =
        new Province("Saskatchewan", "Regina", 1132505);

    return canadianProvinces;
  }

  public void displayAllProvinces() {
    for (Province province : this.provinces) {
      System.out.println(province.getDetails());
    }
  }

  public int getNumberOfProvincesBetween(int minimum, int maximum) {
    int numberOfProvincesInRange = 0;

    for(Province province : this.provinces) {
      if(province.getPopulation() >= (minimum * 1000000) &&
          province.getPopulation() <= (maximum * 1000000)) {
        numberOfProvincesInRange += 1;
      }
    }
    return numberOfProvincesInRange;
  }
}
