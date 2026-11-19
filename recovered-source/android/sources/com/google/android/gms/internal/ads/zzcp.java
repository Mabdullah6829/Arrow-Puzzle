package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public interface zzcp {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f10655a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: a */
    void mo5714a();

    /* JADX INFO: renamed from: b */
    ByteBuffer mo5715b();

    /* JADX INFO: renamed from: c */
    boolean mo5716c();

    /* JADX INFO: renamed from: d */
    void mo5717d(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: e */
    default long mo5718e(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: f */
    zzcl mo5719f(zzcl zzclVar);

    /* JADX INFO: renamed from: g */
    default void mo5720g(zzcn zzcnVar) {
        zzh();
        throw null;
    }

    boolean zzc();

    default void zzh() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    void zzj();
}
