package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    /* JADX INFO: renamed from: s */
    public final int f4581s;

    /* JADX INFO: renamed from: t */
    public final HashMap f4582t;

    /* JADX INFO: renamed from: u */
    public final SparseArray f4583u;

    public StringToIntConverter() {
        this.f4581s = 1;
        this.f4582t = new HashMap();
        this.f4583u = new SparseArray();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4581s);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f4582t;
        for (String str : map.keySet()) {
            arrayList.add(new zac(str, ((Integer) map.get(str)).intValue()));
        }
        SafeParcelWriter.m3587m(parcel, 2, arrayList);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public StringToIntConverter(ArrayList arrayList, int i2) {
        this.f4581s = i2;
        this.f4582t = new HashMap();
        this.f4583u = new SparseArray();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zac zacVar = (zac) arrayList.get(i3);
            String str = zacVar.f4587t;
            int i4 = zacVar.f4588u;
            this.f4582t.put(str, Integer.valueOf(i4));
            this.f4583u.put(i4, str);
        }
    }
}
