package week3;

public class PunctuationCounter {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.\n-that was a nice poem-\nthe end.\n";

        int comma = 0, period = 0, dash = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case ',' -> comma++;
                case '.' -> period++;
                case '-' -> dash++;
            }
        }

        System.out.println("Punctuation\tCount");
        System.out.println(", (comma)\t\t" + comma);
        System.out.println(". (period)\t\t" + period);
        System.out.println("- (dash)\t\t" + dash);
    }
}

