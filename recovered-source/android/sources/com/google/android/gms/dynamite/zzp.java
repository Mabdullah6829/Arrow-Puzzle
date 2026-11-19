package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    /* JADX INFO: renamed from: D0 */
    public final IObjectWrapper m3711D0(ObjectWrapper objectWrapper, String str, int i2, ObjectWrapper objectWrapper2) {
        Parcel parcelM9084k0 = m9084k0();
        com.google.android.gms.internal.common.zzc.m9104b(parcelM9084k0, objectWrapper);
        parcelM9084k0.writeString(str);
        parcelM9084k0.writeInt(i2);
        com.google.android.gms.internal.common.zzc.m9104b(parcelM9084k0, objectWrapper2);
        return AbstractC1456a.m2439f(m9085u(8, parcelM9084k0));
    }

    /* JADX INFO: renamed from: u0 */
    public final IObjectWrapper m3712u0(ObjectWrapper objectWrapper, String str, int i2) {
        Parcel parcelM9084k0 = m9084k0();
        com.google.android.gms.internal.common.zzc.m9104b(parcelM9084k0, objectWrapper);
        parcelM9084k0.writeString(str);
        parcelM9084k0.writeInt(i2);
        return AbstractC1456a.m2439f(m9085u(2, parcelM9084k0));
    }

    /* JADX INFO: renamed from: x0 */
    public final IObjectWrapper m3713x0(ObjectWrapper objectWrapper, String str, int i2) {
        Parcel parcelM9084k0 = m9084k0();
        com.google.android.gms.internal.common.zzc.m9104b(parcelM9084k0, objectWrapper);
        parcelM9084k0.writeString(str);
        parcelM9084k0.writeInt(i2);
        return AbstractC1456a.m2439f(m9085u(4, parcelM9084k0));
    }
}
