package com.google.android.gms.internal.ads;

import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaju extends zzajs {

    /* JADX INFO: renamed from: b */
    public final String f5556b;

    /* JADX INFO: renamed from: c */
    public final String f5557c;

    /* JADX INFO: renamed from: d */
    public final String f5558d;

    public zzaju(String str, String str2, String str3) {
        super("----");
        this.f5556b = str;
        this.f5557c = str2;
        this.f5558d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaju.class == obj.getClass()) {
            zzaju zzajuVar = (zzaju) obj;
            if (Objects.equals(this.f5557c, zzajuVar.f5557c) && Objects.equals(this.f5556b, zzajuVar.f5556b) && Objects.equals(this.f5558d, zzajuVar.f5558d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5558d.hashCode() + ((this.f5557c.hashCode() + ((this.f5556b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.f5554a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f5556b;
        int length2 = str2.length() + length + 14;
        String str3 = this.f5557c;
        StringBuilder sb = new StringBuilder(str3.length() + length2);
        AbstractC0271e0.m413u(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
