package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m3612a(GetServiceRequest getServiceRequest, Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        int i3 = getServiceRequest.f4432s;
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.f4433t;
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(i4);
        int i5 = getServiceRequest.f4434u;
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(i5);
        SafeParcelWriter.m3583i(parcel, 4, getServiceRequest.f4435v);
        SafeParcelWriter.m3578d(parcel, 5, getServiceRequest.f4436w);
        SafeParcelWriter.m3586l(parcel, 6, getServiceRequest.f4437x, i2);
        SafeParcelWriter.m3575a(7, getServiceRequest.f4438y, parcel);
        SafeParcelWriter.m3582h(parcel, 8, getServiceRequest.f4439z, i2);
        SafeParcelWriter.m3586l(parcel, 10, getServiceRequest.f4426A, i2);
        SafeParcelWriter.m3586l(parcel, 11, getServiceRequest.f4427B, i2);
        boolean z = getServiceRequest.f4428C;
        SafeParcelWriter.m3588n(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i6 = getServiceRequest.f4429D;
        SafeParcelWriter.m3588n(parcel, 13, 4);
        parcel.writeInt(i6);
        boolean z2 = getServiceRequest.f4430E;
        SafeParcelWriter.m3588n(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 15, getServiceRequest.f4431F);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        Scope[] scopeArr = GetServiceRequest.f4424G;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f4425H;
        Feature[] featureArr2 = featureArr;
        String strM3558h = null;
        IBinder iBinderM3566p = null;
        Account account = null;
        String strM3558h2 = null;
        int iM3567q = 0;
        int iM3567q2 = 0;
        int iM3567q3 = 0;
        boolean zM3564n = false;
        int iM3567q4 = 0;
        boolean zM3564n2 = false;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 2:
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 3:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 4:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 5:
                    iBinderM3566p = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m3561k(parcel, i2, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.m3557g(parcel, i2, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.m3561k(parcel, i2, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m3561k(parcel, i2, Feature.CREATOR);
                    break;
                case '\f':
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\r':
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 14:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 15:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new GetServiceRequest(iM3567q, iM3567q2, iM3567q3, strM3558h, iBinderM3566p, scopeArr, bundle, account, featureArr, featureArr2, zM3564n, iM3567q4, zM3564n2, strM3558h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new GetServiceRequest[i2];
    }
}
