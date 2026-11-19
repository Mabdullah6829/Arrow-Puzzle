package androidx.core.os;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class JavaHeapDumpRequestBuilder extends ProfilingRequestBuilder<JavaHeapDumpRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public int getProfilingType() {
        return 1;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public JavaHeapDumpRequestBuilder getThis() {
        return this;
    }

    public final JavaHeapDumpRequestBuilder setBufferSizeKb(int i2) {
        this.mParams.putInt("KEY_SIZE_KB", i2);
        return this;
    }
}
