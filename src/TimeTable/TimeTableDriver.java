package TimeTable;

public class TimeTableDriver {
    public static void main(String[] args) {

        TimeTable timetable = new TimeTable();
        ClassDetails classtime1 = new ClassDetails("Algorithims","R204");
        ClassDetails classtime2 = new ClassDetails("Maths","R306");

        timetable.set(0,0, classtime1);
        timetable.set(2,1, classtime2);

        timetable.display();

    }
}
