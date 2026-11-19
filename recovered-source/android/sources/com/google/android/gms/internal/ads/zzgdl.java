package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgdl {

    /* JADX INFO: renamed from: b */
    public static final Object f17042b = new Object();

    /* JADX INFO: renamed from: c */
    public static zzgdl f17043c;

    /* JADX INFO: renamed from: a */
    public final zzgdj f17044a;

    public zzgdl(Context context, zzgdq zzgdqVar, ExecutorService executorService) {
        zzgdx zzgdxVar = new zzgdx();
        context.getClass();
        zzgdxVar.f17068b = context;
        executorService.getClass();
        zzgdxVar.f17067a = executorService;
        zzgdxVar.f17069c = zzgdqVar;
        zzinh.m8555b(Context.class, zzgdxVar.f17068b);
        zzinh.m8555b(zzgdq.class, zzgdxVar.f17069c);
        new zzgjr();
        new zzgjt();
        new zzgjv();
        this.f17044a = (zzgdj) new zzgdw(zzgdxVar.f17068b, zzgdxVar.f17069c, zzgdxVar.f17067a).f17064p.zzb();
    }

    /* JADX INFO: renamed from: a */
    public final String m6900a(final Context context) {
        String string;
        ListenableFuture listenableFuture;
        final zzgdj zzgdjVar = this.f17044a;
        zzgew zzgewVar = zzgdjVar.f17028e;
        zzgqo zzgqoVar = zzgdjVar.f17027d;
        long j2 = zzgdjVar.f17032i;
        boolean z = false;
        if (zzgdjVar.f17033j && System.currentTimeMillis() - j2 <= zzgdjVar.f17034k) {
            z = true;
        }
        zzgqm zzgqmVarM7060a = zzgqoVar.m7060a(3);
        try {
            try {
                try {
                    try {
                        try {
                            zzgqmVarM7060a.m7057a();
                            zzgfq zzgfqVar = zzgdjVar.f17024a;
                            synchronized (zzgfqVar) {
                                listenableFuture = zzgfqVar.f17146e;
                                if (listenableFuture == null) {
                                    throw null;
                                }
                            }
                            string = (String) ((zzhay) zzhcf.m7374h(listenableFuture, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgdi
                                @Override // com.google.android.gms.internal.ads.zzhbn
                                /* JADX INFO: renamed from: b */
                                public final ListenableFuture mo3248b(Object obj) {
                                    return ((zzggc) zzgdjVar.f17025b.f17215f.get()).mo7000d(context);
                                }
                            }, zzhbu.f18506s)).get(z ? zzgdjVar.f17031h : zzgdjVar.f17029f, TimeUnit.MILLISECONDS);
                        } catch (TimeoutException unused) {
                            if (z) {
                                string = ((zzgjp) zzgdjVar.f17030g.zzb()).m7018a(j2);
                            } else {
                                zzgqoVar.m7061b(56);
                                string = Integer.toString(17);
                            }
                        }
                    } catch (ExecutionException e) {
                        e = e;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        zzgqmVarM7060a.m7058b(e);
                        string = Integer.toString(3);
                    }
                } catch (Throwable th) {
                    zzgqmVarM7060a.m7058b(th);
                    throw th;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zzgqmVarM7060a.m7058b(e2);
                string = "";
            }
            zzgqmVarM7060a.m7059c();
            zzgewVar.zzb();
            return string;
        } catch (Throwable th2) {
            zzgqmVarM7060a.m7059c();
            zzgewVar.zzb();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m6901b(final Context context, final String str, final View view) {
        String string;
        ListenableFuture listenableFuture;
        final zzgdj zzgdjVar = this.f17044a;
        zzgew zzgewVar = zzgdjVar.f17028e;
        zzgqo zzgqoVar = zzgdjVar.f17027d;
        zzgqm zzgqmVarM7060a = zzgqoVar.m7060a(5);
        try {
            try {
                try {
                    try {
                        zzgqmVarM7060a.m7057a();
                        zzgfq zzgfqVar = zzgdjVar.f17024a;
                        synchronized (zzgfqVar) {
                            listenableFuture = zzgfqVar.f17146e;
                            if (listenableFuture == null) {
                                throw null;
                            }
                        }
                        string = (String) ((zzhay) zzhcf.m7374h(listenableFuture, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgdh
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            /* JADX INFO: renamed from: b */
                            public final ListenableFuture mo3248b(Object obj) {
                                return ((zzggc) zzgdjVar.f17025b.f17215f.get()).mo7001e(context, str, view);
                            }
                        }, zzhbu.f18506s)).get(zzgdjVar.f17029f, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        zzgqmVarM7060a.m7058b(th);
                        throw th;
                    }
                } catch (ExecutionException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzgqmVarM7060a.m7058b(e);
                    string = Integer.toString(3);
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zzgqmVarM7060a.m7058b(e2);
                string = "";
            } catch (TimeoutException unused) {
                zzgqoVar.m7061b(58);
                string = Integer.toString(17);
            }
            zzgqmVarM7060a.m7059c();
            zzgewVar.zzb();
            return string;
        } catch (Throwable th2) {
            zzgqmVarM7060a.m7059c();
            zzgewVar.zzb();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6902c(MotionEvent motionEvent) {
        zzggn zzggnVar = this.f17044a.f17025b;
        zzggc zzggcVar = (zzggc) zzggnVar.f17215f.get();
        if (zzggcVar == null) {
            zzggnVar.f17214e.m7061b(54);
        } else {
            zzggcVar.mo6998b(motionEvent);
        }
    }
}
