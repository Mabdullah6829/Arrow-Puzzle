package androidx.core.app;

import android.content.ClipData;
import android.location.LocationRequest;
import android.p046os.OutcomeReceiver;
import android.view.ContentInfo;

/* JADX INFO: renamed from: androidx.core.app.e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1158e {
    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ LocationRequest m2053e(Object obj) {
        return (LocationRequest) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ OutcomeReceiver m2056h(Object obj) {
        return (OutcomeReceiver) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ ContentInfo.Builder m2058j(ClipData clipData, int i2) {
        return new ContentInfo.Builder(clipData, i2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ContentInfo.Builder m2059k(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ContentInfo m2061m(Object obj) {
        return (ContentInfo) obj;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m2064p() {
    }
}
