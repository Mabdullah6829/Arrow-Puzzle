package com.google.android.gms.internal.measurement;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzyu implements zzyd {

    /* JADX INFO: renamed from: a */
    public final zzyd f23112a;

    /* JADX INFO: renamed from: b */
    public final Object f23113b;

    public zzyu(zzyd zzydVar, Object obj) {
        zzabr.m9334a(zzydVar, "log site key");
        this.f23112a = zzydVar;
        zzabr.m9334a(obj, "log site qualifier");
        this.f23113b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyu)) {
            return false;
        }
        zzyu zzyuVar = (zzyu) obj;
        return this.f23112a.equals(zzyuVar.f23112a) && this.f23113b.equals(zzyuVar.f23113b);
    }

    public final int hashCode() {
        return this.f23112a.hashCode() ^ this.f23113b.hashCode();
    }

    public final String toString() {
        String string = this.f23112a.toString();
        int length = string.length();
        String string2 = this.f23113b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        AbstractC0271e0.m413u(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb.append("' }");
        return sb.toString();
    }
}
