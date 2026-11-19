package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @NonNull
    public final Exception getException(@NonNull Status status) {
        int i2 = status.f4210s;
        int i3 = status.f4210s;
        String strM3425a = status.f4211t;
        if (i2 == 8) {
            if (strM3425a == null) {
                strM3425a = CommonStatusCodes.m3425a(i3);
            }
            return new FirebaseException(strM3425a);
        }
        if (strM3425a == null) {
            strM3425a = CommonStatusCodes.m3425a(i3);
        }
        return new FirebaseApiNotAvailableException(strM3425a);
    }
}
