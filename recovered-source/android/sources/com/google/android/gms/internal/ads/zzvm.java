package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface zzvm {
    /* JADX INFO: renamed from: A */
    void mo8909A(int i2);

    /* JADX INFO: renamed from: R */
    ByteBuffer mo8910R(int i2);

    /* JADX INFO: renamed from: a */
    int mo8911a();

    /* JADX INFO: renamed from: b */
    void mo8912b(ArrayList arrayList);

    /* JADX INFO: renamed from: c */
    MediaFormat mo8913c();

    /* JADX INFO: renamed from: d */
    void mo8914d(Bundle bundle);

    /* JADX INFO: renamed from: e */
    default void mo8915e(Runnable runnable) {
        ((zzvt) runnable).run();
    }

    /* JADX INFO: renamed from: f */
    void mo8916f(Surface surface);

    /* JADX INFO: renamed from: g */
    void mo8917g(int i2, zziu zziuVar, long j2, int i3);

    /* JADX INFO: renamed from: h */
    int mo8918h(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: i */
    void mo8919i(int i2);

    /* JADX INFO: renamed from: j */
    void mo8920j();

    /* JADX INFO: renamed from: k */
    default boolean mo8921k(zzvl zzvlVar) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    ByteBuffer mo8922l(int i2);

    /* JADX INFO: renamed from: m */
    void mo8923m(int i2, int i3, int i4, long j2);

    /* JADX INFO: renamed from: n */
    void mo8924n(int i2, long j2);

    void zzk();

    void zzl();
}
