package DesignPattren.AdapterDesignPattern;

public class AdvanceMediaPlayer {
    public void playVlc(String fileName){
        System.out.println("Playing VLC File name : "+fileName);
    }

    public void playMp4(String fileName){
        System.out.println("Playing Mp4 File name : "+fileName);
    }

    public void recordVlc(String fileName){System.out.println("Recording VLC File name : "+fileName);}

    public void recordMp4(String fileName){
        System.out.println("Recording Mp4 File name : "+fileName);
    }
}

