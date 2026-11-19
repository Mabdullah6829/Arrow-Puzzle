package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.util.Pair;
import androidx.core.os.EnvironmentCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.regex.Pattern;
import p001B.AbstractC0076b;
import p001B.AbstractC0089o;
import p001B.C0090p;
import p001B.InterfaceC0082h;
import p001B.InterfaceC0097w;
import p003C.AbstractC0116g;
import p003C.AbstractC0120k;
import p003C.C0113d;
import p003C.C0129t;
import p003C.C0135z;
import p011H.AbstractC0243G;
import p011H.AbstractC0253Q;
import p011H.AbstractC0290s;
import p011H.AbstractRunnableC0266c;
import p011H.C0256U;
import p011H.C0262a;
import p011H.C0264b;
import p011H.C0291t;
import p011H.C0292u;
import p011H.EnumC0244H;
import p011H.ExecutorServiceC0267c0;
import p011H.InterfaceC0238B;
import p011H.InterfaceScheduledExecutorServiceC0260Y;
import p011H.RunnableFutureC0281j0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpg {

    /* JADX INFO: renamed from: i */
    public static final zzpe f22723i = new zzpe(0);

    /* JADX INFO: renamed from: j */
    public static final zzon f22724j;

    /* JADX INFO: renamed from: a */
    public volatile zzqs f22725a;

    /* JADX INFO: renamed from: b */
    public final zzlk f22726b;

    /* JADX INFO: renamed from: c */
    public final String f22727c;

    /* JADX INFO: renamed from: d */
    public final String f22728d;

    /* JADX INFO: renamed from: e */
    public final boolean f22729e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0120k f22730f;

    /* JADX INFO: renamed from: g */
    public final zzps f22731g;

    /* JADX INFO: renamed from: h */
    public final zzqt f22732h;

    static {
        zzox zzoxVar = new InterfaceC0082h() { // from class: com.google.android.gms.internal.measurement.zzox
            @Override // p001B.InterfaceC0082h
            public final /* synthetic */ Object apply(Object obj) {
                zzpe zzpeVar = zzpg.f22723i;
                return "";
            }
        };
        int i2 = AbstractC0120k.f179u;
        f22724j = new zzon(zzoxVar, false, C0135z.f209B);
    }

    public zzpg(zzlk zzlkVar, zzon zzonVar) {
        this.f22726b = zzlkVar;
        String strM10578a = zzonVar.m10578a(zzlkVar.f22619b);
        this.f22727c = strM10578a;
        this.f22728d = "";
        this.f22729e = zzonVar.f22699b;
        this.f22730f = zzonVar.f22700c;
        this.f22725a = null;
        this.f22731g = new zzps();
        this.f22732h = new zzqt(zzlkVar, strM10578a);
    }

    /* JADX INFO: renamed from: a */
    public final zzqs m10580a() {
        zzqs zzqsVar;
        zzqs zzqsVar2 = this.f22725a;
        if (zzqsVar2 != null) {
            return zzqsVar2;
        }
        synchronized (this) {
            try {
                zzqsVar = this.f22725a;
                if (zzqsVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        zzqs zzqsVarM10592a = this.f22732h.m10592a();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i2 = zzqsVarM10592a.f22797e.f22792c - 2;
                        if (i2 == 15 || i2 == 16) {
                            zzqsVar = zzqsVarM10592a;
                        } else {
                            zzlk zzlkVar = this.f22726b;
                            zzlkVar.f22624g.m10621a();
                            if (this.f22729e || this.f22732h.m10593b() || !zzqsVarM10592a.f22794b.isEmpty()) {
                                ((ExecutorServiceC0267c0) zzlkVar.m10471a()).execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzoy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C0262a c0262aMo10517m;
                                        zzmd zzmdVarM10476B;
                                        final zzpg zzpgVar = this.f22714s;
                                        zzqs zzqsVarM10580a = zzpgVar.m10580a();
                                        String str = zzqsVarM10580a.f22794b;
                                        zzlk zzlkVar2 = zzpgVar.f22726b;
                                        zzrf zzrfVar = zzlkVar2.f22624g;
                                        InterfaceC0097w interfaceC0097w = zzlkVar2.f22621d;
                                        zzqn zzqnVarM10622b = zzrfVar.m10622b();
                                        boolean z = zzqnVarM10622b.f22784i;
                                        if (zzqnVarM10622b.f22785j) {
                                            if (AbstractC0089o.m161a(str) && !z) {
                                                C0256U c0256u = C0256U.f504t;
                                                return;
                                            }
                                            zzmb zzmbVarM10479B = zzme.m10479B();
                                            zzqr zzqrVar = zzqsVarM10580a.f22797e;
                                            if (zzqrVar.f22790a) {
                                                zzmdVarM10476B = zzmd.m10476B();
                                            } else {
                                                int i3 = zzqrVar.f22791b;
                                                zzmc zzmcVarM10475A = zzmd.m10475A();
                                                zzmcVarM10475A.m9552o();
                                                ((zzmd) zzmcVarM10475A.f22030t).m10477C(i3);
                                                int i4 = zzqrVar.f22792c;
                                                zzmcVarM10475A.m9552o();
                                                ((zzmd) zzmcVarM10475A.f22030t).m10478D(i4);
                                                zzmdVarM10476B = (zzmd) zzmcVarM10475A.m9555r();
                                            }
                                            zzmbVarM10479B.m9552o();
                                            ((zzme) zzmbVarM10479B.f22030t).m10482D(zzmdVarM10476B);
                                            if (!AbstractC0089o.m161a(str)) {
                                                zzmbVarM10479B.m9552o();
                                                ((zzme) zzmbVarM10479B.f22030t).m10481C(str);
                                            }
                                            if (z) {
                                                String str2 = zzpgVar.f22727c;
                                                zzmbVarM10479B.m9552o();
                                                ((zzme) zzmbVarM10479B.f22030t).m10483E(str2);
                                            }
                                            c0262aMo10517m = ((zzmj) interfaceC0097w.get()).mo10515b((zzme) zzmbVarM10479B.m9555r());
                                        } else {
                                            if (AbstractC0089o.m161a(str)) {
                                                C0256U c0256u2 = C0256U.f504t;
                                                return;
                                            }
                                            c0262aMo10517m = ((zzmj) interfaceC0097w.get()).mo10517m(str);
                                        }
                                        AbstractC0253Q.m378a(c0262aMo10517m, zzmk.class, new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzos
                                            @Override // p011H.InterfaceC0238B
                                            public final ListenableFuture apply(Object obj) {
                                                int i5 = ((zzmk) obj).f22648s;
                                                if (i5 == 29501 || i5 == 29537 || i5 == 29538 || i5 == 29539 || i5 == 29540 || i5 == 29541 || i5 == 29542 || i5 == 29543 || i5 == 29544) {
                                                    zzpg zzpgVar2 = zzpgVar;
                                                    if (!zzpgVar2.f22732h.m10593b()) {
                                                        zzpgVar2.m10581b();
                                                    }
                                                }
                                                return C0256U.f504t;
                                            }
                                        }, zzlkVar2.m10471a());
                                    }
                                });
                                zzlkVar.f22618a.m10577a(zzqsVarM10592a.f22795c, this.f22730f, this.f22727c);
                                if (!this.f22728d.equals("")) {
                                    ((ExecutorServiceC0267c0) zzlkVar.m10471a()).execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzoq
                                        @Override // java.lang.Runnable
                                        public final void run() throws IOException {
                                            Uri uri;
                                            zznu zznuVar;
                                            zzuj zzujVar;
                                            final zzpg zzpgVar = this.f22704s;
                                            zzlk zzlkVar2 = zzpgVar.f22726b;
                                            String str = zzpgVar.f22727c;
                                            zzvb zzvbVar = zzpu.f22746a;
                                            zztd zztdVar = new zztd();
                                            zztdVar.f22880d = zztw.f22913a;
                                            byte b = (byte) (zztdVar.f22882f | 2);
                                            zztdVar.f22881e = true;
                                            zztdVar.f22882f = (byte) (b | 1);
                                            Context context = zzlkVar2.f22619b;
                                            Pattern pattern = zzsa.f22856a;
                                            zzrz zzrzVar = new zzrz(context);
                                            zzrzVar.m10638a("phenotype");
                                            zzrzVar.m10639b("all_accounts.pb");
                                            Uri uriM10640c = zzrzVar.m10640c();
                                            if (uriM10640c == null) {
                                                throw new NullPointerException("Null uri");
                                            }
                                            zztdVar.f22877a = uriM10640c;
                                            zznu zznuVarM10568B = zznu.m10568B();
                                            if (zznuVarM10568B == null) {
                                                throw new NullPointerException("Null schema");
                                            }
                                            zztdVar.f22878b = zznuVarM10568B;
                                            zzvb zzvbVar2 = zzpu.f22746a;
                                            zzvbVar2.getClass();
                                            C0090p c0090p = new C0090p(zzvbVar2);
                                            byte b2 = (byte) (zztdVar.f22882f | 2);
                                            zztdVar.f22882f = b2;
                                            if (zztdVar.f22879c == null) {
                                                C0113d c0113d = AbstractC0116g.f168t;
                                                zztdVar.f22879c = C0129t.f192w;
                                            }
                                            if (b2 != 3 || (uri = zztdVar.f22877a) == null || (zznuVar = zztdVar.f22878b) == null || (zzujVar = zztdVar.f22880d) == null) {
                                                StringBuilder sb = new StringBuilder();
                                                if (zztdVar.f22877a == null) {
                                                    sb.append(" uri");
                                                }
                                                if (zztdVar.f22878b == null) {
                                                    sb.append(" schema");
                                                }
                                                if (zztdVar.f22880d == null) {
                                                    sb.append(" variantConfig");
                                                }
                                                if ((zztdVar.f22882f & 1) == 0) {
                                                    sb.append(" useGeneratedExtensionRegistry");
                                                }
                                                if ((zztdVar.f22882f & 2) == 0) {
                                                    sb.append(" enableTracing");
                                                }
                                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                            }
                                            zzte zzteVar = new zzte(uri, zznuVar, c0090p, zztdVar.f22879c, zzujVar, zztdVar.f22881e);
                                            zztt zzttVar = zzpu.f22748c;
                                            if (zzttVar == null) {
                                                synchronized (zzpu.f22747b) {
                                                    try {
                                                        zzttVar = zzpu.f22748c;
                                                        if (zzttVar == null) {
                                                            zztu zztuVar = new zztu();
                                                            zztuVar.f22909a = zzlkVar2.m10471a();
                                                            zztuVar.f22910b = (zzru) zzlkVar2.f22623f.get();
                                                            zzuw zzuwVar = zztx.f22914a;
                                                            HashMap map = zztuVar.f22911c;
                                                            AbstractC0076b.m129d("There is already a factory registered for the ID %s", !map.containsKey("singleproc"), "singleproc");
                                                            map.put("singleproc", zzuwVar);
                                                            zztt zzttVar2 = new zztt(zztuVar.f22909a, zztuVar.f22910b, zztuVar.f22912d, zztuVar.f22911c);
                                                            zzpu.f22748c = zzttVar2;
                                                            zzttVar = zzttVar2;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            }
                                            ConcurrentHashMap concurrentHashMap = zzttVar.f22904a;
                                            Uri uri2 = zzteVar.f22883a;
                                            Pair pairCreate = (Pair) concurrentHashMap.get(uri2);
                                            if (pairCreate == null) {
                                                Uri uri3 = zzteVar.f22883a;
                                                AbstractC0076b.m129d("Uri must be hierarchical: %s", uri3.isHierarchical(), uri3);
                                                String lastPathSegment = uri3.getLastPathSegment();
                                                int i3 = AbstractC0089o.f119a;
                                                if (lastPathSegment == null) {
                                                    lastPathSegment = "";
                                                }
                                                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                AbstractC0076b.m129d("Uri extension must be .pb: %s", (iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), uri3);
                                                AbstractC0076b.m131f(zzteVar.f22885c != null, "Handler cannot be null");
                                                zzuw zzuwVar2 = (zzuw) zzttVar.f22908e.get("singleproc");
                                                AbstractC0076b.m129d("No XDataStoreVariantFactory registered for ID %s", zzuwVar2 != null, "singleproc");
                                                String lastPathSegment2 = zzteVar.f22883a.getLastPathSegment();
                                                if (lastPathSegment2 == null) {
                                                    lastPathSegment2 = "";
                                                }
                                                int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                if (iLastIndexOf2 != -1) {
                                                    lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                }
                                                C0291t c0291tM384g = AbstractC0253Q.m384g(AbstractC0253Q.m381d(zzteVar.f22883a), zzttVar.f22907d, EnumC0244H.f483s);
                                                Executor executor = zzttVar.f22905b;
                                                zzui zzuiVarMo10661b = zzuwVar2.mo10661b(zzteVar, lastPathSegment2, executor, zzttVar.f22906c);
                                                zzuwVar2.mo10660a();
                                                zztp zztpVar = new zztp(zzuiVarMo10661b, c0291tM384g);
                                                AbstractC0116g abstractC0116g = zzteVar.f22886d;
                                                if (!abstractC0116g.isEmpty()) {
                                                    zzto zztoVar = new zzto(abstractC0116g, executor);
                                                    synchronized (zztpVar.f22964g) {
                                                        zztpVar.f22966i.add(zztoVar);
                                                    }
                                                }
                                                pairCreate = Pair.create(zztpVar, zzteVar);
                                                Pair pair = (Pair) concurrentHashMap.putIfAbsent(uri2, pairCreate);
                                                if (pair != null) {
                                                    pairCreate = pair;
                                                }
                                            }
                                            zztp zztpVar2 = (zztp) pairCreate.first;
                                            zztr zztrVar = (zztr) pairCreate.second;
                                            if (zzteVar.equals(zztrVar)) {
                                                final C0292u c0292uM10665a = zztpVar2.m10665a(new zzpt(str), zzlkVar2.m10471a());
                                                c0292uM10665a.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzot
                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        try {
                                                            AbstractC0253Q.m379b(c0292uM10665a);
                                                        } catch (Exception e) {
                                                            String str2 = zzpgVar.f22727c;
                                                            Log.w("FlagStore", AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 73), "Failed to store account on flag read for: ", str2, " which may lead to stale flags."), e);
                                                        }
                                                    }
                                                }, zzlkVar2.m10471a());
                                                return;
                                            }
                                            String strM141p = AbstractC0076b.m141p("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", zzteVar.f22884b.getClass().getSimpleName(), zzteVar.f22883a);
                                            AbstractC0076b.m129d(strM141p, zzteVar.f22883a.equals(zztrVar.mo10652a()), "uri");
                                            AbstractC0076b.m129d(strM141p, zzteVar.f22884b.equals(zztrVar.mo10653b()), "schema");
                                            AbstractC0076b.m129d(strM141p, zzteVar.f22885c.equals(zztrVar.mo10654c()), "handler");
                                            AbstractC0076b.m129d(strM141p, zzteVar.f22886d.equals(zztrVar.mo10655d()), "migrations");
                                            AbstractC0076b.m129d(strM141p, zzteVar.f22887e.equals(zztrVar.mo10656e()), "variantConfig");
                                            AbstractC0076b.m129d(strM141p, zzteVar.f22888f == zztrVar.mo10657f(), "useGeneratedExtensionRegistry");
                                            throw new IllegalArgumentException(AbstractC0076b.m141p(strM141p, EnvironmentCompat.MEDIA_UNKNOWN));
                                        }
                                    });
                                }
                                if (this.f22732h.m10593b()) {
                                    ((ExecutorServiceC0267c0) zzlkVar.m10471a()).execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzor
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final AbstractC0290s abstractC0290sMo10514a;
                                            zzpg zzpgVar = this.f22705s;
                                            final zzqe zzqeVar = zzpgVar.f22726b.f22626i;
                                            boolean z = zzpgVar.f22729e;
                                            zzou zzouVar = new zzqc() { // from class: com.google.android.gms.internal.measurement.zzou
                                                /* JADX WARN: Code duplicated, block: B:39:0x0069 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:25:0x004c, B:27:0x0050, B:29:0x0054, B:34:0x005e, B:39:0x0069, B:40:0x0073), top: B:47:0x004c }] */
                                                @Override // com.google.android.gms.internal.measurement.zzqc
                                                /* JADX INFO: renamed from: a */
                                                public final boolean mo10579a(zzaef zzaefVar) {
                                                    zzpe zzpeVar = zzpg.f22723i;
                                                    zzpeVar.getClass();
                                                    if (zzaefVar == null || zzaefVar.isEmpty()) {
                                                        return false;
                                                    }
                                                    Iterator<E> it = zzaefVar.iterator();
                                                    boolean z2 = false;
                                                    while (it.hasNext()) {
                                                        zzoo zzooVar = (zzoo) zzpeVar.f22721a.get((String) it.next());
                                                        if (zzooVar != null) {
                                                            zzpg zzpgVar2 = zzooVar.f22702a;
                                                            boolean z3 = true;
                                                            if (zzpgVar2.f22729e) {
                                                                zzqs zzqsVar3 = zzpgVar2.f22725a;
                                                                if (zzqsVar3 != null && (zzqsVar3.f22793a || zzqsVar3.f22797e.f22791b == 3 || zzpgVar2.f22732h.m10593b())) {
                                                                    synchronized (zzpgVar2) {
                                                                        try {
                                                                            zzqs zzqsVar4 = zzpgVar2.f22725a;
                                                                            if (zzqsVar4 != null) {
                                                                                if (zzqsVar4.f22793a) {
                                                                                    zzpgVar2.f22725a = null;
                                                                                    zzpgVar2.f22731g.f22744a.incrementAndGet();
                                                                                } else {
                                                                                    if (zzqsVar4.f22797e.f22791b != 3) {
                                                                                        z3 = false;
                                                                                    }
                                                                                    if (z3 || zzpgVar2.f22732h.m10593b()) {
                                                                                        zzpgVar2.f22725a = null;
                                                                                        zzpgVar2.f22731g.f22744a.incrementAndGet();
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                                z3 = false;
                                                            }
                                                            z2 |= z3;
                                                        }
                                                    }
                                                    return z2;
                                                }
                                            };
                                            final zzqm zzqmVar = (zzqm) zzqeVar.f22760c.get();
                                            if (zzqmVar == null && !z) {
                                                C0256U c0256u = C0256U.f504t;
                                                return;
                                            }
                                            if ((zzqeVar.f22762e & 64) == 0) {
                                                CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f22763f;
                                                synchronized (copyOnWriteArrayList) {
                                                    try {
                                                        int i3 = zzqeVar.f22762e;
                                                        if ((i3 & 64) == 0) {
                                                            copyOnWriteArrayList.add(zzouVar);
                                                            zzqeVar.f22762e = i3 | 64;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            }
                                            if (zzqeVar.f22765h == null) {
                                                synchronized (zzqeVar.f22764g) {
                                                    try {
                                                        if (zzqeVar.f22765h == null) {
                                                            if (zzqmVar == null) {
                                                                zzqmVar = new zzqm() { // from class: com.google.android.gms.internal.measurement.zzqb
                                                                    @Override // com.google.android.gms.internal.measurement.zzqm
                                                                    public final /* synthetic */ void zza() {
                                                                    }
                                                                };
                                                            }
                                                            Context context = zzqeVar.f22758a;
                                                            if (zzky.m10464b(context)) {
                                                                abstractC0290sMo10514a = ((zzmj) zzqeVar.f22761d.get()).mo10514a(new zzqd(zzqeVar, zzqmVar));
                                                                zzqeVar.f22765h = abstractC0290sMo10514a;
                                                            } else {
                                                                zzpz zzpzVar = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpz
                                                                    @Override // java.lang.Runnable
                                                                    public final /* synthetic */ void run() {
                                                                    }
                                                                };
                                                                InterfaceC0097w interfaceC0097w = zzqeVar.f22759b;
                                                                abstractC0290sMo10514a = AbstractC0253Q.m384g(zzky.m10463a(context, Executors.callable(zzpzVar, null), (Executor) interfaceC0097w.get()), new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzqa
                                                                    @Override // p011H.InterfaceC0238B
                                                                    public final ListenableFuture apply(Object obj) {
                                                                        zzqe zzqeVar2 = zzqeVar;
                                                                        return ((zzmj) zzqeVar2.f22761d.get()).mo10514a(new zzqd(zzqeVar2, zzqmVar));
                                                                    }
                                                                }, (Executor) interfaceC0097w.get());
                                                                zzqeVar.f22765h = abstractC0290sMo10514a;
                                                            }
                                                            abstractC0290sMo10514a.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpy
                                                                @Override // java.lang.Runnable
                                                                public final /* synthetic */ void run() {
                                                                    try {
                                                                        AbstractC0253Q.m379b(abstractC0290sMo10514a);
                                                                    } catch (Exception e) {
                                                                        Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e);
                                                                    }
                                                                }
                                                            }, (Executor) zzqeVar.f22759b.get());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        }
                                    });
                                }
                                zzqsVar = zzqsVarM10592a;
                            } else {
                                ((ExecutorServiceC0267c0) zzlkVar.m10471a()).execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzop
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.f22703s.m10581b();
                                    }
                                });
                                zzqsVar = new zzqs(zzqv.m10595H(), zzqsVarM10592a.f22797e);
                            }
                        }
                        if (!this.f22729e || zzqsVar.f22797e.f22792c != 17) {
                            this.f22725a = zzqsVar;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzqsVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m10581b() {
        final zzqt zzqtVar = this.f22732h;
        zzlk zzlkVar = zzqtVar.f22799a;
        final C0292u c0292uM383f = AbstractC0253Q.m383f(((zzmj) zzlkVar.f22621d.get()).zza(zzqtVar.f22801c), new InterfaceC0082h() { // from class: com.google.android.gms.internal.measurement.zzqp
            @Override // p001B.InterfaceC0082h
            public final Object apply(Object obj) {
                zzmg zzmgVar = (zzmg) obj;
                zzqu zzquVarM10594G = zzqv.m10594G();
                if (zzmgVar == null) {
                    return (zzqv) zzquVarM10594G.m9555r();
                }
                for (zzmi zzmiVar : zzmgVar.m10489E()) {
                    zzqw zzqwVarM10607G = zzqx.m10607G();
                    String strM10501A = zzmiVar.m10501A();
                    zzqwVarM10607G.m9552o();
                    ((zzqx) zzqwVarM10607G.f22030t).m10614H(strM10501A);
                    int iM10513O = zzmiVar.m10513O();
                    int i2 = iM10513O - 1;
                    if (iM10513O == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        long jM10502B = zzmiVar.m10502B();
                        zzqwVarM10607G.m9552o();
                        ((zzqx) zzqwVarM10607G.f22030t).m10615I(jM10502B);
                    } else if (i2 == 1) {
                        boolean zM10503C = zzmiVar.m10503C();
                        zzqwVarM10607G.m9552o();
                        ((zzqx) zzqwVarM10607G.f22030t).m10616J(zM10503C);
                    } else if (i2 == 2) {
                        double dM10504D = zzmiVar.m10504D();
                        zzqwVarM10607G.m9552o();
                        ((zzqx) zzqwVarM10607G.f22030t).m10617K(dM10504D);
                    } else if (i2 == 3) {
                        String strM10505E = zzmiVar.m10505E();
                        zzqwVarM10607G.m9552o();
                        ((zzqx) zzqwVarM10607G.f22030t).m10618L(strM10505E);
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        zzacr zzacrVarM10506F = zzmiVar.m10506F();
                        zzqwVarM10607G.m9552o();
                        ((zzqx) zzqwVarM10607G.f22030t).m10619M(zzacrVarM10506F);
                    }
                    zzqx zzqxVar = (zzqx) zzqwVarM10607G.m9555r();
                    zzquVarM10594G.m9552o();
                    ((zzqv) zzquVarM10594G.f22030t).m10606M(zzqxVar);
                }
                String strM10488D = zzmgVar.m10488D();
                zzquVarM10594G.m9552o();
                ((zzqv) zzquVarM10594G.f22030t).m10604K(strM10488D);
                String strM10485A = zzmgVar.m10485A();
                zzquVarM10594G.m9552o();
                ((zzqv) zzquVarM10594G.f22030t).m10602I(strM10485A);
                long jM10490F = zzmgVar.m10490F();
                zzquVarM10594G.m9552o();
                ((zzqv) zzquVarM10594G.f22030t).m10605L(jM10490F);
                if (zzmgVar.m10486B()) {
                    zzacr zzacrVarM10487C = zzmgVar.m10487C();
                    zzquVarM10594G.m9552o();
                    ((zzqv) zzquVarM10594G.f22030t).m10603J(zzacrVarM10487C);
                }
                return (zzqv) zzquVarM10594G.m9555r();
            }
        }, zzlkVar.m10471a());
        InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzpf
            @Override // p011H.InterfaceC0238B
            public final ListenableFuture apply(Object obj) {
                final zzqv zzqvVar = (zzqv) obj;
                final zzqt zzqtVar2 = zzqtVar;
                zzqtVar2.getClass();
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.zzqq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzqv zzqvVar2 = zzqvVar;
                        zzqt zzqtVar3 = zzqtVar2;
                        zzlk zzlkVar2 = zzqtVar3.f22799a;
                        zzse zzseVar = new zzse();
                        try {
                            zzru zzruVar = (zzru) zzlkVar2.f22623f.get();
                            Uri uri = zzqtVar3.f22800b;
                            zzsv zzsvVar = new zzsv(zzqvVar2);
                            zzsvVar.f22874b = new zzro[]{zzseVar};
                            return null;
                        } catch (IOException | RuntimeException e) {
                            zzlz.m10473a(Level.WARNING, zzlkVar2.m10471a(), e, "Failed to update snapshot for %s flags may be stale.", zzqtVar3.f22801c);
                            return null;
                        }
                    }
                };
                InterfaceScheduledExecutorServiceC0260Y interfaceScheduledExecutorServiceC0260YM10471a = zzqtVar2.f22799a.m10471a();
                RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0(callable);
                ((ExecutorServiceC0267c0) interfaceScheduledExecutorServiceC0260YM10471a).execute(runnableFutureC0281j0);
                return runnableFutureC0281j0;
            }
        };
        zzlk zzlkVar2 = this.f22726b;
        AbstractC0253Q.m384g(c0292uM383f, interfaceC0238B, zzlkVar2.m10471a()).addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzov
            /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: CancellationException -> 0x001f, ExecutionException -> 0x0021, TryCatch #3 {CancellationException -> 0x001f, ExecutionException -> 0x0021, blocks: (B:3:0x0004, B:5:0x001a, B:18:0x002c, B:20:0x0036, B:22:0x0042, B:28:0x0052, B:30:0x0056, B:12:0x0023, B:33:0x0083, B:14:0x0026, B:17:0x002b, B:26:0x0048, B:27:0x0051), top: B:39:0x0004, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:22:0x0042 A[Catch: CancellationException -> 0x001f, ExecutionException -> 0x0021, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x001f, ExecutionException -> 0x0021, blocks: (B:3:0x0004, B:5:0x001a, B:18:0x002c, B:20:0x0036, B:22:0x0042, B:28:0x0052, B:30:0x0056, B:12:0x0023, B:33:0x0083, B:14:0x0026, B:17:0x002b, B:26:0x0048, B:27:0x0051), top: B:39:0x0004, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:36:0x008c  */
            /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            public final void run() {
                zzqs zzqsVar;
                zzqm zzqmVar;
                final zzpg zzpgVar = this.f22710s;
                try {
                    zzqv zzqvVar = (zzqv) AbstractC0253Q.m379b(c0292uM383f);
                    zzqs zzqsVar2 = new zzqs(zzqvVar, new zzqr(6, 2));
                    boolean z = zzpgVar.f22729e;
                    if (z || (zzqsVar = zzpgVar.f22725a) == null) {
                        synchronized (zzpgVar) {
                            if (!z) {
                                zzqsVar = zzpgVar.f22725a;
                                if (zzqsVar != null) {
                                    if (!zzqsVar.f22796d.equals(zzqsVar2.f22796d)) {
                                        zzqmVar = (zzqm) zzpgVar.f22726b.f22622e.get();
                                        if (zzqmVar != null) {
                                            zzqmVar.zza();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            zzpgVar.f22725a = zzqsVar2;
                            zzpgVar.f22731g.f22744a.incrementAndGet();
                        }
                    } else if (!zzqsVar.f22796d.equals(zzqsVar2.f22796d)) {
                        zzqmVar = (zzqm) zzpgVar.f22726b.f22622e.get();
                        if (zzqmVar != null) {
                            zzqmVar.zza();
                            return;
                        }
                        return;
                    }
                    if (zzpgVar.f22729e) {
                        zzlk zzlkVar3 = zzpgVar.f22726b;
                        C0262a c0262aMo10517m = ((zzmj) zzlkVar3.f22621d.get()).mo10517m(zzqvVar.m10596A());
                        InterfaceC0082h interfaceC0082h = new InterfaceC0082h() { // from class: com.google.android.gms.internal.measurement.zzow
                            @Override // p001B.InterfaceC0082h
                            public final /* synthetic */ Object apply(Object obj) {
                                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(zzpgVar.f22727c)), (Throwable) obj);
                                return null;
                            }
                        };
                        InterfaceScheduledExecutorServiceC0260Y interfaceScheduledExecutorServiceC0260YM10471a = zzlkVar3.m10471a();
                        int i2 = AbstractRunnableC0266c.f515D;
                        C0264b c0264b = new C0264b(c0262aMo10517m, Throwable.class, interfaceC0082h);
                        c0262aMo10517m.addListener(c0264b, AbstractC0243G.m375m(interfaceScheduledExecutorServiceC0260YM10471a, c0264b));
                    }
                } catch (CancellationException e) {
                    e = e;
                    if (e.getCause() instanceof SecurityException) {
                    }
                    String str = zzpgVar.f22727c;
                    Log.w("FlagStore", AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 64), "Unable to update local snapshot for ", str, ", may result in stale flags."), e);
                } catch (ExecutionException e2) {
                    e = e2;
                    if (e.getCause() instanceof SecurityException) {
                        String str2 = zzpgVar.f22727c;
                        Log.w("FlagStore", AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e);
                    }
                }
            }
        }, zzlkVar2.m10471a());
    }
}
