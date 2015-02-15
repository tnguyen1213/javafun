package com.ttnsystems.java.oca_programmer1;

public class PatricksUniverse {
    private String universeName;
    
    public PatricksUniverse(String universeName) {
        //super();
        System.out.println("Creating a PatricksUniverse now.");
        this.setUniverseName(universeName);
    }

    public static void main(String[] args) {
        PatricksUniverse firstUniverse = new PatricksUniverse("First One");
        
        if ((args == null) || (args.length == 0)) {
            firstUniverse.sayHello(null);
        }
        else {
            firstUniverse.sayHello(args[0]);
        }
        
    }
    
    public void sayHello(String nameArg) {
        if (nameArg == null) {
            System.out.println("Hello, from Patrick's Universe named " + universeName + "!");
        }
        else {
            System.out.println("Hello " + nameArg + ", from Patrick's Universe named " + universeName + "!");
        }
    }
    
    private void setUniverseName(String universeName) {
        this.universeName = universeName;
    }
}
