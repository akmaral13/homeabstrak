import java.util.Arrays;

public class farm {
    private String address;
    private Cow[]cows;
    private Horse[]horses;
    private Sheep[]sheep;
    private String owerName;

    public farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String owerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.owerName = owerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwerName() {
        return owerName;
    }

    public void setOwerName(String owerName) {
        this.owerName = owerName;
    }

    @Override
    public String toString() {
        return "farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", owerName='" + owerName + '\'' +
                '}';
    }
}
