package soundsystem.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import soundsystem.compactdisc.CompactDisc;
import soundsystem.compactdisc.SgtPeppers;
import soundsystem.mediaplayer.CDPlayer;
import soundsystem.mediaplayer.MediaPlayer;

@Configuration
@ImportResource("/CDPlayer.xml")
public class CDPlayerConfig {
    @Bean
    public MediaPlayer cdPlayer(@Qualifier("sgtPeppers") CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCd(compactDisc);
        return cdPlayer;
    }
}