package DesignPattren.AdapterDesignPattern;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }

    @Override
    public void record(String audioType , String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Recording mp3 file. Name : "+ fileName);
        }else if(audioType.equalsIgnoreCase("vlc")|| audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.record(audioType,fileName);
        }else {
            System.out.println("Invalid media. "+audioType+" format not supported ");
        }
    }

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.record("mp3", "song.mp3");
        audioPlayer.play("mp3", "song.mp3");

        audioPlayer.record("mp4", "movie.mp4");
        audioPlayer.play("mp4", "movie.mp4");

        audioPlayer.record("vlc", "clip.vlc");
        audioPlayer.play("vlc", "clip.vlc");

        audioPlayer.record("avi", "video.avi");
        audioPlayer.play("vlc", "clip.vlc");
    }
}