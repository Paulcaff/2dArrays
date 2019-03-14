package TimeTable;

public class ClassDetails {


   private String name ;
   private String room ;

    public ClassDetails(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(String room) {
        this.room = room;
    }


    public String toString() {
        return " name = " + name +" room = " + room;
    }
}


