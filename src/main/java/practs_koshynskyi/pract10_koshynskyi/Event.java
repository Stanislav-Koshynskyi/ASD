package practs_koshynskyi.pract10_koshynskyi;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
@AllArgsConstructor
@Getter
public class Event {
    private String title;
    private LocalDateTime startTime;
    private ZoneOffset zone;
    private Duration minuteDuration;
    private String track;
    public LocalDateTime end(){
        return startTime.plus(minuteDuration);
    }
    public String getLable() {
        return "Title: " + title + ", track: " + track;
    }
    @Override
    public String toString(){
        return getLable();
    }
}

