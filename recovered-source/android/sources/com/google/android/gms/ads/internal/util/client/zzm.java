package com.google.android.gms.ads.internal.util.client;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes.dex */
final class zzm extends zzw {

    /* JADX INFO: renamed from: a */
    public final int f3430a;

    /* JADX INFO: renamed from: b */
    public final int f3431b;

    /* JADX INFO: renamed from: c */
    public final boolean f3432c;

    public zzm(int i2, int i3, boolean z) {
        this.f3430a = i2;
        this.f3431b = i3;
        this.f3432c = z;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    /* JADX INFO: renamed from: a */
    public final int mo3061a() {
        return this.f3430a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    /* JADX INFO: renamed from: b */
    public final int mo3062b() {
        return this.f3431b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    /* JADX INFO: renamed from: c */
    public final boolean mo3063c() {
        return this.f3432c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzw)) {
            return false;
        }
        zzw zzwVar = (zzw) obj;
        return this.f3430a == zzwVar.mo3061a() && this.f3431b == zzwVar.mo3062b() && this.f3432c == zzwVar.mo3063c();
    }

    public final int hashCode() {
        return (true != this.f3432c ? 1237 : 1231) ^ ((((this.f3430a ^ 1000003) * 1000003) ^ this.f3431b) * 1000003);
    }

    public final String toString() {
        int i2 = this.f3430a;
        int length = String.valueOf(i2).length();
        int i3 = this.f3431b;
        int length2 = String.valueOf(i3).length();
        boolean z = this.f3432c;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 59, length2, 26, String.valueOf(z).length()) + 1);
        AbstractC1456a.m2455v(sb, "OfflineAdConfig{impressionPrerequisite=", i2, ", clickPrerequisite=", i3);
        sb.append(", notificationFlowEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
