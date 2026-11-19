package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqa {

    /* JADX INFO: renamed from: a */
    public boolean f9249a = false;

    /* JADX INFO: renamed from: b */
    public boolean f9250b = false;

    /* JADX INFO: renamed from: c */
    public float f9251c = 0.0f;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f9252d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m5100a(boolean z) {
        if (!this.f9252d.get()) {
            return z;
        }
        return this.f9249a;
    }
}
