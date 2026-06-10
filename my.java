public class my{
    int modelYear;
    String modelName;
    public my(int year,String name){
        modelYear=year;
        modelName=name;
        

    }
    public static void main(String[] args){
        my mycar=new my(1986,"Mushtang");
        System.out.println(mycar.modelYear +" "+mycar.modelName);
    }
    
}
