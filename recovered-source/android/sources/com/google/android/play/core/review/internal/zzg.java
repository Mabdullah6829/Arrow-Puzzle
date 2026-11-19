package com.google.android.play.core.review.internal;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.review.internal.zzb
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i4 = zzc.zza;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC0271e0.m396d(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        zzb(bundle);
        return true;
    }
}
