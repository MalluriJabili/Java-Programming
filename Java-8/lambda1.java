@FunctionalInterface
interface a{
   void show();
}
public class lambda1{
    public static void main(String[] args) {
    a obj=()->
    {
        System.out.println("hey");
        System.out.println("hello");
    };
    obj.show();
}
}