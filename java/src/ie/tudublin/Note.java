package ie.tudublin;

public class Note
{
    private String note;
    private int duration;

    //constructor method
    public Note(String note, int duration)
    {
        this.note = note;
        this.duration = duration;
    }

    //Getter and setter
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //to string method
    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }
    
    
}
