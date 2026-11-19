package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    /* JADX INFO: renamed from: s */
    public final int f4613s;

    /* JADX INFO: renamed from: t */
    public final HashMap f4614t;

    /* JADX INFO: renamed from: u */
    public final String f4615u;

    public zan(int i2, String str, ArrayList arrayList) {
        this.f4613s = i2;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zal zalVar = (zal) arrayList.get(i3);
            String str2 = zalVar.f4608t;
            ArrayList arrayList2 = zalVar.f4609u;
            HashMap map2 = new HashMap();
            Preconditions.m3544h(arrayList2);
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                zam zamVar = (zam) arrayList2.get(i4);
                map2.put(zamVar.f4611t, zamVar.f4612u);
            }
            map.put(str2, map2);
        }
        this.f4614t = map;
        Preconditions.m3544h(str);
        this.f4615u = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map3.get((String) it2.next())).f4590B = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap map = this.f4614t;
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map2.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4613s);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f4614t;
        for (String str : map.keySet()) {
            arrayList.add(new zal(str, (Map) map.get(str)));
        }
        SafeParcelWriter.m3587m(parcel, 2, arrayList);
        SafeParcelWriter.m3583i(parcel, 3, this.f4615u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
