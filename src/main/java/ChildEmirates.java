public class ChildEmirates extends ParentAircraft {
    public static void main(String[] args){
        ChildEmirates c = new ChildEmirates();
        c.engine();
        c.safetyGuidelines();
        c.bodyColour();


    }


    public void bodyColour() {
        System.out.println("Colour is red");

    }
}
