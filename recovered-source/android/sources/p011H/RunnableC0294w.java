package p011H;

import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.DispatchQueue;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.button.MaterialButton;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.FirestoreClient;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p003C.AbstractC0111b;

/* JADX INFO: renamed from: H.w */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0294w implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f573s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f574t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f575u;

    public /* synthetic */ RunnableC0294w(int i2, Object obj, Object obj2) {
        this.f573s = i2;
        this.f574t = obj;
        this.f575u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f573s;
        Object obj = this.f575u;
        Object obj2 = this.f574t;
        switch (i2) {
            case 0:
                C0241E c0241e = (C0241E) obj2;
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                try {
                    if (!listenableFuture.isCancelled()) {
                        try {
                            AbstractC0253Q.m379b(listenableFuture);
                        } catch (Error e) {
                            e = e;
                            c0241e.m344q(e);
                        } catch (RuntimeException e2) {
                            e = e2;
                            c0241e.m344q(e);
                        } catch (ExecutionException e3) {
                            c0241e.m344q(e3.getCause());
                        }
                        break;
                    } else {
                        c0241e.f479D = null;
                        c0241e.cancel(false);
                    }
                    return;
                } finally {
                    c0241e.m343p(null);
                }
            case 1:
                ((C0241E) obj2).m343p((AbstractC0111b) obj);
                return;
            case 2:
                ((TrustedWebActivityServiceConnectionPool) obj2).lambda$connect$0((Uri) obj);
                return;
            case 3:
                ((ViewTransition) obj2).lambda$applyTransition$0((View[]) obj);
                return;
            case 4:
                ((ResourcesCompat.FontCallback) obj2).lambda$callbackSuccessAsync$0((Typeface) obj);
                return;
            case 5:
                DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1((DispatchQueue) obj2, (Runnable) obj);
                return;
            case 6:
                ((MaterialButton) obj2).lambda$maybeRunAfterWidthAnimation$0((Runnable) obj);
                return;
            case 7:
                ((UserMetadata) obj2).lambda$updateRolloutsState$1((List) obj);
                return;
            case 8:
                ActivityScope.lambda$onFragmentActivityStopCallOnce$1((FragmentActivity) obj2, (Runnable) obj);
                return;
            case 9:
                ActivityScope.lambda$onActivityStopCallOnce$0((Activity) obj2, (Runnable) obj);
                return;
            case 10:
                ((FirestoreClient) obj2).lambda$waitForPendingWrites$18((TaskCompletionSource) obj);
                return;
            case 11:
                ((FirestoreClient) obj2).lambda$new$1((User) obj);
                return;
            case 12:
                ((FirestoreClient) obj2).lambda$configureFieldIndexes$22((List) obj);
                return;
            case 13:
                FragmentStrictMode.m12286handlePolicyViolation$lambda0((FragmentStrictMode.Policy) obj2, (Violation) obj);
                return;
            case 14:
                FragmentStrictMode.m12287handlePolicyViolation$lambda1((String) obj2, (Violation) obj);
                return;
            default:
                int i3 = JobInfoSchedulerService.f2925s;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
        }
    }

    public /* synthetic */ RunnableC0294w(C0241E c0241e, ListenableFuture listenableFuture, int i2) {
        this.f573s = 0;
        this.f574t = c0241e;
        this.f575u = listenableFuture;
    }
}
