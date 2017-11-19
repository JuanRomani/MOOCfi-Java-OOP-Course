public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        printWithSmileys("impar");
    }

    private static void printWithSmileys(String characterString){
        smileys(characterString);

        middleRow(characterString);

        smileys(characterString);
    }

    private static boolean lengthEven(String characterString){
        if (characterString.length() % 2 == 0){
            return true;
        }

        return false;
    }

    private static void smileys(String characterString){
        int times = (characterString.length() / 2);
        if (lengthEven(characterString)){
            times += 3;
        } else {
            times += 4;
        }

        for (int i = 0; i < times; i++){
            System.out.print(":)");
        }

        System.out.println();
    }

    private static void middleRow(String characterString){
        if(lengthEven(characterString)){
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
    }
}
