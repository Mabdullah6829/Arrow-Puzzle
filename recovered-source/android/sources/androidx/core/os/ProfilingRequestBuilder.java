package androidx.core.os;

import android.os.Bundle;
import androidx.core.os.ProfilingRequestBuilder;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public abstract class ProfilingRequestBuilder<T extends ProfilingRequestBuilder<T>> {
    private android.os.CancellationSignal mCancellationSignal;
    private String mTag;

    public final ProfilingRequest build() {
        return new ProfilingRequest(getProfilingType(), getParams(), this.mTag, this.mCancellationSignal);
    }

    public abstract Bundle getParams();

    public abstract int getProfilingType();

    public abstract T getThis();

    public final T setCancellationSignal(android.os.CancellationSignal cancellationSignal) {
        AbstractC6452k.m12181e(cancellationSignal, "cancellationSignal");
        this.mCancellationSignal = cancellationSignal;
        return (T) getThis();
    }

    public final T setTag(String tag) {
        AbstractC6452k.m12181e(tag, "tag");
        this.mTag = tag;
        return (T) getThis();
    }
}
