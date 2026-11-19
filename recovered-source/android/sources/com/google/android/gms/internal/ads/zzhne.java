package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhne {

    /* JADX INFO: renamed from: b */
    public static final zzhne f19005b = (zzhne) zzhoj.m7595a(new zzhoi() { // from class: com.google.android.gms.internal.ads.zzhnd
        @Override // com.google.android.gms.internal.ads.zzhoi
        public final /* synthetic */ Object zza() {
            zzhne zzhneVar = new zzhne();
            zzhneVar.m7571a(new zzhmf(zzhmm.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhnc
                @Override // com.google.android.gms.internal.ads.zzhmg
                /* JADX INFO: renamed from: a */
                public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) {
                    zzhnz zzhnzVar = ((zzhmm) zzhdzVar).f18986a;
                    zzhmm.m7562d(zzhnzVar);
                    return zzhnzVar;
                }
            }));
            return zzhneVar;
        }
    });

    /* JADX INFO: renamed from: a */
    public final AtomicReference f19006a = new AtomicReference(new zzhoh(new zzhoe()));

    /* JADX INFO: renamed from: a */
    public final synchronized void m7571a(zzhmh zzhmhVar) {
        AtomicReference atomicReference = this.f19006a;
        zzhoe zzhoeVar = new zzhoe((zzhoh) atomicReference.get());
        zzhoeVar.m7591a(zzhmhVar);
        atomicReference.set(new zzhoh(zzhoeVar));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7572b(zzhme zzhmeVar) {
        AtomicReference atomicReference = this.f19006a;
        zzhoe zzhoeVar = new zzhoe((zzhoh) atomicReference.get());
        zzhoeVar.m7592b(zzhmeVar);
        atomicReference.set(new zzhoh(zzhoeVar));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7573c(zzhnl zzhnlVar) {
        AtomicReference atomicReference = this.f19006a;
        zzhoe zzhoeVar = new zzhoe((zzhoh) atomicReference.get());
        zzhoeVar.m7593c(zzhnlVar);
        atomicReference.set(new zzhoh(zzhoeVar));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7574d(zzhni zzhniVar) {
        AtomicReference atomicReference = this.f19006a;
        zzhoe zzhoeVar = new zzhoe((zzhoh) atomicReference.get());
        zzhoeVar.m7594d(zzhniVar);
        atomicReference.set(new zzhoh(zzhoeVar));
    }

    /* JADX INFO: renamed from: e */
    public final zzhdz m7575e(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        zzhoh zzhohVar = (zzhoh) this.f19006a.get();
        zzhohVar.getClass();
        zzhof zzhofVar = new zzhof(zzhnz.class, zzhnzVar.f19031b);
        HashMap map = zzhohVar.f19054b;
        if (map.containsKey(zzhofVar)) {
            return ((zzhme) map.get(zzhofVar)).mo7560a(zzhnzVar, zzheyVar);
        }
        String string = zzhofVar.toString();
        throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    /* JADX INFO: renamed from: f */
    public final zzhod m7576f(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
        zzhoh zzhohVar = (zzhoh) this.f19006a.get();
        zzhohVar.getClass();
        zzhog zzhogVar = new zzhog(zzhdzVar.getClass(), zzhnz.class);
        HashMap map = zzhohVar.f19053a;
        if (map.containsKey(zzhogVar)) {
            return ((zzhmh) map.get(zzhogVar)).mo7561a(zzhdzVar, zzheyVar);
        }
        String string = zzhogVar.toString();
        throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    /* JADX INFO: renamed from: g */
    public final zzheq m7577g(zzhoa zzhoaVar) throws GeneralSecurityException {
        zzhoh zzhohVar = (zzhoh) this.f19006a.get();
        zzhohVar.getClass();
        zzhof zzhofVar = new zzhof(zzhoa.class, zzhoaVar.f19042a);
        HashMap map = zzhohVar.f19056d;
        if (map.containsKey(zzhofVar)) {
            return ((zzhni) map.get(zzhofVar)).mo7581a(zzhoaVar);
        }
        String string = zzhofVar.toString();
        throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    /* JADX INFO: renamed from: h */
    public final zzhod m7578h(zzheq zzheqVar) throws GeneralSecurityException {
        zzhoh zzhohVar = (zzhoh) this.f19006a.get();
        zzhohVar.getClass();
        zzhog zzhogVar = new zzhog(zzheqVar.getClass(), zzhoa.class);
        HashMap map = zzhohVar.f19055c;
        if (map.containsKey(zzhogVar)) {
            return ((zzhnl) map.get(zzhogVar)).mo7582a(zzheqVar);
        }
        String string = zzhogVar.toString();
        throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }
}
