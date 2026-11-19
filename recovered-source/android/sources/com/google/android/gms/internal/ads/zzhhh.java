package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhhh extends zzhfg {

    /* JADX INFO: renamed from: a */
    public final zzhhj f18725a;

    /* JADX INFO: renamed from: b */
    public final zzibk f18726b;

    /* JADX INFO: renamed from: c */
    public final Integer f18727c;

    public zzhhh(zzhhj zzhhjVar, zzibk zzibkVar, Integer num) {
        this.f18725a = zzhhjVar;
        this.f18726b = zzibkVar;
        this.f18727c = num;
    }

    /* JADX INFO: renamed from: d */
    public static zzhhh m7454d(zzhhj zzhhjVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarM8050a;
        zzhhi zzhhiVar = zzhhjVar.f18732b;
        if (zzhhiVar == zzhhi.f18728b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzibkVarM8050a = zzibk.m8050a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhhiVar != zzhhi.f18729c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhhiVar.f18730a));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzibkVarM8050a = zzibk.m8050a(new byte[0]);
        }
        return new zzhhh(zzhhjVar, zzibkVarM8050a, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzheq mo7405a() {
        return this.f18725a;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: b */
    public final Integer mo7406b() {
        return this.f18727c;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    /* JADX INFO: renamed from: c */
    public final zzibk mo7427c() {
        return this.f18726b;
    }
}
