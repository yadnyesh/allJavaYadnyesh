package io.yadnyesh.yt.streams.olehdokula;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.security.PublicKey;

public class ArrayPublisher<T> implements Publisher<T> {
    @Override
    public void subscribe(Subscriber<? super T> subscriber) {
        //subscriber.onSubscribe();
    }

    
}
