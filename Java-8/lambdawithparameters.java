@FunctionalInterface
interface a{
   void show(int i,int j);
}
public class lambdawithparameters{
    public static void main(String[] args) {
    a obj=(i,j)->System.out.print("yoo");
    obj.show(8,5);
}
}