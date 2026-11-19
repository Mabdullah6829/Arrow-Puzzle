package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajm extends zzajs {

    /* JADX INFO: renamed from: b */
    public final String f5542b;

    /* JADX INFO: renamed from: c */
    public final String f5543c;

    /* JADX INFO: renamed from: d */
    public final String f5544d;

    public zzajm(String str, String str2, String str3) {
        super("COMM");
        this.f5542b = str;
        this.f5543c = str2;
        this.f5544d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajm.class == obj.getClass()) {
            zzajm zzajmVar = (zzajm) obj;
            if (Objects.equals(this.f5543c, zzajmVar.f5543c) && Objects.equals(this.f5542b, zzajmVar.f5542b) && Objects.equals(this.f5544d, zzajmVar.f5544d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f5543c.hashCode() + ((this.f5542b.hashCode() + 527) * 31);
        String str = this.f5544d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.f5554a;
        int length = String.valueOf(str).length();
        String str2 = this.f5544d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f5542b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.f5543c;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 7 + length2);
        AbstractC0271e0.m413u(sb, str, ": language=", str3, ", description=");
        return AbstractC1456a.m2450q(sb, str4, ", text=", str2);
    }
}
