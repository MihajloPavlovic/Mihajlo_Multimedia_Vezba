
package media;


public class Television {
    
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn = false;

    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int newCurrentProgram) {
        this.currentProgram = newCurrentProgram;
    }
    
    public boolean getTurnOn() {
        return this.turnOn;
    }
    
    public void setTurnOn(boolean turnOff) {
        this.turnOn = turnOff;
    }
    
    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;
    }
    
    public void printAttributes() {
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Current program: " + this.getCurrentProgram());
        System.out.println("Turn on: " + this.getTurnOn());
    }
}
