package com.google.android.gms.internal.ads;

import dalvik.system.DexClassLoader;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbdk implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbdl f7647s;

    public zzbdk(zzbdl zzbdlVar) {
        this.f7647s = zzbdlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbdl zzbdlVar = this.f7647s;
        zzbdlVar.getClass();
        try {
            zzbbz zzbbzVar = zzbdlVar.f7648a;
            DexClassLoader dexClassLoader = zzbbzVar.f7549c;
            byte[] bArr = zzbbzVar.f7551e;
            String str = zzbdlVar.f7649b;
            zzbbzVar.f7550d.getClass();
            Class<?> clsLoadClass = dexClassLoader.loadClass(new String(zzbbe.m4720b(str, bArr), "UTF-8"));
            if (clsLoadClass != null) {
                byte[] bArr2 = zzbbzVar.f7551e;
                String str2 = zzbdlVar.f7650c;
                zzbdlVar.f7648a.f7550d.getClass();
                zzbdlVar.f7651d = clsLoadClass.getMethod(new String(zzbbe.m4720b(str2, bArr2), "UTF-8"), zzbdlVar.f7652e);
            }
        } catch (zzbbd | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            zzbdlVar.f7653f.countDown();
        }
    }
}
