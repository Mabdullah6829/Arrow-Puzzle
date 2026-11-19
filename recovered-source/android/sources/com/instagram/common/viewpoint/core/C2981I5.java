package com.instagram.common.viewpoint.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.I5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2981I5 implements Parcelable.Creator<IcyHeaders> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final IcyHeaders createFromParcel(Parcel parcel) {
        return new IcyHeaders(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final IcyHeaders[] newArray(int i2) {
        return new IcyHeaders[i2];
    }
}
