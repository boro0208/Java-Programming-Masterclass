package com.company;

import com.company.carpetcostcalculator.Calculator;
import com.company.carpetcostcalculator.Carpet;
import com.company.carpetcostcalculator.Floor;
import com.company.complexoperations.ComplexNumber;
import com.company.person.Person;
import com.company.point.Point;
import com.company.sumcalculator.SimpleCalculator;
import com.company.wallarea.WallArea;

import static com.company.allfactors.FactorPrinter.printFactors;
import static com.company.areacalculator.AreaCalculator.area;
import static com.company.barkingdog.BarkingDog.shouldWakeUp;
import static com.company.decimalcomparator.DecimalComparator.areEqualByThreeDecimalPlaces;
import static com.company.diagonalstar.DiagonalStar.printSquareStar;
import static com.company.equalityprinter.IntEqualityPrinter.printEqual;
import static com.company.equalsumchecker.EqualSumChecker.hasEqualSum;
import static com.company.evendigitsum.EvenDigitSum.getEvenDigitSum;
import static com.company.firstandlastdigitsum.FirstLastDigitSum.sumFirstAndLastDigit;
import static com.company.flourpackproblem.FlourPacker.canPack;
import static com.company.greatestcommondivisor.GreatestCommonDivisor.getGreatestCommonDivisor;
import static com.company.inputcalculator.InputCalculator.inputThenPrintSumAndAverage;
import static com.company.largestprime.LargestPrime.getLargestPrime;
import static com.company.lastdigitcheker.LastDigitChecker.hasSameLastDigit;
import static com.company.leapyear.LeapYear.isLeapYear;
import static com.company.megabytesconverter.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.company.minutestoyear.MinutesToYearsDaysCalculator.printYearsAndDays;
import static com.company.numberinword.NumberInWord.printNumberInWord;
import static com.company.numberofdays.NumberOfDaysInMonth.getDaysInMonth;
import static com.company.numberpalindrome.NumberPalindrome.isPalindrome;
import static com.company.numbertowords.NumberToWords.numberToWords;
import static com.company.paintjob.PaintJob.getBucketCount;
import static com.company.perfectnumber.PerfectNumber.isPerfectNumber;
import static com.company.shareddigit.SharedDigit.hasSharedDigit;
import static com.company.speedconverter.SpeedConverter.printConversion;
import static com.company.speedconverter.SpeedConverter.toMilesPerHour;
import static com.company.teennumberchecker.TeenNumberChecker.hasTeen;

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

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }

}
