package TimeTable;

public class TimeTable {

    private final int DAYS = 5;
    private final int HOURS = 9 ;  // 9 hours per day

    private String[] days =
            {
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday",
                    "Saturday",
                    "Sunday"
            };
    private String [] time =
            {
                    "1 oclock",
                    "2 oclock",
                    "3 oclock",
                    "4 oclock",
                    "5 oclock",
                    "6 oclock",
                    "7 oclock",
                    "8 oclock",
                    "9 oclock"
            };

    private ClassDetails[][] grid;

    public TimeTable(){
        grid = new ClassDetails[DAYS][HOURS];
        // the grid will have null values
    }

    public void set(int day, int hour, ClassDetails details) {
        // store details at the specified position in the grid
        grid[day][hour] = details;
    }

    public void display() {
        // display the grid
        // Print headings

        System.out.printf("%15s", "");
        for (int i = 0; i < days.length; i++){
            System.out.printf("%15s", days[i]);
        }
        System.out.println();

        // Print countries, counts, and row totals
        for (int i = 0; i < time.length; i++)
        {
            // Process the ith row
            System.out.printf("%15s", time[i]);

            // Print each row element and update the row total
            for (int j = 0; j < HOURS; j++)
            {
                System.out.printf("%15s", grid[i][j]);

            }
        }
    }

//    public TimeTable.TimeTable.ClassDetails get(int day, int hour) {
//        // returns the object at the specified position in the grid
//    }
//
//    public int getNumberOfClassesFor(String name) //e.g. get number of Algorithms classes
//}
//
//    public int getNumberOfFreeSlots(){
//    }
}

