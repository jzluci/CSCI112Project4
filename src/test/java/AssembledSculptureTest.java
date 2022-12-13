import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssembledSculptureTest {

    @Test
    void empty(){
        AssembledSculpture a = new AssembledSculpture();
        assertNotNull(a);
    }

    @Test
    void galleryName(){
        AssembledSculpture a = new AssembledSculpture("a","","","","",0);
        assertEquals("a",a.getGalleryName());
    }

    @Test
    void galleryLocation(){
        AssembledSculpture a = new AssembledSculpture("","a","","","",0);
        assertEquals("a",a.getGalleryLocation());

    }

    @Test
    void curator(){
        AssembledSculpture a = new AssembledSculpture("","","a","","",0);
        assertEquals("a",a.getCurator());

    }

    @Test
    void medium(){
        AssembledSculpture a = new AssembledSculpture("","","","a","",0);
        assertEquals("a", a.getMedium());

    }

    @Test
    void name(){
        AssembledSculpture a = new AssembledSculpture("","","","","a",0);
        assertEquals("a", a.getName());

    }

    @Test
    void size(){
        AssembledSculpture a = new AssembledSculpture("a","","","","",1);
        assertEquals(1,a.getSize());

    }

    @Test
    void generateTag() {
        AssembledSculpture p = new AssembledSculpture();
        p.setGalleryName("MET");
        p.generateTag();
        assertNotNull(p.getTag());
    }

    @Test
    void artistInfoName() {
        AssembledSculpture p = new AssembledSculpture();
        p.artistInfo("a",1,"b","c");
        assertEquals("a",p.getArtist().getName());
    }

    @Test
    void artistInfoAge() {
        AssembledSculpture p = new AssembledSculpture();
        p.artistInfo("a",1,"b","c");
        assertEquals(1,p.getArtist().getAge());
    }

    @Test
    void artistInfoCity() {
        AssembledSculpture p = new AssembledSculpture();
        p.artistInfo("a",1,"b","c");
        assertEquals("b",p.getArtist().getCity());
    }

    @Test
    void artistInfoState() {
        AssembledSculpture p = new AssembledSculpture();
        p.artistInfo("a",1,"b","c");
        assertEquals("c",p.getArtist().getState());
    }

    @Test
    void calculateCommission() {
        AssembledSculpture a = new AssembledSculpture("","","","wood","", 2.0);
        assertEquals(1000,a.calculateCommission());
    }
}