package src.day45_Exceptions.PhoneTask;

public final class HuaWei extends Phone{

    public HuaWei( String model, double price) {
        super("HuaWei", model, "China", price);
    }

    public void spy(){
        System.out.println(brand+" "+model+" is spying");
    }

}
