package Task1;

public class TV {

    private boolean tvOn = false;
    private int volume;
    private int channel;


    public int setChannel (int setChannel){
        if (tvOn) {
            channel = setChannel;
            System.out.println ("You are now watching channel " + setChannel + ".");
        } else {
            System.out.println ("Please turn on the TV to watch a channel.");
        }
        return setChannel;
    }

    public int setVolume (int setVolume){
        if (tvOn) {
            volume = setVolume;
            System.out.println ("The volume is now at " + setVolume + "%.");
        } else {
            System.out.println  ("Please turn on the TV to increase or decrease the volume.");
        }
        return setVolume;
    }

    public boolean turnOff(){
        tvOn = false;
        System.out.println ("The TV is gonna turn OFF. Bye bye.");
        return false;
    }

    public boolean turnOn(){
        tvOn = true;
        System.out.println ("Your TV is now ON. Welcome.");
        return true;
    }

    public int channelUp() {
        if (tvOn) {
            channel++;
            System.out.println ("You are watching channel " + channel + ".");
        } else {
            System.out.println ("Please turn on the TV to watch a channel.");
        }
        return channel;
    }

    public int channelDown() {
        if (tvOn) {
            channel--;
            System.out.println ("You are now watching channel " + channel + ".");
        } else {
            System.out.println ("Please turn on the TV to watch a channel.");
        }
        return channel;
    }


    public int volumeUp(){
        if (tvOn) {
            volume++;
            System.out.println ("The volume is at " + volume + "%.");
        } else {
            System.out.println ("Please turn on the TV to increase the volume.");
        }
        return volume;
    }

    public int volumeDown(){
        if (tvOn) {
            volume--;
            System.out.println ("The volume is at " + volume + "%.");
        } else {
            System.out.println ("Please turn on the TV to decrease the volume.");
        }
        return volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }
}
