package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();

    /* JADX INFO: renamed from: G */
    public static final Scope[] f4424G = new Scope[0];

    /* JADX INFO: renamed from: H */
    public static final Feature[] f4425H = new Feature[0];

    /* JADX INFO: renamed from: A */
    public Feature[] f4426A;

    /* JADX INFO: renamed from: B */
    public Feature[] f4427B;

    /* JADX INFO: renamed from: C */
    public final boolean f4428C;

    /* JADX INFO: renamed from: D */
    public final int f4429D;

    /* JADX INFO: renamed from: E */
    public boolean f4430E;

    /* JADX INFO: renamed from: F */
    public final String f4431F;

    /* JADX INFO: renamed from: s */
    public final int f4432s;

    /* JADX INFO: renamed from: t */
    public final int f4433t;

    /* JADX INFO: renamed from: u */
    public final int f4434u;

    /* JADX INFO: renamed from: v */
    public String f4435v;

    /* JADX INFO: renamed from: w */
    public IBinder f4436w;

    /* JADX INFO: renamed from: x */
    public Scope[] f4437x;

    /* JADX INFO: renamed from: y */
    public Bundle f4438y;

    /* JADX INFO: renamed from: z */
    public Account f4439z;

    public GetServiceRequest(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i5, boolean z2, String str2) {
        scopeArr = scopeArr == null ? f4424G : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f4425H;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f4432s = i2;
        this.f4433t = i3;
        this.f4434u = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f4435v = "com.google.android.gms";
        } else {
            this.f4435v = str;
        }
        if (i2 < 2) {
            Account accountZzb = null;
            if (iBinder != null) {
                int i6 = IAccountAccessor.Stub.f4445s;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IAccountAccessor zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i7 = AccountAccessor.f4402t;
                if (zztVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            accountZzb = zztVar.zzb();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f4439z = accountZzb;
        } else {
            this.f4436w = iBinder;
            this.f4439z = account;
        }
        this.f4437x = scopeArr;
        this.f4438y = bundle;
        this.f4426A = featureArr;
        this.f4427B = featureArr2;
        this.f4428C = z;
        this.f4429D = i5;
        this.f4430E = z2;
        this.f4431F = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        zzm.m3612a(this, parcel, i2);
    }
}
