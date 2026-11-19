package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import p011H.AbstractC0253Q;
import p011H.AbstractC0290s;
import p011H.C0256U;
import p011H.EnumC0244H;
import p011H.InterfaceC0238B;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvb extends zztf {

    /* JADX INFO: renamed from: a */
    public final zzafc f22969a;

    public zzvb(zznu zznuVar) {
        this.f22969a = zznuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zztf
    /* JADX INFO: renamed from: a */
    public final AbstractC0290s mo10658a(final IOException iOException, zztg zztgVar) {
        if (!(iOException.getCause() instanceof zzaeh)) {
            return AbstractC0253Q.m380c(iOException);
        }
        C0256U c0256uM381d = AbstractC0253Q.m381d(this.f22969a);
        final zzui zzuiVar = ((zzty) zztgVar).f22915a;
        InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzuf
            @Override // p011H.InterfaceC0238B
            public final ListenableFuture apply(Object obj) throws IOException {
                zzui zzuiVar2 = zzuiVar;
                zzuiVar2.m10664c((Uri) AbstractC0253Q.m379b(zzuiVar2.f22933b), obj);
                return C0256U.f504t;
            }
        };
        int i2 = zzxa.f23060a;
        return AbstractC0253Q.m378a(AbstractC0253Q.m384g(c0256uM381d, new zzwy(zzvy.m10684a(), interfaceC0238B), zzuiVar.f22935d), IOException.class, new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzva
            @Override // p011H.InterfaceC0238B
            public final /* synthetic */ ListenableFuture apply(Object obj) throws IOException {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }, EnumC0244H.f483s);
    }
}
