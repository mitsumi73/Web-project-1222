package com.project.capstone.data;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
public class Trace {
    private String conceptName;
    private Map<String, String> attributes;
}
