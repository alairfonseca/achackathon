package com.hackathon.scalitimes.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Pedro on 10/06/2017.
 */
public class CustomJsonDateDeserializer extends JsonDeserializer<LocalDateTime>
{
    @Override
    public LocalDateTime deserialize(JsonParser jsonparser,
                                     DeserializationContext deserializationcontext) throws IOException, JsonProcessingException {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        String date = jsonparser.getText();
            return LocalDateTime.parse(date, formatter);
    }

}
