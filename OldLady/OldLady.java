public class OldLady
{
    public static void main(String[] args)
    {
        PrintFly();
        PrintSpider();
        PrintBird();
        PrintCat();
        System.out.println("There was an old lady who swallowed a horse...");
        System.out.println("She's dead, of course!");
    }
    public static void PrintFly()
    {
        System.out.println("There was an old lady who swallowed a fly");
        PrintPerhapsLine();
    }
    public static void PrintSpider()
    {
        System.out.println("There was an old lady who swallowed a spider,");
        System.out.println("That wriggled and wiggled and tiggled inside her;");
        PrintSwallowSpider();
        PrintPerhapsLine();
    }
    public static void PrintBird()
    {
        System.out.println("There was an old lady who swallowed a bird;");
        System.out.println("How absurd to swallow a bird.");
        PrintSwallowBird();
        PrintSwallowSpider();
        PrintPerhapsLine();
    }
    public static void PrintCat()
    {
        System.out.println("There was an old lady who swallowed a cat;");
        System.out.println("Fancy that to swallow a cat!");
        PrintSwallowCat();
        PrintSwallowBird();
        PrintSwallowSpider();
        PrintPerhapsLine();
    }      
    public static void PrintPerhapsLine()
    {
        System.out.println("I don't know why she swallowed a fly - perhaps she'll die!");
    }
    public static void PrintSwallowSpider()
    {
        System.out.println("She swallowed the spider to catch the fly;");
    }
    public static void PrintSwallowBird()
    {
        System.out.println("She swallowed the bird to catch the spider,");
    }
    public static void PrintSwallowCat()
    {
        System.out.println("She swallowed the cat to catch the bird,");
    }
}