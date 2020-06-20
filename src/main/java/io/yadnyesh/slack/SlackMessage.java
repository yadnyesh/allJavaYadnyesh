package io.yadnyesh.slack;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(builderClassName = "Builder")
public class SlackMessage {
    private String username;
    private String text;
    private String icon_emoji;
}
