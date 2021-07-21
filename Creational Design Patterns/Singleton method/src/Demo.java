public class Demo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        Singleton object = Singleton.getInstance();
        Singleton obj= Singleton.getInstance();
        System.out.println(obj);
        System.out.println(object);
        //show the message
        object.showMessage();
        obj.showMessage();
    }
}