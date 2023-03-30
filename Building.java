/**
 * Contains all code for the Building class
 */

public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    /**
 * Constructs a Building
 *
 * @param name
 * @param address
 * @param nFloors
 */

    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

   

    public String getName() {
        return this.name;
    }

  

    public String getAddress() {
        return this.address;
    }

   

    public int getFloors() {
        return this.nFloors;
    }


    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address + ".";
    }

    /**
 * Creates an instance of the Building class
 *
 * @param args The command line arguments (ignored)
 */

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}