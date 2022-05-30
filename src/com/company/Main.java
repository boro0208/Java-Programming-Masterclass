package com.company;

import com.company.banking.Bank;
import com.company.mobilephone.MobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");
    public static void main(String[] args) {
//        System.out.println(toMilesPerHour(1.5));
//        printMegaBytesAndKiloBytes(1234);
//        System.out.println(shouldWakeUp(true, 1));
//        System.out.println(isLeapYear(1991));
//        System.out.println(hasEqualSum(1, 3, 4));
//        System.out.println(hasTeen(1, 13, 19));
//        printYearsAndDays(525600);
//        printEqual(1, 13, 19);
//        printNumberInWord(4);
//        System.out.println(getDaysInMonth(1,1600));
//        System.out.println(isPalindrome(252));
//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(area(252.00));
//        System.out.println(areEqualByThreeDecimalPlaces(14.23, 3434.23));
//        printConversion(14);
//        System.out.println(getEvenDigitSum(252));
//        System.out.println(hasSharedDigit(252, 23));
//        System.out.println(hasSameLastDigit(252, 23, 45));
//        System.out.println(getGreatestCommonDivisor(23, 45));
//        printFactors(234);
//        System.out.println(isPerfectNumber(45));
//        numberToWords(45);
//        System.out.println(canPack(4, 5, 24));
//        System.out.println(getLargestPrime(24));
//        printSquareStar(5);
//        inputThenPrintSumAndAverage();
//        System.out.println(getBucketCount(3.4,2.1,1.5,2));

//        OOP taskas

//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//        simpleCalculator.setFirstNumber(3);
//        simpleCalculator.setSecondNumber(5);
//        System.out.println(simpleCalculator.getAdditionResult());

//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

//        WallArea wall = new WallArea(5,4);
//        System.out.println("area= " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());

//        Rectangle rectangle = new Rectangle(5, 10);
//        System.out.println("rectangle.width= " + rectangle.getWidth());
//        System.out.println("rectangle.length= " + rectangle.getLength());
//        System.out.println("rectangle.area= " + rectangle.getArea());
//        Cuboid cuboid = new Cuboid(5,10,5);
//        System.out.println("cuboid.width= " + cuboid.getWidth());
//        System.out.println("cuboid.length= " + cuboid.getLength());
//        System.out.println("cuboid.area= " + cuboid.getArea());
//        System.out.println("cuboid.height= " + cuboid.getHeight());
//        System.out.println("cuboid.volume= " + cuboid.getVolume());

//        Wall wall1 = new Wall( "West ");
//        Wall wall2 = new Wall("East") ;
//        Wall wall3 = new Wall ( "South " );
//        Wall wall4 = new Wall("North") ;
//        Ceiling ceiling = new Ceiling (12, 55);
//        Bed bed = new Bed ("Modern", 4, 3, 2, 1);
//        Lamp lamp = new Lamp("Classic", false, 75);
//        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//        bedRoom.makeBed() ;
//        bedRoom.getLamp().turnOn ();


//        Printer printer = new Printer(50, true);
//        System.out.println(printer.addToner(50));
//        System.out.println("initial page count = " +printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was "+pagesPrinted +" new total print count for printer = "+printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was "+ pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

//        Car car= new Car(8, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate() ) ;
//        System.out.println(car.brake());
//        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate()) ;
//        System.out.println(mitsubishi.brake());
//        Ford ford = new Ford(6, "Ford Falcon");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//        Holden holden = new Holden(6, "Holden Commodore") ;
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate()) ;
//        System.out.println(holden.brake()) ;


//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 1.13);
//        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.addHealthyAddition1("Lentils", 3.41);
//        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
////
//        DeluxeBurger db = new DeluxeBurger();
//        db.addHamburgerAddition3("Should not do this", 50.53);
//        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());


//        int[] testArray = SortedArray.getIntegers(5);
//        int[] array = SortedArray.sortIntegers(testArray);
//        SortedArray.printArray(array);

//        readInteger();
//        int[] test = readElements(readInteger());
//        System.out.println(Arrays.toString(test));

//        int minNum = findMin(readElements(readInteger()));
//        System.out.println(minNum);

//        int[] test = new int[] {1,2,3,4};
//        ReverseArray.reverse(test);

//        boolean quit = false;
//        startPhone();
//        printActions();
//        while(!quit) {
//            System.out.println("\nEnter action: (6 to show available actions)");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\nShutting down...");
//                    quit = true;
//                    break;
//
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//
//                case 2:
//                    addNewContact();
//                    break;
//
//                case 3:
//                    updateContact();
//                    break;
//
//                case 4:
//                    removeContact();
//                    break;
//
//                case 5:
//                    queryContact();
//                    break;
//
//                case 6:
//                    printActions();
//                    break;
//            }
//
//        }
//
//
//
//
//    }
//
//    private static void addNewContact() {
//        System.out.println("Enter new contact name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter phone number: ");
//        String phone = scanner.nextLine();
//        Contact newContact = Contact.createContact(name, phone);
//        if(mobilePhone.addNewContact(newContact)) {
//            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
//        } else {
//            System.out.println("Cannot add, " + name + " already on file");
//        }
//    }
//
//    private static void updateContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if(existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//        System.out.print("Enter new contact name: ");
//        String newName = scanner.nextLine();
//        System.out.print("Enter new contact phone number: ");
//        String newNumber = scanner.nextLine();
//        Contact newContact = Contact.createContact(newName, newNumber);
//        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
//            System.out.println("Successfully updated record");
//        } else {
//            System.out.println("Error updating record.");
//        }
//    }
//
//    private static void removeContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//        if(mobilePhone.removeContact(existingContactRecord)) {
//            System.out.println("Successfully deleted");
//        } else {
//            System.out.println("Error deleting contact");
//        }
//    }
//
//    private static void queryContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
//    }
//
//    private static void startPhone() {
//        System.out.println("Starting phone...");
//    }
//
//    private static void printActions() {
//        System.out.println("\nAvailable actions:\npress");
//        System.out.println("0  - to shutdown\n" +
//                "1  - to print contacts\n" +
//                "2  - to add a new contact\n" +
//                "3  - to update an existing contact\n" +
//                "4  - to remove an existing contact\n" +
//                "5  - query if an existing contact exists\n" +
//                "6  - to print a list of available actions.");
//        System.out.println("Choose your action: ");
//    }

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}
