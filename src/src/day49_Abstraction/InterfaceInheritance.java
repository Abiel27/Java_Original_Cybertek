package src.day49_Abstraction;
interface X{
    void x();
}

interface Y {
    void y();
}

interface Z {
    void z();
}

public interface InterfaceInheritance extends X, Y, Z {
    void q();
}

class Practice implements  InterfaceInheritance{

    @Override
    public void q(){

     }

    @Override
    public void x() {

    }

    @Override
    public void y() {

    }

    @Override
    public void z() {

    }
}

/*
interface extends interface(s)
 */