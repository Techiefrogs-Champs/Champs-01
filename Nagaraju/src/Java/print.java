//Create a class to print an integer and a character with two methods 
//having the same name but different sequence of the integer and the character parameters.
//For example, if the parameters of the first method are of the form (int n, char c), 
//then that of the second method will be of the form (char c, int n).
class IC{
    public void P1(int i,char c){ 
        }
    public void P2(char c, int i){
        }
    }
class print{
    public static void main(String [] args){
       int i;
        char c;
       IC a = new IC();
       //IC b = new IC();
       a.P1(4,'h');
       //b.P1('h',2);
        System.out.println(a.P1());
        //System.out.println(b.P1());
      
    }
}