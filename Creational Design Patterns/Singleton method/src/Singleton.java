public class Singleton {
    //create an object of SingleObject
    private static Singleton instance = null;
    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton(){
        //empty
    }
    //Get the only object available
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){

        System.out.println("OBJECT!");
    }
}