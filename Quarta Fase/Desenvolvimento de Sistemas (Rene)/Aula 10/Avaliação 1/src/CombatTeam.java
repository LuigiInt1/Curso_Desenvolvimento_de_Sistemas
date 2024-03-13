public class CombatTeam {

    private Integer numberMembers;
    private ParkAddress parkAddress;
    private User user;

    

    public CombatTeam() {

    }


    public CombatTeam(Integer numberMembers, ParkAddress parkAddress, User user) {
        this.numberMembers = numberMembers;
        this.parkAddress = parkAddress;
        this.user = user;
    }


    public Integer getNumberMembers() {
        return numberMembers;
    }


    public void setNumberMembers(Integer numberMembers) {
        this.numberMembers = numberMembers;
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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numberMembers == null) ? 0 : numberMembers.hashCode());
        result = prime * result + ((parkAddress == null) ? 0 : parkAddress.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
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
        CombatTeam other = (CombatTeam) obj;
        if (numberMembers == null) {
            if (other.numberMembers != null)
                return false;
        } else if (!numberMembers.equals(other.numberMembers))
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
        return true;
    }


    @Override
    public String toString() {
        return "CombatTeam [numberMembers=" + numberMembers + ", parkAddress=" + parkAddress + ", user=" + user + "]";
    }



    

    

    
}
