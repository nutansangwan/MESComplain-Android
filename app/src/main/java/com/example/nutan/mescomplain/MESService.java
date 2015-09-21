package com.example.nutan.mescomplain;

import rx.Observable;

/**
 * Created by nutan on 9/21/15.
 */
public class MESService extends Observable<MESService> {
    /**
     * Creates an Observable with a Function to execute when it is subscribed to.
     * <p>
     * <em>Note:</em> Use {@link #create(OnSubscribe)} to create an Observable, instead of this constructor,
     * unless you specifically have a need for inheritance.
     *
     * @param f {@link OnSubscribe} to be executed when {@link #subscribe(Subscriber)} is called
     */
    protected MESService(OnSubscribe<MESService> f) {
        super(f);
    }


}
