package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        String strM3558h4 = null;
        Uri uri = null;
        String strM3558h5 = null;
        String strM3558h6 = null;
        ArrayList arrayListM3562l = null;
        String strM3558h7 = null;
        String strM3558h8 = null;
        long jM3568r = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 4:
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 5:
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m3557g(parcel, i2, Uri.CREATOR);
                    break;
                case 7:
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\b':
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '\t':
                    strM3558h6 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\n':
                    arrayListM3562l = SafeParcelReader.m3562l(parcel, i2, Scope.CREATOR);
                    break;
                case 11:
                    strM3558h7 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\f':
                    strM3558h8 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new GoogleSignInAccount(strM3558h, strM3558h2, strM3558h3, strM3558h4, uri, strM3558h5, jM3568r, strM3558h6, arrayListM3562l, strM3558h7, strM3558h8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
