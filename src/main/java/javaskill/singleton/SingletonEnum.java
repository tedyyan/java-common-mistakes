package javaskill.singleton;

/**
 * 枚举单利
 */
public enum  SingletonEnum {
    INSTANCE;
    private String name;
    private SingletonEnum() {
    	System.out.println("constructor for singleton ENUM");
    	name = "Test";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    
}
