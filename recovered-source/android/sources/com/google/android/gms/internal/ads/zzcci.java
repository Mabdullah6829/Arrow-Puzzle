package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzcci extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcci> CREATOR = new zzccj();

    /* JADX INFO: renamed from: s */
    public final String f9740s;

    /* JADX INFO: renamed from: t */
    public final int f9741t;

    public zzcci(String str, int i2) {
        this.f9740s = str;
        this.f9741t = i2;
    }

    /* JADX INFO: renamed from: w */
    public static zzcci m5329w(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcci(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcci)) {
            return false;
        }
        zzcci zzcciVar = (zzcci) obj;
        return Objects.m3535a(this.f9740s, zzcciVar.f9740s) && Objects.m3535a(Integer.valueOf(this.f9741t), Integer.valueOf(zzcciVar.f9741t));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9740s, Integer.valueOf(this.f9741t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f9740s);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f9741t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
