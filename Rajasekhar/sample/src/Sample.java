package src;

 class Sample{

    public static void main(String[] args) {
        String c = "i am raja sekhar";
        String x =c.toLowerCase();
        char y[] = x.toCharArray();
        int size = y.length;
        //char a[] = new char[size];
        y[0]=(char)(y[0]-32);
        int i=1;
        while (i!=size){
            if (y[i]==' '){
            y[i+1] = (char)(y[i+1]-32);
            }
            i++;
        }
    System.out.println(y);
  
    }

}