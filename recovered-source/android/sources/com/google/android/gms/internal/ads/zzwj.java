package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwj implements zzvm {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f21213a;

    /* JADX INFO: renamed from: b */
    public final zzvi f21214b;

    public zzwj(MediaCodec mediaCodec, zzvi zzviVar) {
        this.f21213a = mediaCodec;
        this.f21214b = zzviVar;
        if (Build.VERSION.SDK_INT < 35 || zzviVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = zzviVar.f21104b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            zzgtr.m7133f(zzviVar.f21103a.add(mediaCodec));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: A */
    public final void mo8909A(int i2) {
        this.f21213a.releaseOutputBuffer(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: R */
    public final ByteBuffer mo8910R(int i2) {
        return this.f21213a.getOutputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: a */
    public final int mo8911a() {
        return this.f21213a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: b */
    public final void mo8912b(ArrayList arrayList) {
        this.f21213a.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: c */
    public final MediaFormat mo8913c() {
        return this.f21213a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: d */
    public final void mo8914d(Bundle bundle) {
        this.f21213a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: f */
    public final void mo8916f(Surface surface) {
        this.f21213a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: g */
    public final void mo8917g(int i2, zziu zziuVar, long j2, int i3) {
        this.f21213a.queueSecureInputBuffer(i2, 0, zziuVar.f20044i, j2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: h */
    public final int mo8918h(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f21213a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: i */
    public final void mo8919i(int i2) {
        this.f21213a.setVideoScalingMode(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: j */
    public final void mo8920j() {
        this.f21213a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: l */
    public final ByteBuffer mo8922l(int i2) {
        return this.f21213a.getInputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: m */
    public final void mo8923m(int i2, int i3, int i4, long j2) {
        this.f21213a.queueInputBuffer(i2, 0, i3, j2, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: n */
    public final void mo8924n(int i2, long j2) {
        this.f21213a.releaseOutputBuffer(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() {
        this.f21213a.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl() {
        zzvi zzviVar = this.f21214b;
        MediaCodec mediaCodec = this.f21213a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && i2 < 33) {
                mediaCodec.stop();
            }
            if (i2 >= 35 && zzviVar != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && zzviVar != null) {
                zzviVar.m8942b(mediaCodec);
            }
            mediaCodec.release();
        }
    }
}
