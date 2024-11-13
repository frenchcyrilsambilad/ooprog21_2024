import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        String word1 = getWord("Enter first word: ");
        String word2 = getWord("Enter second word: ");

        int vowelIndex1 = findFirstVowelIndex(word1);
        int vowelIndex2 = findFirstVowelIndex(word2);

        if (vowelIndex1 > 0 && vowelIndex2 > 0) {
            String initialPart1 = word1.substring(0, vowelIndex1);
            String remainingPart1 = word1.substring(vowelIndex1);

            String initialPart2 = word2.substring(0, vowelIndex2);
            String remainingPart2 = word2.substring(vowelIndex2);

            String spoonerizedWord1 = initialPart2 + remainingPart1;
            String spoonerizedWord2 = initialPart1 + remainingPart2;

            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        } else {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize");
        }
    }

    private static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }

    private static int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i;
            }
        }
        return -1;
    }
}
