package androidx.core.os;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class SystemTraceRequestBuilder extends ProfilingRequestBuilder<SystemTraceRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public int getProfilingType() {
        return 4;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public SystemTraceRequestBuilder getThis() {
        return this;
    }

    public final SystemTraceRequestBuilder setBufferFillPolicy(BufferFillPolicy bufferFillPolicy) {
        AbstractC6452k.m12181e(bufferFillPolicy, "bufferFillPolicy");
        this.mParams.putInt("KEY_BUFFER_FILL_POLICY", bufferFillPolicy.getValue$core_release());
        return this;
    }

    public final SystemTraceRequestBuilder setBufferSizeKb(int i2) {
        this.mParams.putInt("KEY_SIZE_KB", i2);
        return this;
    }

    public final SystemTraceRequestBuilder setDurationMs(int i2) {
        this.mParams.putInt("KEY_DURATION_MS", i2);
        return this;
    }
}
