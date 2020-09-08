package typecasting;//upcasting


    class Animal{
        String name;
        void nature(){
            System.out.println("Animal");
        }
    }
    class fish extends Animal{
        String color;
        void nature(){
            System.out.println("Aquatic Animal");
        }
    }
    class pro7{
        public static void main(String args[]){
            Animal a=new fish();
            a.name="Goldfish";
            System.out.println(a.name);
            a.nature();
            System.out.println("object A");
            a.nature();
            System.out.println("object B");
            fish f=new fish();
            f.name="Whale";
            f.color="yellow";
            System.out.println(f.name);
            System.out.println(f.color);
        }
    }   

