package soundsystem.mediaplayer;

import soundsystem.compactdisc.CompactDisc;

public interface MediaPlayer {
    void play();

    CompactDisc getCD();
}
