package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zax implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        Account account = null;
        int iM3567q = 0;
        int iM3567q2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                account = (Account) SafeParcelReader.m3557g(parcel, i2, Account.CREATOR);
            } else if (c == 3) {
                iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 4) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m3557g(parcel, i2, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zaw(iM3567q, account, iM3567q2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zaw[i2];
    }
}
