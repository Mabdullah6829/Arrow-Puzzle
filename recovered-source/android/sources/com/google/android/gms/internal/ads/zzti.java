package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class zzti {

    /* JADX INFO: renamed from: a */
    public final zzth f20851a;

    /* JADX INFO: renamed from: b */
    public final zzdp f20852b;

    /* JADX INFO: renamed from: c */
    public final long[] f20853c;

    /* JADX INFO: renamed from: d */
    public final AudioTrack f20854d;

    /* JADX INFO: renamed from: e */
    public final int f20855e;

    /* JADX INFO: renamed from: f */
    public final long f20856f;

    /* JADX INFO: renamed from: g */
    public final boolean f20857g;

    /* JADX INFO: renamed from: h */
    public final zzsi f20858h;

    /* JADX INFO: renamed from: i */
    public final float f20859i;

    /* JADX INFO: renamed from: j */
    public long f20860j;

    /* JADX INFO: renamed from: k */
    public long f20861k;

    /* JADX INFO: renamed from: l */
    public long f20862l;

    /* JADX INFO: renamed from: m */
    public Method f20863m;

    /* JADX INFO: renamed from: n */
    public long f20864n;

    /* JADX INFO: renamed from: o */
    public long f20865o;

    /* JADX INFO: renamed from: p */
    public long f20866p;

    /* JADX INFO: renamed from: q */
    public long f20867q;

    /* JADX INFO: renamed from: r */
    public long f20868r;

    /* JADX INFO: renamed from: s */
    public int f20869s;

    /* JADX INFO: renamed from: t */
    public int f20870t;

    /* JADX INFO: renamed from: u */
    public long f20871u;

    /* JADX INFO: renamed from: v */
    public long f20872v;

    /* JADX INFO: renamed from: w */
    public long f20873w;

    /* JADX INFO: renamed from: x */
    public long f20874x;

    /* JADX INFO: renamed from: y */
    public long f20875y;

    /* JADX INFO: renamed from: z */
    public long f20876z;

    public zzti(zzth zzthVar, zzdp zzdpVar, AudioTrack audioTrack, int i2, int i3, int i4) {
        this.f20851a = zzthVar;
        this.f20852b = zzdpVar;
        this.f20854d = audioTrack;
        try {
            this.f20863m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f20853c = new long[10];
        this.f20876z = -9223372036854775807L;
        this.f20875y = -9223372036854775807L;
        this.f20858h = new zzsi(audioTrack, zzthVar);
        int sampleRate = audioTrack.getSampleRate();
        this.f20855e = sampleRate;
        boolean zM6502d = zzfm.m6502d(i2);
        this.f20857g = zM6502d;
        this.f20856f = zM6502d ? zzfm.m6520v(sampleRate, i4 / i3) : -9223372036854775807L;
        this.f20867q = 0L;
        this.f20868r = 0L;
        this.f20871u = -9223372036854775807L;
        this.f20872v = -9223372036854775807L;
        this.f20865o = 0L;
        this.f20864n = 0L;
        this.f20859i = 1.0f;
        this.f20860j = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m8865a(long j2) {
        long j3 = this.f20860j;
        if (j3 == -9223372036854775807L || j2 < j3) {
            return;
        }
        long jRound = j2 - j3;
        String str = zzfm.f16091a;
        float f2 = this.f20859i;
        if (f2 != 1.0f) {
            jRound = Math.round(jRound / ((double) f2));
        }
        final long jZza = this.f20852b.zza() - zzfm.m6518t(jRound);
        this.f20860j = -9223372036854775807L;
        zztb zztbVar = ((zzsu) this.f20851a).f20769a;
        zzeg zzegVar = zztbVar.f20829i;
        zzegVar.getClass();
        if (Thread.currentThread() == zzegVar.f13832a) {
            zzeg zzegVar2 = zztbVar.f20829i;
            zzegVar2.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzst
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj) {
                    ((zzqv) obj).mo8844e(jZza);
                }
            });
            zzegVar2.m6198d();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m8866b(long j2) {
        long jM6523y;
        int i2 = this.f20870t;
        int i3 = this.f20855e;
        if (i2 == 0) {
            jM6523y = this.f20871u != -9223372036854775807L ? zzfm.m6520v(i3, m8868d()) : zzfm.m6520v(i3, m8867c());
        } else {
            jM6523y = zzfm.m6523y(j2 + this.f20861k, this.f20859i);
        }
        long jMax = Math.max(0L, jM6523y - this.f20864n);
        return this.f20871u != -9223372036854775807L ? Math.min(zzfm.m6520v(i3, this.f20874x), jMax) : jMax;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX INFO: renamed from: c */
    public final long m8867c() {
        if (this.f20871u != -9223372036854775807L) {
            return Math.min(this.f20874x, m8868d());
        }
        long jZzb = this.f20852b.zzb();
        if (jZzb - this.f20866p >= 5) {
            AudioTrack audioTrack = this.f20854d;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.f20867q > playbackHeadPosition) {
                        this.f20868r++;
                    }
                    this.f20867q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f20867q <= 0 || playState != 3) {
                    this.f20872v = -9223372036854775807L;
                    if (this.f20867q > playbackHeadPosition) {
                        this.f20868r++;
                    }
                    this.f20867q = playbackHeadPosition;
                } else if (this.f20872v == -9223372036854775807L) {
                    this.f20872v = jZzb;
                }
            }
            this.f20866p = jZzb;
        }
        return this.f20867q + (this.f20868r << 32);
    }

    /* JADX INFO: renamed from: d */
    public final long m8868d() {
        if (this.f20854d.getPlayState() == 2) {
            return this.f20873w;
        }
        return this.f20873w + zzfm.m6521w(zzfm.m6523y(zzfm.m6519u(this.f20852b.zzb()) - this.f20871u, this.f20859i), this.f20855e, 1000000L, RoundingMode.UP);
    }
}
