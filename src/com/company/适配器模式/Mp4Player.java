package 适配器模式;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void palyMp4(String fileName) {
        System.out.println("Playing Mp4 filr. Name : "+fileName);
    }
}
