/**
 * OK_JavaGoInHome
 */
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OK_JavaGoInHome_input {
    public static void main(String[] args) {
        System.out.println(args[0]);
        String id = args[0];
        String bright = args[1];
        

        // Elevator call
        Elevator myElevator=new Elevator(id);
        myElevator.callForUp(1);
        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();        
        // Light on
        Lighting hallLamp = new Lighting(id+ "/ Hall Lamp");
        hallLamp.on();
        Lighting floorLamp = new Lighting(id+" / Floor Lamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+" / MoodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }
}