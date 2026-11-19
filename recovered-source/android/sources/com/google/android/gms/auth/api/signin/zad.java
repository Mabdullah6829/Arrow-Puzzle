package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        ArrayList arrayListM3562l = null;
        int i2 = 0;
        ArrayList arrayListM3562l2 = null;
        Account account = null;
        String strM3558h = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        int iM3567q = 0;
        boolean zM3564n = false;
        boolean zM3564n2 = false;
        boolean zM3564n3 = false;
        while (parcel.dataPosition() < iM3572v) {
            int i3 = parcel.readInt();
            switch ((char) i3) {
                case 1:
                    iM3567q = SafeParcelReader.m3567q(i3, parcel);
                    break;
                case 2:
                    arrayListM3562l2 = SafeParcelReader.m3562l(parcel, i3, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m3557g(parcel, i3, Account.CREATOR);
                    break;
                case 4:
                    zM3564n = SafeParcelReader.m3564n(i3, parcel);
                    break;
                case 5:
                    zM3564n2 = SafeParcelReader.m3564n(i3, parcel);
                    break;
                case 6:
                    zM3564n3 = SafeParcelReader.m3564n(i3, parcel);
                    break;
                case 7:
                    strM3558h = SafeParcelReader.m3558h(i3, parcel);
                    break;
                case '\b':
                    strM3558h2 = SafeParcelReader.m3558h(i3, parcel);
                    break;
                case '\t':
                    arrayListM3562l = SafeParcelReader.m3562l(parcel, i3, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    strM3558h3 = SafeParcelReader.m3558h(i3, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i3, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        HashMap map = new HashMap();
        if (arrayListM3562l != null) {
            int size = arrayListM3562l.size();
            while (i2 < size) {
                Object obj = arrayListM3562l.get(i2);
                i2++;
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) obj;
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f4069t), googleSignInOptionsExtensionParcelable);
            }
        }
        return new GoogleSignInOptions(iM3567q, arrayListM3562l2, account, zM3564n, zM3564n2, zM3564n3, strM3558h, strM3558h2, map, strM3558h3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleSignInOptions[i2];
    }
}
