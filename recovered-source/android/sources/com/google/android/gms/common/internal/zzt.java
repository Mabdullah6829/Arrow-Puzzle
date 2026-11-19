package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends com.google.android.gms.internal.common.zza implements IAccountAccessor {
    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        Parcel parcelM9085u = m9085u(2, m9084k0());
        Account account = (Account) com.google.android.gms.internal.common.zzc.m9103a(parcelM9085u, Account.CREATOR);
        parcelM9085u.recycle();
        return account;
    }
}
