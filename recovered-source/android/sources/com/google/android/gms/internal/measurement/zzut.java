package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p001B.AbstractC0074D;
import p001B.AbstractC0076b;
import p001B.C0083i;
import p001B.InterfaceC0082h;
import p006D0.C0177l;
import p011H.AbstractC0253Q;
import p011H.AbstractC0290s;
import p011H.C0256U;
import p011H.C0291t;
import p011H.C0292u;
import p011H.EnumC0244H;
import p011H.InterfaceC0237A;
import p011H.InterfaceC0238B;
import p011H.InterfaceScheduledExecutorServiceC0260Y;

/* JADX INFO: loaded from: classes2.dex */
class zzut {

    /* JADX INFO: renamed from: a */
    public final String f22958a;

    /* JADX INFO: renamed from: b */
    public final C0291t f22959b;

    /* JADX INFO: renamed from: c */
    public final zzuv f22960c;

    /* JADX INFO: renamed from: d */
    public final C0177l f22961d;

    /* JADX INFO: renamed from: e */
    public final zzvm f22962e;

    /* JADX INFO: renamed from: f */
    public final zzvm f22963f;

    /* JADX INFO: renamed from: g */
    public final Object f22964g;

    /* JADX INFO: renamed from: h */
    public final zzwb f22965h;

    /* JADX INFO: renamed from: i */
    public List f22966i;

    public zzut(zzuv zzuvVar, C0291t c0291t) {
        final zztp zztpVar = (zztp) this;
        this.f22963f = new zzvm(new zzul(zztpVar));
        Object obj = new Object();
        this.f22964g = obj;
        this.f22966i = new ArrayList();
        this.f22960c = zzuvVar;
        this.f22959b = c0291t;
        this.f22958a = zzuvVar.zzc();
        final zzui zzuiVar = (zzui) zzuvVar;
        this.f22962e = new zzvm(new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zzuh
            @Override // p011H.InterfaceC0237A
            public final ListenableFuture call() {
                final zzui zzuiVar2 = zzuiVar;
                zzuiVar2.getClass();
                InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzug
                    @Override // p011H.InterfaceC0238B
                    public final ListenableFuture apply(Object obj2) {
                        Uri uri = (Uri) obj2;
                        zzui zzuiVar3 = zzuiVar2;
                        zzuiVar3.getClass();
                        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                        try {
                            zzru zzruVar = zzuiVar3.f22936e;
                            zzrs zzrsVarM10630b = zzruVar.m10630b(uriBuild);
                            if (zzrsVarM10630b.f22834a.mo10632b(zzrsVarM10630b.f22837d)) {
                                zzrs zzrsVarM10630b2 = zzruVar.m10630b(uriBuild);
                                zzrs zzrsVarM10630b3 = zzruVar.m10630b(uri);
                                zzsx zzsxVar = zzrsVarM10630b2.f22834a;
                                if (zzsxVar != zzrsVarM10630b3.f22834a) {
                                    throw new zzsk("Cannot rename file across backends");
                                }
                                zzsxVar.mo10644f(zzrsVarM10630b2.f22837d, zzrsVarM10630b3.f22837d);
                            }
                            return C0256U.f504t;
                        } catch (IOException e) {
                            return AbstractC0253Q.m380c(e);
                        }
                    }
                };
                int i2 = zzxa.f23060a;
                return AbstractC0253Q.m382e(AbstractC0253Q.m384g(zzuiVar2.f22933b, new zzwy(zzvy.m10684a(), interfaceC0238B), zzuiVar2.f22935d));
            }
        });
        this.f22961d = new C0177l(5);
        this.f22965h = new zzwa();
        InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzuq
            @Override // p011H.InterfaceC0238B
            public final /* synthetic */ ListenableFuture apply(Object obj2) {
                return zztpVar.f22962e.m10671a();
            }
        };
        synchronized (obj) {
            this.f22966i.add(interfaceC0238B);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0292u m10665a(final InterfaceC0082h interfaceC0082h, final InterfaceScheduledExecutorServiceC0260Y interfaceScheduledExecutorServiceC0260Y) throws IOException {
        InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzuo
            @Override // p011H.InterfaceC0238B
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return AbstractC0253Q.m381d(((zzpt) interfaceC0082h).apply(obj));
            }
        };
        int i2 = zzxa.f23060a;
        final zzwy zzwyVar = new zzwy(zzvy.m10684a(), interfaceC0238B);
        AbstractC0074D abstractC0074D = zzxh.f23062a;
        AbstractC0076b.m133h(abstractC0074D, "ticker");
        abstractC0074D.mo121a();
        zzwi zzwiVarMo10689a = this.f22965h.mo10689a("Update ".concat(String.valueOf(this.f22958a)));
        try {
            final AbstractC0290s abstractC0290sM10671a = this.f22963f.m10671a();
            C0177l c0177l = this.f22961d;
            InterfaceC0237A interfaceC0237A = new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zzum
                @Override // p011H.InterfaceC0237A
                public final /* synthetic */ ListenableFuture call() {
                    return abstractC0290sM10671a;
                }
            };
            EnumC0244H enumC0244H = EnumC0244H.f483s;
            c0177l.m282n(interfaceC0237A, enumC0244H);
            ListenableFuture listenableFutureM282n = c0177l.m282n(zzxa.m10703a(new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zzun
                @Override // p011H.InterfaceC0237A
                public final ListenableFuture call() {
                    final zzwy zzwyVar2 = zzwyVar;
                    final Executor executor = interfaceScheduledExecutorServiceC0260Y;
                    final zzut zzutVar = this.f22946s;
                    InterfaceC0238B interfaceC0238B2 = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzup
                        @Override // p011H.InterfaceC0238B
                        public final /* synthetic */ ListenableFuture apply(Object obj) {
                            return zzutVar.f22960c.mo10662a(zzwyVar2, executor);
                        }
                    };
                    int i3 = zzxa.f23060a;
                    return AbstractC0253Q.m384g(abstractC0290sM10671a, new zzwy(zzvy.m10684a(), interfaceC0238B2), EnumC0244H.f483s);
                }
            }), enumC0244H);
            AbstractC0253Q.propagateCancellation(listenableFutureM282n, abstractC0290sM10671a);
            AbstractC0253Q.m382e(this.f22959b);
            C0292u c0292uM383f = AbstractC0253Q.m383f(listenableFutureM282n, new C0083i(), enumC0244H);
            zzwiVarMo10689a.m10691c(c0292uM383f);
            zzwiVarMo10689a.close();
            return c0292uM383f;
        } catch (Throwable th) {
            try {
                zzwiVarMo10689a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
