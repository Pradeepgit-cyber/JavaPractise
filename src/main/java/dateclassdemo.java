import java.text.SimpleDateFormat;
import java.util.Date;

public class dateclassdemo
{
    public static void main(String[] args)
    {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sd.format(d));
        System.out.println(sdf.format(d));
        System.out.println(d);


    }
}
