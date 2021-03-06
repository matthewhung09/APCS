public class InsertSort
{
    public static void main(String[] args)
    {
        int[] theArray = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(theArray);

        for(int j = 0; j < theArray.length; j++)
            System.out.print(theArray[j] + "  ");
        System.out.println(" ");
    }

    public static void sort(int[] a)
    {
        int itemToInsert, j;
        boolean keepGoing;
        for (int k = 1; k < a.length; k++)
        {
            itemToInsert = a[k];
            j = k - 1;
            keepGoing = true;
            
            while ((j >= 0) && keepGoing)
            {
                if (itemToInsert < a[j])
                {
                    a[j+1] = a[j];
                    j--;
                    if (j == -1)
                        a[0] = itemToInsert;
                }
                else
                {
                    keepGoing = false;
                    a[j+1] = itemToInsert;
                }
            }
        }
    }
}