package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhn extends PushbackInputStream {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbhq f7864s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbhn(zzbhq zzbhqVar, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f7864s = zzbhqVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7864s.f7873u.m4890a();
        super.close();
    }
}
