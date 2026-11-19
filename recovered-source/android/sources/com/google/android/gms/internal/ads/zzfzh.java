package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzh {

    /* JADX INFO: renamed from: f */
    public static final Object f16844f = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f16845a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f16846b;

    /* JADX INFO: renamed from: c */
    public final String f16847c;

    /* JADX INFO: renamed from: d */
    public final zzfyo f16848d;

    /* JADX INFO: renamed from: e */
    public final boolean f16849e;

    public zzfzh(Context context, zzbdz zzbdzVar, zzfyo zzfyoVar, boolean z) {
        this.f16849e = false;
        this.f16845a = context;
        this.f16847c = Integer.toString(zzbdzVar.f7672s);
        this.f16846b = context.getSharedPreferences("pcvmspf", 0);
        this.f16848d = zzfyoVar;
        this.f16849e = z;
    }

    /* JADX INFO: renamed from: d */
    public static String m6812d(zzbeb zzbebVar) {
        zzbeh zzbehVarM4794K = zzbei.m4794K();
        String strM4796D = zzbebVar.m4780D().m4796D();
        zzbehVarM4794K.m8326l();
        ((zzbei) zzbehVarM4794K.f19780t).m4801M(strM4796D);
        String strM4797E = zzbebVar.m4780D().m4797E();
        zzbehVarM4794K.m8326l();
        ((zzbei) zzbehVarM4794K.f19780t).m4802N(strM4797E);
        long jM4799G = zzbebVar.m4780D().m4799G();
        zzbehVarM4794K.m8326l();
        ((zzbei) zzbehVarM4794K.f19780t).m4804P(jM4799G);
        long jM4800H = zzbebVar.m4780D().m4800H();
        zzbehVarM4794K.m8326l();
        ((zzbei) zzbehVarM4794K.f19780t).m4805Q(jM4800H);
        long jM4798F = zzbebVar.m4780D().m4798F();
        zzbehVarM4794K.m8326l();
        ((zzbei) zzbehVarM4794K.f19780t).m4803O(jM4798F);
        return Hex.m3647a(((zzbei) zzbehVarM4794K.m8328o()).m8099h());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6813a(zzbeb zzbebVar, zzfzg zzfzgVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f16844f) {
            try {
                zzbei zzbeiVarM6817f = m6817f(1);
                String strM4796D = zzbebVar.m4780D().m4796D();
                if (zzbeiVarM6817f != null && zzbeiVarM6817f.m4796D().equals(strM4796D)) {
                    m6816e(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileM6815c = m6815c(strM4796D);
                if (fileM6815c.exists()) {
                    String str = true != fileM6815c.isDirectory() ? "0" : "1";
                    String str2 = true != fileM6815c.isFile() ? "0" : "1";
                    StringBuilder sb = new StringBuilder(7);
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    this.f16848d.mo3252a(sb.toString(), 4023, jCurrentTimeMillis2);
                    m6816e(4015, jCurrentTimeMillis2);
                } else if (!fileM6815c.mkdirs()) {
                    this.f16848d.mo3252a("cw:".concat(true != fileM6815c.canWrite() ? "0" : "1"), 4024, jCurrentTimeMillis2);
                    m6816e(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileM6815c2 = m6815c(strM4796D);
                File file = new File(fileM6815c2, "pcam.jar");
                File file2 = new File(fileM6815c2, "pcbc");
                if (!zzfzb.m6808b(file, zzbebVar.m4781E().m8151a())) {
                    m6816e(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!zzfzb.m6808b(file2, zzbebVar.m4782F().m8151a())) {
                    m6816e(4017, jCurrentTimeMillis);
                    return false;
                }
                if (zzfzgVar != null && !((zzbam) zzfzgVar).m4684a(file)) {
                    m6816e(4018, jCurrentTimeMillis);
                    zzfzb.m6811e(fileM6815c2);
                    return false;
                }
                String strM6812d = m6812d(zzbebVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.f16846b;
                String string = sharedPreferences.getString("LATMTD".concat(String.valueOf(this.f16847c)), null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("LATMTD".concat(String.valueOf(this.f16847c)), strM6812d);
                if (string != null) {
                    editorEdit.putString("FBAMTD".concat(String.valueOf(this.f16847c)), string);
                }
                if (!editorEdit.commit()) {
                    m6816e(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzbei zzbeiVarM6817f2 = m6817f(1);
                if (zzbeiVarM6817f2 != null) {
                    hashSet.add(zzbeiVarM6817f2.m4796D());
                }
                zzbei zzbeiVarM6817f3 = m6817f(2);
                if (zzbeiVarM6817f3 != null) {
                    hashSet.add(zzbeiVarM6817f3.m4796D());
                }
                for (File file3 : new File(this.f16845a.getDir("pccache", 0), this.f16847c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfzb.m6811e(file3);
                    }
                }
                m6816e(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6814b(zzbeb zzbebVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f16844f) {
            try {
                if (!zzfzb.m6808b(new File(m6815c(zzbebVar.m4780D().m4796D()), "pcbc"), zzbebVar.m4782F().m8151a())) {
                    m6816e(4020, jCurrentTimeMillis);
                    return false;
                }
                String strM6812d = m6812d(zzbebVar);
                SharedPreferences.Editor editorEdit = this.f16846b.edit();
                editorEdit.putString("LATMTD".concat(String.valueOf(this.f16847c)), strM6812d);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    m6816e(5015, jCurrentTimeMillis);
                } else {
                    m6816e(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final File m6815c(String str) {
        return new File(new File(this.f16845a.getDir("pccache", 0), this.f16847c), str);
    }

    /* JADX INFO: renamed from: e */
    public final void m6816e(int i2, long j2) {
        this.f16848d.mo3253b(i2, j2);
    }

    /* JADX INFO: renamed from: f */
    public final zzbei m6817f(int i2) {
        zzidz zzidzVarM8304a;
        String str = this.f16847c;
        SharedPreferences sharedPreferences = this.f16846b;
        String string = i2 == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrM3648b = Hex.m3648b(string);
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM3648b, 0, bArrM3648b.length);
                if (this.f16849e) {
                    zzidz zzidzVar = zzidz.f19758b;
                    int i3 = zzicy.f19697a;
                    zzidzVarM8304a = zzidz.f19759c;
                } else {
                    zzidzVarM8304a = zzidz.m8304a();
                }
                return zzbei.m4793J(zzidlVarM8149y, zzidzVarM8304a);
            } catch (zzifh unused) {
            } catch (NullPointerException unused2) {
                m6816e(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused3) {
                m6816e(2032, jCurrentTimeMillis);
            }
        }
        return null;
    }
}
