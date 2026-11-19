package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbm implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f15328a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f15329b;

    /* JADX INFO: renamed from: c */
    public final zzflg f15330c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f15331d;

    public zzfbm(Context context, zzhcp zzhcpVar, zzflg zzflgVar, VersionInfoParcel versionInfoParcel) {
        this.f15328a = context;
        this.f15329b = zzhcpVar;
        this.f15330c = zzflgVar;
        this.f15331d = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15329b.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbl
            /* JADX WARN: Code duplicated, block: B:14:0x0046 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:15:0x0048 A[Catch: IOException -> 0x002f, TryCatch #4 {IOException -> 0x002f, blocks: (B:3:0x0002, B:5:0x0017, B:7:0x0029, B:12:0x0034, B:17:0x005a, B:18:0x007f, B:26:0x008c, B:28:0x009e, B:30:0x00b2, B:32:0x00bb, B:37:0x00dd, B:39:0x00f9, B:40:0x0118, B:54:0x0140, B:55:0x0145, B:68:0x015b, B:69:0x0160, B:77:0x0175, B:75:0x0171, B:61:0x0154, B:66:0x0159, B:35:0x00cd, B:25:0x008b, B:15:0x0048, B:56:0x0146, B:57:0x0150, B:41:0x0119, B:42:0x0120, B:46:0x012e, B:47:0x0133, B:51:0x0138, B:52:0x013e, B:64:0x0157, B:43:0x0121, B:44:0x012b, B:20:0x0082, B:21:0x0086, B:70:0x0161, B:71:0x016b), top: B:88:0x0002, inners: #0, #2, #3, #5 }] */
            /* JADX WARN: Code duplicated, block: B:17:0x005a A[Catch: IOException -> 0x002f, TryCatch #4 {IOException -> 0x002f, blocks: (B:3:0x0002, B:5:0x0017, B:7:0x0029, B:12:0x0034, B:17:0x005a, B:18:0x007f, B:26:0x008c, B:28:0x009e, B:30:0x00b2, B:32:0x00bb, B:37:0x00dd, B:39:0x00f9, B:40:0x0118, B:54:0x0140, B:55:0x0145, B:68:0x015b, B:69:0x0160, B:77:0x0175, B:75:0x0171, B:61:0x0154, B:66:0x0159, B:35:0x00cd, B:25:0x008b, B:15:0x0048, B:56:0x0146, B:57:0x0150, B:41:0x0119, B:42:0x0120, B:46:0x012e, B:47:0x0133, B:51:0x0138, B:52:0x013e, B:64:0x0157, B:43:0x0121, B:44:0x012b, B:20:0x0082, B:21:0x0086, B:70:0x0161, B:71:0x016b), top: B:88:0x0002, inners: #0, #2, #3, #5 }] */
            /* JADX WARN: Code duplicated, block: B:19:0x0080  */
            /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:35:0x00cd A[Catch: IOException -> 0x002f, TryCatch #4 {IOException -> 0x002f, blocks: (B:3:0x0002, B:5:0x0017, B:7:0x0029, B:12:0x0034, B:17:0x005a, B:18:0x007f, B:26:0x008c, B:28:0x009e, B:30:0x00b2, B:32:0x00bb, B:37:0x00dd, B:39:0x00f9, B:40:0x0118, B:54:0x0140, B:55:0x0145, B:68:0x015b, B:69:0x0160, B:77:0x0175, B:75:0x0171, B:61:0x0154, B:66:0x0159, B:35:0x00cd, B:25:0x008b, B:15:0x0048, B:56:0x0146, B:57:0x0150, B:41:0x0119, B:42:0x0120, B:46:0x012e, B:47:0x0133, B:51:0x0138, B:52:0x013e, B:64:0x0157, B:43:0x0121, B:44:0x012b, B:20:0x0082, B:21:0x0086, B:70:0x0161, B:71:0x016b), top: B:88:0x0002, inners: #0, #2, #3, #5 }] */
            /* JADX WARN: Code duplicated, block: B:37:0x00dd A[Catch: IOException -> 0x002f, TryCatch #4 {IOException -> 0x002f, blocks: (B:3:0x0002, B:5:0x0017, B:7:0x0029, B:12:0x0034, B:17:0x005a, B:18:0x007f, B:26:0x008c, B:28:0x009e, B:30:0x00b2, B:32:0x00bb, B:37:0x00dd, B:39:0x00f9, B:40:0x0118, B:54:0x0140, B:55:0x0145, B:68:0x015b, B:69:0x0160, B:77:0x0175, B:75:0x0171, B:61:0x0154, B:66:0x0159, B:35:0x00cd, B:25:0x008b, B:15:0x0048, B:56:0x0146, B:57:0x0150, B:41:0x0119, B:42:0x0120, B:46:0x012e, B:47:0x0133, B:51:0x0138, B:52:0x013e, B:64:0x0157, B:43:0x0121, B:44:0x012b, B:20:0x0082, B:21:0x0086, B:70:0x0161, B:71:0x016b), top: B:88:0x0002, inners: #0, #2, #3, #5 }] */
            /* JADX WARN: Code duplicated, block: B:39:0x00f9 A[Catch: IOException -> 0x002f, TryCatch #4 {IOException -> 0x002f, blocks: (B:3:0x0002, B:5:0x0017, B:7:0x0029, B:12:0x0034, B:17:0x005a, B:18:0x007f, B:26:0x008c, B:28:0x009e, B:30:0x00b2, B:32:0x00bb, B:37:0x00dd, B:39:0x00f9, B:40:0x0118, B:54:0x0140, B:55:0x0145, B:68:0x015b, B:69:0x0160, B:77:0x0175, B:75:0x0171, B:61:0x0154, B:66:0x0159, B:35:0x00cd, B:25:0x008b, B:15:0x0048, B:56:0x0146, B:57:0x0150, B:41:0x0119, B:42:0x0120, B:46:0x012e, B:47:0x0133, B:51:0x0138, B:52:0x013e, B:64:0x0157, B:43:0x0121, B:44:0x012b, B:20:0x0082, B:21:0x0086, B:70:0x0161, B:71:0x016b), top: B:88:0x0002, inners: #0, #2, #3, #5 }] */
            /* JADX WARN: Code duplicated, block: B:46:0x012e A[Catch: all -> 0x0136, TRY_ENTER, TryCatch #2 {all -> 0x0136, blocks: (B:41:0x0119, B:42:0x0120, B:46:0x012e, B:47:0x0133, B:51:0x0138, B:52:0x013e, B:64:0x0157, B:43:0x0121, B:44:0x012b), top: B:85:0x0119, outer: #4, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:51:0x0138 A[Catch: all -> 0x0136, TryCatch #2 {all -> 0x0136, blocks: (B:41:0x0119, B:42:0x0120, B:46:0x012e, B:47:0x0133, B:51:0x0138, B:52:0x013e, B:64:0x0157, B:43:0x0121, B:44:0x012b), top: B:85:0x0119, outer: #4, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:67:0x015a  */
            /* JADX WARN: Code duplicated, block: B:81:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:83:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:85:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:89:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzgcr zzgcrVar;
                boolean z;
                boolean z2;
                zzgcw zzgcwVarM6893f;
                zzgcs zzgcsVarM6881a;
                long jLongValue;
                boolean zMo3172s;
                zzgcs zzgcsVar;
                boolean z3;
                zzgcr zzgcrVarM6885a;
                zzfbm zzfbmVar = this.f15327a;
                try {
                    Context context = zzfbmVar.f15328a;
                    boolean zM6486a = zzfbmVar.f15330c.m6486a();
                    zzgcr zzgcrVar2 = new zzgcr();
                    zzgcr zzgcrVar3 = new zzgcr();
                    if (zM6486a) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8408Y3)).booleanValue()) {
                            return new zzfbn(true);
                        }
                    }
                    if (!zM6486a) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8344U3)).booleanValue()) {
                            zzgcv zzgcvVarM6890f = zzgcv.m6890f(context);
                            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8526f4)).longValue();
                            boolean zMo3172s2 = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().mo3172s();
                            zzgcvVarM6890f.getClass();
                            synchronized (zzgcv.class) {
                                zzgcrVar2 = zzgcvVarM6890f.m6885a(null, null, jLongValue2, zMo3172s2);
                            }
                        } else if (zM6486a) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8376W3)).booleanValue()) {
                                zzgcv zzgcvVarM6890f2 = zzgcv.m6890f(context);
                                long jLongValue3 = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8526f4)).longValue();
                                boolean zMo3172s3 = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().mo3172s();
                                zzgcvVarM6890f2.getClass();
                                synchronized (zzgcv.class) {
                                }
                                zzgcrVar2 = zzgcvVarM6890f2.m6885a(null, null, jLongValue3, zMo3172s3);
                            }
                        }
                    } else if (zM6486a) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8376W3)).booleanValue()) {
                            zzgcv zzgcvVarM6890f3 = zzgcv.m6890f(context);
                            long jLongValue4 = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8526f4)).longValue();
                            boolean zMo3172s4 = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().mo3172s();
                            zzgcvVarM6890f3.getClass();
                            synchronized (zzgcv.class) {
                                zzgcrVar2 = zzgcvVarM6890f3.m6885a(null, null, jLongValue4, zMo3172s4);
                            }
                        }
                    }
                    zzbio zzbioVar = zzbix.f8475c4;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        if (zzfbmVar.f15331d.f3398u < ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8458b4)).intValue()) {
                            zzgcw.m6893f(context).m6894g();
                        }
                    }
                    if (zM6486a) {
                        if (zM6486a) {
                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8392X3)).booleanValue()) {
                                zzgcwVarM6893f = zzgcw.m6893f(context);
                                zzgcsVarM6881a = zzgcs.m6881a(context);
                                if (zzfbmVar.f15331d.f3398u >= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8458b4)).intValue()) {
                                    jLongValue = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8543g4)).longValue();
                                    zMo3172s = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().mo3172s();
                                    zzgcwVarM6893f.getClass();
                                    synchronized (zzgcw.class) {
                                        zzgcsVar = zzgcwVarM6893f.f17001g;
                                        zzgcsVar.getClass();
                                        synchronized (zzgcs.class) {
                                            z3 = zzgcsVar.f16990a.f16993b.getBoolean("paidv2_publisher_option", true);
                                            if (z3) {
                                                zzgcrVarM6885a = zzgcwVarM6893f.m6885a(null, null, jLongValue, zMo3172s);
                                            } else {
                                                zzgcrVarM6885a = new zzgcr();
                                            }
                                            zzgcrVar3 = zzgcrVarM6885a;
                                            zzgcsVarM6881a.getClass();
                                            synchronized (zzgcs.class) {
                                                z = zzgcsVarM6881a.f16990a.f16993b.getBoolean("paidv2_publisher_option", true);
                                            }
                                        }
                                    }
                                } else {
                                    z = true;
                                }
                                zzgcsVarM6881a.getClass();
                                synchronized (zzgcs.class) {
                                    zzgcrVar = zzgcrVar3;
                                    z2 = zzgcsVarM6881a.f16990a.f16993b.getBoolean("paidv2_user_option", true);
                                }
                            }
                        }
                        zzgcrVar = zzgcrVar3;
                        z = true;
                        z2 = true;
                    } else {
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8360V3)).booleanValue()) {
                            zzgcwVarM6893f = zzgcw.m6893f(context);
                            zzgcsVarM6881a = zzgcs.m6881a(context);
                            if (zzfbmVar.f15331d.f3398u >= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8458b4)).intValue()) {
                                jLongValue = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8543g4)).longValue();
                                zMo3172s = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().mo3172s();
                                zzgcwVarM6893f.getClass();
                                synchronized (zzgcw.class) {
                                    zzgcsVar = zzgcwVarM6893f.f17001g;
                                    zzgcsVar.getClass();
                                    synchronized (zzgcs.class) {
                                        z3 = zzgcsVar.f16990a.f16993b.getBoolean("paidv2_publisher_option", true);
                                        if (z3) {
                                            zzgcrVarM6885a = new zzgcr();
                                        } else {
                                            zzgcrVarM6885a = zzgcwVarM6893f.m6885a(null, null, jLongValue, zMo3172s);
                                        }
                                        zzgcrVar3 = zzgcrVarM6885a;
                                        zzgcsVarM6881a.getClass();
                                        synchronized (zzgcs.class) {
                                            z = zzgcsVarM6881a.f16990a.f16993b.getBoolean("paidv2_publisher_option", true);
                                        }
                                    }
                                }
                            } else {
                                z = true;
                            }
                            zzgcsVarM6881a.getClass();
                            synchronized (zzgcs.class) {
                                zzgcrVar = zzgcrVar3;
                                z2 = zzgcsVarM6881a.f16990a.f16993b.getBoolean("paidv2_user_option", true);
                            }
                        } else {
                            if (zM6486a) {
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8392X3)).booleanValue()) {
                                    zzgcwVarM6893f = zzgcw.m6893f(context);
                                    zzgcsVarM6881a = zzgcs.m6881a(context);
                                    if (zzfbmVar.f15331d.f3398u >= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8458b4)).intValue()) {
                                        jLongValue = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8543g4)).longValue();
                                        zMo3172s = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().mo3172s();
                                        zzgcwVarM6893f.getClass();
                                        synchronized (zzgcw.class) {
                                            try {
                                                zzgcsVar = zzgcwVarM6893f.f17001g;
                                                zzgcsVar.getClass();
                                                synchronized (zzgcs.class) {
                                                    z3 = zzgcsVar.f16990a.f16993b.getBoolean("paidv2_publisher_option", true);
                                                }
                                                if (z3) {
                                                    zzgcrVarM6885a = new zzgcr();
                                                } else {
                                                    zzgcrVarM6885a = zzgcwVarM6893f.m6885a(null, null, jLongValue, zMo3172s);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        zzgcrVar3 = zzgcrVarM6885a;
                                        zzgcsVarM6881a.getClass();
                                        synchronized (zzgcs.class) {
                                            z = zzgcsVarM6881a.f16990a.f16993b.getBoolean("paidv2_publisher_option", true);
                                        }
                                    } else {
                                        z = true;
                                    }
                                    zzgcsVarM6881a.getClass();
                                    synchronized (zzgcs.class) {
                                    }
                                    zzgcrVar = zzgcrVar3;
                                    z2 = zzgcsVarM6881a.f16990a.f16993b.getBoolean("paidv2_user_option", true);
                                }
                            }
                            zzgcrVar = zzgcrVar3;
                            z = true;
                            z2 = true;
                        }
                    }
                    return new zzfbn(zzgcrVar2, zzgcrVar, z, z2, zM6486a);
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PerAppIdSignal", e);
                    return new zzfbn(zzfbmVar.f15330c.m6486a());
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 53;
    }
}
