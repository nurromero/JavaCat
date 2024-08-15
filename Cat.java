public class Cat {
  //Instance variables
  String name;
  int age;


  //Constructor
  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //Method for the cat to meow
  public void meow() {
    System.out.println("Meow!;3");
  }

  //Method to print the cat's name and age
  public void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

}