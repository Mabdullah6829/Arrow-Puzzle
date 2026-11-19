package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.google.android.gms.internal.base.zab
        /* JADX INFO: renamed from: u */
        public final boolean mo3465u(int i2, Parcel parcel, Parcel parcel2) {
            if (i2 != 1) {
                return false;
            }
            Status status = (Status) com.google.android.gms.internal.base.zac.m9077a(parcel, Status.CREATOR);
            com.google.android.gms.internal.base.zac.m9080d(parcel);
            mo3464D1(status);
            return true;
        }
    }

    /* JADX INFO: renamed from: D1 */
    void mo3464D1(Status status);
}
