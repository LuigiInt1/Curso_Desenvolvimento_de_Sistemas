import java.time.LocalDate;

public class FireSpot {
    private LocalDate start;
    private LocalDate end;
    private String cause;
    private Status status;
    private Identefication identefication;
    private Intensity intensity;
    private ParkAddress parkAddress;
    private User user;
    private Image image;
    private Sensor sensor;


    public FireSpot() {

    }


    public FireSpot(LocalDate start, LocalDate end, String cause, Status status, Identefication identefication,
            Intensity intensity, ParkAddress parkAddress, User user, Image image, Sensor sensor) {
        this.start = start;
        this.end = end;
        this.cause = cause;
        this.status = status;
        this.identefication = identefication;
        this.intensity = intensity;
        this.parkAddress = parkAddress;
        this.user = user;
        this.image = image;
        this.sensor = sensor;
    }


    public LocalDate getStart() {
        return start;
    }


    public void setStart(LocalDate start) {
        this.start = start;
    }


    public LocalDate getEnd() {
        return end;
    }


    public void setEnd(LocalDate end) {
        this.end = end;
    }


    public String getCause() {
        return cause;
    }


    public void setCause(String cause) {
        this.cause = cause;
    }


    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }


    public Identefication getIdentefication() {
        return identefication;
    }


    public void setIdentefication(Identefication identefication) {
        this.identefication = identefication;
    }


    public Intensity getIntensity() {
        return intensity;
    }


    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }


    public ParkAddress getParkAddress() {
        return parkAddress;
    }


    public void setParkAddress(ParkAddress parkAddress) {
        this.parkAddress = parkAddress;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public Image getImage() {
        return image;
    }


    public void setImage(Image image) {
        this.image = image;
    }


    public Sensor getSensor() {
        return sensor;
    }


    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((start == null) ? 0 : start.hashCode());
        result = prime * result + ((end == null) ? 0 : end.hashCode());
        result = prime * result + ((cause == null) ? 0 : cause.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((identefication == null) ? 0 : identefication.hashCode());
        result = prime * result + ((intensity == null) ? 0 : intensity.hashCode());
        result = prime * result + ((parkAddress == null) ? 0 : parkAddress.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        result = prime * result + ((image == null) ? 0 : image.hashCode());
        result = prime * result + ((sensor == null) ? 0 : sensor.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FireSpot other = (FireSpot) obj;
        if (start == null) {
            if (other.start != null)
                return false;
        } else if (!start.equals(other.start))
            return false;
        if (end == null) {
            if (other.end != null)
                return false;
        } else if (!end.equals(other.end))
            return false;
        if (cause == null) {
            if (other.cause != null)
                return false;
        } else if (!cause.equals(other.cause))
            return false;
        if (status != other.status)
            return false;
        if (identefication != other.identefication)
            return false;
        if (intensity != other.intensity)
            return false;
        if (parkAddress == null) {
            if (other.parkAddress != null)
                return false;
        } else if (!parkAddress.equals(other.parkAddress))
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        if (image == null) {
            if (other.image != null)
                return false;
        } else if (!image.equals(other.image))
            return false;
        if (sensor == null) {
            if (other.sensor != null)
                return false;
        } else if (!sensor.equals(other.sensor))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "FireSpot [start=" + start + ", end=" + end + ", cause=" + cause + ", status=" + status
                + ", identefication=" + identefication + ", intensity=" + intensity + ", parkAddress=" + parkAddress
                + ", user=" + user + ", image=" + image + ", sensor=" + sensor + "]";
    }

    

    
}