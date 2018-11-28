package 适配器模式;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("Vlc"))
            advancedMediaPlayer = new VlcPlayer();
        else if(audioType.equalsIgnoreCase("Mp4"))
            advancedMediaPlayer = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("Vlc"))
            advancedMediaPlayer.playVlc(fileName);
        else if (audioType.equalsIgnoreCase("Mp4"))
            advancedMediaPlayer.palyMp4(fileName);
    }
}
