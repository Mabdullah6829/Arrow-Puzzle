package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzib extends zzadu implements zzafd {
    private static final zzib zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzaef zze = zzafm.f22097w;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzib zzibVar = new zzib();
        zzi = zzibVar;
        zzadu.m9561u(zzib.class, zzibVar);
    }

    private zzib() {
    }

    /* JADX INFO: renamed from: H */
    public static zzhz m10181H() {
        return (zzhz) zzi.m9571q();
    }

    /* JADX INFO: renamed from: I */
    public static zzhz m10182I(zzib zzibVar) {
        zzadp zzadpVarM9571q = zzi.m9571q();
        zzadpVarM9571q.m9556s(zzibVar);
        return (zzhz) zzadpVarM9571q;
    }

    /* JADX INFO: renamed from: A */
    public final List m10183A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final int m10184B() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final zzid m10185C(int i2) {
        return (zzid) this.zze.get(i2);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m10186D() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final String m10187E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10188F() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final String m10189G() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10190J(int i2, zzid zzidVar) {
        m10196P();
        this.zze.set(i2, zzidVar);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10191K(zzid zzidVar) {
        m10196P();
        this.zze.add(zzidVar);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10192L(ArrayList arrayList) {
        m10196P();
        zzacb.m9343k(arrayList, this.zze);
    }

    /* JADX INFO: renamed from: M */
    public final void m10193M() {
        this.zze = zzafm.f22097w;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10194N(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10195O(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: P */
    public final void m10196P() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = AbstractC1456a.m2441h(zzaefVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    /* JADX INFO: renamed from: z */
    public final Object mo9574z(int i2) {
        zzafj zzadqVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", zzid.class, "zzf", "zzg", "zzh", zzia.f22503a});
        }
        if (i3 == 3) {
            return new zzib();
        }
        if (i3 == 4) {
            return new zzhz(zzi);
        }
        if (i3 == 5) {
            return zzi;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzib.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
