package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.work.WorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p001B.AbstractC0076b;
import p001B.InterfaceC0082h;
import p001B.InterfaceC0097w;
import p003C.AbstractC0116g;
import p011H.AbstractC0243G;
import p011H.AbstractC0249M;
import p011H.AbstractC0253Q;
import p011H.AbstractRunnableC0266c;
import p011H.C0250N;
import p011H.C0256U;
import p011H.C0262a;
import p011H.C0264b;
import p011H.C0292u;
import p011H.ExecutorServiceC0267c0;
import p011H.InterfaceC0238B;
import p011H.InterfaceScheduledExecutorServiceC0260Y;
import p011H.RunnableFutureC0281j0;
import p011H.ScheduledFutureC0263a0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrf {

    /* JADX INFO: renamed from: j */
    public static final Object f22809j = new Object();

    /* JADX INFO: renamed from: k */
    public static final Object f22810k = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f22811a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0097w f22812b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0097w f22813c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0097w f22814d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0097w f22815e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0097w f22816f;

    /* JADX INFO: renamed from: g */
    public final Uri f22817g;

    /* JADX INFO: renamed from: h */
    public volatile zzni f22818h;

    /* JADX INFO: renamed from: i */
    public final Uri f22819i;

    public zzrf(Context context, final InterfaceC0097w interfaceC0097w, InterfaceC0097w interfaceC0097w2, InterfaceC0097w interfaceC0097w3) {
        this.f22811a = context;
        this.f22813c = interfaceC0097w;
        this.f22812b = interfaceC0097w3;
        this.f22814d = interfaceC0097w2;
        Pattern pattern = zzsa.f22856a;
        zzrz zzrzVar = new zzrz(context);
        zzrzVar.m10638a("phenotype_storage_info");
        zzrzVar.m10639b("storage-info.pb");
        this.f22817g = zzrzVar.m10640c();
        zzrz zzrzVar2 = new zzrz(context);
        zzrzVar2.m10638a("phenotype_storage_info");
        zzrzVar2.m10639b("device-encrypted-storage-info.pb");
        Set set = zzsa.f22859d;
        zzsq.m10645a(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        zzrzVar2.f22848b = "directboot-files";
        this.f22819i = zzrzVar2.m10640c();
        this.f22815e = AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzre
            @Override // p001B.InterfaceC0097w
            public final Object get() {
                final zzrf zzrfVar = this.f22808s;
                InterfaceScheduledExecutorServiceC0260Y interfaceScheduledExecutorServiceC0260Y = (InterfaceScheduledExecutorServiceC0260Y) zzrfVar.f22813c.get();
                interfaceScheduledExecutorServiceC0260Y.getClass();
                zzmj zzmjVar = (zzmj) zzrfVar.f22812b.get();
                zzmjVar.getClass();
                C0262a c0262aMo10516d = zzmjVar.mo10516d();
                int i2 = AbstractC0249M.f500z;
                zzqz zzqzVar = new InterfaceC0082h() { // from class: com.google.android.gms.internal.measurement.zzqz
                    @Override // p001B.InterfaceC0082h
                    public final Object apply(Object obj) {
                        zzmk zzmkVar = (zzmk) obj;
                        if (zzmkVar.f22648s != 29514) {
                            throw zzmkVar;
                        }
                        zznn zznnVarM10556D = zzno.m10556D();
                        zznh zznhVarM10535N = zzni.m10535N();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        zznhVarM10535N.m9552o();
                        ((zzni) zznhVarM10535N.f22030t).m10550P(jCurrentTimeMillis);
                        zznnVarM10556D.m9552o();
                        ((zzno) zznnVarM10556D.f22030t).m10559E((zzni) zznhVarM10535N.m9555r());
                        return (zzno) zznnVarM10556D.m9555r();
                    }
                };
                int i3 = AbstractRunnableC0266c.f515D;
                C0264b c0264b = new C0264b(c0262aMo10516d, zzmk.class, zzqzVar);
                c0262aMo10516d.addListener(c0264b, AbstractC0243G.m375m(interfaceScheduledExecutorServiceC0260Y, c0264b));
                final C0292u c0292uM383f = AbstractC0253Q.m383f(c0264b, new InterfaceC0082h() { // from class: com.google.android.gms.internal.measurement.zzra
                    @Override // p001B.InterfaceC0082h
                    public final Object apply(Object obj) {
                        zzrf zzrfVar2 = zzrfVar;
                        zzno zznoVar = (zzno) obj;
                        zzse zzseVar = new zzse();
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                        try {
                            try {
                                synchronized (zzrf.f22809j) {
                                    zzru zzruVar = (zzru) zzrfVar2.f22814d.get();
                                    Uri uri = zzrfVar2.f22817g;
                                    zzsv zzsvVar = new zzsv(zznoVar.m10557A());
                                    zzsvVar.f22874b = new zzro[]{zzseVar};
                                    zzruVar.m10629a(uri, zzsvVar);
                                    zzrfVar2.f22818h = zznoVar.m10557A();
                                }
                                synchronized (zzrf.f22810k) {
                                    zzru zzruVar2 = (zzru) zzrfVar2.f22814d.get();
                                    Uri uri2 = zzrfVar2.f22819i;
                                    zzsv zzsvVar2 = new zzsv(zznoVar.m10558B());
                                    zzsvVar2.f22874b = new zzro[]{zzseVar};
                                    zzruVar2.m10629a(uri2, zzsvVar2);
                                    zznoVar.m10558B();
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                return null;
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    }
                }, interfaceScheduledExecutorServiceC0260Y);
                c0292uM383f.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzrb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        try {
                            AbstractC0253Q.m379b(c0292uM383f);
                        } catch (Exception e) {
                            if (Log.isLoggable("StorageInfoHandler", 3)) {
                                Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e);
                            }
                        }
                    }
                }, interfaceScheduledExecutorServiceC0260Y);
                return c0292uM383f;
            }
        });
        this.f22816f = AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzqy
            @Override // p001B.InterfaceC0097w
            public final Object get() {
                InterfaceScheduledExecutorServiceC0260Y interfaceScheduledExecutorServiceC0260Y = (InterfaceScheduledExecutorServiceC0260Y) interfaceC0097w.get();
                interfaceScheduledExecutorServiceC0260Y.getClass();
                zzrd zzrdVar = new Callable() { // from class: com.google.android.gms.internal.measurement.zzrd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return null;
                    }
                };
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0(zzrdVar);
                return new ScheduledFutureC0263a0(runnableFutureC0281j0, ((ExecutorServiceC0267c0) interfaceScheduledExecutorServiceC0260Y).f520t.schedule(runnableFutureC0281j0, WorkRequest.MIN_BACKOFF_MILLIS, timeUnit));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m10621a() {
        if (zzky.m10464b(this.f22811a)) {
            if (TimeUnit.HOURS.toMillis(24L) + m10623c().m10541E() < System.currentTimeMillis()) {
                InterfaceScheduledExecutorServiceC0260Y interfaceScheduledExecutorServiceC0260Y = (InterfaceScheduledExecutorServiceC0260Y) this.f22813c.get();
                interfaceScheduledExecutorServiceC0260Y.getClass();
                ListenableFuture listenableFutureM382e = AbstractC0253Q.m382e((ListenableFuture) this.f22816f.get());
                int i2 = AbstractC0249M.f500z;
                AbstractC0253Q.m384g(listenableFutureM382e instanceof AbstractC0249M ? (AbstractC0249M) listenableFutureM382e : new C0250N(listenableFutureM382e), new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzrc
                    @Override // p011H.InterfaceC0238B
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        return AbstractC0253Q.m382e((ListenableFuture) this.f22806a.f22815e.get());
                    }
                }, interfaceScheduledExecutorServiceC0260Y);
                return;
            }
        }
        C0256U c0256u = C0256U.f504t;
    }

    /* JADX INFO: renamed from: b */
    public final zzqn m10622b() {
        zzni zzniVarM10623c = m10623c();
        return new zzqn(zzniVarM10623c.m10539C(), AbstractC0116g.m194r(zzniVarM10623c.m10544H()), zzniVarM10623c.m10538B(), zzniVarM10623c.m10540D(), (zzniVarM10623c.m10545I() && zzniVarM10623c.m10546J().m10554B() == ((long) Build.VERSION.SDK_INT)) ? zzniVarM10623c.m10546J().m10553A() : "", AbstractC0116g.m194r(zzniVarM10623c.m10542F()), AbstractC0116g.m194r(zzniVarM10623c.m10543G()), zzniVarM10623c.m10537A(), zzniVarM10623c.m10548L(), zzniVarM10623c.m10547K(), zzniVarM10623c.m10549M());
    }

    /* JADX INFO: renamed from: c */
    public final zzni m10623c() {
        zzni zzniVarM10536O;
        zzni zzniVar = this.f22818h;
        if (zzniVar != null) {
            return zzniVar;
        }
        synchronized (f22809j) {
            try {
                zzniVarM10536O = this.f22818h;
                if (zzniVarM10536O == null) {
                    zzniVarM10536O = zzni.m10536O();
                    if (zzky.m10464b(this.f22811a)) {
                        zzss zzssVar = new zzss(zzniVarM10536O.mo9566d());
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            try {
                                zzni zzniVar2 = (zzni) ((zzru) this.f22814d.get()).m10629a(this.f22817g, zzssVar);
                                StrictMode.setThreadPolicy(threadPolicy);
                                zzniVarM10536O = zzniVar2;
                            } catch (IOException unused) {
                                StrictMode.setThreadPolicy(threadPolicy);
                            }
                            this.f22818h = zzniVarM10536O;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzniVarM10536O;
    }
}
