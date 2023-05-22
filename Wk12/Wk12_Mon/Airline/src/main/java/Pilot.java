public class Pilot {
    private String name;
    private String rank;
    private String licenseNumber;

    public Pilot(String name, String rank, String licenseNumber) {
        this.name = name;
        this.rank = rank;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String flyPlane() {
        return "Flying the plane.";
    }
}