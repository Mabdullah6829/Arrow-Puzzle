package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvi {

    /* JADX INFO: renamed from: a */
    public zzhvf f19229a = null;

    /* JADX INFO: renamed from: b */
    public ECPoint f19230b = null;

    /* JADX INFO: renamed from: c */
    public Integer f19231c = null;

    private zzhvi() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhvj m7979a() throws GeneralSecurityException {
        zzibk zzibkVarM7579a;
        zzhvf zzhvfVar = this.f19229a;
        if (zzhvfVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.f19230b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zzhlt.m7530a(eCPoint, zzhvfVar.f19222b.f19208b.getCurve());
        if (this.f19229a.mo7421a() && this.f19231c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f19229a.mo7421a() && this.f19231c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhve zzhveVar = this.f19229a.f19224d;
        if (zzhveVar == zzhve.f19219e) {
            zzibkVarM7579a = zzhnf.f19007a;
        } else if (zzhveVar == zzhve.f19218d || zzhveVar == zzhve.f19217c) {
            zzibkVarM7579a = zzhnf.m7579a(this.f19231c.intValue());
        } else {
            if (zzhveVar != zzhve.f19216b) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.f19229a.f19224d.f19220a));
            }
            zzibkVarM7579a = zzhnf.m7580b(this.f19231c.intValue());
        }
        return new zzhvj(this.f19229a, this.f19230b, zzibkVarM7579a, this.f19231c);
    }

    public /* synthetic */ zzhvi(int i2) {
    }
}
