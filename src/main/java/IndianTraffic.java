import org.example.CentralTrafficInterface;

public class IndianTraffic implements CentralTrafficInterface {

    public static void main(String[] args)
    {
        CentralTrafficInterface a = new IndianTraffic();
        a.greengo();
        a.redstop();
        a.flashyellow();

    }

    @Override
    public void greengo() {
        System.out.println("Green go implementation");

    }

    @Override
    public void redstop() {
        System.out.println("Red stop implementation");

    }

    @Override
    public void flashyellow() {
        System.out.println("Flash yellow implementation");

    }
}
