package com.google.android.gms.internal.measurement;

import android.content.Context;
import p001B.InterfaceC0097w;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzlc extends zzlt {

    /* JADX INFO: renamed from: a */
    public final Context f22600a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0097w f22601b;

    public zzlc(Context context, InterfaceC0097w interfaceC0097w) {
        this.f22600a = context;
        this.f22601b = interfaceC0097w;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    /* JADX INFO: renamed from: a */
    public final Context mo10465a() {
        return this.f22600a;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    /* JADX INFO: renamed from: b */
    public final InterfaceC0097w mo10466b() {
        return this.f22601b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlt)) {
            return false;
        }
        zzlt zzltVar = (zzlt) obj;
        if (!this.f22600a.equals(zzltVar.mo10465a())) {
            return false;
        }
        InterfaceC0097w interfaceC0097w = this.f22601b;
        if (interfaceC0097w == null) {
            return zzltVar.mo10466b() == null;
        }
        return interfaceC0097w.equals(zzltVar.mo10466b());
    }

    public final int hashCode() {
        int iHashCode = this.f22600a.hashCode() ^ 1000003;
        InterfaceC0097w interfaceC0097w = this.f22601b;
        return (iHashCode * 1000003) ^ (interfaceC0097w == null ? 0 : interfaceC0097w.hashCode());
    }

    public final String toString() {
        String string = this.f22600a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f22601b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        AbstractC0271e0.m413u(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
