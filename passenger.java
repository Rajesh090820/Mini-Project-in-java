public class passenger {
    
    String name;
    int age;
    String departure;
    String arrival;
    public passenger(String name,int age,String departure,String arrival){
        this.name=name;
        this.age=age;
        this.departure=departure;
        this.arrival=arrival;
        

    }
    public static void main(String[] args){
        passenger mypass=new passenger("Rajesh",18,"Chennai","Mumbai");
        System.out.println(mypass.name +" "+mypass.age+" "+mypass.departure+" "+mypass.arrival);
    }
    
}