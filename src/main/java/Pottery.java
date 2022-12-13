public class Pottery extends ArtWork {

    private Artist artist;
    private String kind; //type of material
    private String design;
    private String tag;

    public Pottery(){
        kind= "";
        design="";
        artist = new Artist();


    }

    public Pottery(String design, String kind,String curator, String galleryName, String galleryLocation){
        super.setGalleryName(galleryName);
        super.setGalleryName(galleryLocation);
        super.setCurator(curator);
        this.kind = kind;
        this.design = design;
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
    public String toString() {
        return "Pottery{" +
                "artist=" + artist +
                ", kind='" + kind + '\'' +
                ", design='" + design + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }

    @Override
    public double calculateCommission() {
        double price = 0.0;
        if (design.equals("mug")){
            if (kind.equals("earthenware")){
                price = 115.00;
            }
            else if (kind.equals("porcelain")) {
                price = 35.00;
            }
            else {
                price = 15.00;
            }
        }
        else if (design.equals("plate")) {
            if (kind.equals("earthenware")){
                price = 125.00;
            }
            else if (kind.equals("porcelain")) {
                price = 45.00;
            }
            else {
                price = 25.00;
            }

        }
        else if (design.equals("vases")) {
            if (kind.equals("earthenware")){
                price = 140.00;
            }
            else if (kind.equals("porcelain")) {
                price = 60.00;
            }
            else {
                price = 40.00;
            }

        }

        return price;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getKind() {
        return kind;
    }

    public String getDesign() {
        return design;
    }

    public String getTag() {
        return tag;
    }
}
