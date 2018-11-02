public class Main
{
    public static int WorkEffort;

    public static void main(String[] args)
    {
        calcWorkEffort(100);
        calcWorkEffort(50);
        calcWorkEffort(20);
        calcWorkEffort(360);
        calcWorkEffort(80);
        calcWorkEffort(160);
        calcWorkEffort(500);
        calcWorkEffort(240);
        calcWorkEffort(40);
        calcWorkEffort(40);

        System.out.println();
        calcPercent(8,3,40);
        calcPercent(9,3,40);
        calcPercent(10,3,40);
        calcPercent(11,3,40);
        calcPercent(8,4,40);
        calcPercent(8,5,40);
        calcPercent(8,6,40);
        System.out.println();

        calcPercent(8,3,35);
        calcPercent(9,3,35);
        calcPercent(10,3,35);
        calcPercent(11,3,35);
        calcPercent(8,4,35);
        calcPercent(8,5,35);
        calcPercent(8,6,35);
        System.out.println();

        calcPercent(8,3,30);
        calcPercent(9,3,30);
        calcPercent(10,3,30);
        calcPercent(11,3,30);
        calcPercent(8,4,30);
        calcPercent(8,5,30);
        calcPercent(8,6,30);
        System.out.println();
    }

    public static int calcWorkEffort(int time)
    {
        WorkEffort = WorkEffort + time;
        return WorkEffort;
    }

    public static void calcPercent(int engineers,int length,int hours)
    {
        double capacity=WorkEffort/(double)(engineers * length * hours);
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.0f%% of capacity\n",engineers, length, hours, capacity*100);
    }
}