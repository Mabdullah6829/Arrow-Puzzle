package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class DataBufferRef {

    /* JADX INFO: renamed from: a */
    public int f4386a;

    public final boolean equals(Object obj) {
        return (obj instanceof DataBufferRef) && Objects.m3535a(Integer.valueOf(((DataBufferRef) obj).f4386a), Integer.valueOf(this.f4386a)) && Objects.m3535a(0, 0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4386a), 0, null});
    }
}
