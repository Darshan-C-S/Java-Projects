package DesignPattren.AdapterDesignPattern;

public class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new AdvanceMediaPlayer();
        }
        if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new AdvanceMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }
        if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
    @Override
    public void record (String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.recordVlc(fileName);
        }
        if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.recordMp4(fileName);
        }
    }
}
