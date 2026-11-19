package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface ICancelToken extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @Override // com.google.android.gms.internal.common.zzb
        /* JADX INFO: renamed from: u */
        public final boolean mo3533u(int i2, Parcel parcel, Parcel parcel2) {
            if (i2 != 2) {
                return false;
            }
            cancel();
            throw null;
        }
    }

    void cancel();
}
