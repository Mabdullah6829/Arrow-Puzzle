package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6452k;
import p001B.AbstractC0088n;
import p001B.InterfaceC0097w;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqt {

    /* JADX INFO: renamed from: d */
    public static Boolean f22798d;

    /* JADX INFO: renamed from: a */
    public final zzlk f22799a;

    /* JADX INFO: renamed from: b */
    public final Uri f22800b;

    /* JADX INFO: renamed from: c */
    public final String f22801c;

    public zzqt(zzlk zzlkVar, String str) {
        this.f22799a = zzlkVar;
        this.f22801c = str;
        Context context = zzlkVar.f22619b;
        Pattern pattern = zzsa.f22856a;
        zzrz zzrzVar = new zzrz(context);
        zzrzVar.m10638a("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        zzrzVar.m10639b(sb.toString());
        this.f22800b = zzrzVar.m10640c();
    }

    /* JADX INFO: renamed from: a */
    public final zzqs m10592a() {
        String staticPackageName;
        int i2;
        zznv zznvVar;
        zznv zznvVar2;
        zzlk zzlkVar = this.f22799a;
        Context context = zzlkVar.f22619b;
        InterfaceC0097w interfaceC0097w = zzlkVar.f22623f;
        if (!zzky.m10464b(context)) {
            return new zzqs(zzqv.m10595H(), new zzqr(3, 17));
        }
        if (f22798d == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f22798d = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    f22798d = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    f22798d = Boolean.FALSE;
                }
            }
        }
        if (f22798d.booleanValue()) {
            return new zzqs(zzqv.m10595H(), new zzqr(3, 18));
        }
        zzqn zzqnVarM10622b = zzlkVar.f22624g.m10622b();
        zzacr zzacrVar = zzqnVarM10622b.f22778c;
        ArrayMap arrayMap = zzlg.f22605a;
        String str = this.f22801c;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            staticPackageName = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                throw new IllegalArgumentException("Invalid package name: ".concat(str));
            }
            staticPackageName = str;
        }
        AbstractC6452k.m12181e(staticPackageName, "staticPackageName");
        if (!zzqnVarM10622b.f22783h) {
            i2 = 14;
        } else if (!zzqnVarM10622b.f22776a || !zzqnVarM10622b.f22777b.contains(zzabz.FILE)) {
            i2 = 3;
        } else if (zzacrVar.mo9373b() != 0) {
            List list = zzqnVarM10622b.f22781f;
            if (list.isEmpty() || list.contains(staticPackageName)) {
                i2 = zzqnVarM10622b.f22782g.contains(staticPackageName) ? 6 : 0;
            } else {
                i2 = 5;
            }
        } else {
            i2 = 4;
        }
        if (i2 != 0) {
            zznvVar2 = new zznv(null, new zzqr(i2));
        } else {
            try {
                String str2 = zzqnVarM10622b.f22780e;
                if (str2.isEmpty()) {
                    AbstractC0088n abstractC0088n = (AbstractC0088n) zzlkVar.f22625h.get();
                    if (abstractC0088n.mo123b()) {
                        str2 = ((ApplicationInfo) abstractC0088n.mo122a()).dataDir;
                    } else {
                        zzlz.m10473a(Level.WARNING, zzlkVar.m10471a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        zznvVar = new zznv(zznd.f22673c, new zzqr(3, 7));
                        zznvVar2 = zznvVar;
                    }
                }
                String str3 = File.separator;
                String str4 = zzqnVarM10622b.f22779d;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                zzmz zzmzVar = new zzmz(zzacrVar, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = zzmzVar.m10530a().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        zznv zznvVar3 = new zznv((zznd) ((zzru) interfaceC0097w.get()).m10629a(uriBuild, new zzna(zzqnVarM10622b.f22786k.m10534A())), new zzqr(5, 2));
                        StrictMode.setThreadPolicy(threadPolicy);
                        zznvVar2 = zznvVar3;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                } catch (zzaeh e) {
                    zzlz.m10473a(Level.SEVERE, zzlkVar.m10471a(), e, "Failed to parse snapshot from shared storage for %s", str);
                    zznvVar2 = new zznv(null, new zzqr(9));
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (FileNotFoundException unused2) {
                    zzlz.m10473a(Level.INFO, zzlkVar.m10471a(), null, "Shared storage file not found for %s", str);
                    zznvVar2 = new zznv(null, new zzqr(8));
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e2) {
                zzlz.m10473a(Level.WARNING, zzlkVar.m10471a(), e2, "Failed to read shared file for %s", str);
                zznvVar = new zznv(zznd.f22673c, new zzqr(3, 10));
                zznvVar2 = zznvVar;
            }
        }
        zzqr zzqrVar = zznvVar2.f22680b;
        zznd zzndVar = zznvVar2.f22679a;
        if (zzndVar != null) {
            return new zzqs(zzndVar, zzqrVar);
        }
        try {
            return new zzqs((zzqv) ((zzru) interfaceC0097w.get()).m10629a(this.f22800b, new zzss(zzqv.m10595H().mo9566d())), new zzqr(4, zzqrVar.f22792c));
        } catch (IOException | RuntimeException unused3) {
            zzlz.m10473a(Level.INFO, zzlkVar.m10471a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return m10593b() ? new zzqs(zznd.f22673c, new zzqr(3, 16)) : new zzqs(zzqv.m10595H(), new zzqr(3, 11));
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10593b() {
        zzni zzniVarM10623c = this.f22799a.f22624g.m10623c();
        return zzniVarM10623c.m10539C() && ((AbstractCollection) zzniVarM10623c.m10544H()).contains(zzabz.FILE);
    }
}
