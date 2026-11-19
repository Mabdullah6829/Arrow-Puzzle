package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzed {

    /* JADX INFO: renamed from: a */
    public final Object f13654a;

    /* JADX INFO: renamed from: b */
    public zzr f13655b = new zzr();

    /* JADX INFO: renamed from: c */
    public boolean f13656c;

    /* JADX INFO: renamed from: d */
    public boolean f13657d;

    public zzed(Object obj) {
        this.f13654a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzed.class != obj.getClass()) {
            return false;
        }
        return this.f13654a.equals(((zzed) obj).f13654a);
    }

    public final int hashCode() {
        return this.f13654a.hashCode();
    }
}
