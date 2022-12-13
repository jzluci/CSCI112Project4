import java.util.Random;

public class AssembledSculpture extends ArtWork{

    private Artist artist;
    private String medium;
    private String name;
    private double size;
    private String tag;

    public AssembledSculpture() {
        medium = "";
        name = "";
        size = 0.0;
        artist = new Artist();
    }

    public AssembledSculpture(String galleryName, String galleryLocation, String curator,  String medium, String name, double size) {
        super.setGalleryName(galleryName);
        super.setGalleryName(galleryLocation);
        super.setCurator(curator);
        this.medium = medium;
        this.name = name;
        this.size = size;
        artist = new Artist();
    }

    @Override
    public void generateTag() {
        tag =  (int)((Math.random()*(99-20))+20) + "-"+ getGalleryName().substring(0,3)+ (int)((Math.random()*(799-150))+150) + "-"+(int)((Math.random()*(5000-2500))+2500);
        System.out.println(tag);
    }

    @Override
    public void artistInfo(String name, int age, String city, String state) {
        artist.setName(name);
        artist.setAge(age);
        artist.setCity(city);
        artist.setState(state);

    }

    @Override
    public void printArtInfo() {
        super.printArtInfo();
        generateTag();
        System.out.println(toString());
        System.out.println("Commission = $" + calculateCommission());
    }

    @Override
    public double calculateCommission() {
        double price = 0.0;
        if (size < 1){
            if (medium.equals("wood")){
                price = 625.00;
            }
            else if (medium.equals("plastic")) {
                price = 200.00;
            }
            else {
                price = 125;
            }
        }
        else if(size<3){
            if (medium.equals("wood")){
                price = 1000.00;
            }
            else if (medium.equals("plastic")) {
                price = 575.00;
            }
            else {
                price = 500.00;
            }
        }
        else {
            if (medium.equals("wood")){
                price = 1500.00;
            }
            else if (medium.equals("plastic")) {
                price = 1075.00;
            }
            else {
                price = 1000.00;
            }
        }


        return price;
    }

    @Override
    public String toString() {
        return "Assembled Sculpture{" +
                "artist=" + artist +
                ", medium='" + medium + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + "ft"+'\'' +
                ", tag='" + tag + '\'' +
                '}';
    }

    public Artist getArtist() {
        return artist;
    }

    public String getMedium() {
        return medium;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getTag() {
        return tag;
    }
}
