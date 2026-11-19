package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        Bundle bundleM3552b = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iM3567q = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
            } else if (c == 2) {
                featureArr = (Feature[]) SafeParcelReader.m3561k(parcel, i2, Feature.CREATOR);
            } else if (c == 3) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 4) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.m3557g(parcel, i2, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        zzj zzjVar = new zzj();
        zzjVar.f4530s = bundleM3552b;
        zzjVar.f4531t = featureArr;
        zzjVar.f4532u = iM3567q;
        zzjVar.f4533v = connectionTelemetryConfiguration;
        return zzjVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzj[i2];
    }
}
