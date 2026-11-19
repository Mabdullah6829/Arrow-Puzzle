package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzvz {

    /* JADX INFO: renamed from: a */
    public final String f21203a;

    /* JADX INFO: renamed from: b */
    public final boolean f21204b;

    /* JADX INFO: renamed from: c */
    public final boolean f21205c;

    public zzvz(String str, boolean z, boolean z2) {
        this.f21203a = str;
        this.f21204b = z;
        this.f21205c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != zzvz.class) {
            return false;
        }
        zzvz zzvzVar = (zzvz) obj;
        return TextUtils.equals(this.f21203a, zzvzVar.f21203a) && this.f21204b == zzvzVar.f21204b && this.f21205c == zzvzVar.f21205c;
    }

    public final int hashCode() {
        return ((((this.f21203a.hashCode() + 31) * 31) + (true != this.f21204b ? 1237 : 1231)) * 31) + (true != this.f21205c ? 1237 : 1231);
    }
}
