package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzglk {

    /* JADX INFO: renamed from: a */
    public final File f17725a;

    /* JADX INFO: renamed from: b */
    public final File f17726b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f17727c;

    /* JADX INFO: renamed from: d */
    public final zzimt f17728d;

    /* JADX INFO: renamed from: e */
    public final zzgqo f17729e;

    public zzglk(Context context, SharedPreferences sharedPreferences, zzimt zzimtVar, zzgqo zzgqoVar) {
        this.f17727c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfzb.m6810d(dir, false);
        this.f17725a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfzb.m6810d(dir2, true);
        this.f17726b = dir2;
        this.f17728d = zzimtVar;
        this.f17729e = zzgqoVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m7022a(zzggb zzggbVar, byte[] bArr, byte[] bArr2) {
        String strM4796D = zzggbVar.m6989D().m4796D();
        boolean zIsEmpty = TextUtils.isEmpty(strM4796D);
        zzgqo zzgqoVar = this.f17729e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file = this.f17726b;
            zzfzb.m6811e(file);
            file.mkdirs();
            File fileM6809c = zzfzb.m6809c(file, strM4796D);
            fileM6809c.getClass();
            fileM6809c.mkdirs();
            File fileM6807a = zzfzb.m6807a(strM4796D, file, "pcam.jar");
            fileM6807a.getClass();
            if (bArr == null || bArr.length <= 0 || zzfzb.m6808b(fileM6807a, bArr)) {
                File fileM6807a2 = zzfzb.m6807a(strM4796D, file, "pcbc");
                fileM6807a2.getClass();
                if (zzfzb.m6808b(fileM6807a2, bArr2)) {
                    String strM4796D2 = zzggbVar.m6989D().m4796D();
                    if (!TextUtils.isEmpty(strM4796D2)) {
                        File fileM6807a3 = zzfzb.m6807a(strM4796D2, file, "pcam.jar");
                        fileM6807a3.getClass();
                        File fileM6807a4 = zzfzb.m6807a(strM4796D2, file, "pcbc");
                        fileM6807a4.getClass();
                        File fileM6807a5 = zzfzb.m6807a(strM4796D2, m7024c(), "pcam.jar");
                        fileM6807a5.getClass();
                        File fileM6807a6 = zzfzb.m6807a(strM4796D2, m7024c(), "pcbc");
                        fileM6807a6.getClass();
                        if (fileM6807a3.exists() && !fileM6807a3.renameTo(fileM6807a5)) {
                            zzgqoVar.m7061b(15318);
                        } else if (fileM6807a4.exists() && fileM6807a4.renameTo(fileM6807a6)) {
                            zzggb zzggbVarM7023b = m7023b(1);
                            SharedPreferences.Editor editorEdit = this.f17727c.edit();
                            if (zzggbVarM7023b != null && !zzggbVar.m6989D().m4796D().equals(zzggbVarM7023b.m6989D().m4796D())) {
                                editorEdit.putString(m7025d(), Hex.m3647a(zzggbVarM7023b.m8099h()));
                            }
                            editorEdit.putString(m7026e(), Hex.m3647a(zzggbVar.m8099h()));
                            if (!editorEdit.commit()) {
                                zzgqoVar.m7061b(15320);
                            }
                        } else {
                            zzgqoVar.m7061b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    zzggb zzggbVarM7023b2 = m7023b(1);
                    if (zzggbVarM7023b2 != null) {
                        hashSet.add(zzggbVarM7023b2.m6989D().m4796D());
                    }
                    zzggb zzggbVarM7023b3 = m7023b(2);
                    if (zzggbVarM7023b3 != null) {
                        hashSet.add(zzggbVarM7023b3.m6989D().m4796D());
                    }
                    File[] fileArrListFiles = m7024c().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileM6809c2 = zzfzb.m6809c(m7024c(), name);
                                fileM6809c2.getClass();
                                zzfzb.m6811e(fileM6809c2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        zzgqoVar.m7061b(15316);
    }

    /* JADX INFO: renamed from: b */
    public final zzggb m7023b(int i2) {
        SharedPreferences sharedPreferences = this.f17727c;
        String string = i2 == 1 ? sharedPreferences.getString(m7026e(), null) : sharedPreferences.getString(m7025d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrM3648b = Hex.m3648b(string);
                zzggb zzggbVarM6986H = zzggb.m6986H(zzidl.m8149y(bArrM3648b, 0, bArrM3648b.length));
                String strM4796D = zzggbVarM6986H.m6989D().m4796D();
                File fileM6807a = zzfzb.m6807a(strM4796D, m7024c(), "pcam.jar");
                if (fileM6807a == null) {
                    throw null;
                }
                if (!fileM6807a.exists() && (fileM6807a = zzfzb.m6807a(strM4796D, m7024c(), "pcam")) == null) {
                    throw null;
                }
                File fileM6807a2 = zzfzb.m6807a(strM4796D, m7024c(), "pcbc");
                if (fileM6807a2 == null) {
                    throw null;
                }
                if (fileM6807a.exists() && fileM6807a2.exists()) {
                    return zzggbVarM6986H;
                }
            } catch (zzifh unused) {
                this.f17729e.m7061b(15317);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final File m7024c() {
        File file = new File(this.f17725a, Integer.toString(((zzbdz) this.f17728d.zzb()).f7672s));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public final String m7025d() {
        int i2 = ((zzbdz) this.f17728d.zzb()).f7672s;
        return AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 6), "FBAMTD", i2);
    }

    /* JADX INFO: renamed from: e */
    public final String m7026e() {
        int i2 = ((zzbdz) this.f17728d.zzb()).f7672s;
        return AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 6), "LATMTD", i2);
    }
}
