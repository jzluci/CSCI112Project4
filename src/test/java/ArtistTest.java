import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {

    @Test
    void empty(){
        Artist a = new Artist();
        assertNotNull(a);
    }

    @Test
    void name(){
        Artist a = new Artist("a",0,"","");
        assertEquals("a",a.getName());

    }

    @Test
    void age(){
        Artist a = new Artist("",3,"","");
        assertEquals(3,a.getAge());

    }

    @Test
    void city(){
        Artist a = new Artist("",0,"c","");
        assertEquals("c",a.getCity());

    }
    @Test
    void state(){
        Artist a = new Artist("",0,"","z");
        assertEquals("z",a.getState());

    }

    @Test
    void setName() {
        Artist a = new Artist();
        a.setName("a");
        assertEquals("a",a.getName());

    }

    @Test
    void setAge() {
        Artist a = new Artist();
        a.setAge(3);
        assertEquals(3,a.getAge());
    }

    @Test
    void setCity() {
        Artist a = new Artist();
        a.setCity("a");
        assertEquals("a",a.getCity());
    }

    @Test
    void setState() {Artist a = new Artist();
        a.setState("a");
        assertEquals("a",a.getState());

    }
}