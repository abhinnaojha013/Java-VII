public class Threader
{
    public static void main(String[] args)
    {
        ThreaderClass1 threaderClass1 = new ThreaderClass1();
        Thread thread1 = new Thread(threaderClass1);

        ThreaderClass2 threaderClass2 = new ThreaderClass2();
        Thread thread2 = new Thread(threaderClass2);

        thread1.start();
        thread2.start();
    }
}

class ThreaderClass1 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try
            {
                System.out.print(i + ", ");
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreaderClass2 implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            for (int i = 99; i >= 90; i--)
            {
                System.out.print(i + ", ");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

    }
}
