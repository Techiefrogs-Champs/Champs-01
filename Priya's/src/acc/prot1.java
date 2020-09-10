package acc;


import p1.*;

 class prot1 extends prot {
   int a = 10;
   public static void main(String[] args) {
       prot1 P = new prot1();
       System.out.println("VALUE OF PROTECTED INT:"+P.a);
       P.msg();

   }
}