package Strings;

public class DuplicateWord {
    public static void main(String[] args) {
        String s="My name is phani phani likes drawing name";
        int count;
        s=s.toLowerCase(); //converts into lowercase
        String words[]=s.split(" "); //split the string into words
        System.out.println("Duplicate words in a string are :");
        for(int i=0;i<words.length;i++){
            count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if(count>1&&words[i]!="0")
            System.out.println(words[i]);
        }
    }
}