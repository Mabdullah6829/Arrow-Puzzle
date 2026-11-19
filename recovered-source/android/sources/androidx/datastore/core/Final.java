package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class Final<T> extends State<T> {
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        AbstractC6452k.m12181e(finalException, "finalException");
        this.finalException = finalException;
    }

    public final Throwable getFinalException() {
        return this.finalException;
    }
}
