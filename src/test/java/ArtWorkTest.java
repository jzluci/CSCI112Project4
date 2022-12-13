import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtWorkTest {

    @Test
    void emptyConstructor(){
        ArtWork a = new Pottery();
        assertNotNull(a);

        ArtWork b = new AssembledSculpture();
        assertNotNull(b);
    }


    @Test
    void setGalleryName() {
        ArtWork a = new Pottery();
        a.setGalleryName("a");
        assertEquals("a",a.getGalleryName());
        ArtWork b = new AssembledSculpture();
        b.setGalleryName("a");
        assertEquals("a",b.getGalleryName());
    }

    @Test
    void setGalleryLocation() {
        ArtWork a = new Pottery();
        a.setGalleryLocation("a");
        assertEquals("a",a.getGalleryLocation());
        ArtWork b = new AssembledSculpture();
        b.setGalleryLocation("a");
        assertEquals("a",b.getGalleryLocation());

    }

    @Test
    void setCurator() {
        ArtWork a = new AssembledSculpture();
        a.setCurator("a");
        assertEquals("a",a.getCurator());
        ArtWork b = new Pottery();
        b.setCurator("a");
        assertEquals("a",b.getCurator());
    }

    @Test
    void calculateCommission() {
        ArtWork a = new AssembledSculpture("","","","wood","", 2.0);
        assertEquals(1000,a.calculateCommission());
    }
}