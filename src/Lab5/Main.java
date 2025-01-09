package Lab5;

public class Main {
    public static void main(String[] args) {

        //1
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        System.out.println(findTheLongestWordInTheText(text));

        //2
        String thisWordMayBeAPalindrome = "Rotator";
        System.out.println(isItAPalindrome(thisWordMayBeAPalindrome));

        //3
        String uncensoredSpecificText = "- Вместо нормальных сигарет бяка какая-то! \n- Да сейчас вместо всего бяка сплошная!";
        System.out.println(censorThisSpecificText(uncensoredSpecificText));

        //4
        String stringText = "The first line of Lorem Ipsum, \" Lorem Ipsum dolor sit amet..\", comes from a line in section 1.10.32.";
        String substringText = "Lorem Ipsum";
        System.out.println(howManyTimesIsASubstringIncludedInAString(stringText, substringText));

        //5
        String testString = "This is a test string";
        System.out.println("The given string is: " + testString);
        System.out.println("The string reversed word by word is:");
        System.out.println(invertWordsInAString(testString));

    }

    //1
    public static String findTheLongestWordInTheText(String text) {
        String[] splitText = text.split(" ");
        String longestWord = "";
        for (String word : splitText) {
            if (longestWord.length() < word.length())
                longestWord = word;
        }
        return longestWord;
    }

    //2
    public static boolean isItAPalindrome(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reverseWord)) {
            return true;
        } else {
            return false;
        }
    }

    //3
    public static String censorThisSpecificText(String text) {//
        String censoredText = text.replace("бяка", "[вырезано цензурой]");
        return censoredText;
    }

    //4
    public static int howManyTimesIsASubstringIncludedInAString(String string, String substring) {
        int counter = 0;
        int index = 0;

        while ((index = string.indexOf(substring, index)) != -1) {
            counter++;
            index += 1;
        }
        return counter;
    }

    //5
    public static String invertWordsInAString(String string) {
        String[] splitText = string.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : splitText) {
            String reverseWordsInString = new StringBuilder(word).reverse().toString();
            result.append(reverseWordsInString).append(" ");
        }
        return result.toString().trim();
    }
}