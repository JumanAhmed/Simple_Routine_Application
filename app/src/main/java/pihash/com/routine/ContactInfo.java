package pihash.com.routine;

/**
 * Created by Juman on 1/17/2016.
 */
public class ContactInfo {


    private String classN;
    private String time;
    private String roomNo;
    private String feculty;


    public ContactInfo(String classN, String time, String roomNo, String feculty) {
        this.classN = classN;
        this.time = time;
        this.roomNo = roomNo;
        this.feculty = feculty;
    }

    public String getClassN() {
        return classN;
    }

    public void setClassN(String classN) {
        this.classN = classN;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getFeculty() {
        return feculty;
    }

    public void setFeculty(String feculty) {
        this.feculty = feculty;
    }
}
