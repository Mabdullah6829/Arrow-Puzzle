package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzfyv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfyv> CREATOR = new zzfyw();

    /* JADX INFO: renamed from: s */
    public final int f16816s;

    /* JADX INFO: renamed from: t */
    public zzayt f16817t = null;

    /* JADX INFO: renamed from: u */
    public byte[] f16818u;

    public zzfyv(int i2, byte[] bArr) {
        this.f16816s = i2;
        this.f16818u = bArr;
        m6789w();
    }

    /* JADX INFO: renamed from: w */
    public final void m6789w() {
        zzayt zzaytVar = this.f16817t;
        if (zzaytVar != null || this.f16818u == null) {
            if (zzaytVar == null || this.f16818u != null) {
                if (zzaytVar != null && this.f16818u != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaytVar != null || this.f16818u != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f16816s);
        byte[] bArrM8099h = this.f16818u;
        if (bArrM8099h == null) {
            bArrM8099h = this.f16817t.m8099h();
        }
        SafeParcelWriter.m3576b(parcel, 2, bArrM8099h);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
