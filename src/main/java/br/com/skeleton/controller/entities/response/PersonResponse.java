package br.com.skeleton.controller.entities.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonResponse {
    private String name;
}
