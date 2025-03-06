public class SmartTv {
    public int Channel=500, VolumeSound=70;
    public boolean on=false;

    public void TvState(boolean value)
    {
        this.on = value;

        if (value)
            System.out.println("The Tv is on");
        else
            System.out.println("The Tv is off");
    }


    public void increaseChannel(boolean repeat, int repeatNum)
    {
        if (this.on)
            if (repeat)
                for (var i = 0; i < repeatNum; i++)
                {
                    this.Channel++;
                }
            else
                this.Channel++;
        else
            System.out.println("The Tv is off");
    }

    public void decreaseChannel(boolean repeat, int repeatNum)
    {
        if (this.on)
            if (repeat)
                for (var i = 0; i < repeatNum; i++)
                {
                    this.Channel--;
                }
            else
                this.Channel--;
        else
            System.out.println("The Tv is off");
    }

    public void increaseVolume(boolean repeat, int repeatNum)
    {
        if (this.on)
            if (repeat)
                for (var i = 0; i < repeatNum; i++)
                {
                    this.VolumeSound++;
                }
            else
                this.VolumeSound++;
        else
            System.out.println("The Tv is off");
    }

    public void decreaseVolume(boolean repeat, int repeatNum)
    {
        if (this.on)
            if (repeat)
                for (var i = 0; i < repeatNum; i++)
                {
                    this.VolumeSound--;
                }
            else
                this.VolumeSound--;
        else
            System.out.println("The Tv is off");
    }
}