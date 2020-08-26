package javaskill.singleton;

/**
 * Created by wuzejian on 2017/5/9.
 * 
 */
public class StaticSingleton {
	private String name;
    private static class Holder {
        private static StaticSingleton singleton = new StaticSingleton();
    }

    private StaticSingleton(){
    	System.out.println("constructor for singleton Static");
    	this.name = "Test 2";
    }

    public static StaticSingleton getSingleton(){
        return Holder.singleton;
    }
    
    public String getName() {     
        return name;     
    }    
}