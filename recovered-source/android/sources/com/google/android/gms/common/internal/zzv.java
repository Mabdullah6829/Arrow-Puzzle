package com.google.android.gms.common.internal;

import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends com.google.android.gms.internal.common.zza implements zzx {
    @Override // com.google.android.gms.common.internal.zzx
    /* JADX INFO: renamed from: a */
    public final int mo3614a() {
        Parcel parcelM9085u = m9085u(2, m9084k0());
        int i2 = parcelM9085u.readInt();
        parcelM9085u.recycle();
        return i2;
    }

    @Override // com.google.android.gms.common.internal.zzx
    /* JADX INFO: renamed from: d */
    public final IObjectWrapper mo3615d() {
        return AbstractC1456a.m2439f(m9085u(1, m9084k0()));
    }
}
