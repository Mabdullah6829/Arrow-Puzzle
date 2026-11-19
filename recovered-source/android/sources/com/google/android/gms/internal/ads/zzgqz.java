package com.google.android.gms.internal.ads;

import android.os.IBinder;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqz extends zzgsa {

    /* JADX INFO: renamed from: a */
    public final IBinder f18085a;

    /* JADX INFO: renamed from: b */
    public final String f18086b;

    /* JADX INFO: renamed from: c */
    public final int f18087c;

    /* JADX INFO: renamed from: d */
    public final float f18088d;

    /* JADX INFO: renamed from: e */
    public final int f18089e;

    /* JADX INFO: renamed from: f */
    public final String f18090f;

    public /* synthetic */ zzgqz(IBinder iBinder, String str, int i2, float f2, int i3, String str2) {
        this.f18085a = iBinder;
        this.f18086b = str;
        this.f18087c = i2;
        this.f18088d = f2;
        this.f18089e = i3;
        this.f18090f = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    /* JADX INFO: renamed from: a */
    public final IBinder mo7074a() {
        return this.f18085a;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    /* JADX INFO: renamed from: b */
    public final String mo7075b() {
        return this.f18086b;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    /* JADX INFO: renamed from: c */
    public final int mo7076c() {
        return this.f18087c;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    /* JADX INFO: renamed from: d */
    public final float mo7077d() {
        return this.f18088d;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    /* JADX INFO: renamed from: e */
    public final int mo7078e() {
        return this.f18089e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsa)) {
            return false;
        }
        zzgsa zzgsaVar = (zzgsa) obj;
        if (!this.f18085a.equals(zzgsaVar.mo7074a())) {
            return false;
        }
        String str = this.f18086b;
        if (str == null) {
            if (zzgsaVar.mo7075b() != null) {
                return false;
            }
        } else if (!str.equals(zzgsaVar.mo7075b())) {
            return false;
        }
        if (this.f18087c != zzgsaVar.mo7076c() || Float.floatToIntBits(this.f18088d) != Float.floatToIntBits(zzgsaVar.mo7077d()) || this.f18089e != zzgsaVar.mo7078e()) {
            return false;
        }
        String str2 = this.f18090f;
        if (str2 == null) {
            return zzgsaVar.mo7079f() == null;
        }
        return str2.equals(zzgsaVar.mo7079f());
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    /* JADX INFO: renamed from: f */
    public final String mo7079f() {
        return this.f18090f;
    }

    public final int hashCode() {
        int iHashCode = this.f18085a.hashCode() ^ 1000003;
        String str = this.f18086b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f18087c) * 1000003) ^ Float.floatToIntBits(this.f18088d);
        String str2 = this.f18090f;
        return ((((iHashCode2 * 1525764945) ^ this.f18089e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.f18085a.toString();
        int length = string.length();
        String str = this.f18086b;
        int length2 = String.valueOf(str).length();
        int i2 = this.f18087c;
        int length3 = String.valueOf(i2).length();
        float f2 = this.f18088d;
        int length4 = String.valueOf(f2).length();
        int i3 = this.f18089e;
        int length5 = String.valueOf(i3).length();
        String str2 = this.f18090f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        AbstractC0271e0.m413u(sb, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb.append(", layoutGravity=");
        sb.append(i2);
        sb.append(", layoutVerticalMargin=");
        sb.append(f2);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i3);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
