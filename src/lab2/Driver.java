package lab2;

public class Driver {

  public static void main(String[] args) {

    Canada canada = new Canada();

    canada.displayAllProvinces();
    System.out.println("\nNumber of provinces in range: " +
        canada.getNumberOfProvincesBetween(1, 15));
  }
}
