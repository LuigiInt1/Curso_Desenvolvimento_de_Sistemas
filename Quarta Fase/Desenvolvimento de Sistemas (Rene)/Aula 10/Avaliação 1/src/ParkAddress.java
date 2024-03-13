public class ParkAddress {

    private String city;
    private String state;
    private String coutry;
    private String parkName;
    private Float latitude;
    private Float longitude;


    public ParkAddress() {

    }


    public ParkAddress(String city, String state, String coutry, String parkName, Float latitude, Float longitude) {
        this.city = city;
        this.state = state;
        this.coutry = coutry;
        this.parkName = parkName;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


    public String getCoutry() {
        return coutry;
    }


    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }


    public String getParkName() {
        return parkName;
    }


    public void setParkName(String parkName) {
        this.parkName = parkName;
    }


    public Float getLatitude() {
        return latitude;
    }


    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }


    public Float getLongitude() {
        return longitude;
    }


    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((coutry == null) ? 0 : coutry.hashCode());
        result = prime * result + ((parkName == null) ? 0 : parkName.hashCode());
        result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
        result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
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
        ParkAddress other = (ParkAddress) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (coutry == null) {
            if (other.coutry != null)
                return false;
        } else if (!coutry.equals(other.coutry))
            return false;
        if (parkName == null) {
            if (other.parkName != null)
                return false;
        } else if (!parkName.equals(other.parkName))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!latitude.equals(other.latitude))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!longitude.equals(other.longitude))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "ParkAddress [city=" + city + ", state=" + state + ", coutry=" + coutry + ", parkName=" + parkName
                + ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    

    

}
