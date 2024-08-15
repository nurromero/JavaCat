public class Main {
  public static void main(String [] args) {
    // Create a new Cat object
    Cat myCat = new Cat("Müezza", 10);
    Cat slotCat = new Cat ("Freja", 6);


    // Making the cats meow
    myCat.meow();
    slotCat.meow();

    // Printing the cats' info
    myCat.printInfo();
    slotCat.printInfo();
  }


}
