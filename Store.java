import java.util.ArrayList;

public class Store
{
    private ArrayList<Record> records = new ArrayList<Record>();

    /**
     * Constructor for objects of class Store
     */
    public Store()
    {
        Record r1 = new Record(1);
        r1.setArtist("U2");
        r1.setAlbum("Free spam");
        r1.setTracks(10);
        
        Record r2 = new Record(1);
        r2.setArtist("CO320");
        r2.setAlbum("Tunes");
        r2.setTracks(4);
        
        records.add(r1);
        records.add(r2);
    }

    public boolean test() {
        boolean correct = true;
        
        correct = correct && records.get(0).getArtist().equals("U2");
        correct = correct && records.get(0).getAlbum().equals("Free spam");
        correct = correct && records.get(0).getTracks() == 10;
        correct = correct && records.get(1).getArtist().equals("CO320");
        correct = correct && records.get(1).getAlbum().equals("Tunes");
        correct = correct && records.get(1).getTracks() == 4;
        
        return correct;
    }
    
    public boolean testChallenge() {
        boolean correct = true;
        
        correct = correct && records.get(0).challenge().equals("Free spam by U2");
        correct = correct && records.get(1).challenge().equals("Tunes by CO320");
        
        return correct;
    }
}
