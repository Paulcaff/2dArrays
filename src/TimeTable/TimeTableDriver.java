package TimeTable;

public class TimeTableDriver {
    public static void main(String[] args) {

        TimeTable timetable = new TimeTable();
        ClassDetails classtime1 = new ClassDetails("Algorithims","R204");
        ClassDetails classtime2 = new ClassDetails("Maths","R306");
        ClassDetails classtime3 = new ClassDetails("Scripting","R206");
        ClassDetails classtime4 = new ClassDetails("Client Side ","R204");
        ClassDetails classtime5 = new ClassDetails("Software Testing","T306");
        ClassDetails classtime6 = new ClassDetails("Software Engineering","T306");

        timetable.set(0,0, classtime1);
        timetable.set(2,1, classtime2);
        timetable.set(4,5, classtime3);
        timetable.set(3,6, classtime4);
        timetable.set(1,1, classtime5);
        timetable.set(0,7, classtime6);

        timetable.display();

    }
}
