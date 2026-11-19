package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhhp extends zzhfg {

    /* JADX INFO: renamed from: a */
    public final zzhht f18741a;

    /* JADX INFO: renamed from: b */
    public final zzibk f18742b;

    /* JADX INFO: renamed from: c */
    public final Integer f18743c;

    public zzhhp(zzhht zzhhtVar, zzibk zzibkVar, Integer num) {
        this.f18741a = zzhhtVar;
        this.f18742b = zzibkVar;
        this.f18743c = num;
    }

    /* JADX INFO: renamed from: d */
    public static zzhhp m7461d(zzhht zzhhtVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarM7580b;
        zzhhs zzhhsVar = zzhhtVar.f18758a;
        if (zzhhsVar == zzhhs.f18756c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzibkVarM7580b = zzhnf.f19007a;
        } else {
            if (zzhhsVar != zzhhs.f18755b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzhhsVar)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzibkVarM7580b = zzhnf.m7580b(num.intValue());
        }
        return new zzhhp(zzhhtVar, zzibkVarM7580b, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzheq mo7405a() {
        return this.f18741a;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: b */
    public final Integer mo7406b() {
        return this.f18743c;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    /* JADX INFO: renamed from: c */
    public final zzibk mo7427c() {
        return this.f18742b;
    }
}
