package lab2;

public class Canada {

  private Province[] provinces;

  public Canada() {
    this.provinces = generateProvinces();
  }

  private Province[] generateProvinces() {
    Province[] canadianProvinces = new Province[10];

    canadianProvinces[0] =
        new Province("Alberta", "Edmonton", 4262635L);
    canadianProvinces[1] =
        new Province("British Columbia", "Victoria", 5000879L);
    canadianProvinces[2] =
        new Province("Manitoba", "Winnipeg", 1342153L);
    canadianProvinces[3] =
        new Province("New Brunswick", "Fredericton", 775610L);
    canadianProvinces[4] =
        new Province("Newfoundland and Labrador", "St. John's", 510550L);
    canadianProvinces[5] =
        new Province("Nova Scotia", "Halifax", 969383L);
    canadianProvinces[6] =
        new Province("Ontario", "Toronto", 14223942L);
    canadianProvinces[7] =
        new Province("Prince Edward Island", "Charlottetown", 154331L);
    canadianProvinces[8] =
        new Province("Quebec", "Quebec City", 8501833L);
    canadianProvinces[9] =
        new Province("Saskatchewan", "Regina", 1132505L);

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
      if(province.getPopulation() >= (minimum * 1000000L) &&
          province.getPopulation() <= (maximum * 1000000L)) {
        numberOfProvincesInRange += 1;
      }
    }
    return numberOfProvincesInRange;
  }
}
