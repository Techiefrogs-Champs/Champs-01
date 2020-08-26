package basicstrings;

public class string2 {
    public static void main(String[] args) {
        String[] words = { " sri", " vamsi", " Shanmukh" };
        for(int i = 0; i < 2; ++i) {
        for (int j = i + 1; j < 3; ++j) {
        if (words[i].compareTo(words[j]) > 0) {
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
        }
        }
        }
        for(int i = 0; i < 3; i++) {
        System.out.print(words[i]);
        }
        }
        
}