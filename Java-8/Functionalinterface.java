@FunctionalInterface
interface a{
   void show();
}
public class Functionalinterface{
    public static void main(String[] args) {
    a obj=new a(){
        public void show(){
            System.err.println("hi");
        }
    };
    obj.show();
}
}