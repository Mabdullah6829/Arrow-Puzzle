package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes2.dex */
final class zzsi {

    /* JADX INFO: renamed from: a */
    public final zzsh f20743a;

    /* JADX INFO: renamed from: b */
    public final int f20744b;

    /* JADX INFO: renamed from: c */
    public final zzth f20745c;

    /* JADX INFO: renamed from: d */
    public int f20746d;

    /* JADX INFO: renamed from: e */
    public long f20747e;

    /* JADX INFO: renamed from: f */
    public long f20748f;

    /* JADX INFO: renamed from: g */
    public long f20749g;

    /* JADX INFO: renamed from: h */
    public long f20750h;

    /* JADX INFO: renamed from: i */
    public long f20751i;

    public zzsi(AudioTrack audioTrack, zzth zzthVar) {
        this.f20743a = new zzsh(audioTrack);
        this.f20744b = audioTrack.getSampleRate();
        this.f20745c = zzthVar;
        m8848a(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m8848a(int i2) {
        this.f20746d = i2;
        long j2 = WorkRequest.MIN_BACKOFF_MILLIS;
        if (i2 == 0) {
            this.f20749g = 0L;
            this.f20750h = -1L;
            this.f20751i = -9223372036854775807L;
            this.f20747e = System.nanoTime() / 1000;
        } else {
            if (i2 == 1) {
                this.f20748f = WorkRequest.MIN_BACKOFF_MILLIS;
                return;
            }
            j2 = (i2 == 2 || i2 == 3) ? 10000000L : 500000L;
        }
        this.f20748f = j2;
    }
}
