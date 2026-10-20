@FunctionalInterface
interface a{
   void show();
}
public class lambda{
    public static void main(String[] args) {
    a obj=()->System.out.print("hi");
    obj.show();
}
}