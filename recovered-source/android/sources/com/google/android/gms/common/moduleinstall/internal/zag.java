package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class zag extends com.google.android.gms.internal.base.zab implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.zab
    /* JADX INFO: renamed from: u */
    public final boolean mo3465u(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        com.google.android.gms.internal.base.zac.m9080d(parcel);
        Objects.requireNonNull((zaab) this);
        throw null;
    }
}
