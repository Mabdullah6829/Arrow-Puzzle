package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfza {

    /* JADX INFO: renamed from: a */
    public final File f16832a;

    /* JADX INFO: renamed from: b */
    public final File f16833b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f16834c;

    /* JADX INFO: renamed from: d */
    public final zzbdz f16835d;

    public zzfza(Context context, zzbdz zzbdzVar) {
        this.f16834c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfzb.m6810d(dir, false);
        this.f16832a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfzb.m6810d(dir2, true);
        this.f16833b = dir2;
        this.f16835d = zzbdzVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX INFO: renamed from: a */
    public final boolean m6802a(zzbeb zzbebVar, zzfzg zzfzgVar) {
        boolean z;
        String strM4796D = zzbebVar.m4780D().m4796D();
        byte[] bArrM8151a = zzbebVar.m4781E().m8151a();
        byte[] bArrM8151a2 = zzbebVar.m4782F().m8151a();
        if (!TextUtils.isEmpty(strM4796D) && bArrM8151a2.length != 0) {
            File file = this.f16833b;
            zzfzb.m6811e(file);
            file.mkdirs();
            zzfzb.m6809c(file, strM4796D).mkdirs();
            File fileM6807a = zzfzb.m6807a(strM4796D, file, "pcam.jar");
            if ((bArrM8151a.length <= 0 || zzfzb.m6808b(fileM6807a, bArrM8151a)) && zzfzb.m6808b(zzfzb.m6807a(strM4796D, file, "pcbc"), bArrM8151a2)) {
                File fileM6807a2 = zzfzb.m6807a(zzbebVar.m4780D().m4796D(), file, "pcam.jar");
                if (!fileM6807a2.exists() || zzfzgVar == null || ((zzbam) zzfzgVar).m4684a(fileM6807a2)) {
                    String strM4796D2 = zzbebVar.m4780D().m4796D();
                    if (TextUtils.isEmpty(strM4796D2)) {
                        z = false;
                    } else {
                        File fileM6807a3 = zzfzb.m6807a(strM4796D2, file, "pcam.jar");
                        File fileM6807a4 = zzfzb.m6807a(strM4796D2, file, "pcbc");
                        File fileM6807a5 = zzfzb.m6807a(strM4796D2, m6804c(), "pcam.jar");
                        File fileM6807a6 = zzfzb.m6807a(strM4796D2, m6804c(), "pcbc");
                        if ((!fileM6807a3.exists() || fileM6807a3.renameTo(fileM6807a5)) && fileM6807a4.exists() && fileM6807a4.renameTo(fileM6807a6)) {
                            zzbeh zzbehVarM4794K = zzbei.m4794K();
                            String strM4796D3 = zzbebVar.m4780D().m4796D();
                            zzbehVarM4794K.m8326l();
                            ((zzbei) zzbehVarM4794K.f19780t).m4801M(strM4796D3);
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
                            zzbei zzbeiVar = (zzbei) zzbehVarM4794K.m8328o();
                            zzbei zzbeiVarM6803b = m6803b(1);
                            SharedPreferences.Editor editorEdit = this.f16834c.edit();
                            if (zzbeiVarM6803b != null && !zzbeiVar.m4796D().equals(zzbeiVarM6803b.m4796D())) {
                                editorEdit.putString(m6805d(), Hex.m3647a(zzbeiVarM6803b.m8099h()));
                            }
                            editorEdit.putString(m6806e(), Hex.m3647a(zzbeiVar.m8099h()));
                            if (editorEdit.commit()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    zzbei zzbeiVarM6803b2 = m6803b(1);
                    if (zzbeiVarM6803b2 != null) {
                        hashSet.add(zzbeiVarM6803b2.m4796D());
                    }
                    zzbei zzbeiVarM6803b3 = m6803b(2);
                    if (zzbeiVarM6803b3 != null) {
                        hashSet.add(zzbeiVarM6803b3.m4796D());
                    }
                    for (File file2 : m6804c().listFiles()) {
                        String name = file2.getName();
                        if (!hashSet.contains(name)) {
                            zzfzb.m6811e(zzfzb.m6809c(m6804c(), name));
                        }
                    }
                    return z;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final zzbei m6803b(int i2) {
        SharedPreferences sharedPreferences = this.f16834c;
        String string = i2 == 1 ? sharedPreferences.getString(m6806e(), null) : sharedPreferences.getString(m6805d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrM3648b = Hex.m3648b(string);
                zzbei zzbeiVarM4792I = zzbei.m4792I(zzidl.m8149y(bArrM3648b, 0, bArrM3648b.length));
                String strM4796D = zzbeiVarM4792I.m4796D();
                File fileM6807a = zzfzb.m6807a(strM4796D, m6804c(), "pcam.jar");
                if (!fileM6807a.exists()) {
                    fileM6807a = zzfzb.m6807a(strM4796D, m6804c(), "pcam");
                }
                File fileM6807a2 = zzfzb.m6807a(strM4796D, m6804c(), "pcbc");
                if (fileM6807a.exists() && fileM6807a2.exists()) {
                    return zzbeiVarM4792I;
                }
            } catch (zzifh unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final File m6804c() {
        File file = new File(this.f16832a, Integer.toString(this.f16835d.f7672s));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public final String m6805d() {
        int i2 = this.f16835d.f7672s;
        return AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 6), "FBAMTD", i2);
    }

    /* JADX INFO: renamed from: e */
    public final String m6806e() {
        int i2 = this.f16835d.f7672s;
        return AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 6), "LATMTD", i2);
    }
}
