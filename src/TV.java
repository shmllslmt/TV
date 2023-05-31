public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
        this.on = true;
        this.channel = 1;
        this.volumeLevel = 30;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOf() {
        this.on = false;
    }

    public void setChannel(int newChannel) {
        this.channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        this.volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        this.channel--;
    }

    public void volumeUp() {
        this.volumeLevel++;
    }

    public void volumeDown() {
        this.volumeLevel--;
    }
}
