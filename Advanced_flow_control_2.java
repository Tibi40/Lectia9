import org.w3c.dom.ls.LSOutput;

public class Advanced_flow_control_2 {

    public static void main(String[] args) {

        int ageOfCustomer = 18;
        boolean overCustomer = (ageOfCustomer >= 18) ? true : false;

        if(overCustomer) {
            System.out.println("He's age is ok: ");
        }

        double x = 20.00;
        double y = 80.00;
        double xy = (x + y) * 100;
        double z = xy % 40;

        boolean a = true;
        boolean b = false;

        if (z != 0) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }


    }


}
