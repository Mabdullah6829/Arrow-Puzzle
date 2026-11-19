package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgrb extends zzgsc {

    /* JADX INFO: renamed from: a */
    public final int f18100a;

    /* JADX INFO: renamed from: b */
    public final String f18101b;

    /* JADX INFO: renamed from: c */
    public final int f18102c;

    /* JADX INFO: renamed from: d */
    public final Boolean f18103d;

    public /* synthetic */ zzgrb(int i2, String str, int i3, Boolean bool) {
        this.f18100a = i2;
        this.f18101b = str;
        this.f18102c = i3;
        this.f18103d = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    /* JADX INFO: renamed from: a */
    public final int mo7093a() {
        return this.f18100a;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    /* JADX INFO: renamed from: b */
    public final String mo7094b() {
        return this.f18101b;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    /* JADX INFO: renamed from: c */
    public final int mo7095c() {
        return this.f18102c;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    /* JADX INFO: renamed from: d */
    public final Boolean mo7096d() {
        return this.f18103d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsc)) {
            return false;
        }
        zzgsc zzgscVar = (zzgsc) obj;
        if (this.f18100a != zzgscVar.mo7093a()) {
            return false;
        }
        String str = this.f18101b;
        if (str == null) {
            if (zzgscVar.mo7094b() != null) {
                return false;
            }
        } else if (!str.equals(zzgscVar.mo7094b())) {
            return false;
        }
        if (this.f18102c != zzgscVar.mo7095c()) {
            return false;
        }
        Boolean bool = this.f18103d;
        if (bool == null) {
            return zzgscVar.mo7096d() == null;
        }
        return bool.equals(zzgscVar.mo7096d());
    }

    public final int hashCode() {
        String str = this.f18101b;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.f18103d;
        return (bool != null ? bool.hashCode() : 0) ^ ((((iHashCode ^ ((this.f18100a ^ 1000003) * 1000003)) * 1000003) ^ this.f18102c) * 1000003);
    }

    public final String toString() {
        int i2 = this.f18100a;
        int length = String.valueOf(i2).length();
        String str = this.f18101b;
        int length2 = String.valueOf(str).length();
        int i3 = this.f18102c;
        int length3 = String.valueOf(i3).length();
        Boolean bool = this.f18103d;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i2);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i3);
        sb.append(", userInteracted=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
