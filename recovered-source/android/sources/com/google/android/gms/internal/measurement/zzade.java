package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes2.dex */
final class zzade {

    /* JADX INFO: renamed from: a */
    public final Object f22010a;

    /* JADX INFO: renamed from: b */
    public final int f22011b;

    public zzade(int i2, zzafc zzafcVar) {
        this.f22010a = zzafcVar;
        this.f22011b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzade)) {
            return false;
        }
        zzade zzadeVar = (zzade) obj;
        return this.f22010a == zzadeVar.f22010a && this.f22011b == zzadeVar.f22011b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f22010a) * SupportMenu.USER_MASK) + this.f22011b;
    }
}
