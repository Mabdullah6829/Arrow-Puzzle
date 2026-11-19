package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC6447f;

/* JADX INFO: loaded from: classes.dex */
public final class AtomicInt {
    private final AtomicInteger delegate;

    public AtomicInt(int i2) {
        this.delegate = new AtomicInteger(i2);
    }

    public final int decrementAndGet() {
        return this.delegate.decrementAndGet();
    }

    public final int get() {
        return this.delegate.get();
    }

    public final int getAndIncrement() {
        return this.delegate.getAndIncrement();
    }

    public final int incrementAndGet() {
        return this.delegate.incrementAndGet();
    }

    public /* synthetic */ AtomicInt(int i2, int i3, AbstractC6447f abstractC6447f) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
