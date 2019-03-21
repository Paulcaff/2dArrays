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
                    "Friday"

            };
    private String [] time =
            {
                    "9 oclock",
                    "10 oclock",
                    "11 oclock",
                    "12 oclock",
                    "1 oclock",
                    "2 oclock",
                    "3 oclock",
                    "4 oclock",
                    "5 oclock"
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

        System.out.printf("%30s", "");
        for (int i = 0; i < time.length; i++){
            System.out.printf("%30s", time[i]);
        }
        System.out.println();


        // Print countries, counts, and row totals
        for (int i = 0; i < days.length; i++)
        {
            // Process the ith row
            System.out.printf("%30s", days[i]);


            // Print each row element and update the row total
            for (int j = 0; j < HOURS; j++)
            {
                System.out.printf("%30s", grid[i][j]);


            }
            System.out.println();

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

