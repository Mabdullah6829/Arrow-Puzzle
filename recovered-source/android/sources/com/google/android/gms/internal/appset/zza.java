package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: s */
    public final IBinder f21529s;

    public zza(IBinder iBinder) {
        this.f21529s = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21529s;
    }
}
