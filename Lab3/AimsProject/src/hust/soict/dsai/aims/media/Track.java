package hust.soict.dsai.aims.media;

public class Track implements Playable
{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play()
    {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Track track) {
            return track.getTitle().equals(this.title) && track.getLength() == this.length;
        }
        else {
            return false;
        }
    }
}