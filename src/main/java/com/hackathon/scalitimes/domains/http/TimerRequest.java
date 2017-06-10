package com.hackathon.scalitimes.domains.http;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hackathon.scalitimes.util.CustomJsonDateDeserializer;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Created by Pedro on 10/06/2017.
 */
@Getter
@Setter
public class TimerRequest {

    @NotNull
    @JsonProperty("lat")
    private String latitute;

    @NotNull
    @JsonProperty("lng")
    private String longitude;

    @NotNull
    @JsonProperty("loc")
    private String locale;

    @NotNull
    @JsonProperty("date")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private LocalDateTime time;
}
