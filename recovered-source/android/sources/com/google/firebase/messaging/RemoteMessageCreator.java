package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    public static final int CONTENT_DESCRIPTION = 0;

    public static void writeToParcel(RemoteMessage remoteMessage, Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3575a(2, remoteMessage.bundle, parcel);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    @Nullable
    public RemoteMessage createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        Bundle bundleM3552b = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            if (((char) i2) != 2) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new RemoteMessage(bundleM3552b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    @Nullable
    public RemoteMessage[] newArray(int i2) {
        return new RemoteMessage[i2];
    }
}
