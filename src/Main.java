public class Main {
    //findHorseSpace
    public int findHorseSpace(String name)
    {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null) {
                if (spaces[i].getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }
    //Consolidate
    public void consolidate()
    {
        Horse [] temp = new Horse[spaces.length];
        int tempIndex = 0;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null) {
                temp[tempIndex] = spaces[i];
                tempIndex++;
            }
        }
        spaces = temp;
    }





    //PRACTICE FRQS
    /** Updates the Flower objects contained in flowerInventory, as described in part (a)
     *
     *  Precondition: newInventory has the same flower names in the same positions
     *                as flowerInventory.
     *  Postcondition: newInventory is unchanged.
     */
    public void updateInventory(Flower[] newInventory)
    {
        for (int i = 0; i < flowerInventory.length; i++) {
            flowerInventory[i].setQuantity(flowerInventory[i].getQuantity + newInventory[i].getQuantity);
        }
    }

    /** Returns true if the top n flowers by quantity in stock at the flower shop are the
     *  same as the top n flowers by quantity in stock in otherInventory, as described
     *  in part (b)
     *
     *  Precondition: n is less than or equal to the lengths of flowerInventory and
     *                 otherInventory.
     *  Postcondition: flowerInventory and otherInventory are unchanged.
     */
    public boolean topNSame(int n, Flower[] otherInventory)
    {
        Flower [] SortedInventory = sortByQuantity(flowerInventory);
        Flower [] otherSortedInventory = sortByQuantity(otherInventory);
        for (int i  = 0; i < n; i++) {
            if (!sortedInventory[i].getName().equals(otherSortedInventory[i].getName())) {
                return false;
            }
        }
        return true;
    }


    /*
    PART C ONLY NEEDS METHOD HEADER AND EXPLANATION OF WHAT YOU ARE GOING TO DO

    public String getMostExpensiveFlower(){}

    New private variable in Flower.java that stores the price of the specific flower (double)
    New getter and mutator methods in Flower.java to get/change the price of the flower
    New local variable maxPrice that stores a double value to represent the current max price(set to 0 when initiated)
    New local variable maxPriceFlowerIndex that stores an integer value to store the index of the flower that has the most expensive price
    Use a for loop to iterate through flowerInventory and takes the price of each flower in the array and sets maxPrice to the price of the flower if the flower is more expensive. Also sets maxPriceFlowerIndex to the index of the flower if it is more expensive than maxPrice.
    Returns the name of the flower at flowerInventory[maxPriceFlowerIndex]
    */
    public static void main(String[] args) {

    }
}