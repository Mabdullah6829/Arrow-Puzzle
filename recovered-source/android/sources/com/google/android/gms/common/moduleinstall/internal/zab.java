package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zab implements Comparator {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f4569s = 0;

    static {
        new zab();
    }

    private /* synthetic */ zab() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj2;
        Feature feature2 = (Feature) obj;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        return !feature2.f4149s.equals(feature.f4149s) ? feature2.f4149s.compareTo(feature.f4149s) : Long.compare(feature2.m3395w(), feature.m3395w());
    }
}
