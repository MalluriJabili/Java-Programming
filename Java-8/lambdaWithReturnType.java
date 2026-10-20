@FunctionalInterface
interface a{
   int add(int i,int j);
}
public class lambdaWithReturnType{
    public static void main(String[] args) {
    a obj=(i,j)->i+j;
    int result= obj.add(8,5);
    System.out.println("result:"+result);
}
}