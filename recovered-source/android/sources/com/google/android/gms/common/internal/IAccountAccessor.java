package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IAccountAccessor {

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ int f4445s = 0;

        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @Override // com.google.android.gms.internal.common.zzb
        /* JADX INFO: renamed from: u */
        public final boolean mo3533u(int i2, Parcel parcel, Parcel parcel2) {
            if (i2 != 2) {
                return false;
            }
            throw null;
        }
    }

    Account zzb();
}
