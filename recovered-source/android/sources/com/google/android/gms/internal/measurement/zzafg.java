package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Iterator;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzafg implements zzafp {

    /* JADX INFO: renamed from: a */
    public final zzafc f22088a;

    /* JADX INFO: renamed from: b */
    public final zzafz f22089b;

    /* JADX INFO: renamed from: c */
    public final boolean f22090c;

    /* JADX INFO: renamed from: d */
    public final zzadg f22091d;

    public zzafg(zzafz zzafzVar, zzadg zzadgVar, zzafc zzafcVar) {
        this.f22089b = zzafzVar;
        this.f22090c = zzafcVar instanceof zzadr;
        this.f22091d = zzadgVar;
        this.f22088a = zzafcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: a */
    public final void mo9631a(Object obj, Object obj2) {
        zzafq.m9652b(obj, obj2);
        if (!this.f22090c || ((zzadr) obj2).zzb.f22017a.isEmpty()) {
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: b */
    public final boolean mo9632b(Object obj) {
        ((zzadr) obj).zzb.m9544c();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: c */
    public final void mo9633c(Object obj) {
        this.f22089b.mo9684j(obj);
        this.f22091d.mo9536a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: d */
    public final void mo9634d(Object obj, zzadb zzadbVar) {
        Iterator itM9543b = ((zzadr) obj).zzb.m9543b();
        if (itM9543b.hasNext()) {
            ((zzadj) ((Map.Entry) itM9543b.next()).getKey()).zzc();
            throw null;
        }
        zzaga zzagaVar = ((zzadu) obj).zzc;
        for (int i2 = 0; i2 < zzagaVar.f22122a; i2++) {
            int i3 = zzagaVar.f22123b[i2] >>> 3;
            Object obj2 = zzagaVar.f22124c[i2];
            zzada zzadaVar = zzadbVar.f22006a;
            if (obj2 instanceof zzacr) {
                zzadaVar.mo9493q(i3, (zzacr) obj2);
            } else {
                zzadaVar.mo9492p(i3, (zzafc) obj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: e */
    public final int mo9635e(zzadu zzaduVar) {
        zzaga zzagaVar = zzaduVar.zzc;
        int iM395c = zzagaVar.f22125d;
        if (iM395c == -1) {
            iM395c = 0;
            for (int i2 = 0; i2 < zzagaVar.f22122a; i2++) {
                int i3 = zzagaVar.f22123b[i2] >>> 3;
                zzacr zzacrVar = (zzacr) zzagaVar.f22124c[i2];
                int iM9510b = zzada.m9510b(8);
                int iM9510b2 = zzada.m9510b(i3) + zzada.m9510b(16);
                int iM9510b3 = zzada.m9510b(24);
                int iMo9373b = zzacrVar.mo9373b();
                iM395c = AbstractC0271e0.m395c(iM9510b + iM9510b, iM9510b2, AbstractC1456a.m2457x(iMo9373b, iMo9373b, iM9510b3), iM395c);
            }
            zzagaVar.f22125d = iM395c;
        }
        if (this.f22090c) {
            zzafr zzafrVar = ((zzadr) zzaduVar).zzb.f22017a;
            if (zzafrVar.f22114t > 0) {
                zzadk.m9541g(zzafrVar.m9666b(0));
                throw null;
            }
            Iterator it = zzafrVar.m9667c().iterator();
            if (it.hasNext()) {
                zzadk.m9541g((Map.Entry) it.next());
                throw null;
            }
        }
        return iM395c;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: f */
    public final boolean mo9636f(zzadu zzaduVar, zzadu zzaduVar2) {
        if (!zzaduVar.zzc.equals(zzaduVar2.zzc)) {
            return false;
        }
        if (this.f22090c) {
            return ((zzadr) zzaduVar).zzb.equals(((zzadr) zzaduVar2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: g */
    public final void mo9637g(Object obj, byte[] bArr, int i2, int i3, zzacg zzacgVar) {
        zzadu zzaduVar = (zzadu) obj;
        if (zzaduVar.zzc == zzaga.f22121f) {
            zzaduVar.zzc = zzaga.m9686a();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: h */
    public final void mo9638h(Object obj, zzacw zzacwVar, zzadf zzadfVar) {
        this.f22089b.mo9682h(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: i */
    public final int mo9639i(zzadu zzaduVar) {
        int iHashCode = zzaduVar.zzc.hashCode();
        return this.f22090c ? (iHashCode * 53) + ((zzadr) zzaduVar).zzb.f22017a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final Object zza() {
        zzafc zzafcVar = this.f22088a;
        return zzafcVar instanceof zzadu ? ((zzadu) zzafcVar).m9570p() : zzafcVar.mo9348c().mo9558w();
    }
}
