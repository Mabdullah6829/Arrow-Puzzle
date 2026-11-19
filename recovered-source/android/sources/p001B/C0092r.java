package p001B;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.FrameLayout;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;
import com.arrow.puzzle.escape.maze.free.game.activity.SplashActivity;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p000A0.C0039h;
import p006D0.C0166a;
import p006D0.C0177l;
import p006D0.InterfaceC0170e;
import p006D0.InterfaceC0171f;
import p007E.C0195d;
import p008E0.C0206i;
import p011H.AbstractC0243G;
import p022N.AbstractC0355G;
import p030R.C0559h0;
import p034T.C0720c1;
import p034T.C0742i;
import p034T.C0783s0;
import p034T.InterfaceC0748j1;
import p036U.C0829j;
import p036U.C0830k;
import p049b0.AbstractC1886b;
import p049b0.C1887c;
import p050c0.InterfaceC1888a;
import p057d0.C6289k;
import p059f.RunnableC6319a;
import p059f.ViewOnClickListenerC6332n;
import p061g.AbstractC6341f;
import p061g.C6336a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p069k.AbstractC6434o;
import p069k.C6431l;
import p072l.C6470e;
import p074m.C6474a;
import p074m.InterfaceC6475b;
import p077p.C6485b;
import p078p0.InterfaceC6502p;
import p079q.C6518i;
import p081r.C6526e;

/* JADX INFO: renamed from: B.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C0092r implements InterfaceC0170e, OnCompleteListener, InterfaceC0748j1, OnUserEarnedRewardListener, InterfaceC6475b {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f129s;

    /* JADX INFO: renamed from: t */
    public Object f130t;

    public /* synthetic */ C0092r(int i2) {
        this.f129s = i2;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    /* JADX INFO: renamed from: a */
    public void mo162a() {
        MainActivity mainActivity = (MainActivity) this.f130t;
        mainActivity.f2905s.post(new RunnableC6319a(mainActivity, 1));
    }

    /* JADX INFO: renamed from: c */
    public C6431l m163c() {
        Context context = (Context) this.f130t;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C6431l c6431l = new C6431l();
        c6431l.f24601s = C6474a.m12196a(AbstractC6434o.f24610a);
        C0092r c0092r = new C0092r(context, 17);
        c6431l.f24602t = c0092r;
        c6431l.f24603u = C6474a.m12196a(new C0177l(16, c0092r, new C0092r(c0092r, 16)));
        C0092r c0092r2 = c6431l.f24602t;
        c6431l.f24604v = new C6526e(c0092r2, 1);
        InterfaceC1888a interfaceC1888aM12196a = C6474a.m12196a(new C6526e(c0092r2, 0));
        c6431l.f24605w = interfaceC1888aM12196a;
        InterfaceC1888a interfaceC1888aM12196a2 = C6474a.m12196a(new C0177l(17, c6431l.f24604v, interfaceC1888aM12196a));
        c6431l.f24606x = interfaceC1888aM12196a2;
        C1887c c1887c = new C1887c(9);
        C0092r c0092r3 = c6431l.f24602t;
        C0086l c0086l = new C0086l(c0092r3, interfaceC1888aM12196a2, c1887c, 9);
        InterfaceC1888a interfaceC1888a = c6431l.f24601s;
        InterfaceC1888a interfaceC1888a2 = c6431l.f24603u;
        C6485b c6485b = new C6485b(interfaceC1888a, interfaceC1888a2, c0086l, interfaceC1888aM12196a2, interfaceC1888aM12196a2);
        C6518i c6518i = new C6518i(c0092r3, interfaceC1888a2, interfaceC1888aM12196a2, c0086l, interfaceC1888a, interfaceC1888aM12196a2, interfaceC1888aM12196a2);
        C0742i c0742i = new C0742i();
        c0742i.f1886s = interfaceC1888a;
        c0742i.f1887t = interfaceC1888aM12196a2;
        c0742i.f1888u = c0086l;
        c0742i.f1889v = interfaceC1888aM12196a2;
        c6431l.f24607y = C6474a.m12196a(new C0086l(c6485b, c6518i, c0742i, 8));
        return c6431l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [i0.i, p0.p] */
    @Override // p006D0.InterfaceC0170e
    public Object collect(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) throws Throwable {
        C0166a c0166a;
        Throwable th;
        C0206i c0206i;
        if (interfaceC6348c instanceof C0166a) {
            c0166a = (C0166a) interfaceC6348c;
            int i2 = c0166a.f298v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0166a.f298v = i2 - Integer.MIN_VALUE;
            } else {
                c0166a = new C0166a(this, interfaceC6348c);
            }
        } else {
            c0166a = new C0166a(this, interfaceC6348c);
        }
        Object obj = c0166a.f296t;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c0166a.f298v;
        C6289k c6289k = C6289k.f24318a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0206i = c0166a.f295s;
            try {
                AbstractC0243G.m377o(obj);
                c0206i.releaseIntercepted();
                return c6289k;
            } catch (Throwable th2) {
                th = th2;
                c0206i.releaseIntercepted();
                throw th;
            }
        }
        AbstractC0243G.m377o(obj);
        C0206i c0206i2 = new C0206i(interfaceC0171f, c0166a.getContext());
        try {
            c0166a.f295s = c0206i2;
            c0166a.f298v = 1;
            Object objInvoke = ((AbstractC6379i) this.f130t).invoke(c0206i2, c0166a);
            if (objInvoke != enumC6363a) {
                objInvoke = c6289k;
            }
            if (objInvoke == enumC6363a) {
                return enumC6363a;
            }
            c0206i = c0206i2;
            c0206i.releaseIntercepted();
            return c6289k;
        } catch (Throwable th3) {
            th = th3;
            c0206i = c0206i2;
            c0206i.releaseIntercepted();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m164d() {
        StartActivity startActivity = (StartActivity) ((ViewOnClickListenerC6332n) this.f130t).f24361t;
        int i2 = StartActivity.f2911t;
        startActivity.getClass();
        startActivity.startActivity(new Intent(startActivity, (Class<?>) MainActivity.class));
        startActivity.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }

    /* JADX INFO: renamed from: e */
    public InputStream m165e() {
        InputStream inputStream = (InputStream) this.f130t;
        this.f130t = null;
        return inputStream;
    }

    /* JADX INFO: renamed from: f */
    public void m166f(boolean z) {
        C0720c1 c0720c1 = (C0720c1) this.f130t;
        c0720c1.f1769Z.m1664a(c0720c1.f1748E, z);
    }

    /* JADX INFO: renamed from: g */
    public void m167g(C0559h0 c0559h0, byte[] bArr) {
        AbstractC1886b.m2715c();
        try {
            String str = "/" + ((C0830k) this.f130t).f2227j.f1201b;
            if (bArr != null) {
                ((C0830k) this.f130t).f2234q = true;
                str = str + "?" + C0195d.f387c.m287c(bArr);
            }
            synchronized (((C0830k) this.f130t).f2231n.f2222w) {
                C0829j.m1709j(((C0830k) this.f130t).f2231n, c0559h0, str);
            }
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p050c0.InterfaceC1888a
    public Object get() {
        switch (this.f129s) {
            case 16:
                return new C6470e((Context) ((C0092r) this.f130t).f130t, new C1887c(11), new C1887c(10));
            default:
                return this.f130t;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f129s) {
            case 2:
                C0039h c0039h = (C0039h) this.f130t;
                Exception exception = task.getException();
                if (exception != null) {
                    c0039h.resumeWith(AbstractC0243G.m372j(exception));
                } else if (!task.isCanceled()) {
                    c0039h.resumeWith(task.getResult());
                } else {
                    c0039h.m82m(null);
                }
                break;
            default:
                SplashActivity splashActivity = (SplashActivity) this.f130t;
                if (!task.isSuccessful()) {
                    Log.e("Hello", "Me");
                } else {
                    AbstractC0355G.f702z = ((DocumentSnapshot) task.getResult()).getData().get("admob_banner").toString();
                    ((DocumentSnapshot) task.getResult()).getData().get("fb_banner").toString();
                    AbstractC0355G.f689A = ((DocumentSnapshot) task.getResult()).getData().get("admob_full").toString();
                    AbstractC0355G.f690B = ((DocumentSnapshot) task.getResult()).getData().get("fb_full").toString();
                    AbstractC0355G.f691C = ((DocumentSnapshot) task.getResult()).getData().get("admob_rewarded").toString();
                    AbstractC0355G.f692D = ((DocumentSnapshot) task.getResult()).getData().get("admob_native").toString();
                    AbstractC0355G.f693E = ((DocumentSnapshot) task.getResult()).getData().get("fb_native").toString();
                    AbstractC0355G.f694F = ((DocumentSnapshot) task.getResult()).getData().get("admob_open").toString();
                    AbstractC0355G.f695G = ((DocumentSnapshot) task.getResult()).getData().get("ad_counter").toString();
                    FrameLayout frameLayout = AbstractC6341f.f24383a;
                    AdRequest adRequest = new AdRequest(new AdRequest.Builder());
                    C6336a c6336a = new C6336a(splashActivity, adRequest);
                    AbstractC6341f.f24392j = c6336a;
                    InterstitialAd.m3273b(splashActivity, AbstractC0355G.f689A, adRequest, c6336a);
                    AbstractC6341f.m12151a(splashActivity);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f129s) {
            case 10:
                StringBuilder sb = new StringBuilder();
                String[] strArr = (String[]) this.f130t;
                int length = strArr.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    String str = null;
                    sb.append((i3 < 0 || i3 >= strArr.length) ? null : strArr[i3]);
                    sb.append(": ");
                    int i4 = i3 + 1;
                    if (i4 >= 0 && i4 < strArr.length) {
                        str = strArr[i4];
                    }
                    sb.append(str);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0092r(Object obj, int i2) {
        this.f129s = i2;
        this.f130t = obj;
    }

    public C0092r() {
        this.f129s = 3;
        this.f130t = new ConcurrentHashMap(16);
    }

    public C0092r(C0783s0 c0783s0) {
        this.f129s = 10;
        ArrayList arrayList = c0783s0.f2033b;
        this.f130t = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0092r(InterfaceC6502p interfaceC6502p) {
        this.f129s = 1;
        this.f130t = (AbstractC6379i) interfaceC6502p;
    }
}
