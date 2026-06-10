public class Main{
    int x=5;
    String y="rajesh";
    public static void main(String[] args){
        Main obj1=new Main();
        Main obj2=new Main();
        obj2.y="jas";
        System.out.println(obj1.x);
        System.out.println(obj2.y);
    }
}