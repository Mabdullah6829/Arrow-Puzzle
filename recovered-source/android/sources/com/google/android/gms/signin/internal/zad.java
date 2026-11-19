package com.google.android.gms.signin.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    /* JADX INFO: renamed from: u */
    public final boolean mo3465u(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 3:
                com.google.android.gms.internal.base.zac.m9080d(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.zac.m9080d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.zac.m9080d(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.zac.m9080d(parcel);
                break;
            case 8:
                zak zakVar = (zak) com.google.android.gms.internal.base.zac.m9077a(parcel, zak.CREATOR);
                com.google.android.gms.internal.base.zac.m9080d(parcel);
                mo3492l1(zakVar);
                break;
            case 9:
                com.google.android.gms.internal.base.zac.m9080d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
