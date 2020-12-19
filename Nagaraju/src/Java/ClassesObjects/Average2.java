/* Print the average of three numbers entered by user by creating a class named 'Average' 
having a method to calculate and print the average. */

package ClassesObjects;
class Average2 {
    int a;
    int b;
    int c;
    public static void find_avg(int a,int b,int c){
        System.out.println("average = "+(a+b+c)/3); 
    }
    public static void main(String[] args) {
        find_avg(4,5,6);
    }
}
