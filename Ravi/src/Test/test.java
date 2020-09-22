public class test {
    public static void main(String[] args) {

     
        String str1 = "the quick brown fox";
        String str2 = "queenk";
        System.out.println("The given string is: " + str1);
        System.out.println("The given mask string is: " + str2);
        char[] mas = new char[20];
        for (int i = 0; i < str2.length(); i++)
        {
        mas[str2.charAt(i)]++;
        System.out.println("\nThe new string is: ");
        for (int j = 0; j < str1.length(); j++)
          {
            if (mas[str1.charAt(i)] == 0)
             System.out.print(str1.charAt(i));
          }
        }

    }  
}