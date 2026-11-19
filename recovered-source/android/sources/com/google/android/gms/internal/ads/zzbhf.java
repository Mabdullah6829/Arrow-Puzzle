package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbhf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbhf> CREATOR = new zzbhg();

    /* JADX INFO: renamed from: s */
    public ParcelFileDescriptor f7848s;

    /* JADX INFO: renamed from: t */
    public final boolean f7849t;

    /* JADX INFO: renamed from: u */
    public final boolean f7850u;

    /* JADX INFO: renamed from: v */
    public final long f7851v;

    /* JADX INFO: renamed from: w */
    public final boolean f7852w;

    public zzbhf() {
        this(null, false, false, 0L, false);
    }

    /* JADX INFO: renamed from: H */
    public final synchronized boolean m4885H() {
        return this.f7852w;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m4886a() {
        return this.f7850u;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized ParcelFileDescriptor.AutoCloseInputStream m4887w() {
        if (this.f7848s == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f7848s);
        this.f7848s = null;
        return autoCloseInputStream;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        long j2;
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        synchronized (this) {
            parcelFileDescriptor = this.f7848s;
        }
        SafeParcelWriter.m3582h(parcel, 2, parcelFileDescriptor, i2);
        synchronized (this) {
            z = this.f7849t;
        }
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean zM4886a = m4886a();
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(zM4886a ? 1 : 0);
        synchronized (this) {
            j2 = this.f7851v;
        }
        SafeParcelWriter.m3588n(parcel, 5, 8);
        parcel.writeLong(j2);
        boolean zM4885H = m4885H();
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeInt(zM4885H ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public final synchronized boolean zza() {
        return this.f7848s != null;
    }

    public zzbhf(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j2, boolean z3) {
        this.f7848s = parcelFileDescriptor;
        this.f7849t = z;
        this.f7850u = z2;
        this.f7851v = j2;
        this.f7852w = z3;
    }
}
