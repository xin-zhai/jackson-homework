package com.thoughtworks.capability.gtb.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serialized.LocalDateTimeDeserializer;
import com.thoughtworks.capability.gtb.serialized.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author itutry
 * @create 2020-05-21_16:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

    private String id;
    private String name;
    private EventType type;
    private LocalDateTime time;
    @JsonUnwrapped
    private UserVo user;
}
