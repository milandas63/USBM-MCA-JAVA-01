import java.util.*;
    import java.util.List;
    public class Assignment{
        public static void printInFrame(List<String> strings) {
            int maxLength = 0;
            for (String str : strings) {
                if (str.length() > maxLength) {
                    maxLength = str.length();
                }
            }
            int frameWidth = maxLength + 4;

            for (int i = 0; i < frameWidth; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (String str : strings) {
                System.out.println("* " + str + " ".repeat(maxLength - str.length()) + " *");
            }

            for (int i = 0; i < frameWidth; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            List<String> wordList = List.of("Hello", "World", "in", "a", "frame");
            printInFrame(wordList);
        }
    }
    