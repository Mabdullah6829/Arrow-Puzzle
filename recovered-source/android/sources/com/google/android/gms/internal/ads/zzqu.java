package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqu {

    /* JADX INFO: renamed from: d */
    public static final zzqu f20661d = new zzqt().m8841a();

    /* JADX INFO: renamed from: a */
    public final boolean f20662a;

    /* JADX INFO: renamed from: b */
    public final boolean f20663b;

    /* JADX INFO: renamed from: c */
    public final boolean f20664c;

    public /* synthetic */ zzqu(zzqt zzqtVar) {
        this.f20662a = zzqtVar.f20658a;
        this.f20663b = zzqtVar.f20659b;
        this.f20664c = zzqtVar.f20660c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzqu.class != obj.getClass()) {
            return false;
        }
        zzqu zzquVar = (zzqu) obj;
        return this.f20662a == zzquVar.f20662a && this.f20663b == zzquVar.f20663b && this.f20664c == zzquVar.f20664c;
    }

    public final int hashCode() {
        int i2 = (this.f20662a ? 1 : 0) << 2;
        boolean z = this.f20663b;
        return (z ? 1 : 0) + (z ? 1 : 0) + i2 + (this.f20664c ? 1 : 0);
    }
}
