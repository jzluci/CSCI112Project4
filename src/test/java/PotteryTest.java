import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotteryTest {

    @Test
    void empty(){
        Pottery p = new Pottery();
        assertNotNull(p);
    }

    @Test
    void design(){
        Pottery p = new Pottery("a","","","","");
        assertEquals("a",p.getDesign());
    }

    @Test
    void kind(){
        Pottery p = new Pottery("","a","","","");
        assertEquals("a",p.getKind());
    }

    @Test
    void curator(){
        Pottery p = new Pottery("","","a","","");
        assertEquals("a",p.getCurator());
    }

    @Test
    void galleryName(){
        Pottery p = new Pottery("","","","met","");
        assertEquals("met",p.getGalleryName());
    }

    @Test
    void galleryLocation(){
        Pottery p = new Pottery("","","","","a");
        assertEquals("a",p.getGalleryLocation());
    }



    @Test
    void generateTag() {
        Pottery p = new Pottery();
        p.setGalleryName("MET");
        p.generateTag();
        assertNotNull(p.getTag());
    }

    @Test
    void artistInfoName() {
        Pottery p = new Pottery();
        p.artistInfo("a",1,"b","c");
        assertEquals("a",p.getArtist().getName());
    }
    @Test
    void artistInfoAge() {
        Pottery p = new Pottery();
        p.artistInfo("a",1,"b","c");
        assertEquals(1,p.getArtist().getAge());
    }
    @Test
    void artistInfoCity() {
        Pottery p = new Pottery();
        p.artistInfo("a",1,"b","c");
        assertEquals("b",p.getArtist().getCity());
    }
    @Test
    void artistInfoState() {
        Pottery p = new Pottery();
        p.artistInfo("a",1,"b","c");
        assertEquals("c",p.getArtist().getState());
    }

    @Test
    void calculateCommission() {
        Pottery p = new Pottery("mug","earthenware","","","");
        assertEquals(115,p.calculateCommission());

    }
}