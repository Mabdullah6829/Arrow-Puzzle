package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhml extends zzheq {

    /* JADX INFO: renamed from: a */
    public final String f18984a;

    /* JADX INFO: renamed from: b */
    public final zzhtx f18985b;

    public /* synthetic */ zzhml(String str, zzhtx zzhtxVar) {
        this.f18984a = str;
        this.f18985b = zzhtxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18985b != zzhtx.RAW;
    }

    public final String toString() {
        String str;
        int iOrdinal = this.f18985b.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return "(typeUrl=" + this.f18984a + ", outputPrefixType=" + str + ")";
    }
}
