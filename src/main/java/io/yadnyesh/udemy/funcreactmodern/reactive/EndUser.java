package io.yadnyesh.udemy.funcreactmodern.reactive;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EndUser implements Observer {
    String name;

    EndUser(String name, SubjectLibrary subject) {
        this.name = name;
        subject.subscribeObserver(this);
    }

    @Override
    public void update(String avail) {
        log.info("Hello " + name + "!, the book you were looking for is now available");
    }
}
