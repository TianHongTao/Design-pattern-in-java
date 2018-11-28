package 适配器模式;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("Mp3"))
            System.out.println("Playing mp3 filr. Name : "+fileName);
        else if(audioType.equalsIgnoreCase("Vlc") || audioType.equalsIgnoreCase("Mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else{
            System.out.println("Invalid media. " + audioType +" format not supported");
        }
    }
}
