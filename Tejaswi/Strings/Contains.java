class Contains 
 {

    public static void main(String[] args) {

        String name = "teja is learning java";

        System.out.println(name.contains("Java"));     
        System.out.println(name.contains("java"));      
        System.out.println(name.contains("MKYONG"));    
        System.out.println(name.contains("teja"));   

        if (name.contains("java")) {
            System.out.println("Hello Java");
        } else {
            System.out.println("abc...");
        }

    }
}