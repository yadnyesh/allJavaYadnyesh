package io.yadnyesh.yt.devdojo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
class Anime {
    private String title;
    private String studio;
    private int episodes;
}