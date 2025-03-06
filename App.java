public class App {
    public static void main(String[] args)
    {
        SmartTv tv = new SmartTv();

        tv.TvState(true);

        System.out.println(tv.VolumeSound);
        System.out.println(tv.Channel);
        tv.increaseVolume(true, 10);
        tv.decreaseChannel(true, 100);
        System.out.println(tv.VolumeSound);
        System.out.println(tv.Channel);
    }
}
