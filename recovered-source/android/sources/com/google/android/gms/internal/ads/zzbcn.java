package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcn extends zzbdm {

    /* JADX INFO: renamed from: k */
    public static final zzbdn f7612k = new zzbdn();

    /* JADX INFO: renamed from: h */
    public final zzaxm f7613h;

    /* JADX INFO: renamed from: i */
    public final Context f7614i;

    /* JADX INFO: renamed from: j */
    public final zzazt f7615j;

    public zzbcn(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, Context context, zzaxm zzaxmVar, zzazt zzaztVar) {
        super(zzbbzVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", zzaxtVar, i2, 27);
        this.f7614i = context;
        this.f7613h = zzaxmVar;
        this.f7615j = zzaztVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00e7, B:65:0x00ed, B:21:0x0041, B:23:0x0047, B:63:0x00e4, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e, B:55:0x00bf, B:57:0x00d4, B:61:0x00dd), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00e7, B:65:0x00ed, B:21:0x0041, B:23:0x0047, B:63:0x00e4, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e, B:55:0x00bf, B:57:0x00d4, B:61:0x00dd), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00e7, B:65:0x00ed, B:21:0x0041, B:23:0x0047, B:63:0x00e4, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e, B:55:0x00bf, B:57:0x00d4, B:61:0x00dd), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00e7, B:65:0x00ed, B:21:0x0041, B:23:0x0047, B:63:0x00e4, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e, B:55:0x00bf, B:57:0x00d4, B:61:0x00dd), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00be, TryCatch #1 {InterruptedException | ExecutionException -> 0x00be, blocks: (B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e), top: B:81:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009e A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00be, TryCatch #1 {InterruptedException | ExecutionException -> 0x00be, blocks: (B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e), top: B:81:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4 A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00be, TryCatch #1 {InterruptedException | ExecutionException -> 0x00be, blocks: (B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e), top: B:81:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7 A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00be, TryCatch #1 {InterruptedException | ExecutionException -> 0x00be, blocks: (B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e), top: B:81:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00e7, B:65:0x00ed, B:21:0x0041, B:23:0x0047, B:63:0x00e4, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a4, B:47:0x00a9, B:46:0x00a7, B:48:0x00ac, B:50:0x00b2, B:52:0x00b8, B:42:0x009e, B:55:0x00bf, B:57:0x00d4, B:61:0x00dd), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        com.google.android.gms.ads.internal.client.zzba zzbaVar;
        Boolean bool;
        String strM4629y0;
        String str;
        zzazq zzazqVarM4752c;
        boolean z;
        zzbbz zzbbzVar;
        zzbaz zzbazVar;
        Object obj;
        zzayt zzaytVarM4729b;
        Future future;
        zzazq zzazqVar;
        zzbdn zzbdnVar = f7612k;
        Context context = this.f7614i;
        AtomicReference atomicReferenceM4756a = zzbdnVar.m4756a(context.getPackageName());
        synchronized (atomicReferenceM4756a) {
            try {
                zzazq zzazqVar2 = (zzazq) atomicReferenceM4756a.get();
                if (zzazqVar2 != null) {
                    String str2 = zzazqVar2.f7208a;
                    char[] cArr = zzbcc.f7581a;
                    if ((str2 == null || str2.isEmpty()) || zzazqVar2.f7208a.equals("E") || zzazqVar2.f7208a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                        char[] cArr2 = zzbcc.f7581a;
                        if (this.f7615j != null) {
                            zzazqVarM4752c = m4752c();
                        } else {
                            Boolean boolValueOf = Boolean.valueOf(!this.f7613h.m4519D());
                            zzbio zzbioVar = zzbix.f8643m3;
                            zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                            bool = (Boolean) zzbaVar.f3098c.m5030a(zzbioVar);
                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8626l3)).booleanValue()) {
                                strM4629y0 = m4751b();
                            } else {
                                strM4629y0 = null;
                            }
                            if (bool.booleanValue() && this.f7654a.f7558l) {
                                if (strM4629y0 != null || strM4629y0.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    try {
                                        zzbbzVar = this.f7654a;
                                        zzbazVar = zzbbzVar.f7556j;
                                        if (zzbazVar != null) {
                                            obj = zzbazVar.f7503a;
                                        } else {
                                            obj = zzbbzVar.f7555i;
                                        }
                                        if (obj != null) {
                                            if (zzbazVar != null) {
                                                future = zzbazVar.f7503a;
                                            } else {
                                                future = zzbbzVar.f7555i;
                                            }
                                            future.get();
                                        }
                                        zzaytVarM4729b = zzbbzVar.m4729b();
                                        if (zzaytVarM4729b == null && zzaytVarM4729b.m4608d0()) {
                                            strM4629y0 = zzaytVarM4729b.m4629y0();
                                        } else {
                                            strM4629y0 = null;
                                        }
                                    } catch (InterruptedException | ExecutionException unused) {
                                    }
                                }
                            }
                            zzazq zzazqVar3 = new zzazq((String) this.f7658e.invoke(null, context, boolValueOf, strM4629y0));
                            str = zzazqVar3.f7208a;
                            if (!(str != null || str.isEmpty())) {
                                str.equals("E");
                            }
                            zzazqVarM4752c = zzazqVar3;
                        }
                        atomicReferenceM4756a.set(zzazqVarM4752c);
                    }
                } else {
                    char[] cArr3 = zzbcc.f7581a;
                    if (this.f7615j != null) {
                        zzazqVarM4752c = m4752c();
                    } else {
                        Boolean boolValueOf2 = Boolean.valueOf(!this.f7613h.m4519D());
                        zzbio zzbioVar2 = zzbix.f8643m3;
                        zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        bool = (Boolean) zzbaVar.f3098c.m5030a(zzbioVar2);
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8626l3)).booleanValue()) {
                            strM4629y0 = m4751b();
                        } else {
                            strM4629y0 = null;
                        }
                        if (bool.booleanValue()) {
                            if (strM4629y0 != null) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (z) {
                                zzbbzVar = this.f7654a;
                                zzbazVar = zzbbzVar.f7556j;
                                if (zzbazVar != null) {
                                    obj = zzbazVar.f7503a;
                                } else {
                                    obj = zzbbzVar.f7555i;
                                }
                                if (obj != null) {
                                    if (zzbazVar != null) {
                                        future = zzbazVar.f7503a;
                                    } else {
                                        future = zzbbzVar.f7555i;
                                    }
                                    future.get();
                                }
                                zzaytVarM4729b = zzbbzVar.m4729b();
                                if (zzaytVarM4729b == null) {
                                    strM4629y0 = null;
                                } else {
                                    strM4629y0 = null;
                                }
                            }
                        }
                        zzazq zzazqVar4 = new zzazq((String) this.f7658e.invoke(null, context, boolValueOf2, strM4629y0));
                        str = zzazqVar4.f7208a;
                        if (!(str != null || str.isEmpty())) {
                            str.equals("E");
                        }
                        zzazqVarM4752c = zzazqVar4;
                    }
                    atomicReferenceM4756a.set(zzazqVarM4752c);
                }
                zzazqVar = (zzazq) atomicReferenceM4756a.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            if (zzazqVar != null) {
                try {
                    String str3 = zzazqVar.f7208a;
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4600V0(str3);
                    long j2 = zzazqVar.f7209b;
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4573I(j2);
                    String str4 = zzazqVar.f7210c;
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4571H(str4);
                    String str5 = zzazqVar.f7211d;
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4591R(str5);
                    String str6 = zzazqVar.f7212e;
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4593S(str6);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m4751b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            zzbio zzbioVar = zzbix.f8660n3;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            byte[] bArrM4742a = zzbcc.m4742a((String) zzbaVar.f3098c.m5030a(zzbioVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM4742a)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzbcc.m4742a((String) zzbaVar.f3098c.m5030a(zzbix.f8677o3)))));
            }
            Context context = this.f7614i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f7654a.f7548b;
            return zzbdp.m4757a(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final zzazq m4752c() {
        String str;
        ListenableFuture listenableFuture;
        zzbio zzbioVar = zzbix.f8006A3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        int iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        zzaxm zzaxmVar = this.f7613h;
        int iM4520E = (iIntValue <= 0 || ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue() >= zzaxmVar.m4520E()) ? zzaxmVar.m4520E() : ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        zzazq zzazqVar = new zzazq((String) this.f7658e.invoke(null, this.f7614i, Boolean.FALSE, ""));
        zzazt zzaztVar = this.f7615j;
        if (zzaztVar == null || (listenableFuture = zzaztVar.f7216a) == null) {
            str = "E";
        } else {
            try {
                str = (String) ((zzhay) listenableFuture).get(iM4520E, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        zzazqVar.f7208a = str;
        return zzazqVar;
    }
}
