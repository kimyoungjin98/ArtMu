package com.malcom.artmu.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Data{
    private String id = "";
    private String name = "";
    private String content = "";
    private String img = "../assets/뚱이.jpeg";
}
