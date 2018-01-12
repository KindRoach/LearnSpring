package soundsystem.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import soundsystem.compactdisc.BlankDisc;
import soundsystem.compactdisc.CompactDisc;
import soundsystem.compactdisc.SgtPeppers;
import soundsystem.mediaplayer.CDPlayer;
import soundsystem.mediaplayer.MediaPlayer;

@Configuration
@PropertySource("classpath:cd.properties")
public class CDPlayerConfig {
    @Bean
    public CompactDisc blankDic(
            @Value("${disc.title}") String tile,
            @Value("${disc.artist}") String artist) {
        return new BlankDisc(tile, artist);
    }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCd(compactDisc);
        return cdPlayer;
    }
}