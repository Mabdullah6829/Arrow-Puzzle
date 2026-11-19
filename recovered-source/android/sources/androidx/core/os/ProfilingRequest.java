package androidx.core.os;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class ProfilingRequest {
    private final android.os.CancellationSignal cancellationSignal;
    private final Bundle params;
    private final int profilingType;
    private final String tag;

    public ProfilingRequest(int i2, Bundle params, String str, android.os.CancellationSignal cancellationSignal) {
        AbstractC6452k.m12181e(params, "params");
        this.profilingType = i2;
        this.params = params;
        this.tag = str;
        this.cancellationSignal = cancellationSignal;
    }

    public final android.os.CancellationSignal getCancellationSignal() {
        return this.cancellationSignal;
    }

    public final Bundle getParams() {
        return this.params;
    }

    public final int getProfilingType() {
        return this.profilingType;
    }

    public final String getTag() {
        return this.tag;
    }
}
