package TerrainAnalysis;

public class TerrainAnalysis {
    static int point= 1;

    public static int peaks(int peak[][]){
        int counter = 0;


        for (int i = 1; i < peak.length -1; i++)
        {
            // Process the ith row
            if(peak[i][point] > peak[i][point + 1] && peak[i][point] > peak[i][point - 1] ){

                if(peak[point][i] > peak[point + 1][i] && peak[point][i] > peak[point - 1][i] ){
                    counter++;
                }

            }

            //  each row element
            for (int j = 0; j < peak.length; j++)
            {
               // System.out.printf("%30s", grid[i][j]);


            }
            System.out.println();

        }


        return counter;
    }

}
