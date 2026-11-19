package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();

    /* JADX INFO: renamed from: s */
    public final int f4405s;

    /* JADX INFO: renamed from: t */
    public final String f4406t;

    public ClientIdentity(int i2, String str) {
        this.f4405s = i2;
        this.f4406t = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f4405s == this.f4405s && Objects.m3535a(clientIdentity.f4406t, this.f4406t);
    }

    public final int hashCode() {
        return this.f4405s;
    }

    public final String toString() {
        int i2 = this.f4405s;
        int length = String.valueOf(i2).length();
        String str = this.f4406t;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb.append(i2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4405s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4406t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
