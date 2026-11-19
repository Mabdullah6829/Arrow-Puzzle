package androidx.core.view;

import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Map;

/* JADX INFO: renamed from: androidx.core.view.p */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1277p {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ WindowInsets.Builder m2369e() {
        return new WindowInsets.Builder();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ WindowInsets.Builder m2370f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo m2375k(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m2377m(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
