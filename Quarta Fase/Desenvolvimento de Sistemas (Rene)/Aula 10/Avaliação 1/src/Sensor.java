public class Sensor {

    private Float longitude;
    private Float latitude;
    private SensorStatus sensorStatus;
    private String name;


    public Sensor() {

    }


    public Sensor(Float longitude, Float latitude, SensorStatus sensorStatus, String name) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.sensorStatus = sensorStatus;
        this.name = name;
    }


    public Float getLongitude() {
        return longitude;
    }


    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }


    public Float getLatitude() {
        return latitude;
    }


    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }


    public SensorStatus getSensorStatus() {
        return sensorStatus;
    }


    public void setSensorStatus(SensorStatus sensorStatus) {
        this.sensorStatus = sensorStatus;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
        result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
        result = prime * result + ((sensorStatus == null) ? 0 : sensorStatus.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Sensor other = (Sensor) obj;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!longitude.equals(other.longitude))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!latitude.equals(other.latitude))
            return false;
        if (sensorStatus != other.sensorStatus)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Sensor [longitude=" + longitude + ", latitude=" + latitude + ", sensorStatus=" + sensorStatus
                + ", name=" + name + "]";
    }

    

    

}
