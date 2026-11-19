package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC6452k;
import p001B.AbstractC0076b;
import p001B.AbstractC0088n;
import p001B.C0075a;
import p001B.C0090p;
import p001B.InterfaceC0097w;

/* JADX INFO: loaded from: classes2.dex */
abstract class zznp implements zzom {

    /* JADX INFO: renamed from: s */
    public final String f22676s;

    /* JADX INFO: renamed from: t */
    public final zzph f22677t;

    public zznp(String str, zzph zzphVar) {
        this.f22676s = str;
        this.f22677t = zzphVar;
    }

    /* JADX INFO: renamed from: c */
    public Object mo10560c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo10561d(zzlk zzlkVar);

    /* JADX INFO: renamed from: e */
    public abstract Object mo10562e(String str);

    /* JADX INFO: renamed from: f */
    public abstract Object mo10563f(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001B.InterfaceC0097w
    public final Object get() {
        boolean z;
        zzlk zzlkVar;
        if (zzls.f22635c == null) {
            Object obj = zzlk.f22614j;
            zzls.f22635c = new zzlr();
        }
        Context context = (Context) zzlk.f22615k.get();
        if (context == null) {
            synchronized (zzls.f22633a) {
            }
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        zzlk zzlkVar2 = zzlk.f22616l;
        if (zzlkVar2 == null) {
            final Context context2 = context.getApplicationContext();
            try {
                AbstractC6452k.m12181e(context2, "context");
                Object applicationContext = context2.getApplicationContext();
                AbstractC6452k.m12180d(applicationContext, "getApplicationContext(...)");
                if (!(applicationContext instanceof zzagp)) {
                    Class<?> cls = applicationContext.getClass();
                    new StringBuilder(String.valueOf(cls).length() + 72);
                    cls.toString();
                    throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
                }
                try {
                    Object objCast = zzlk.zza.class.cast(((zzagp) applicationContext).zza());
                    AbstractC6452k.m12178b(objCast);
                    AbstractC0088n abstractC0088nZza = ((zzlk.zza) objCast).zza();
                    z = true;
                    try {
                        if (abstractC0088nZza.mo123b()) {
                            zzlkVar2 = (zzlk) abstractC0088nZza.mo122a();
                        }
                    } catch (IllegalStateException unused) {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
                }
            } catch (IllegalStateException unused2) {
                z = false;
            }
            synchronized (zzlk.f22614j) {
                try {
                    if (zzlk.f22616l != null) {
                        zzlkVar = zzlk.f22616l;
                    } else {
                        AbstractC0088n abstractC0088nZza2 = C0075a.f101s;
                        boolean z2 = context2 instanceof zzlk.zza;
                        if (z2) {
                            abstractC0088nZza2 = ((zzlk.zza) context2).zza();
                        }
                        zzlkVar = (zzlk) abstractC0088nZza2.mo124c(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzll
                            @Override // p001B.InterfaceC0097w
                            public final Object get() {
                                Object obj2 = zzlk.f22614j;
                                final zzlj zzljVar = new zzlj();
                                Context context3 = context2;
                                zzljVar.f22608a = context3;
                                context3.getClass();
                                if (zzljVar.f22609b == null) {
                                    zzljVar.f22609b = zzlk.f22617m;
                                }
                                if (zzljVar.f22610c == null) {
                                    final Context context4 = zzljVar.f22608a;
                                    zzljVar.f22610c = AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzln
                                        @Override // p001B.InterfaceC0097w
                                        public final Object get() {
                                            Object obj3 = zzlk.f22614j;
                                            Api api = zzjx.f22566a;
                                            return new zzmn(new zzkk(context4, zzjx.f22566a, Api.ApiOptions.f4177i, GoogleApi.Settings.f4198c));
                                        }
                                    });
                                }
                                if (zzljVar.f22611d == null) {
                                    zzljVar.f22611d = new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzli
                                        @Override // p001B.InterfaceC0097w
                                        public final Object get() {
                                            return new C0090p(new zzqi(zzljVar.f22609b));
                                        }
                                    };
                                }
                                if (zzljVar.f22612e == null) {
                                    Context context5 = zzljVar.f22608a;
                                    final ArrayList arrayList = new ArrayList();
                                    Collections.addAll(arrayList, new zzrx(new zzrw(context5)), new zzsd());
                                    zzljVar.f22612e = AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzlm
                                        @Override // p001B.InterfaceC0097w
                                        public final /* synthetic */ Object get() {
                                            Object obj3 = zzlk.f22614j;
                                            return new zzru(arrayList);
                                        }
                                    });
                                }
                                if (zzljVar.f22613f == null) {
                                    zzljVar.f22613f = new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzlh
                                        @Override // p001B.InterfaceC0097w
                                        public final Object get() {
                                            Context context6 = zzljVar.f22608a;
                                            Object obj3 = zzlk.f22614j;
                                            try {
                                                ApplicationInfo applicationInfo = context6.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                                applicationInfo.getClass();
                                                return new C0090p(applicationInfo);
                                            } catch (PackageManager.NameNotFoundException unused3) {
                                                return C0075a.f101s;
                                            }
                                        }
                                    };
                                }
                                return new zzlk(zzljVar.f22608a, zzljVar.f22609b, zzljVar.f22610c, zzljVar.f22611d, zzljVar.f22612e, zzljVar.f22613f);
                            }
                        });
                        zzlk.f22616l = zzlkVar;
                        if (!z && !z2) {
                            zzlz.m10473a(Level.CONFIG, zzlkVar.m10471a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzlkVar2 = zzlkVar;
        }
        Object objMo10561d = mo10561d(zzlkVar2);
        objMo10561d.getClass();
        return objMo10561d;
    }
}
