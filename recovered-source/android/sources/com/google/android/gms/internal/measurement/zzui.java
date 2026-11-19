package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p001B.AbstractC0088n;
import p006D0.C0177l;
import p011H.AbstractC0253Q;
import p011H.AbstractC0290s;
import p011H.C0256U;
import p011H.C0291t;
import p011H.EnumC0244H;
import p011H.ExecutorC0273f0;
import p011H.InterfaceC0237A;
import p011H.InterfaceC0238B;

/* JADX INFO: loaded from: classes2.dex */
public final class zzui implements zzuv {

    /* JADX INFO: renamed from: a */
    public final String f22932a;

    /* JADX INFO: renamed from: b */
    public final ListenableFuture f22933b;

    /* JADX INFO: renamed from: c */
    public final zztv f22934c;

    /* JADX INFO: renamed from: d */
    public final ExecutorC0273f0 f22935d;

    /* JADX INFO: renamed from: e */
    public final zzru f22936e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0088n f22937f;

    /* JADX INFO: renamed from: g */
    public final zzwb f22938g;

    /* JADX INFO: renamed from: h */
    public final Object f22939h = new Object();

    /* JADX INFO: renamed from: i */
    public final C0177l f22940i = new C0177l(5);

    /* JADX INFO: renamed from: j */
    public ListenableFuture f22941j = null;

    public zzui(String str, C0256U c0256u, zztv zztvVar, Executor executor, zzru zzruVar, AbstractC0088n abstractC0088n, zzwb zzwbVar) {
        this.f22932a = str;
        this.f22933b = AbstractC0253Q.m382e(c0256u);
        this.f22934c = zztvVar;
        this.f22935d = new ExecutorC0273f0(executor);
        this.f22936e = zzruVar;
        this.f22937f = abstractC0088n;
        this.f22938g = zzwbVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:13:0x0016, B:14:0x0018, B:16:0x001c, B:17:0x0033, B:18:0x0035), top: B:25:0x0003, inners: #0 }] */
    @Override // com.google.android.gms.internal.measurement.zzuv
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo10662a(final zzwy zzwyVar, final Executor executor) {
        final ListenableFuture listenableFuture;
        synchronized (this.f22939h) {
            ListenableFuture listenableFuture2 = this.f22941j;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (this.f22941j == null) {
                    this.f22941j = AbstractC0253Q.m382e(this.f22940i.m282n(zzxa.m10703a(new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zzub
                        @Override // p011H.InterfaceC0237A
                        public final ListenableFuture call() {
                            final zzui zzuiVar = this.f22922s;
                            try {
                                return AbstractC0253Q.m381d(zzuiVar.m10663b((Uri) AbstractC0253Q.m379b(zzuiVar.f22933b)));
                            } catch (IOException e) {
                                zzty zztyVar = new zzty(zzuiVar);
                                AbstractC0088n abstractC0088n = zzuiVar.f22937f;
                                if (!abstractC0088n.mo123b()) {
                                    return AbstractC0253Q.m380c(e);
                                }
                                if ((e instanceof zzsg) || (e.getCause() instanceof zzsg)) {
                                    return AbstractC0253Q.m380c(e);
                                }
                                AbstractC0290s abstractC0290sMo10658a = ((zztf) abstractC0088n.mo122a()).mo10658a(e, zztyVar);
                                InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzue
                                    @Override // p011H.InterfaceC0238B
                                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                                        zzui zzuiVar2 = zzuiVar;
                                        return AbstractC0253Q.m381d(zzuiVar2.m10663b((Uri) AbstractC0253Q.m379b(zzuiVar2.f22933b)));
                                    }
                                };
                                int i2 = zzxa.f23060a;
                                return AbstractC0253Q.m384g(abstractC0290sMo10658a, new zzwy(zzvy.m10684a(), interfaceC0238B), zzuiVar.f22935d);
                            }
                        }
                    }), this.f22935d));
                }
                listenableFuture = this.f22941j;
            } else {
                try {
                    AbstractC0253Q.m379b(this.f22941j);
                } catch (ExecutionException unused) {
                    this.f22941j = null;
                }
                if (this.f22941j == null) {
                    this.f22941j = AbstractC0253Q.m382e(this.f22940i.m282n(zzxa.m10703a(new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zzub
                        @Override // p011H.InterfaceC0237A
                        public final ListenableFuture call() {
                            final zzui zzuiVar = this.f22922s;
                            try {
                                return AbstractC0253Q.m381d(zzuiVar.m10663b((Uri) AbstractC0253Q.m379b(zzuiVar.f22933b)));
                            } catch (IOException e) {
                                zzty zztyVar = new zzty(zzuiVar);
                                AbstractC0088n abstractC0088n = zzuiVar.f22937f;
                                if (!abstractC0088n.mo123b()) {
                                    return AbstractC0253Q.m380c(e);
                                }
                                if ((e instanceof zzsg) || (e.getCause() instanceof zzsg)) {
                                    return AbstractC0253Q.m380c(e);
                                }
                                AbstractC0290s abstractC0290sMo10658a = ((zztf) abstractC0088n.mo122a()).mo10658a(e, zztyVar);
                                InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzue
                                    @Override // p011H.InterfaceC0238B
                                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                                        zzui zzuiVar2 = zzuiVar;
                                        return AbstractC0253Q.m381d(zzuiVar2.m10663b((Uri) AbstractC0253Q.m379b(zzuiVar2.f22933b)));
                                    }
                                };
                                int i2 = zzxa.f23060a;
                                return AbstractC0253Q.m384g(abstractC0290sMo10658a, new zzwy(zzvy.m10684a(), interfaceC0238B), zzuiVar.f22935d);
                            }
                        }
                    }), this.f22935d));
                }
                listenableFuture = this.f22941j;
            }
            throw th;
        }
        return this.f22940i.m282n(zzxa.m10703a(new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zztz
            @Override // p011H.InterfaceC0237A
            public final ListenableFuture call() {
                final zzui zzuiVar = this.f22916s;
                InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzua
                    @Override // p011H.InterfaceC0238B
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        ListenableFuture listenableFuture3;
                        zzui zzuiVar2 = zzuiVar;
                        synchronized (zzuiVar2.f22939h) {
                            listenableFuture3 = zzuiVar2.f22941j;
                        }
                        return listenableFuture3;
                    }
                };
                ListenableFuture listenableFuture3 = listenableFuture;
                EnumC0244H enumC0244H = EnumC0244H.f483s;
                final C0291t c0291tM384g = AbstractC0253Q.m384g(listenableFuture3, interfaceC0238B, enumC0244H);
                final C0291t c0291tM384g2 = AbstractC0253Q.m384g(c0291tM384g, zzwyVar, executor);
                InterfaceC0238B interfaceC0238B2 = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzuc
                    @Override // p011H.InterfaceC0238B
                    public final ListenableFuture apply(Object obj) {
                        final zzui zzuiVar2 = zzuiVar;
                        C0291t c0291t = c0291tM384g;
                        final C0291t c0291t2 = c0291tM384g2;
                        if (AbstractC0253Q.m379b(c0291t).equals(AbstractC0253Q.m379b(c0291t2))) {
                            return AbstractC0253Q.m381d(obj);
                        }
                        InterfaceC0238B interfaceC0238B3 = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzud
                            @Override // p011H.InterfaceC0238B
                            public final /* synthetic */ ListenableFuture apply(Object obj2) throws IOException {
                                zzui zzuiVar3 = zzuiVar2;
                                C0291t c0291t3 = c0291t2;
                                zzuiVar3.m10664c((Uri) AbstractC0253Q.m379b(zzuiVar3.f22933b), obj2);
                                synchronized (zzuiVar3.f22939h) {
                                    zzuiVar3.f22941j = c0291t3;
                                }
                                return AbstractC0253Q.m381d(obj2);
                            }
                        };
                        int i2 = zzxa.f23060a;
                        C0291t c0291tM384g3 = AbstractC0253Q.m384g(c0291t2, new zzwy(zzvy.m10684a(), interfaceC0238B3), zzuiVar2.f22935d);
                        synchronized (zzuiVar2.f22939h) {
                        }
                        return c0291tM384g3;
                    }
                };
                int i2 = zzxa.f23060a;
                return AbstractC0253Q.m384g(c0291tM384g2, new zzwy(zzvy.m10684a(), interfaceC0238B2), enumC0244H);
            }
        }), EnumC0244H.f483s);
    }

    /* JADX INFO: renamed from: b */
    public final Object m10663b(Uri uri) throws IOException {
        zztv zztvVar = this.f22934c;
        String str = this.f22932a;
        zzru zzruVar = this.f22936e;
        try {
            try {
                zzwb zzwbVar = this.f22938g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                zzwi zzwiVarMo10689a = zzwbVar.mo10689a(sb.toString());
                try {
                    InputStream inputStream = (InputStream) zzruVar.m10629a(uri, zzst.m10647b());
                    try {
                        zzadu zzaduVarMo9350a = ((zzve) zztvVar).mo10669a().mo9566d().mo9350a(inputStream, ((zzve) zztvVar).mo10670b());
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        zzwiVarMo10689a.close();
                        return zzaduVarMo9350a;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        zzwiVarMo10689a.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                zzrs zzrsVarM10630b = zzruVar.m10630b(uri);
                if (zzrsVarM10630b.f22834a.mo10632b(zzrsVarM10630b.f22837d)) {
                    throw e;
                }
                return ((zzvd) zztvVar).f22971a;
            }
        } catch (IOException e2) {
            throw zzux.m10666a(zzruVar, uri, e2, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10664c(Uri uri, Object obj) throws IOException {
        String str = this.f22932a;
        zzru zzruVar = this.f22936e;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            zzwb zzwbVar = this.f22938g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            zzwi zzwiVarMo10689a = zzwbVar.mo10689a(sb.toString());
            try {
                zzse zzseVar = new zzse();
                try {
                    zzsw zzswVarM10649b = zzsw.m10649b();
                    zzswVarM10649b.f22875a = new zzro[]{zzseVar};
                    OutputStream outputStream = (OutputStream) zzruVar.m10629a(uriBuild, zzswVarM10649b);
                    try {
                        ((zzafc) obj).mo9345e(outputStream);
                        if (zzseVar.f22863b == null) {
                            throw new zzsk("Cannot sync underlying stream");
                        }
                        zzseVar.f22862a.flush();
                        zzseVar.f22863b.f22866s.getFD().sync();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        zzwiVarMo10689a.close();
                        zzrs zzrsVarM10630b = zzruVar.m10630b(uriBuild);
                        zzrs zzrsVarM10630b2 = zzruVar.m10630b(uri);
                        zzsx zzsxVar = zzrsVarM10630b.f22834a;
                        if (zzsxVar != zzrsVarM10630b2.f22834a) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        zzsxVar.mo10644f(zzrsVarM10630b.f22837d, zzrsVarM10630b2.f22837d);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw zzux.m10666a(zzruVar, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    zzwiVarMo10689a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            zzrs zzrsVarM10630b3 = zzruVar.m10630b(uriBuild);
            if (zzrsVarM10630b3.f22834a.mo10632b(zzrsVarM10630b3.f22837d)) {
                try {
                    zzrs zzrsVarM10630b4 = zzruVar.m10630b(uriBuild);
                    zzrsVarM10630b4.f22834a.mo10643e(zzrsVarM10630b4.f22837d);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzuv
    public final String zzc() {
        return this.f22932a;
    }
}
