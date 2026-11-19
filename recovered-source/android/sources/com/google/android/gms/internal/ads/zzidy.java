package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
final class zzidy {

    /* JADX INFO: renamed from: a */
    public final Object f19756a;

    /* JADX INFO: renamed from: b */
    public final int f19757b;

    public zzidy(int i2, zzifz zzifzVar) {
        this.f19756a = zzifzVar;
        this.f19757b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzidy)) {
            return false;
        }
        zzidy zzidyVar = (zzidy) obj;
        return this.f19756a == zzidyVar.f19756a && this.f19757b == zzidyVar.f19757b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f19756a) * SupportMenu.USER_MASK) + this.f19757b;
    }
}
