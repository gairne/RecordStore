public class Record
{
    private String artist;
    private String album;
    private int numberTracks;
    private int recordID;

    /**
     * Constructor for objects of class Record
     */
    public Record(int id)
    {
        recordID = id;
    }
    
    public int getRecordID() {
        return recordID;
    }
    
    public void setArtist(String artistName) {
        //Exercise 1: Write the code for this method, to write artistName into the artist field
        
        //Code here
    }
    
    public String getArtist() {
        return artist;
    }
    
    public int getTracks() {
        return numberTracks;
    }

    //Exercise 2: Write a similar method to setArtist called 'setTracks' which instead sets the numberTracks field.
    //Exercise 3: Do the same for 'setAlbum'
    
    //Exercise 4: Write a method 'getAlbum' that returns the album name
    
    
   public String challenge() {
    /**
     * Exercise 5: Challenge exercise: Write a method 'challenge' that returns a String with the artist
         concatenated with the album name. For example, a record with artist "Matthew" and album
         "Programming tunes" should return "Programming tunes by Matthew"
    */
     //Code here
   
     //Adding this line so this file compiles:
     return ""; //(change this)
   }
}
