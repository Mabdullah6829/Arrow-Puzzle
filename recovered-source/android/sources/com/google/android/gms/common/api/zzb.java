package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static final ApiMetadata m3526a(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        boolean zM3564n = false;
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                complianceOptions = (ComplianceOptions) SafeParcelReader.m3557g(parcel, i2, ComplianceOptions.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new ApiMetadata(complianceOptions, zM3564n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3526a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new ApiMetadata[i2];
    }
}
