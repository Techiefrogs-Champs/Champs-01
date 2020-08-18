package src.ControlStatement;

public class SwitchStatement {
    public static void main(String[] args)
{
        int instrument = 4;
        String musicInstrument;
        switch (instrument) {
        case 1:
        musicInstrument = "Guitar";
        break;
        case 2:
        musicInstrument = "Piano";
        break;
        case 3:
        musicInstrument = "Drums";
        break;
        case 4:
        musicInstrument = "Flute";
        break;
        case 5:
        musicInstrument = "Ukelele";
        break;
        case 6:
        musicInstrument = "Violin";
        break;
        case 7:
        musicInstrument = "Trumpet";
        break;
        default:
        musicInstrument = "Invalid";
        break;
        }
        System.out.println(musicInstrument);



        int day = 3; 
        String dayName; 
        switch (day) { 
        case 1: 
        dayName = "Today is Monday"; 
                    break; 
                case 2: 
        dayName = "Today is Tuesday"; 
                    break; 
                case 3: 
        dayName = "Today is Wednesday"; 
                    break; 
                case 4: 
        dayName = "Today is Thursday"; 
                    break; 
                case 5: 
        dayName = "Today is Friday"; 
                    break; 
                case 6: 
        dayName = "Today is Saturday"; 
                    break; 
                case 7: 
        dayName = "Today is Sunday"; 
                    break; 
                default: 
        dayName = "Invalid day"; 
                    break; 
                } 
        System.out.println(dayName); 

        }
}