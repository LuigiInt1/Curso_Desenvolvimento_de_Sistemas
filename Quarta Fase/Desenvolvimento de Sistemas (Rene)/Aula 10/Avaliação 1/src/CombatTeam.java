import java.util.List;

public class CombatTeam {

    private Integer numberMembers;
    private ParkAddress parkAddress;
    private List <User> users;

    

    public CombatTeam() {

    }



    public CombatTeam(Integer numberMembers, ParkAddress parkAddress, List<User> users) {
        this.numberMembers = numberMembers;
        this.parkAddress = parkAddress;
        this.users = users;
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



    public List<User> getUsers() {
        return users;
    }



    public void setUsers(List<User> users) {
        this.users = users;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numberMembers == null) ? 0 : numberMembers.hashCode());
        result = prime * result + ((parkAddress == null) ? 0 : parkAddress.hashCode());
        result = prime * result + ((users == null) ? 0 : users.hashCode());
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
        if (users == null) {
            if (other.users != null)
                return false;
        } else if (!users.equals(other.users))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "CombatTeam [numberMembers=" + numberMembers + ", parkAddress=" + parkAddress + ", users=" + users + "]";
    }

    
    



    

    

    
}
