package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmn extends zzheq {

    /* JADX INFO: renamed from: a */
    public final zzhoa f18987a;

    public zzhmn(zzhoa zzhoaVar) {
        this.f18987a = zzhoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18987a.f19043b.m7805F() != zzhtx.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmn)) {
            return false;
        }
        zzhoa zzhoaVar = ((zzhmn) obj).f18987a;
        zzhoa zzhoaVar2 = this.f18987a;
        zzhte zzhteVar = zzhoaVar2.f19043b;
        zzhte zzhteVar2 = zzhoaVar2.f19043b;
        zzhtx zzhtxVarM7805F = zzhteVar.m7805F();
        zzhte zzhteVar3 = zzhoaVar.f19043b;
        zzhte zzhteVar4 = zzhoaVar.f19043b;
        return zzhtxVarM7805F.equals(zzhteVar3.m7805F()) && zzhteVar2.m7803D().equals(zzhteVar4.m7803D()) && zzhteVar2.m7804E().equals(zzhteVar4.m7804E());
    }

    public final int hashCode() {
        zzhoa zzhoaVar = this.f18987a;
        return Objects.hash(zzhoaVar.f19043b, zzhoaVar.f19042a);
    }

    public final String toString() {
        String str;
        zzhoa zzhoaVar = this.f18987a;
        String strM7803D = zzhoaVar.f19043b.m7803D();
        int iOrdinal = zzhoaVar.f19043b.m7805F().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return "(typeUrl=" + strM7803D + ", outputPrefixType=" + str + ")";
    }
}
