package com.instagram.common.viewpoint.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.p052v7.widget.LinearLayoutManager$SavedState;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qi */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3511Qi implements Parcelable.Creator<LinearLayoutManager$SavedState> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final LinearLayoutManager$SavedState createFromParcel(Parcel parcel) {
        return new LinearLayoutManager$SavedState(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final LinearLayoutManager$SavedState[] newArray(int i2) {
        return new LinearLayoutManager$SavedState[i2];
    }
}
