package com.google.android.gms.internal.measurement;

import java.util.UUID;
import p003C.AbstractC0116g;
import p003C.C0129t;

/* JADX INFO: loaded from: classes2.dex */
final class zzvp extends zzww {

    /* JADX INFO: renamed from: a */
    public final AbstractC0116g f23001a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0116g f23002b;

    /* JADX INFO: renamed from: c */
    public final UUID f23003c;

    /* JADX INFO: renamed from: d */
    public final long f23004d;

    public /* synthetic */ zzvp(C0129t c0129t, C0129t c0129t2, UUID uuid, long j2) {
        this.f23001a = c0129t;
        this.f23002b = c0129t2;
        this.f23003c = uuid;
        this.f23004d = j2;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    /* JADX INFO: renamed from: a */
    public final AbstractC0116g mo10677a() {
        return this.f23001a;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    /* JADX INFO: renamed from: b */
    public final AbstractC0116g mo10678b() {
        return this.f23002b;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    /* JADX INFO: renamed from: c */
    public final UUID mo10679c() {
        return this.f23003c;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    /* JADX INFO: renamed from: d */
    public final long mo10680d() {
        return this.f23004d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzww)) {
            return false;
        }
        zzww zzwwVar = (zzww) obj;
        return this.f23001a.equals(zzwwVar.mo10677a()) && this.f23002b.equals(zzwwVar.mo10678b()) && this.f23003c.equals(zzwwVar.mo10679c()) && this.f23004d == zzwwVar.mo10680d();
    }

    public final int hashCode() {
        int iHashCode = ((((this.f23001a.hashCode() ^ 1000003) * 1000003) ^ this.f23002b.hashCode()) * 1000003) ^ this.f23003c.hashCode();
        long j2 = this.f23004d;
        return (iHashCode * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }
}
