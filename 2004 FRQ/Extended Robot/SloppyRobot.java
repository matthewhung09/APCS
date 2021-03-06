public class SloppyRobot extends Robot
{
    private int trashNumber;

    public SloppyRobot()
    {
        trashNumber = 0;
    }
    public void move()
    {
        if (trashNumber > 0 && trashNumber % 3 == 0)
        {
            getHall()[getPosition()] = getHall()[getPosition()] + 1;
            System.out.println("oops");
        }
        if(getHall()[(getPosition())] > 0)
        {
            getHall()[getPosition()] = getHall()[getPosition()] - 1;
            trashNumber++;
        }
        if(getHall()[getPosition()] == 0)
        {
            if(forwardMoveBlocked())
            {
                setDirection(!getDirection());
            }
            else
            {
                if (getDirection())
		            setPosition(getPosition() + 1);
		        else
                    setPosition(getPosition() - 1);
                trashNumber++;
            }
        }
    }
}