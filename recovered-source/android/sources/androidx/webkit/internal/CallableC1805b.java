package androidx.webkit.internal;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: renamed from: androidx.webkit.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1805b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2851b;

    public /* synthetic */ CallableC1805b(Object obj, int i2) {
        this.f2850a = i2;
        this.f2851b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2850a) {
            case 0:
                return JavaScriptReplyProxyImpl.lambda$forInvocationHandler$0((JsReplyProxyBoundaryInterface) this.f2851b);
            case 1:
                return WebViewRenderProcessImpl.lambda$forInvocationHandler$0((WebViewRendererBoundaryInterface) this.f2851b);
            case 2:
                return ((CrashlyticsCore) this.f2851b).lambda$checkForPreviousCrash$10();
            default:
                return ((FirebaseInstallations) this.f2851b).deleteFirebaseInstallationId();
        }
    }
}
