package soundsystem.mediaplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soundsystem.compactdisc.CompactDisc;

public class CDPlayer implements MediaPlayer {
    public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    private CompactDisc cd;

    public void play() {
        cd.play();
    }

    public CompactDisc getCD() {
        return cd;
    }
}