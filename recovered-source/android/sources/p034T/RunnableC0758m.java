package p034T;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.View;
import androidx.constraintlayout.core.state.C1106a;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.facebook.ads.InterstitialAd;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.core.TransactionRunner;
import com.google.firebase.installations.FirebaseInstallations;
import p001B.C0092r;
import p006D0.C0177l;
import p030R.RunnableC0595z0;
import p061g.AbstractC6341f;
import p079q.C6519j;
import p081r.C6530i;

/* JADX INFO: renamed from: T.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0758m implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1917s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f1918t;

    public /* synthetic */ RunnableC0758m(Object obj, int i2) {
        this.f1917s = i2;
        this.f1918t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1917s) {
            case 0:
                C0762n c0762n = (C0762n) this.f1918t;
                C0177l c0177l = c0762n.f1961d;
                if (c0177l != null) {
                    RunnableC0595z0 runnableC0595z0 = (RunnableC0595z0) c0177l.f333u;
                    if (!runnableC0595z0.f1310u && !runnableC0595z0.f1309t) {
                        c0177l.m271c();
                    }
                }
                c0762n.f1960c = null;
                break;
            case 1:
                ((C0799w1) this.f1918t).mo1268e();
                break;
            case 2:
                C0729e2 c0729e2 = ((C0725d2) this.f1918t).f1833e;
                c0729e2.f1851b.m1638a(new RunnableC0681Q(c0729e2, 10));
                break;
            case 3:
                ((Carousel) this.f1918t).lambda$updateItems$0();
                break;
            case 4:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) this.f1918t);
                break;
            case 5:
                ((View) this.f1918t).requestLayout();
                break;
            case 6:
                ((MaterialButton) this.f1918t).lambda$setOpticalCenterEnabled$5();
                break;
            case 7:
                ((CarouselLayoutManager) this.f1918t).refreshKeylineState();
                break;
            case 8:
                ((MaterialBackOrchestrator) this.f1918t).startListeningForBackCallbacksWithPriorityOverlay();
                break;
            case 9:
                ((ListenerRegistration) this.f1918t).remove();
                break;
            case 10:
                ((TransactionRunner) this.f1918t).lambda$runWithBackoff$2();
                break;
            case 11:
                ((FirebaseInstallations) this.f1918t).lambda$getId$1();
                break;
            case 12:
                Activity activity = (Activity) this.f1918t;
                try {
                    ProgressDialog progressDialog = AbstractC6341f.f24391i;
                    if (progressDialog != null && progressDialog.isShowing()) {
                        AbstractC6341f.f24391i.dismiss();
                    }
                    zzbss zzbssVar = AbstractC6341f.f24385c;
                    if (zzbssVar == null) {
                        AbstractC6341f.m12152b(activity, AbstractC6341f.f24388f);
                    } else {
                        zzbssVar.mo3277e(activity);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    AbstractC6341f.m12152b(activity, AbstractC6341f.f24388f);
                    return;
                }
                break;
            case 13:
                C0092r c0092r = (C0092r) this.f1918t;
                try {
                    ProgressDialog progressDialog2 = AbstractC6341f.f24391i;
                    if (progressDialog2 != null && progressDialog2.isShowing()) {
                        AbstractC6341f.f24391i.dismiss();
                    }
                    InterstitialAd interstitialAd = AbstractC6341f.f24386d;
                    if (interstitialAd != null && interstitialAd.isAdLoaded()) {
                        AbstractC6341f.f24386d.show();
                    } else {
                        c0092r.m164d();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    c0092r.m164d();
                    return;
                }
                break;
            default:
                C6519j c6519j = (C6519j) this.f1918t;
                ((C6530i) c6519j.f24735d).m12207l(new C1106a(c6519j, 20));
                break;
        }
    }
}
