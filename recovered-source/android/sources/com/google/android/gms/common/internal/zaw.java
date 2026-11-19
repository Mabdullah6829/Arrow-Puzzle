package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaw> CREATOR = new zax();

    /* JADX INFO: renamed from: s */
    public final int f4498s;

    /* JADX INFO: renamed from: t */
    public final Account f4499t;

    /* JADX INFO: renamed from: u */
    public final int f4500u;

    /* JADX INFO: renamed from: v */
    public final GoogleSignInAccount f4501v;

    public zaw(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f4498s = i2;
        this.f4499t = account;
        this.f4500u = i3;
        this.f4501v = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4498s);
        SafeParcelWriter.m3582h(parcel, 2, this.f4499t, i2);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4500u);
        SafeParcelWriter.m3582h(parcel, 4, this.f4501v, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
