package androidx.constraintlayout.core.state;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.transition.C1750a;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.play.core.review.ReviewInfo;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.ServiceStarter;
import com.google.gson.internal.C6086a;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p001B.C0086l;
import p011H.AbstractC0242F;
import p034T.C0742i;
import p065i.C6369b;
import p065i.C6370c;
import p067j.C6405n;
import p067j.C6414w;
import p069k.AbstractC6437r;
import p076n.C6477a;
import p076n.EnumC6479c;
import p079q.C6517h;
import p079q.C6519j;
import p081r.C6530i;
import p081r.InterfaceC6524c;
import p081r.InterfaceC6525d;
import p082s.InterfaceC6533a;

/* JADX INFO: renamed from: androidx.constraintlayout.core.state.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1106a implements Interpolator, InputConnectionCompat.OnCommitContentListener, AccessibilityViewCommand, MaterialShapeDrawable.OnCornerSizeChangeListener, CanvasCompat.CanvasOperation, Deferred.DeferredHandler, Continuation, ObjectConstructor, OnCompleteListener, InterfaceC6533a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2626s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f2627t;

    public /* synthetic */ C1106a(Object obj, int i2) {
        this.f2626s = i2;
        this.f2627t = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public Object mo170a(Task task) {
        switch (this.f2626s) {
            case 8:
                return Boolean.valueOf(((SessionReportingCoordinator) this.f2627t).onReportSendComplete(task));
            case 9:
                return Utils.lambda$awaitEvenIfOnMainThread$0((CountDownLatch) this.f2627t, task);
            case 10:
                return CrashlyticsWorker.lambda$submit$1((Runnable) this.f2627t, task);
            case 11:
                return CrashlyticsWorker.lambda$submitTaskOnSuccess$5((SuccessContinuation) this.f2627t, task);
            default:
                return ((Transaction) this.f2627t).lambda$lookup$0(task);
        }
    }

    /* JADX INFO: renamed from: b */
    public C6369b m1981b(C0086l c0086l) throws IOException {
        C6370c c6370c = (C6370c) this.f2627t;
        URL url = (URL) c0086l.f113u;
        String strM355l = AbstractC0242F.m355l("CctTransportBackend");
        if (Log.isLoggable(strM355l, 4)) {
            Log.i(strM355l, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c6370c.f24442g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c0086l.f112t;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    c6370c.f24436a.encode((C6405n) c0086l.f114v, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strM355l2 = AbstractC0242F.m355l("CctTransportBackend");
                    if (Log.isLoggable(strM355l2, 4)) {
                        Log.i(strM355l2, String.format("Status Code: %d", numValueOf));
                    }
                    AbstractC0242F.m350f("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC0242F.m350f("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C6369b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C6369b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C6369b c6369b = new C6369b(responseCode, null, C6414w.m12163a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f24551a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c6369b;
                        } catch (Throwable th) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (EncodingException e) {
            e = e;
            AbstractC0242F.m351h("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C6369b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            AbstractC0242F.m351h("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C6369b(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            AbstractC0242F.m351h("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C6369b(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        } catch (IOException e4) {
            e = e4;
            AbstractC0242F.m351h("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C6369b(400, null, 0L);
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f2626s) {
            case 13:
                return ConstructorConstructor.lambda$newDefaultConstructor$2((Constructor) this.f2627t);
            default:
                return ConstructorConstructor.lambda$newUnsafeAllocator$4((Class) this.f2627t);
        }
    }

    @Override // p082s.InterfaceC6533a
    public Object execute() {
        int i2 = this.f2626s;
        Object obj = this.f2627t;
        switch (i2) {
            case 17:
                C6530i c6530i = (C6530i) ((C6517h) obj).f24724i;
                SQLiteDatabase sQLiteDatabaseM12203c = c6530i.m12203c();
                sQLiteDatabaseM12203c.beginTransaction();
                try {
                    sQLiteDatabaseM12203c.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM12203c.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c6530i.f24753t.m2719f()).execute();
                    sQLiteDatabaseM12203c.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM12203c.endTransaction();
                }
            case 18:
                C6530i c6530i2 = (C6530i) ((InterfaceC6524c) obj);
                c6530i2.getClass();
                int i3 = C6477a.f24660e;
                C0742i c0742i = new C0742i();
                c0742i.f1886s = null;
                c0742i.f1887t = new ArrayList();
                c0742i.f1888u = null;
                c0742i.f1889v = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseM12203c2 = c6530i2.m12203c();
                sQLiteDatabaseM12203c2.beginTransaction();
                try {
                    C6477a c6477a = (C6477a) C6530i.m12202o(sQLiteDatabaseM12203c2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C1750a(c6530i2, map, c0742i, 5));
                    sQLiteDatabaseM12203c2.setTransactionSuccessful();
                    return c6477a;
                } finally {
                    sQLiteDatabaseM12203c2.endTransaction();
                }
            case 19:
                C6530i c6530i3 = (C6530i) ((InterfaceC6525d) obj);
                long jM2719f = c6530i3.f24753t.m2719f() - c6530i3.f24755v.f24740d;
                SQLiteDatabase sQLiteDatabaseM12203c3 = c6530i3.m12203c();
                sQLiteDatabaseM12203c3.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jM2719f)};
                    Cursor cursorRawQuery = sQLiteDatabaseM12203c3.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c6530i3.m12206j(cursorRawQuery.getInt(0), EnumC6479c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM12203c3.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM12203c3.setTransactionSuccessful();
                    sQLiteDatabaseM12203c3.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseM12203c3.endTransaction();
                    throw th2;
                }
            default:
                C6519j c6519j = (C6519j) obj;
                SQLiteDatabase sQLiteDatabaseM12203c4 = ((C6530i) c6519j.f24733b).m12203c();
                sQLiteDatabaseM12203c4.beginTransaction();
                try {
                    List list = (List) C6530i.m12202o(sQLiteDatabaseM12203c4.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C6086a(10));
                    sQLiteDatabaseM12203c4.setTransactionSuccessful();
                    sQLiteDatabaseM12203c4.endTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c6519j.f24734c.m12198a((AbstractC6437r) it.next(), 1, false);
                    }
                    return null;
                } catch (Throwable th3) {
                    sQLiteDatabaseM12203c4.endTransaction();
                    throw th3;
                }
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f2) {
        return Transition.lambda$getInterpolator$0((String) this.f2627t, f2);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        switch (this.f2626s) {
            case 6:
                ((CrashlyticsNativeComponentDeferredProxy) this.f2627t).lambda$new$0(provider);
                break;
            default:
                RemoteConfigDeferredProxy.lambda$setupListener$0((CrashlyticsRemoteConfigListener) this.f2627t, provider);
                break;
        }
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.f2627t, inputContentInfoCompat, i2, bundle);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        StartActivity startActivity = (StartActivity) this.f2627t;
        int i2 = StartActivity.f2911t;
        startActivity.getClass();
        if (!task.isSuccessful()) {
            Log.e("Hello", "Me");
        } else {
            startActivity.f2912s.launchReviewFlow(startActivity, (ReviewInfo) task.getResult()).addOnCompleteListener(new C6086a(8));
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable.OnCornerSizeChangeListener
    public void onCornerSizeChange(float f2) {
        ((MaterialButton) this.f2627t).lambda$setOpticalCenterEnabled$4(f2);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return ((BottomSheetDragHandleView) this.f2627t).lambda$onBottomSheetStateChanged$0(view, commandArguments);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        switch (this.f2626s) {
            case 4:
                ((MaskableFrameLayout) this.f2627t).lambda$dispatchDraw$1(canvas);
                break;
            default:
                ((NavigationView) this.f2627t).lambda$dispatchDraw$0(canvas);
                break;
        }
    }
}
