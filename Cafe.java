/* This is a stub for the Cafe class */

/**
 * Contains all code for the Cafe class
 */

public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
 * Constructs a Cafe
 *
 * @param name
 * @param address
 * @param nFloors
 */

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = 600;
        nSugarPackets = 100;
        nCreams = 100;
        nCups = 80;

    }

    /**
 * Sells a coffee and triggers the restock method if there are not enough ingredients for the drink
 *
 * @param size
 * @param sugars
 * @param creams
 */

    public void sellCoffee(int size, int sugars, int creams) {
        if (size > 600 || sugars > 100 || creams > 100) {
            System.out.println("We never stock more than 600 ounces of coffee, 100 sugar packets, and 100 creams. Please make sure your order is within the bounds of our supply.");
        } else {
            if (nCoffeeOunces >= size && nSugarPackets >= sugars && nCreams >= creams && nCups >= 1) {
                nCoffeeOunces = nCoffeeOunces - size; 
                nSugarPackets = nSugarPackets - sugars; 
                nCreams = nCreams - creams;
                nCups = nCups - 1;
            } else {
                restock(size, sugars, creams, nCups);
            }
        }
    }

    /**
 * Restocks all supplies that are too low to make the requested drink and triggers the sell method when finished
 *
 * @param size
 * @param sugars
 * @param creams
 * @param nCups
 */

    private void restock(int size, int sugars, int creams, int nCups) {
        System.out.println("Restocking items...");
        if (nCoffeeOunces < size) {
            nCoffeeOunces = 600; 
        }
        if (nSugarPackets < sugars) {
            nSugarPackets = 100;
        } 
        if (nCreams < creams) {
            nCreams = 100;
        } 
        if (nCups < 1) {
            nCups = 80;
        }
        System.out.println("Restock complete. Your order will now be completed."); 
        sellCoffee(size, sugars, creams); 
    }
       
    
/**
 * Creates an instance of the Cafe class
 *
 * @param args The command line arguments (ignored)
 */


    public static void main(String[] args) {
        Cafe sweetPea = new Cafe("Sweet Pea Cafe", "144 Flores Blvd.", 1);
        System.out.println(sweetPea);
        //    Testing:
        // sweetPea.sellCoffee(16, 2, 2);
        // sweetPea.sellCoffee(8, 100, 4);
    }
    
}



