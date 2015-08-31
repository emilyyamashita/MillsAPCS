/* Revise the Twelve Days of Christmas so that it practices good coding techniquies.
    by: Emily Yamashita
    date: 08/31/2015
*/
public class TwelveDays
{
    public static void main(String[] args)
    {
        firstDay();
        secondDay();
        thirdDay();
        fourthDay();
        fifthDay();
        sixthDay();
        seventhDay();
        eighthDay();
        ninthDay();
        tenthDay();
        eleventhDay();
        twelfthDay();
    }
    public static void firstDay()
    {
        System.out.println("On the first day of Christmas,");
        printTrueLove();
        printPartridge();
    }
    public static void secondDay()
    {
        System.out.println("On the second day of Christmas,");
        printTrueLove();
        printTurtleDoves();
        printPartridge();
    }
    public static void thirdDay()
    {
        System.out.println("On the third day of Christmas,");
        printTrueLove();
        printFrenchHens();
        printTurtleDoves();
        printPartridge();
    }
    public static void fourthDay()
    {
        System.out.println("On the fourth day of Christmas,");
        printTrueLove();
        printFirstFourGifts();
    }
    public static void fifthDay()
    {
        System.out.println("On the fifth day of Christmas,");
        printTrueLove();
        printGoldenRings();
        printFirstFourGifts();
    }
    public static void sixthDay()
    {
        System.out.println("On the sixth day of Christmas,");
        printTrueLove();
        printGeese();
        printGoldenRings();
        printFirstFourGifts();
    }
    public static void seventhDay()
    {
        System.out.println("On the seventh day of Christmas,");
        printTrueLove();
        printSwans();
        printGeese();
        printGoldenRings();
        printFirstFourGifts();
    }
    public static void eighthDay()
    {
        System.out.println("On the eighth day of Christmas,");
        printTrueLove();
        printFirstEightGifts();
    }
    public static void ninthDay()
    {
        System.out.println("On the ninth day of Christmas,");
        printTrueLove();
        printLadies();
        printFirstEightGifts();
    }
    public static void tenthDay()
    {
        System.out.println("On the tenth day of Christmas,");
        printTrueLove();
        printLords();
        printLadies();
        printFirstEightGifts();
    }
    public static void eleventhDay()
    {
        System.out.println("On the eleventh day of Christmas,");
        printTrueLove();
        printPipers();
        printLords();
        printLadies();
        printFirstEightGifts();
    }
    public static void twelfthDay()
    {
        System.out.println("On the twelfth day of Christmas,");
        printTrueLove();
        printAllTwelveGifts();
    } 
    public static void printTrueLove()
    {
        System.out.println("my true love sent to me");
    }
    public static void printPartridge()
    {
        System.out.println("a partridge in a pear tree.");
    }
    public static void printTurtleDoves()
    {
        System.out.println("two turtle doves, and");
    }
    public static void printFrenchHens()
    {
        System.out.println("three French hens,");
    }
    public static void printCallingBirds()
    {
        System.out.println("four calling birds,");
    }
    public static void printGoldenRings()
    {
        System.out.println("five golden rings,");
    }
    public static void printGeese()
    {
        System.out.println("six geese a-laying,");
    }
    public static void printSwans()
    {
        System.out.println("seven swans a-swimming,");
    }
    public static void printMaids()
    {
        System.out.println("eight maids a-milking,");
    }
    public static void printLadies()
    {
        System.out.println("nine ladies dancing,");
    }
    public static void printLords()
    {
        System.out.println("ten lords a-leaping,");
    }
    public static void printPipers()
    {
        System.out.println("eleven pipers piping,");
    }
    public static void printDrummers()
    {
        System.out.println("Twelve drummers drumming,");
    }
    public static void printFirstFourGifts()
    {
        printCallingBirds();
        printFrenchHens();
        printTurtleDoves();
        printPartridge();
    }
    public static void printFirstEightGifts()
    {
        printMaids();
        printSwans();
        printGeese();
        printGoldenRings();
        printFirstFourGifts();
    }
    public static void printAllTwelveGifts()
    {
        printDrummers();
        printPipers();
        printLords();
        printLadies();
        printFirstEightGifts();
    }
}