package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6447f;

/* JADX INFO: loaded from: classes.dex */
public abstract class State<T> {
    private final int version;

    public /* synthetic */ State(int i2, AbstractC6447f abstractC6447f) {
        this(i2);
    }

    public final int getVersion() {
        return this.version;
    }

    private State(int i2) {
        this.version = i2;
    }
}
