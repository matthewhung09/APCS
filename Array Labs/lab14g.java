public class lab14g
{
    public static void main(String[] args)
    {
        int[] list = {1, 1, 1, 2, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 4, 4, 4, 6};
        int[] storage = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int count = 0;
        int groupSize = 1;

        for(int i = 1; i < list.length; i++)
        {
            if(list[i] == list[i - 1])
            {
                groupSize++;
            }

            else
            {
                count++;
                if(groupSize > 0)
                {
                    for(int j = 0; j < groupSize; j++)
                    {
                        storage[j] = storage[j] + 1;
                    }
                }
                groupSize = 1;
            }
        }

        if(groupSize > 0)
        {
            for(int j = 0; j < groupSize; j++)
            {
                storage[j] = storage[j] + 1;
            }
        }      

        for(int k = 0; k < storage.length; k++)
            System.out.println("size " + (k + 1) + " count == " + storage[k]);
    }
}