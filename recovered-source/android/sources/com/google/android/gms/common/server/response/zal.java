package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();

    /* JADX INFO: renamed from: s */
    public final int f4607s;

    /* JADX INFO: renamed from: t */
    public final String f4608t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f4609u;

    public zal(int i2, String str, ArrayList arrayList) {
        this.f4607s = i2;
        this.f4608t = str;
        this.f4609u = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4607s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4608t);
        SafeParcelWriter.m3587m(parcel, 3, this.f4609u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f4607s = 1;
        this.f4608t = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f4609u = arrayList;
    }
}
