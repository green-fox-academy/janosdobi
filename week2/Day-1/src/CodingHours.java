public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    int hours = 6;
    int days = 5;
    int semester = 17;

    int codingHours = hours * days * semester;

    int allHours = semester * 52;

    System.out.println(codingHours);
    System.out.println(((float) (codingHours) / (float) (allHours)) * 100 + "%");



  }
}
