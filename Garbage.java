public class Garbage{
    public static void main(String args[]) {
        Garbage obj = new Garbage();
        obj=null;
        Garbage a = new Garbage();
        Garbage b = new Garbage();
        b=a;
        System.gc();
    }
    
    public void finalize() {
        System.out.println("Garbage collection is performed by JVM");
    }
}
