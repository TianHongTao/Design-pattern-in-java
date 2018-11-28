package 适配器模式;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing clv file. Nmae : "+fileName);
    }

    @Override
    public void palyMp4(String fileName) {

    }
}
