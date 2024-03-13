import java.time.LocalDate;

public class Image {

    private String filename;
    private LocalDate date;
    private String sateliteName;


    public Image() {

    }


    public Image(String filename, LocalDate date, String sateliteName) {
        this.filename = filename;
        this.date = date;
        this.sateliteName = sateliteName;
    }


    public String getFilename() {
        return filename;
    }


    public void setFilename(String filename) {
        this.filename = filename;
    }


    public LocalDate getDate() {
        return date;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }


    public String getSateliteName() {
        return sateliteName;
    }


    public void setSateliteName(String sateliteName) {
        this.sateliteName = sateliteName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((filename == null) ? 0 : filename.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((sateliteName == null) ? 0 : sateliteName.hashCode());
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
        Image other = (Image) obj;
        if (filename == null) {
            if (other.filename != null)
                return false;
        } else if (!filename.equals(other.filename))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (sateliteName == null) {
            if (other.sateliteName != null)
                return false;
        } else if (!sateliteName.equals(other.sateliteName))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Image [filename=" + filename + ", date=" + date + ", sateliteName=" + sateliteName + "]";
    }

    

    

}
