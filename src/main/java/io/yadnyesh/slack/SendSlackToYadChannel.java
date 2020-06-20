package io.yadnyesh.slack;

public class SendSlackToYadChannel {

    public static void main(String[] args) {
        SlackMessage slackMessage = SlackMessage.builder()
                //.channel("the-channel-name")
                .username("yadnyeshJava")
                .text("just testing")
                .icon_emoji(":twice:")
                .build();
        SlackUtils.sendMessage(slackMessage);
    }
}
