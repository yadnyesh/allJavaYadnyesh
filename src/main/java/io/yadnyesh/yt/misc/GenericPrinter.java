package io.yadnyesh.yt.misc;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class GenericPrinter <T> {

    private T thingToPrint;

    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        log.info(thingToPrint.toString());
    }
}
