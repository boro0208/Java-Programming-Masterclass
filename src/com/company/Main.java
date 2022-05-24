package com.company;

import com.company.bedroom.*;
import com.company.billsburgers.DeluxeBurger;
import com.company.billsburgers.Hamburger;
import com.company.billsburgers.HealthyBurger;
import com.company.car.Car;
import com.company.car.Ford;
import com.company.car.Holden;
import com.company.car.Mitsubishi;
import com.company.printer.Printer;
import com.company.rectanglecuboid.Cuboid;
import com.company.rectanglecuboid.Rectangle;

import static com.company.areacalculator.AreaCalculator.area;
import static com.company.paintjob.PaintJob.getBucketCount;

public class Main {

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


        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
//
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }

}
