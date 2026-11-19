package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String[] strArrM3559i = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleM3552b = null;
        int iM3567q = 0;
        int iM3567q2 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                strArrM3559i = SafeParcelReader.m3559i(i2, parcel);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m3561k(parcel, i2, CursorWindow.CREATOR);
            } else if (c == 3) {
                iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 4) {
                bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
            } else if (c != 1000) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        DataHolder dataHolder = new DataHolder(iM3567q, strArrM3559i, cursorWindowArr, iM3567q2, bundleM3552b);
        dataHolder.f4390u = new Bundle();
        int i3 = 0;
        while (true) {
            String[] strArr = dataHolder.f4389t;
            if (i3 >= strArr.length) {
                break;
            }
            dataHolder.f4390u.putInt(strArr[i3], i3);
            i3++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.f4391v;
        dataHolder.f4394y = new int[cursorWindowArr2.length];
        int numRows = 0;
        for (int i4 = 0; i4 < cursorWindowArr2.length; i4++) {
            dataHolder.f4394y[i4] = numRows;
            numRows += cursorWindowArr2[i4].getNumRows() - (numRows - cursorWindowArr2[i4].getStartPosition());
        }
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new DataHolder[i2];
    }
}
