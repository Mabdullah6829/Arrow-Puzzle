package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakb implements zzao {

    /* JADX INFO: renamed from: a */
    public final float f5580a;

    /* JADX INFO: renamed from: b */
    public final int f5581b;

    public zzakb(float f2, int i2) {
        this.f5580a = f2;
        this.f5581b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakb.class == obj.getClass()) {
            zzakb zzakbVar = (zzakb) obj;
            if (this.f5580a == zzakbVar.f5580a && this.f5581b == zzakbVar.f5581b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f5580a) + 527) * 31) + this.f5581b;
    }

    public final String toString() {
        float f2 = this.f5580a;
        int length = String.valueOf(f2).length();
        int i2 = this.f5581b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i2).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f2);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i2);
        return sb.toString();
    }
}
