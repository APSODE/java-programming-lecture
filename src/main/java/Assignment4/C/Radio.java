package Assignment4.C;

import java.util.ArrayList;
import java.util.Calendar;

public class Radio {
    private ArrayList<RadioStation> stations = new ArrayList<>();
    private boolean power = false;
    private int currentChannel = 0;
    private Calendar currentTime = Calendar.getInstance();

    public Radio() {
    }

    public static Radio createRadio() {
        return new Radio();
    }


    public ArrayList<RadioStation> getStations() {
        return stations;
    }

    public RadioStation getCurrentStation() {
        return this.stations.get(this.currentChannel);
    }

    public void addStation(RadioStation station) {
        this.stations.add(station);
    }

    public boolean isPower() {
        return power;
    }

    public void offPower() {
        this.power = false;
    }

    public void onPower() {
        this.power = true;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public boolean setCurrentChannel(int currentChannel) {
        boolean status = true;
        if (currentChannel <= this.stations.size() - 1) {
            this.currentChannel = currentChannel;
        } else {
            status = false;
        }

        return status;
    }

    public void editCurrentTime(Calendar newCurrentTime) {
        this.currentTime = newCurrentTime;
    }

    public void showCurrentOnAirProgram() {
        RadioStation station = this.getCurrentStation();
        if (station.getProgram().isOnAir(this.currentTime)) {
            System.out.println("지금 [" + station.getName() + "] 방송국에서 " +
                    "[" + station.getProgram().getName() + "] 송출중!");
        } else {
            System.out.println("지금 [" + station.getName() + "] 방송국에서 " +
                    "송출중인 프로그램이 없습니다...");
        }

    }
}
