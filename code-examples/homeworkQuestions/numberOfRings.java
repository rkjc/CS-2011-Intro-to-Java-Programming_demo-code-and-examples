package homeworkQuestions;

public class numberOfRings {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        // output number of rings in 2D array assingment

        int rows = 10;
        int cols = 9;

        // get smaller dimention
        int minDim = Math.min(rows, cols);
        int numOfRings = 0;

        if(minDim == 5 || minDim == 6){
            numOfRings = 3;
        } else if(minDim == 7 || minDim == 8){
            numOfRings = 4;
        } else if(minDim == 9 || minDim == 10){
            numOfRings = 5;
        } else {
            numOfRings = -1;
        }


        System.out.println("min= " + minDim);
        System.out.println("number of rings= " + numOfRings);


        System.out.println("-------- program ended ---------");
    } 
}
