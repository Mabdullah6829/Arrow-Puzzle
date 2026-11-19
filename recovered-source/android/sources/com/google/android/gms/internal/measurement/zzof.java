package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import p001B.AbstractC0088n;
import p003C.C0118i;
import p003C.C0134y;
import p011H.EnumC0244H;
import p011H.ExecutorServiceC0267c0;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzof extends zznp implements zznw {

    /* JADX INFO: renamed from: u */
    public volatile int f22688u;

    /* JADX INFO: renamed from: v */
    public zzps f22689v;

    public zzof(String str, zzph zzphVar) {
        super(str, zzphVar);
        this.f22688u = -1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @Override // com.google.android.gms.internal.measurement.zznp
    /* JADX INFO: renamed from: d */
    public final Object mo10561d(final zzlk zzlkVar) {
        zzpg zzpgVarMo10582a;
        Object objMo10560c;
        SimpleArrayMap simpleArrayMap;
        int i2 = this.f22688u;
        if (i2 == -1 || i2 < this.f22689v.f22744a.get()) {
            synchronized (this) {
                try {
                    int i3 = this.f22688u;
                    Object objMo10563f = null;
                    if (i3 == -1) {
                        zzlk.m10470b();
                        zzlkVar.getClass();
                        zzpgVarMo10582a = this.f22677t.mo10582a(zzlkVar);
                        this.f22689v = zzpgVarMo10582a.f22731g;
                    } else {
                        zzpgVarMo10582a = null;
                    }
                    int i4 = this.f22689v.f22744a.get();
                    if (i3 < i4) {
                        zzlk.m10470b();
                        zzlkVar.getClass();
                        AbstractC0088n abstractC0088nM10467a = zzlf.m10467a(zzlkVar.f22619b);
                        if (abstractC0088nM10467a.mo123b()) {
                            zzle zzleVar = (zzle) abstractC0088nM10467a.mo122a();
                            Uri uriM10468a = zzlg.m10468a();
                            String str = this.f22676s;
                            if (uriM10468a != null) {
                                simpleArrayMap = (SimpleArrayMap) zzleVar.f22603a.get(uriM10468a.toString());
                            } else {
                                zzleVar.getClass();
                                simpleArrayMap = null;
                            }
                            String str2 = simpleArrayMap == null ? null : (String) simpleArrayMap.get(str);
                            if (str2 == null) {
                                objMo10560c = null;
                            } else {
                                try {
                                    objMo10560c = mo10562e(str2);
                                } catch (IOException | IllegalArgumentException e) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f22676s), e);
                                    objMo10560c = null;
                                }
                            }
                        } else {
                            objMo10560c = null;
                        }
                        if (zzpgVarMo10582a == null) {
                            zzpgVarMo10582a = this.f22677t.mo10582a(zzlkVar);
                        }
                        final String str3 = zzpgVarMo10582a.f22727c;
                        if (Build.VERSION.SDK_INT >= 26 && !zzlkVar.f22619b.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            ListenableFuture listenableFutureM392c = ((ExecutorServiceC0267c0) zzlkVar.m10471a()).m392c(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Context context = zzlkVar.f22619b;
                                    C0134y c0134y = zzpp.f22742c;
                                    if (c0134y == null) {
                                        synchronized (zzpp.f22741b) {
                                            c0134y = zzpp.f22742c;
                                            if (c0134y == null) {
                                                C0118i c0118i = new C0118i(4);
                                                try {
                                                    String[] list = context.getAssets().list("phenotype");
                                                    if (list != null) {
                                                        for (String str4 : list) {
                                                            if (str4.endsWith("_package_metadata.binarypb")) {
                                                                try {
                                                                    AssetManager assets = context.getAssets();
                                                                    StringBuilder sb = new StringBuilder(str4.length() + 10);
                                                                    sb.append("phenotype/");
                                                                    sb.append(str4);
                                                                    InputStream inputStreamOpen = assets.open(sb.toString());
                                                                    try {
                                                                        zzadf zzadfVar = zzadf.f22012b;
                                                                        int i5 = zzacf.f21956a;
                                                                        zzpp zzppVar = new zzpp(context, zzpr.m10589C(inputStreamOpen, zzadf.f22013c));
                                                                        c0118i.m200d(zzppVar.f22743a, zzppVar);
                                                                        if (inputStreamOpen != null) {
                                                                            inputStreamOpen.close();
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        if (inputStreamOpen != null) {
                                                                            try {
                                                                                inputStreamOpen.close();
                                                                            } catch (Throwable th2) {
                                                                                th.addSuppressed(th2);
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (zzaeh e2) {
                                                                    StringBuilder sb2 = new StringBuilder(str4.length() + 45);
                                                                    sb2.append("Unable to read Phenotype PackageMetadata for ");
                                                                    sb2.append(str4);
                                                                    Log.e("PackageInfo", sb2.toString(), e2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (IOException e3) {
                                                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e3);
                                                }
                                                C0134y c0134yM198a = c0118i.m198a(true);
                                                zzpp.f22742c = c0134yM198a;
                                                c0134y = c0134yM198a;
                                            }
                                        }
                                    }
                                    String str5 = str3;
                                    if (c0134y.containsKey(str5)) {
                                        return;
                                    }
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 173);
                                    sb3.append("Config package ");
                                    sb3.append(str5);
                                    sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                                    Log.e("FilePhenotypeFlags", sb3.toString());
                                }
                            });
                            listenableFutureM392c.addListener(new zzpw(listenableFutureM392c), EnumC0244H.f483s);
                        }
                        Object obj = zzpgVarMo10582a.m10580a().f22796d.get(this.f22676s);
                        if (obj != null) {
                            try {
                                objMo10563f = mo10563f(obj);
                            } catch (IOException | ClassCastException e2) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f22676s), e2);
                            }
                        }
                        if (true != abstractC0088nM10467a.mo123b()) {
                            objMo10560c = objMo10563f;
                        }
                        if (objMo10560c == null) {
                            objMo10560c = mo10560c();
                        }
                        if (objMo10560c != null) {
                            mo10574b(objMo10560c);
                            this.f22688u = i4;
                        }
                        return objMo10560c;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mo10573a();
    }
}
