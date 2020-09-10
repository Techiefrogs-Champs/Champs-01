package encap;

class animals {
    private String name = "RABBIT";
    private String type = "HERBIVORE";
    public String getName() {
     return name;
    }
    protected void setName(String name) {
     this.name = name;
    }
    protected String getType() {
     return type;
    }
    protected void setType(String type) {
     this.type = type;
    }
    void does(){
     System.out.println("ANIMAL CLASSIFICATION");
    }
 }
 
 