/*
Name: James Zachary Luci
Current Date: 11/2/2022
Sources Consulted: Referenced lecture notes and labs. Talked with my classmate Jaysun to work through some of the logic and decision making.
We did not copy or share code.

By submitting this work, I attest that it is my original work and that I did
not violate the University of Mississippi academic policies set forth in the
M book.
*/

import java.util.ArrayList;

public class DriverP4 {

    public static void main(String[] args) {
        ArrayList<ArtWork> artWorks= new ArrayList<ArtWork>();
        System.out.println("Welcome to the Art Gallery Database");

        artWorks.add(new Pottery("mug","ceramic", "Bob Jones","Met", "New York City, New York"));
        artWorks.get(0).artistInfo("Harold Gregory",24,"Seattle","Washington");

        artWorks.add(new Pottery("mug","porcelain","Madison Brown","Met","New York City, New York"));
        artWorks.get(1).artistInfo("Harold Gregory",24,"Seattle","Washington");

        artWorks.add(new Pottery("vase","earthenware","Ian Harris","MOMA","Manhattan, New York"));
        artWorks.get(2).artistInfo("Franco Harris",50,"Pittsburgh","Pennsylvania");

        artWorks.add(new Pottery("vase","ceramic","Ian Harris","MOMA","Manhattan, New York"));
        artWorks.get(3).artistInfo("Terry Bradshaw",75,"Dallas","Texas");

        artWorks.add(new Pottery("plate","porcelain","Lynn Swann","LACMA","Los Angeles, California"));
        artWorks.get(4).artistInfo("Troy Polamalu",43,"Honolulu","Hawaii");

        artWorks.add(new AssembledSculpture("MET","New York City, New York","Gregory Hines","wood","Walk Through the Glen",.8));
        artWorks.get(5).artistInfo("Pablo Piastri",31,"Denver","Colorado");

        artWorks.add(new AssembledSculpture("MET","New York City, New York","Gregory Hines","plastic","What Does It All Mean?",2.4));
        artWorks.get(6).artistInfo("Nikolas Magnussen",35,"Paris","France");

        artWorks.add(new AssembledSculpture("LACMA","Los Angeles, California","Brendad Fraser","rubber","Tree Plant",1.8));
        artWorks.get(7).artistInfo("Max Wonderwood",27,"Oslo","Norway");

        artWorks.add(new AssembledSculpture("LACMA","Los Angeles, California","Brendad Fraser","wood","Bear-Man",6.1));
        artWorks.get(8).artistInfo("Pablo Piastri",31,"Denver","Colorado");

        artWorks.add(new AssembledSculpture("MOMA","Manhattan, New York","Jake Long","metal","Armageddon",4.1));
        artWorks.get(9).artistInfo("Zach Zayne",23,"Los Angeles","California");

        for (int i =0; i<artWorks.size(); i++){
            artWorks.get(i).printArtInfo();
            System.out.println();
        }


        System.out.println("Thank you and have a nice day!");





    }
}
