public abstract class ArtWork implements ArtTag {

    protected final double COMMISSION_FEE = 0.30;
    private String galleryName;
    private String galleryLocation;
    private String curator;

    public ArtWork(){
        galleryName = "";
        galleryLocation = "";
        curator = "";
    }


    public void setGalleryName(String galleryName) {
        this.galleryName = galleryName;
    }

    public void setGalleryLocation(String galleryLocation) {
        this.galleryLocation = galleryLocation;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public String getGalleryName() {
        return galleryName;
    }

    public String getGalleryLocation() {
        return galleryLocation;
    }

    public String getCurator() {
        return curator;
    }

    public abstract void artistInfo(String name, int age, String city, String state);

    public void printArtInfo(){
        System.out.println(galleryName + " located in: " + galleryLocation);
        System.out.println("and curated by: " + curator);
        System.out.println("Is honored to present the following art piece:");
    }

    public double calculateCommission(){
        return 0.0;
    }
}
