public class TrafficLightApp {

    private String color;
    private final String id;

    TrafficLightApp(String id) {
        this.id = id;
        color = "RED";
    }

    void next() {

        if (color.equals("RED")) {
            color = "GREEN";
        } 
        else if (color.equals("GREEN")) {
            color = "YELLOW";
        } 
        else {
            color = "RED";
        }
    }

    String getColor() {
        return color;
    }

    public static void main(String[] args) {

        TrafficLightApp t = new TrafficLightApp("TL-9");

        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());
    }
}