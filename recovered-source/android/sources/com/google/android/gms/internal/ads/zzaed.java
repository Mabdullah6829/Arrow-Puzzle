package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaed {

    /* JADX INFO: renamed from: b */
    public final Context f5082b;

    /* JADX INFO: renamed from: c */
    public zzadz f5083c;

    /* JADX INFO: renamed from: d */
    public boolean f5084d;

    /* JADX INFO: renamed from: e */
    public Surface f5085e;

    /* JADX INFO: renamed from: g */
    public float f5087g;

    /* JADX INFO: renamed from: h */
    public float f5088h;

    /* JADX INFO: renamed from: k */
    public long f5091k;

    /* JADX INFO: renamed from: l */
    public long f5092l;

    /* JADX INFO: renamed from: m */
    public long f5093m;

    /* JADX INFO: renamed from: n */
    public long f5094n;

    /* JADX INFO: renamed from: o */
    public long f5095o;

    /* JADX INFO: renamed from: p */
    public long f5096p;

    /* JADX INFO: renamed from: q */
    public long f5097q;

    /* JADX INFO: renamed from: r */
    public long f5098r;

    /* JADX INFO: renamed from: s */
    public long f5099s;

    /* JADX INFO: renamed from: a */
    public final zzacz f5081a = new zzacz();

    /* JADX INFO: renamed from: f */
    public float f5086f = -1.0f;

    /* JADX INFO: renamed from: i */
    public float f5089i = 1.0f;

    /* JADX INFO: renamed from: j */
    public int f5090j = 0;

    public zzaed(Context context) {
        this.f5082b = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m4042a() {
        this.f5093m = 0L;
        this.f5097q = -1L;
        this.f5094n = -1L;
        this.f5091k = 0L;
        this.f5092l = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m4043b() {
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.f5085e == null) {
            return;
        }
        zzacz zzaczVar = this.f5081a;
        if (!zzaczVar.f4949a.m3970b()) {
            f2 = this.f5086f;
        } else if (zzaczVar.f4949a.m3970b()) {
            zzacy zzacyVar = zzaczVar.f4949a;
            long j2 = zzacyVar.f4945e;
            f2 = (float) (1.0E9d / (j2 != 0 ? zzacyVar.f4946f / j2 : 0L));
        } else {
            f2 = -1.0f;
        }
        float f3 = this.f5087g;
        if (f2 != f3) {
            if (f2 != -1.0f && f3 != -1.0f) {
                float f4 = 1.0f;
                if (zzaczVar.f4949a.m3970b()) {
                    if ((zzaczVar.f4949a.m3970b() ? zzaczVar.f4949a.f4946f : -9223372036854775807L) >= 5000000000L) {
                        f4 = 0.1f;
                    }
                }
                if (Math.abs(f2 - this.f5087g) < f4) {
                    return;
                }
            } else if (f2 == -1.0f && zzaczVar.f4953e < 30) {
                return;
            }
            this.f5087g = f2;
            m4044c(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX INFO: renamed from: c */
    public final void m4044c(boolean z) {
        Surface surface;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f5085e) == null || this.f5090j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.f5084d) {
            float f3 = this.f5087g;
            if (f3 != -1.0f) {
                f2 = f3 * this.f5089i;
            } else {
                f2 = 0.0f;
            }
        } else {
            f2 = 0.0f;
        }
        if (z || this.f5088h != f2) {
            this.f5088h = f2;
            try {
                this.f5085e.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                zzeh.m6214f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4045d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f5085e) == null || this.f5090j == Integer.MIN_VALUE || this.f5088h == 0.0f || !surface.isValid()) {
            return;
        }
        this.f5088h = 0.0f;
        try {
            this.f5085e.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e) {
            zzeh.m6214f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
