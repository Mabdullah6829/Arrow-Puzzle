package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes.dex */
public class HashAccumulator {

    /* JADX INFO: renamed from: a */
    public int f4071a = 1;

    /* JADX INFO: renamed from: a */
    public final void m3371a(Object obj) {
        this.f4071a = (this.f4071a * 31) + (obj == null ? 0 : obj.hashCode());
    }
}
