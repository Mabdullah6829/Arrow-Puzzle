package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgml implements zzglm {

    /* JADX INFO: renamed from: a */
    public final zzggd f17796a;

    /* JADX INFO: renamed from: b */
    public final zzgpe f17797b;

    /* JADX INFO: renamed from: c */
    public final zzgop f17798c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f17799d;

    /* JADX INFO: renamed from: e */
    public final zzgpj f17800e;

    /* JADX INFO: renamed from: f */
    public final zzgqo f17801f;

    /* JADX INFO: renamed from: g */
    public final Object f17802g = new Object();

    /* JADX INFO: renamed from: h */
    public final String f17803h;

    /* JADX INFO: renamed from: i */
    public final long f17804i;

    /* JADX INFO: renamed from: j */
    public final long f17805j;

    /* JADX INFO: renamed from: k */
    public final boolean f17806k;

    /* JADX INFO: renamed from: l */
    public final boolean f17807l;

    /* JADX INFO: renamed from: m */
    public zzgmk f17808m;

    public zzgml(zzggd zzggdVar, zzgpe zzgpeVar, zzgop zzgopVar, zzgpj zzgpjVar, zzgqo zzgqoVar, zzgdq zzgdqVar, ExecutorService executorService) {
        this.f17796a = zzggdVar;
        this.f17797b = zzgpeVar;
        this.f17798c = zzgopVar;
        this.f17799d = executorService;
        this.f17800e = zzgpjVar;
        this.f17801f = zzgqoVar;
        this.f17803h = zzgdqVar.m6921U();
        this.f17804i = zzgdqVar.m6929c0();
        this.f17805j = zzgdqVar.m6928b0();
        this.f17806k = zzgdqVar.m6919S();
        this.f17807l = zzgdqVar.m6920T();
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo7027a(final Context context, final View view, final Activity activity) {
        return zzhcf.m7369c(this.f17799d, new Callable() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                final HashMap map = new HashMap();
                final zzgml zzgmlVar = this.f17768a;
                final Context context2 = context;
                final View view2 = view;
                final Activity activity2 = activity;
                zzgmlVar.f17801f.m7065f(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzgml zzgmlVar2 = zzgmlVar;
                        zzgpj zzgpjVar = zzgmlVar2.f17800e;
                        Context context3 = context2;
                        View view3 = view2;
                        HashMap mapM7048b = zzgpjVar.m7048b(context3, view3);
                        HashMap map2 = map;
                        map2.putAll(mapM7048b);
                        zzgmlVar2.m7033f(map2);
                        map2.put("f", "v");
                        map2.put("ctx", context3);
                        map2.put("view", view3);
                        map2.put("act", activity2);
                        map2.put("bds", null);
                    }
                });
                String strM7035h = zzgmlVar.m7035h(map);
                map.clear();
                return strM7035h;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: b */
    public final void mo7028b(InputEvent inputEvent) {
        try {
            synchronized (this.f17802g) {
                try {
                    zzgmk zzgmkVar = this.f17808m;
                    if (zzgmkVar != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        zzgmkVar.f17792a.m4438c(zzgmkVar.f17794c, Optional.of(map));
                    } else {
                        this.f17801f.m7061b(20105);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (zzavc | zzavg e) {
            this.f17801f.m7063d(e, 20104);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: c */
    public final int mo7029c() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: d */
    public final ListenableFuture mo7030d(final Context context) {
        return zzhcf.m7369c(this.f17799d, new Callable() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                final HashMap map = new HashMap();
                final zzgml zzgmlVar = this.f17766a;
                final Context context2 = context;
                zzgmlVar.f17801f.m7065f(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzgml zzgmlVar2 = zzgmlVar;
                        HashMap mapM7047a = zzgmlVar2.f17800e.m7047a();
                        HashMap map2 = map;
                        map2.putAll(mapM7047a);
                        zzgmlVar2.m7033f(map2);
                        map2.put("f", "q");
                        map2.put("ctx", context2);
                    }
                });
                String strM7035h = zzgmlVar.m7035h(map);
                map.clear();
                return strM7035h;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    /* JADX INFO: renamed from: e */
    public final ListenableFuture mo7031e(final Context context, final String str, final View view) {
        return zzhcf.m7369c(this.f17799d, new Callable() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                final HashMap map = new HashMap();
                final zzgml zzgmlVar = this.f17772a;
                final Context context2 = context;
                final View view2 = view;
                final String str2 = str;
                zzgmlVar.f17801f.m7065f(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmi
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzgml zzgmlVar2 = zzgmlVar;
                        HashMap mapM7049c = zzgmlVar2.f17800e.m7049c();
                        HashMap map2 = map;
                        map2.putAll(mapM7049c);
                        zzgmlVar2.m7033f(map2);
                        map2.put("f", "c");
                        map2.put("ctx", context2);
                        map2.put("view", view2);
                        map2.put("act", null);
                        map2.put("bds", str2);
                    }
                });
                String strM7035h = zzgmlVar.m7035h(map);
                map.clear();
                return strM7035h;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX INFO: renamed from: f */
    public final void m7033f(HashMap map) {
        String strM4629y0;
        zzgqm zzgqmVarM7060a;
        String str;
        map.put("v", this.f17803h);
        ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
        ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
        zzgqo zzgqoVar = this.f17801f;
        byte[] bArrM8099h = null;
        long jM4563A0 = -1;
        if (listenableFuture != null) {
            zzgqm zzgqmVarM7060a2 = zzgqoVar.m7060a(20107);
            try {
                try {
                    zzgqmVarM7060a2.m7057a();
                    zzayt zzaytVar = (zzayt) listenableFuture.get(this.f17805j, TimeUnit.MILLISECONDS);
                    if (zzaytVar != null) {
                        bArrM8099h = zzaytVar.m4567D0().m8099h();
                        strM4629y0 = zzaytVar.m4629y0().length() > 1 ? zzaytVar.m4629y0() : "E";
                        try {
                            if (zzaytVar.m4630z0()) {
                                jM4563A0 = zzaytVar.m4563A0();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            zzgqmVarM7060a2.m7058b(e);
                        } catch (InterruptedException e2) {
                            e = e2;
                            zzgqmVarM7060a2.m7058b(e);
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zzgqmVarM7060a2.m7058b(e);
                        } catch (TimeoutException e4) {
                            e = e4;
                            zzgqmVarM7060a2.m7058b(e);
                        }
                    } else {
                        strM4629y0 = "E";
                    }
                } catch (Throwable th) {
                    zzgqmVarM7060a2.m7059c();
                    throw th;
                }
            } catch (ClassCastException e5) {
                e = e5;
                strM4629y0 = "E";
                zzgqmVarM7060a2.m7058b(e);
                zzgqmVarM7060a2.m7059c();
                if (strM4629y0.equals("E")) {
                    zzgqmVarM7060a = zzgqoVar.m7060a(20108);
                    try {
                        try {
                            zzgqmVarM7060a.m7057a();
                            str = (String) listenableFuture2.get(this.f17804i, TimeUnit.MILLISECONDS);
                            if (true != zzgtq.m7127a(str)) {
                                strM4629y0 = str;
                            }
                        } catch (ClassCastException e6) {
                            e = e6;
                            zzgqmVarM7060a.m7058b(e);
                        } catch (InterruptedException e7) {
                            e = e7;
                            zzgqmVarM7060a.m7058b(e);
                        } catch (ExecutionException e8) {
                            e = e8;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            zzgqmVarM7060a.m7058b(e);
                        } catch (TimeoutException e9) {
                            e = e9;
                            zzgqmVarM7060a.m7058b(e);
                        }
                        zzgqmVarM7060a.m7059c();
                    } catch (Throwable th2) {
                        zzgqmVarM7060a.m7059c();
                        throw th2;
                    }
                }
                map.put("int", strM4629y0);
                if (bArrM8099h != null) {
                    map.put("att", bArrM8099h);
                }
                map.put("gv", Long.valueOf(jM4563A0));
            } catch (InterruptedException e10) {
                e = e10;
                strM4629y0 = "E";
                zzgqmVarM7060a2.m7058b(e);
                zzgqmVarM7060a2.m7059c();
                if (strM4629y0.equals("E")) {
                    zzgqmVarM7060a = zzgqoVar.m7060a(20108);
                    zzgqmVarM7060a.m7057a();
                    str = (String) listenableFuture2.get(this.f17804i, TimeUnit.MILLISECONDS);
                    if (true != zzgtq.m7127a(str)) {
                        strM4629y0 = str;
                    }
                    zzgqmVarM7060a.m7059c();
                }
                map.put("int", strM4629y0);
                if (bArrM8099h != null) {
                    map.put("att", bArrM8099h);
                }
                map.put("gv", Long.valueOf(jM4563A0));
            } catch (ExecutionException e11) {
                e = e11;
                strM4629y0 = "E";
            } catch (TimeoutException e12) {
                e = e12;
                strM4629y0 = "E";
                zzgqmVarM7060a2.m7058b(e);
                zzgqmVarM7060a2.m7059c();
                if (strM4629y0.equals("E")) {
                    zzgqmVarM7060a = zzgqoVar.m7060a(20108);
                    zzgqmVarM7060a.m7057a();
                    str = (String) listenableFuture2.get(this.f17804i, TimeUnit.MILLISECONDS);
                    if (true != zzgtq.m7127a(str)) {
                        strM4629y0 = str;
                    }
                    zzgqmVarM7060a.m7059c();
                }
                map.put("int", strM4629y0);
                if (bArrM8099h != null) {
                    map.put("att", bArrM8099h);
                }
                map.put("gv", Long.valueOf(jM4563A0));
            }
            zzgqmVarM7060a2.m7059c();
        } else {
            strM4629y0 = "E";
        }
        if (strM4629y0.equals("E") && listenableFuture2 != null) {
            zzgqmVarM7060a = zzgqoVar.m7060a(20108);
            zzgqmVarM7060a.m7057a();
            str = (String) listenableFuture2.get(this.f17804i, TimeUnit.MILLISECONDS);
            if (true != zzgtq.m7127a(str)) {
                strM4629y0 = str;
            }
            zzgqmVarM7060a.m7059c();
        }
        map.put("int", strM4629y0);
        if (bArrM8099h != null) {
            map.put("att", bArrM8099h);
        }
        map.put("gv", Long.valueOf(jM4563A0));
    }

    /* JADX INFO: renamed from: g */
    public final void m7034g(zzavi zzaviVar, byte[] bArr, boolean z) {
        zzgqm zzgqmVarM7060a = this.f17801f.m7060a(20102);
        try {
            try {
                zzgqmVarM7060a.m7057a();
                synchronized (this.f17802g) {
                    this.f17808m = zzgmk.m7032a(zzaviVar, bArr, z);
                }
                zzgqmVarM7060a.m7059c();
            } catch (zzavc e) {
                e = e;
                zzgqmVarM7060a.m7058b(e);
                throw new zzgln("r: 2", e);
            } catch (zzavg e2) {
                e = e2;
                zzgqmVarM7060a.m7058b(e);
                throw new zzgln("r: 2", e);
            } catch (Throwable th) {
                zzgqmVarM7060a.m7058b(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgqmVarM7060a.m7059c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m7035h(HashMap map) {
        String strM7282g;
        zzgqo zzgqoVar = this.f17801f;
        zzgqm zzgqmVarM7060a = zzgqoVar.m7060a(20110);
        try {
            zzgqmVarM7060a.m7057a();
            synchronized (this.f17802g) {
                try {
                    zzgmk zzgmkVar = this.f17808m;
                    if (zzgmkVar == null) {
                        zzgqoVar.m7061b(20109);
                        strM7282g = "";
                    } else {
                        byte[] bArr = (byte[]) zzgmkVar.f17792a.m4438c(zzgmkVar.f17793b, Optional.of(map));
                        zzgzn zzgznVar = (zzgzn) zzgzo.f18402b;
                        strM7282g = (zzgznVar.f18399e == null ? zzgznVar : zzgznVar.mo7276i(zzgznVar.f18398d, null)).m7282g(bArr.length, bArr);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzgqmVarM7060a.m7059c();
            return strM7282g;
        } catch (Throwable th2) {
            try {
                zzgqmVarM7060a.m7058b(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgqmVarM7060a.m7059c();
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final String zza() {
        synchronized (this.f17802g) {
            try {
                zzgmk zzgmkVar = this.f17808m;
                if (zzgmkVar == null) {
                    return "3.893135394.-1";
                }
                return zzgmkVar.f17795d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final zzhbx zzb() {
        boolean z = this.f17807l;
        zzhbu zzhbuVar = zzhbu.f18506s;
        zzgop zzgopVar = this.f17798c;
        if (z) {
            return (zzhbx) zzhcf.m7375i(zzgopVar.mo7043b(), new zzgmf(this), zzhbuVar);
        }
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzgopVar.zzb());
        zzgmj zzgmjVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmj
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return null;
            }
        };
        ExecutorService executorService = this.f17799d;
        return (zzhbx) zzhcf.m7372f((zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7371e(zzhbxVarM7360q, Throwable.class, zzgmjVar, executorService), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzglz
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                zzggb zzggbVar = (zzggb) obj;
                final zzgml zzgmlVar = this.f17761a;
                if (zzggbVar != null) {
                    zzgmlVar.f17796a.mo6974a((zziex) zzggbVar.m6992G());
                }
                if (zzgmlVar.f17797b.mo7044a(zzggbVar)) {
                    return zzhcf.m7375i(zzgmlVar.f17798c.mo7042a(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgme
                        @Override // com.google.android.gms.internal.ads.zzgti
                        public final Object apply(Object obj2) {
                            zzavi zzaviVar = new zzavi();
                            zzgmlVar.m7034g(zzaviVar, (byte[]) obj2, false);
                            return null;
                        }
                    }, zzhbu.f18506s);
                }
                zzgmlVar.f17801f.m7061b(20103);
                throw new zzgln(1);
            }
        }, executorService), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                Throwable th = (Throwable) obj;
                zzgml zzgmlVar = this.f17765a;
                return zzgmlVar.f17806k ? zzhcf.m7375i(zzgmlVar.f17798c.mo7043b(), new zzgmf(zzgmlVar), zzhbu.f18506s) : zzhcf.m7368b(th);
            }
        }, zzhbuVar);
    }
}
