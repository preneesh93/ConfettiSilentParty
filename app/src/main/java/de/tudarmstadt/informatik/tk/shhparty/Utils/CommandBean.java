package de.tudarmstadt.informatik.tk.shhparty.utils;

/**
 * Created by Ashwin on 3/5/2017.
 */

public class CommandBean {

    private String command;
    private long startPosition;
    private String URL;
    private long trackLength;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public long getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(long startPosition) {
        this.startPosition = startPosition;
    }

    public long getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(long trackLength) {
        this.trackLength = trackLength;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
