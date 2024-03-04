package chapter06recursion;

public class Recursion0NumCells {
    public static void main(String[] args) {
        System.out.println(numCells3(4,1));
    }
    /**
     * Wrapping method for numCells3 recursive method
     * @param generations number of generations to create
     * @param cells initial number of cells
     * @return the number of cells after generations
     */
    public static int numCells3(int generations, int cells){

        return numCells3(1,generations,cells,0,0);
    }
    /**
     * Recursive function calculates number of cells after getTarget generations
     * Here cells die after 3 generations
     * @param genCurrent The current generation we are at
     * @param genTerget The number of generations we let the cells multiply
     * @param gen0 number of cells of age 0 (newborn cells)
     * @param gen1 number of cells of age 1
     * @param gen2 number of cells of age 2
     * @return the number of cells that will be in the colony at getTarget generation
     */
    public static int numCells3(int genCurrent, int genTerget, int gen0, int gen1, int gen2){
        if(genTerget == genCurrent) return gen0 + gen1 + gen2;
        else
            return numCells3(genCurrent + 1, genTerget,
                gen0 + gen1 + gen2, gen0, gen1);
    }

    /**
     * Wrapping method for numCells2 recursive method
     * @param generations number of generations to create
     * @param cells initial number of cells
     * @return the number of cells after generations
     */
    public static int numCells2(int generations, int cells){

        return numCells2(1,generations,cells,0);
    }

    /**
     * Recursive function calculates number of cells after getTarget generations
     * Here cells die after 2 generations
     * @param genCurrent The current generation we are at
     * @param genTerget The number of generations we let the cells multiply
     * @param gen0 number of cells of age 0 (newborn cells)
     * @param gen1 number of cells of age 1
     * @return the number of cells that will be in the colony at getTarget generation
     */
    public static int numCells2(int genCurrent, int genTerget, int gen0, int gen1){
        if(genTerget == genCurrent) return gen0 + gen1;
        else
            return numCells2(genCurrent + 1, genTerget,
                gen0 + gen1, gen0);
    }

}
