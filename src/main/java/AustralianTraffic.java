import org.example.CentralTraffic;

public class AustralianTraffic implements CentralTraffic {

    public static void main(String[] args)
    {
        AustralianTraffic a = new AustralianTraffic();
        a.greenGo();
        a.redstop();
        a.flashYellow();

    }

    @Override
    public void greenGo()
    {
        System.out.println("green go implemented");

    }

    @Override
    public void redstop()
    {
        System.out.println("red stop implemented");

    }

    @Override
    public void flashYellow()
    {
        System.out.println("flash yellow implemented");

    }


}
