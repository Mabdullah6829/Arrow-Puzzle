package com.google.android.gms.internal.measurement;

import android.content.Context;
import p001B.InterfaceC0082h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagr {

    /* JADX INFO: renamed from: a */
    public static final zzph f22151a = null;

    /* JADX INFO: renamed from: b */
    public static final zzom f22152b;

    /* JADX INFO: renamed from: c */
    public static volatile String f22153c;

    /* JADX INFO: renamed from: d */
    public static final zzog f22154d;

    static {
        zzpj zzpjVar = new zzpj(new InterfaceC0082h() { // from class: com.google.android.gms.internal.measurement.zzagq
            @Override // p001B.InterfaceC0082h
            public final Object apply(Object obj) {
                String strM10469b;
                Context context = (Context) obj;
                String str = zzagr.f22153c;
                if (str != null) {
                    return str;
                }
                synchronized (zzagr.class) {
                    try {
                        strM10469b = zzagr.f22153c;
                        if (strM10469b == null) {
                            strM10469b = zzlg.m10469b(context, "com.google.android.gms.measurement");
                            zzagr.f22153c = strM10469b;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return strM10469b;
            }
        });
        zzon zzonVar = new zzon(zzpjVar.f22735a, true, zzpjVar.f22736b);
        zzpi zzpiVar = new zzpi();
        zzpiVar.f22733a = zzonVar;
        f22154d = new zzog(zzpiVar);
        f22152b = new zzod("__phenotype_server_token", zzpiVar, "");
        f22153c = null;
    }

    private zzagr() {
    }

    /* JADX INFO: renamed from: a */
    public static String m9720a() {
        return (String) ((zznp) f22152b).get();
    }
}
