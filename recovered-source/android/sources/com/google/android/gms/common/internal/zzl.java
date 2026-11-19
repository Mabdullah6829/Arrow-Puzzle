package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrM3555e = null;
        int[] iArrM3555e2 = null;
        boolean zM3564n = false;
        boolean zM3564n2 = false;
        int iM3567q = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m3557g(parcel, i2, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 3:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 4:
                    iArrM3555e = SafeParcelReader.m3555e(i2, parcel);
                    break;
                case 5:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 6:
                    iArrM3555e2 = SafeParcelReader.m3555e(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zM3564n, zM3564n2, iArrM3555e, iM3567q, iArrM3555e2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new ConnectionTelemetryConfiguration[i2];
    }
}
