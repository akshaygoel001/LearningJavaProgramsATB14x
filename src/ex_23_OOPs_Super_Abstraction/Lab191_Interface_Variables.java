package ex_23_OOPs_Super_Abstraction;


public class Lab191_Interface_Variables {
    public static void main(String[] args) {

    }
}


interface Akshay{
    final int a = 10;
    void display();
}

class Goel implements Akshay {

    int aa = 10;
    @Override
    public void display() {
//        System.out.println(super.a);
        System.out.println(a);
        System.out.println(this.aa);
    }
}
class Somya implements TTA{

    @Override
    public void practice() {

    }

}
class Akshay1 implements TTA{

    @Override
    public void practice() {

    }

}
interface TTA{
    void practice();
}


class Akshay_Mentor implements TTA_Mentor{

    @Override
    public void teach() {

    }
}

class Dipak implements TTA_Mentor{

    @Override
    public void teach() {

    }
}

interface TTA_Mentor{
    void teach();
}