/* This is a stub for the Library class */
import java.util.Hashtable;

/**
 * Contains all code for the Library class
 */

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  /**
 * Constructs a Library
 *
 * @param name
 * @param address
 * @param nFloors
 */

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
      Hashtable<String, Boolean> collection = new Hashtable<String, Boolean>();
      this.collection = collection;
    }

    /**
 * Tests whether x is a single digit integer.
 *
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 */

    public void addTitle(String title) {
      this.collection.put(title, true);
    }

    /**
 * Tests whether x is a single digit integer.
 *
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 */

    public String removeTitle(String title) {
      this.collection.remove(title);
      return title;
    }

    /**
 * Tests whether x is a single digit integer.
 *
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 */

    public void checkOut(String title) {
      this.collection.replace(title, true, false);
    }
    public void returnBook(String title) {
      this.collection.replace(title, false, true);
    }

    /**
 * Tests whether x is a single digit integer.
 *
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 */

    public boolean containsTitle(String title) {
      if (this.collection.containsKey(title)) {
        return true;
      } else {
        return false;
      }
    }

    /**
 * Tests whether x is a single digit integer.
 *
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 */

    public boolean isAvailable(String title) {
      if (this.collection.get(title).equals(true)) {
        return true;
      } else {
        return false;
      } 
    }

    /**
 * Tests whether x is a single digit integer.
 *
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 */

    public void printCollection() {
      this.collection.forEach((title, status)->System.out.print(title + " : " + status));

    }

    /**
 * Creates an instance of the Library class
 *
 * @param args The command line arguments (ignored)
 */
   
    public static void main(String[] args) {
      Library leaf = new Library("Leaf Library", "324 Oak Avenue", 4);
      System.out.println(leaf);
      //    Testing:
      //leaf.addTitle("The Lorax by Dr. Seuss");

    }
  
  }
