package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6452k;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbl implements Serializer {

    /* JADX INFO: renamed from: a */
    public static final zzgbl f16894a = new zzgbl();

    /* JADX INFO: renamed from: b */
    public static final zzgbi f16895b;

    static {
        zzgbi zzgbiVarM6865G = zzgbi.m6865G();
        AbstractC6452k.m12180d(zzgbiVarM6865G, "getDefaultInstance(...)");
        f16895b = zzgbiVarM6865G;
    }

    private zzgbl() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return f16895b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, InterfaceC6348c interfaceC6348c) {
        try {
            return zzgbi.m6864F(inputStream);
        } catch (Exception unused) {
            return f16895b;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, InterfaceC6348c interfaceC6348c) {
        ((zzgbi) obj).mo8097c(outputStream);
        return C6289k.f24318a;
    }
}
