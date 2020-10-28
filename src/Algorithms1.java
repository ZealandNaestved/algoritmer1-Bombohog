import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    public static void main(String[] args) {
        // exampleOfPredictableRandomNumber();

        System.out.println("Random boy name: " + randomBoyName());
        System.out.println("Random girl name: " + randomGirlName());
        System.out.println("Random name: " + randomName());
        System.out.println("Random character: " + randomCharacter());
        System.out.println("Head or tails: " + headsOrTails());

    }

    // this is more like a hint
    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDregneNavne property OBS: randomDregneNavne skal forblive private!
    public static String randomBoyName() {
        Random rand = new Random();

        String[] names = new Data().getRandomDrengeNavne();

        return names[rand.nextInt(names.length)];
    }

    // brugt til test
    public static String randomBoyName(long seed) {
        Random rand = new Random();
        rand.setSeed(seed);

        String[] names = new Data().getRandomDrengeNavne();

        return names[rand.nextInt(names.length)];
    }

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen
    public static String randomGirlName() {
        Random rand = new Random();

        String[] names = new Data().getRandomPigeNavne();

        return names[rand.nextInt(names.length)];
    }

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det
    public static String randomName() {
        Random rand = new Random();

        String[] boyNames = new Data().getRandomDrengeNavne();
        String[] girlNames = new Data().getRandomPigeNavne();

        int aLen = boyNames.length;
        int bLen = girlNames.length;
        String[] names = new String[aLen + bLen];

        System.arraycopy(boyNames, 0, names, 0, aLen);
        System.arraycopy(girlNames, 0, names, aLen, bLen);

        return names[rand.nextInt(names.length)];
    }

    // brugt til test
    public static String randomName(long seed) {
        Random rand = new Random();
        rand.setSeed(seed);

        String[] boyNames = new Data().getRandomDrengeNavne();
        String[] girlNames = new Data().getRandomPigeNavne();

        int aLen = boyNames.length;
        int bLen = girlNames.length;
        String[] names = new String[aLen + bLen];

        System.arraycopy(boyNames, 0, names, 0, aLen);
        System.arraycopy(girlNames, 0, names, aLen, bLen);

        return names[rand.nextInt(names.length)];
    }

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)
    public static char randomCharacter() {
        Random rand = new Random();

        char[] alphabet = new char[26]; // new array

        for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
        {
            alphabet[ch-'a']=ch;
        }

        System.out.print(alphabet);// output

        return alphabet[rand.nextInt(alphabet.length)];
    }

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)
    public static String headsOrTails() {
        Random rand = new Random();

        if (rand.nextBoolean() == true) {
            return "Tails";
        } else {
            return "Heads";
        }

    }

}
