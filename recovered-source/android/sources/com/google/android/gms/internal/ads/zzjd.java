package com.google.android.gms.internal.ads;

import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjd {

    /* JADX INFO: renamed from: a */
    public int f20076a;

    /* JADX INFO: renamed from: b */
    public int f20077b;

    /* JADX INFO: renamed from: c */
    public int f20078c;

    /* JADX INFO: renamed from: d */
    public int f20079d;

    /* JADX INFO: renamed from: e */
    public int f20080e;

    /* JADX INFO: renamed from: f */
    public int f20081f;

    /* JADX INFO: renamed from: g */
    public int f20082g;

    /* JADX INFO: renamed from: h */
    public int f20083h;

    /* JADX INFO: renamed from: i */
    public int f20084i;

    /* JADX INFO: renamed from: j */
    public int f20085j;

    /* JADX INFO: renamed from: k */
    public long f20086k;

    /* JADX INFO: renamed from: l */
    public int f20087l;

    /* JADX INFO: renamed from: a */
    public final synchronized void m8609a() {
    }

    public final String toString() {
        int i2 = this.f20076a;
        int i3 = this.f20077b;
        int i4 = this.f20078c;
        int i5 = this.f20079d;
        int i6 = this.f20080e;
        int i7 = this.f20081f;
        int i8 = this.f20082g;
        int i9 = this.f20083h;
        int i10 = this.f20084i;
        int i11 = this.f20085j;
        long j2 = this.f20086k;
        int i12 = this.f20087l;
        String str = zzfm.f16091a;
        Locale locale = Locale.US;
        StringBuilder sbM409q = AbstractC0271e0.m409q("DecoderCounters {\n decoderInits=", i2, ",\n decoderReleases=", i3, "\n queuedInputBuffers=");
        sbM409q.append(i4);
        sbM409q.append("\n skippedInputBuffers=");
        sbM409q.append(i5);
        sbM409q.append("\n renderedOutputBuffers=");
        sbM409q.append(i6);
        sbM409q.append("\n skippedOutputBuffers=");
        sbM409q.append(i7);
        sbM409q.append("\n droppedBuffers=");
        sbM409q.append(i8);
        sbM409q.append("\n droppedInputBuffers=");
        sbM409q.append(i9);
        sbM409q.append("\n maxConsecutiveDroppedBuffers=");
        sbM409q.append(i10);
        sbM409q.append("\n droppedToKeyframeEvents=");
        sbM409q.append(i11);
        sbM409q.append("\n totalVideoFrameProcessingOffsetUs=");
        sbM409q.append(j2);
        sbM409q.append("\n videoFrameProcessingOffsetCount=");
        sbM409q.append(i12);
        sbM409q.append("\n}");
        return sbM409q.toString();
    }
}
