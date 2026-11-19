package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzckj extends zzchl implements zzip, zznr {

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ int f10330O = 0;

    /* JADX INFO: renamed from: A */
    public zznm f10331A;

    /* JADX INFO: renamed from: B */
    public ByteBuffer f10332B;

    /* JADX INFO: renamed from: C */
    public boolean f10333C;

    /* JADX INFO: renamed from: D */
    public zzchk f10334D;

    /* JADX INFO: renamed from: E */
    public int f10335E;

    /* JADX INFO: renamed from: F */
    public int f10336F;

    /* JADX INFO: renamed from: G */
    public long f10337G;

    /* JADX INFO: renamed from: H */
    public final String f10338H;

    /* JADX INFO: renamed from: I */
    public final int f10339I;

    /* JADX INFO: renamed from: K */
    public Integer f10341K;

    /* JADX INFO: renamed from: L */
    public final ArrayList f10342L;

    /* JADX INFO: renamed from: M */
    public volatile zzcjw f10343M;

    /* JADX INFO: renamed from: u */
    public final Context f10345u;

    /* JADX INFO: renamed from: v */
    public final zzcjt f10346v;

    /* JADX INFO: renamed from: w */
    public final zzaaz f10347w;

    /* JADX INFO: renamed from: x */
    public final zzcht f10348x;

    /* JADX INFO: renamed from: y */
    public final WeakReference f10349y;

    /* JADX INFO: renamed from: z */
    public final zzyu f10350z;

    /* JADX INFO: renamed from: J */
    public final Object f10340J = new Object();

    /* JADX INFO: renamed from: N */
    public final HashSet f10344N = new HashSet();

    /* JADX WARN: Code duplicated, block: B:24:0x0110  */
    /* JADX WARN: Code duplicated, block: B:27:0x0115  */
    public zzckj(Context context, zzcht zzchtVar, zzchu zzchuVar, Integer num) {
        final zzhq zzhqVar;
        this.f10345u = context;
        this.f10348x = zzchtVar;
        this.f10341K = num;
        this.f10349y = new WeakReference(zzchuVar);
        final zzcjt zzcjtVar = new zzcjt();
        this.f10346v = zzcjtVar;
        final zzaaz zzaazVar = new zzaaz(context);
        this.f10347w = zzaazVar;
        if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
            com.google.android.gms.ads.internal.util.zze.m3150k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzchl.f10038s.incrementAndGet();
        zznl zznlVar = new zznl(context, new zzcke(this));
        zzjv zzjvVar = zznlVar.f20507a;
        final boolean z = true;
        zzgtr.m7133f(!zzjvVar.f20173w);
        zzjvVar.f20155e = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i2 = zzjv.f20150A;
                return zzaazVar;
            }
        };
        zzjv zzjvVar2 = zznlVar.f20507a;
        zzgtr.m7133f(!zzjvVar2.f20173w);
        zzjvVar2.f20156f = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjt
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i2 = zzjv.f20150A;
                return zzcjtVar;
            }
        };
        zzjv zzjvVar3 = zznlVar.f20507a;
        zzgtr.m7133f(!zzjvVar3.f20173w);
        zzjvVar3.f20173w = true;
        zznm zznmVar = new zznm(zzjvVar3);
        this.f10331A = zznmVar;
        zznmVar.f20509c.m6051b();
        zznmVar.f20508b.m8629c(this);
        this.f10335E = 0;
        this.f10337G = 0L;
        this.f10336F = 0;
        this.f10342L = new ArrayList();
        this.f10343M = null;
        String strMo5471g = zzchuVar != null ? zzchuVar.mo5471g() : null;
        this.f10338H = (String) (strMo5471g == null ? zzgsx.f18165s : new zzgtw(strMo5471g)).mo7116a();
        this.f10339I = zzchuVar != null ? zzchuVar.mo5473i() : 0;
        final String strM3231E = com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(context, zzchuVar.mo5472h().f3396s);
        if (!this.f10333C || this.f10332B.limit() <= 0) {
            zzbio zzbioVar = zzbix.f8090F2;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8829x2)).booleanValue()) {
                    if (zzchtVar.f10088i) {
                        z = false;
                    }
                }
            } else if (zzchtVar.f10088i) {
                z = false;
            }
            final zzhq zzhqVar2 = zzchtVar.f10091l ? new zzhq() { // from class: com.google.android.gms.internal.ads.zzcjz
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    boolean z2 = z;
                    zzckj zzckjVar = this.f10307a;
                    zzckj zzckjVar2 = true != z2 ? null : zzckjVar;
                    zzcht zzchtVar2 = zzckjVar.f10348x;
                    return new zzckm(strM3231E, zzckjVar2, zzchtVar2.f10083d, zzchtVar2.f10084e, zzchtVar2.f10092m, zzchtVar2.f10093n);
                }
            } : zzchtVar.f10087h > 0 ? new zzhq() { // from class: com.google.android.gms.internal.ads.zzckb
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    boolean z2 = z;
                    zzckj zzckjVar = this.f10317a;
                    zzckj zzckjVar2 = true != z2 ? null : zzckjVar;
                    zzcht zzchtVar2 = zzckjVar.f10348x;
                    zzcjs zzcjsVar = new zzcjs(strM3231E, zzckjVar2, zzchtVar2.f10083d, zzchtVar2.f10084e, zzchtVar2.f10087h);
                    zzckjVar.f10344N.add(new WeakReference(zzcjsVar));
                    return zzcjsVar;
                }
            } : new zzhq() { // from class: com.google.android.gms.internal.ads.zzcka
                @Override // com.google.android.gms.internal.ads.zzhq
                public final zzhr zza() {
                    zzhy zzhyVar = new zzhy();
                    zzhyVar.f19429c = strM3231E;
                    zzckj zzckjVar = this.f10314a;
                    zzhyVar.f19428b = true != z ? null : zzckjVar;
                    zzcht zzchtVar2 = zzckjVar.f10348x;
                    zzhyVar.f19430d = zzchtVar2.f10083d;
                    zzhyVar.f19431e = zzchtVar2.f10084e;
                    zzhyVar.f19432f = true;
                    return zzhyVar.zza();
                }
            };
            zzhqVar = zzchtVar.f10088i ? new zzhq() { // from class: com.google.android.gms.internal.ads.zzckc
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    zzhr zzhrVarZza = zzhqVar2.zza();
                    zzckj zzckjVar = this.f10320a;
                    zzckh zzckhVar = new zzckh(zzckjVar);
                    return new zzcjw(zzckjVar.f10345u, zzhrVarZza, zzckjVar.f10338H, zzckjVar.f10339I, zzckjVar, zzckhVar);
                }
            } : zzhqVar2;
            ByteBuffer byteBuffer = this.f10332B;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.f10332B.limit()];
                this.f10332B.get(bArr);
                zzhqVar = new zzhq() { // from class: com.google.android.gms.internal.ads.zzckd
                    @Override // com.google.android.gms.internal.ads.zzhq
                    public final /* synthetic */ zzhr zza() {
                        int i2 = zzckj.f10330O;
                        zzhr zzhrVarZza = zzhqVar.zza();
                        byte[] bArr2 = bArr;
                        return new zzcjx(new zzhm(bArr2), bArr2.length, zzhrVarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.f10332B.limit()];
            this.f10332B.get(bArr2);
            zzhqVar = new zzhq() { // from class: com.google.android.gms.internal.ads.zzcjy
                @Override // com.google.android.gms.internal.ads.zzhq
                public final /* synthetic */ zzhr zza() {
                    int i2 = zzckj.f10330O;
                    return new zzhm(bArr2);
                }
            };
        }
        this.f10350z = new zzyu(zzhqVar, ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8707q)).booleanValue() ? new zzagg() { // from class: com.google.android.gms.internal.ads.zzckg
            @Override // com.google.android.gms.internal.ads.zzagg
            public final zzaga[] zza() {
                int i2 = zzckj.f10330O;
                zzami zzamiVar = new zzami();
                zzakm zzakmVar = new zzakm();
                zzanq zzanqVar = zzanq.f6138a;
                zzgzi zzgziVar = zzgwt.f18303t;
                return new zzaga[]{zzamiVar, zzakmVar, new zzalw(zzanqVar, 32, zzgyo.f18355w)};
            }
        } : new zzagg() { // from class: com.google.android.gms.internal.ads.zzckf
            @Override // com.google.android.gms.internal.ads.zzagg
            public final /* synthetic */ zzaga[] zza() {
                int i2 = zzckj.f10330O;
                return new zzaga[]{new zzami(), new zzakm()};
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: A */
    public final void m5538A(Uri[] uriArr, ByteBuffer byteBuffer, boolean z) {
        Object zzycVar;
        if (this.f10331A != null) {
            this.f10332B = byteBuffer;
            this.f10333C = z;
            int length = uriArr.length;
            if (length == 1) {
                zzycVar = m5559y(uriArr[0]);
            } else {
                zzxn[] zzxnVarArr = new zzxn[length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    zzxnVarArr[i2] = m5559y(uriArr[i2]);
                }
                zzycVar = new zzyc(new zzww(), zzxnVarArr);
            }
            zznm zznmVar = this.f10331A;
            zznmVar.f20509c.m6051b();
            zzlj zzljVar = zznmVar.f20508b;
            zzljVar.m8639w();
            List listSingletonList = Collections.singletonList(zzycVar);
            zzljVar.m8639w();
            zzljVar.m8639w();
            zzljVar.m8631g(zzljVar.f20244Z);
            zzljVar.mo4712k();
            zzljVar.f20224F++;
            ArrayList arrayList = zzljVar.f20262p;
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < listSingletonList.size(); i3++) {
                zzmq zzmqVar = new zzmq((zzxn) listSingletonList.get(i3), zzljVar.f20263q);
                arrayList2.add(zzmqVar);
                arrayList.add(i3, new zzlf(zzmqVar.f20438b, zzmqVar.f20437a));
            }
            zzljVar.f20249c0 = new zzzg(new Random(zzljVar.f20249c0.f21470a.nextLong())).m9064a(arrayList2.size());
            zzna zznaVar = new zzna(arrayList, zzljVar.f20249c0);
            boolean zM4833g = zznaVar.m4833g();
            int i4 = zznaVar.f20487d;
            if (!zM4833g && i4 < 0) {
                throw new zzw();
            }
            int iMo4837k = zznaVar.mo4837k(false);
            zzmu zzmuVarM8635q = zzljVar.m8635q(zzljVar.f20244Z, zznaVar, zzljVar.m8636t(zznaVar, iMo4837k, -9223372036854775807L));
            int i5 = zzmuVarM8635q.f20460e;
            if (i5 == 1) {
                i5 = 1;
            } else if (zznaVar.m4833g()) {
                i5 = 4;
            } else if (iMo4837k != -1) {
                if (iMo4837k >= i4) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            }
            zzmu zzmuVarM8625r = zzlj.m8625r(zzmuVarM8635q, i5);
            zzlw zzlwVar = zzljVar.f20258l;
            long jM6519u = zzfm.m6519u(-9223372036854775807L);
            zzzg zzzgVar = zzljVar.f20249c0;
            zzlwVar.getClass();
            ((zzfg) zzlwVar.f20348y.mo6124i(17, new zzlq(arrayList2, zzzgVar, iMo4837k, jM6519u))).m6435a();
            zzljVar.m8634o(zzmuVarM8625r, 0, (zzljVar.f20244Z.f20457b.f21278a.equals(zzmuVarM8625r.f20457b.f21278a) || zzljVar.f20244Z.f20456a.m4833g()) ? false : true, 4, zzljVar.m8633m(zzmuVarM8625r), -1);
            zznm zznmVar2 = this.f10331A;
            zznmVar2.f20509c.m6051b();
            zzlj zzljVar2 = zznmVar2.f20508b;
            zzljVar2.m8639w();
            zzmu zzmuVar = zzljVar2.f20244Z;
            if (zzmuVar.f20460e == 1) {
                zzmu zzmuVarM8760e = zzmuVar.m8760e(null);
                zzmu zzmuVarM8625r2 = zzlj.m8625r(zzmuVarM8760e, true != zzmuVarM8760e.f20456a.m4833g() ? 2 : 4);
                zzljVar2.f20224F++;
                ((zzfg) zzljVar2.f20258l.f20348y.mo6114A(29)).m6435a();
                zzljVar2.m8634o(zzmuVarM8625r2, 1, false, 5, -9223372036854775807L, -1);
            }
            zzchl.f10039t.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m5539B() {
        String str;
        boolean zM6052c;
        Context context;
        zznm zznmVar = this.f10331A;
        if (zznmVar != null) {
            zznmVar.f20509c.m6051b();
            zzlj zzljVar = zznmVar.f20508b;
            zzljVar.m8639w();
            zzljVar.f20264r.f20560f.m6196b(this);
            zznm zznmVar2 = this.f10331A;
            zznmVar2.f20509c.m6051b();
            zzlj zzljVar2 = zznmVar2.f20508b;
            zzljVar2.getClass();
            String hexString = Integer.toHexString(System.identityHashCode(zzljVar2));
            String str2 = zzfm.f16091a;
            HashSet hashSet = zzal.f5780a;
            synchronized (zzal.class) {
                str = zzal.f5781b;
            }
            StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(String.valueOf(hexString).length(), 34, String.valueOf(str2).length(), 3, String.valueOf(str).length()) + 1);
            AbstractC0271e0.m413u(sb, "Release ", hexString, " [AndroidXMedia3/1.10.0] [", str2);
            sb.append("] [");
            sb.append(str);
            sb.append("]");
            zzeh.m6210b("ExoPlayerImpl", sb.toString());
            zzljVar2.m8639w();
            zzljVar2.f20270x.m6634a(false);
            zzfu zzfuVar = zzljVar2.f20271y;
            if (zzfuVar.f16532a) {
                zzfuVar.f16532a = false;
            }
            zzli zzliVar = zzljVar2.f20221C;
            if (zzliVar != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) zzliVar.f20215a.get()) != null) {
                context.unregisterDeviceIdChangeListener(zzliVar.f20216b);
            }
            zzfd zzfdVar = zzljVar2.f20220B;
            zzfdVar.f15447e.zzl();
            zzbb zzbbVar = zzfdVar.f15443a;
            zzaz zzazVar = zzfdVar.f15444b;
            zzlj zzljVar3 = (zzlj) zzbbVar;
            zzljVar3.m8639w();
            zzazVar.getClass();
            zzljVar3.f20259m.m6196b(zzazVar);
            zzlw zzlwVar = zzljVar2.f20258l;
            if (zzlwVar.f20320Z || !zzlwVar.f20295A.getThread().isAlive()) {
                zM6052c = true;
            } else {
                zzlwVar.f20320Z = true;
                zzdt zzdtVar = new zzdt();
                ((zzfg) zzlwVar.f20348y.mo6124i(7, zzdtVar)).m6435a();
                zM6052c = zzdtVar.m6052c(zzlwVar.f20305K);
            }
            if (!zM6052c) {
                zzeg zzegVar = zzljVar2.f20259m;
                zzegVar.m6197c(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkx
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final void mo6141b(Object obj) {
                        int i2 = zzlj.f20218d0;
                        ((zzaz) obj).mo4647M(new zzjm(2, new zzlx("Player release timed out."), PointerIconCompat.TYPE_HELP));
                    }
                });
                zzegVar.m6198d();
            }
            zzljVar2.f20259m.m6199e();
            zzljVar2.f20256j.zzl();
            zzabr zzabrVar = zzljVar2.f20266t;
            final zzpt zzptVar = zzljVar2.f20264r;
            zzabrVar.mo3934c(zzptVar);
            zzljVar2.f20244Z.getClass();
            zzmu zzmuVarM8625r = zzlj.m8625r(zzljVar2.f20244Z, 1);
            zzljVar2.f20244Z = zzmuVarM8625r;
            zzmu zzmuVarM8762g = zzmuVarM8625r.m8762g(zzmuVarM8625r.f20457b);
            zzljVar2.f20244Z = zzmuVarM8762g;
            zzmuVarM8762g.f20471p = zzmuVarM8762g.f20473r;
            zzljVar2.f20244Z.f20472q = 0L;
            zzea zzeaVar = zzptVar.f20562h;
            zzeaVar.getClass();
            zzeaVar.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzns
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpt zzptVar2 = zzptVar;
                    zzptVar2.m8814r(zzptVar2.m8815s(), 1028, new zzpl());
                    zzptVar2.f20560f.m6199e();
                }
            });
            Surface surface = zzljVar2.f20233O;
            if (surface != null) {
                surface.release();
                zzljVar2.f20233O = null;
            }
            zzgyn zzgynVar = zzda.f11856a;
            zzljVar2.f20242X = true;
            if (!zzljVar2.f20244Z.f20456a.m4833g()) {
                zzmu zzmuVar = zzljVar2.f20244Z;
                boolean z = zzmuVar.f20456a.mo4739e(zzmuVar.f20457b.f21278a) != -1;
                Locale locale = Locale.US;
                zzmu zzmuVar2 = zzljVar2.f20244Z;
                zzgtr.m7134g(String.format(locale, "periodUid %s not found in timeline %s with size %d", zzmuVar2.f20457b.f21278a, zzmuVar2.f20456a.getClass().getName(), Integer.valueOf(zzljVar2.f20244Z.f20456a.mo4735a())), z);
            }
            this.f10331A = null;
            zzchl.f10039t.decrementAndGet();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m5540C() {
        zznm zznmVar = this.f10331A;
        zznmVar.f20509c.m6051b();
        zzlj zzljVar = zznmVar.f20508b;
        zzljVar.m8639w();
        zzljVar.m8630d(null);
        zzgwt zzgwtVar = zzgyo.f18355w;
        long j2 = zzljVar.f20244Z.f20473r;
        new zzda(zzgwtVar);
    }

    /* JADX INFO: renamed from: D */
    public final void m5541D(int i2) {
        zzcjt zzcjtVar = this.f10346v;
        synchronized (zzcjtVar) {
            zzcjtVar.f10279d = ((long) i2) * 1000;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m5542E(int i2) {
        zzcjt zzcjtVar = this.f10346v;
        synchronized (zzcjtVar) {
            zzcjtVar.f10280e = ((long) i2) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: b */
    public final void mo5543b(int i2) {
        this.f10336F += i2;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: c */
    public final void mo5544c(int i2) {
        zzchk zzchkVar = this.f10334D;
        if (zzchkVar != null) {
            zzchkVar.mo5447a0(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: e */
    public final void mo3938e(zzhj zzhjVar, zzhv zzhvVar, boolean z) {
        if (zzhjVar instanceof zzik) {
            synchronized (this.f10340J) {
                this.f10342L.add((zzik) zzhjVar);
            }
        } else if (zzhjVar instanceof zzcjw) {
            this.f10343M = (zzcjw) zzhjVar;
            final zzchu zzchuVar = (zzchu) this.f10349y.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue() && zzchuVar != null && this.f10343M.f10294o) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f10343M.f10296q));
                map.put("gcacheDownloaded", String.valueOf(this.f10343M.f10297r));
                com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcki
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i2 = zzckj.f10330O;
                        zzchuVar.mo5129b("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    public final void finalize() {
        zzchl.f10038s.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
            com.google.android.gms.ads.internal.util.zze.m3150k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: g */
    public final void mo3940g(zzhv zzhvVar, boolean z, int i2) {
        this.f10335E += i2;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: h */
    public final void mo5545h(zzbv zzbvVar) {
        zzchk zzchkVar = this.f10334D;
        if (zzchkVar != null) {
            zzchkVar.mo5446a(zzbvVar.f9426a, zzbvVar.f9427b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: i */
    public final void mo5546i(zzv zzvVar) {
        zzchu zzchuVar = (zzchu) this.f10349y.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue() || zzchuVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzvVar.f21060n;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzvVar.f21061o;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.f21057k;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzchuVar.mo5129b("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: j */
    public final void mo5547j() {
        zzchk zzchkVar = this.f10334D;
        if (zzchkVar != null) {
            zzchkVar.mo5451y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: l */
    public final void mo5548l(zzau zzauVar) {
        zzchk zzchkVar = this.f10334D;
        if (zzchkVar != null) {
            zzchkVar.mo5448b("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: m */
    public final void mo5549m(zzv zzvVar) {
        zzchu zzchuVar = (zzchu) this.f10349y.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue() || zzchuVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzvVar.f21072z));
        map.put("bitRate", String.valueOf(zzvVar.f21056j));
        int i2 = zzvVar.f21068v;
        int i3 = zzvVar.f21069w;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        map.put("resolution", sb.toString());
        String str = zzvVar.f21060n;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzvVar.f21061o;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.f21057k;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzchuVar.mo5129b("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: p */
    public final void mo5550p(IOException iOException) {
        zzchk zzchkVar = this.f10334D;
        if (zzchkVar != null) {
            if (this.f10348x.f10089j) {
                zzchkVar.mo5450d(iOException);
            } else {
                zzchkVar.mo5448b("onLoadError", iOException);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5551q() {
        return this.f10331A != null;
    }

    /* JADX INFO: renamed from: r */
    public final void m5552r(boolean z) {
        zznm zznmVar = this.f10331A;
        zznmVar.f20509c.m6051b();
        zzlj zzljVar = zznmVar.f20508b;
        zzljVar.m8639w();
        zzmu zzmuVar = zzljVar.f20244Z;
        int i2 = zzmuVar.f20469n;
        int i3 = 0;
        if (i2 == 1) {
            if (z) {
                i2 = 1;
            } else {
                i2 = 1;
                i3 = 1;
            }
        }
        if (zzmuVar.f20467l == z && i2 == i3 && zzmuVar.f20468m == 1) {
            return;
        }
        zzljVar.f20224F++;
        zzmu zzmuVarM8763h = zzmuVar.m8763h(1, i3, z);
        ((zzfg) zzljVar.f20258l.f20348y.mo6116a(1, z ? 1 : 0, (i3 << 4) | 1)).m6435a();
        zzljVar.m8634o(zzmuVarM8763h, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: s */
    public final void m5553s(int i2) {
        zzcjt zzcjtVar = this.f10346v;
        synchronized (zzcjtVar) {
            zzcjtVar.f10277b = ((long) i2) * 1000;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5554t(int i2) {
        zzcjt zzcjtVar = this.f10346v;
        synchronized (zzcjtVar) {
            zzcjtVar.f10278c = ((long) i2) * 1000;
        }
    }

    /* JADX INFO: renamed from: u */
    public final long m5555u() {
        if (this.f10343M == null || !this.f10343M.f10295p) {
            return this.f10335E;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: v */
    public final long m5556v() {
        if (this.f10343M != null && this.f10343M.f10295p && this.f10343M.f10296q) {
            return Math.min(this.f10335E, this.f10343M.f10298s);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: w */
    public final long m5557w() {
        if (this.f10343M != null && this.f10343M.f10295p) {
            final zzcjw zzcjwVar = this.f10343M;
            if (zzcjwVar.f10293n != null) {
                AtomicLong atomicLong = zzcjwVar.f10300u;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (zzcjwVar) {
                    try {
                        if (zzcjwVar.f10299t == null) {
                            zzcjwVar.f10299t = ((zzhbb) zzcfy.f9946a).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcjv
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    long j2;
                                    zzcjw zzcjwVar2 = zzcjwVar;
                                    zzcjwVar2.getClass();
                                    zzbhe zzbheVar = com.google.android.gms.ads.internal.zzt.f3698C.f3710j;
                                    zzbhi zzbhiVar = zzcjwVar2.f10293n;
                                    synchronized (zzbheVar.f7844c) {
                                        try {
                                            j2 = -2;
                                            if (zzbheVar.f7847f != null) {
                                                if (zzbheVar.f7845d.m4888e()) {
                                                    try {
                                                        zzbhk zzbhkVar = zzbheVar.f7847f;
                                                        Parcel parcelM4810u = zzbhkVar.m4810u();
                                                        zzben.m4815c(parcelM4810u, zzbhiVar);
                                                        Parcel parcelM4809k0 = zzbhkVar.m4809k0(3, parcelM4810u);
                                                        long j3 = parcelM4809k0.readLong();
                                                        parcelM4809k0.recycle();
                                                        j2 = j3;
                                                    } catch (RemoteException e) {
                                                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to call into cache service.", e);
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return Long.valueOf(j2);
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zzcjwVar.f10299t.isDone()) {
                    try {
                        zzcjwVar.f10300u.compareAndSet(-1L, ((Long) zzcjwVar.f10299t.get()).longValue());
                        return zzcjwVar.f10300u.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.f10340J) {
            while (true) {
                ArrayList arrayList = this.f10342L;
                if (!arrayList.isEmpty()) {
                    long j2 = this.f10337G;
                    Map mapZzj = ((zzik) arrayList.remove(0)).zzj();
                    long j3 = 0;
                    if (mapZzj != null) {
                        for (Map.Entry entry : mapZzj.entrySet()) {
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgsz.m7122d("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j3 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f10337G = j2 + j3;
                }
            }
        }
        return this.f10337G;
    }

    /* JADX INFO: renamed from: x */
    public final void m5558x(boolean z) {
        zzaan zzaanVar;
        boolean zEquals;
        if (this.f10331A == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            zznm zznmVar = this.f10331A;
            zznmVar.f20509c.m6051b();
            zzlj zzljVar = zznmVar.f20508b;
            zzljVar.m8639w();
            int length = zzljVar.f20253g.length;
            if (i2 >= 2) {
                return;
            }
            zzaaz zzaazVar = this.f10347w;
            synchronized (zzaazVar.f4827c) {
                zzaanVar = zzaazVar.f4829e;
            }
            zzaanVar.getClass();
            zzaam zzaamVar = new zzaam(zzaanVar);
            boolean z2 = !z;
            SparseBooleanArray sparseBooleanArray = zzaamVar.f4773E;
            if (sparseBooleanArray.get(i2) != z2) {
                if (z) {
                    sparseBooleanArray.delete(i2);
                } else {
                    sparseBooleanArray.put(i2, true);
                }
            }
            zzaan zzaanVar2 = new zzaan(zzaamVar);
            synchronized (zzaazVar.f4827c) {
                zEquals = zzaazVar.f4829e.equals(zzaanVar2);
                zzaazVar.f4829e = zzaanVar2;
            }
            if (!zEquals) {
                if (zzaanVar2.f4779A && zzaazVar.f4828d == null) {
                    zzeh.m6211c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                zzabh zzabhVar = zzaazVar.f4842a;
                if (zzabhVar != null) {
                    ((zzlw) zzabhVar).f20348y.mo6125l(10);
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public final zzyv m5559y(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.f21434b = uri;
        zzak zzakVarM9054a = zzzVar.m9054a();
        int i2 = this.f10348x.f10085f;
        zzyu zzyuVar = this.f10350z;
        zzyuVar.f21406c = i2;
        zzakVarM9054a.f5574b.getClass();
        return new zzyv(zzakVarM9054a, zzyuVar.f21404a, zzyuVar.f21405b, zzuq.f21010a, zzyuVar.f21407d, zzyuVar.f21406c);
    }

    /* JADX INFO: renamed from: z */
    public final void m5560z(Uri[] uriArr, String str) {
        m5538A(uriArr, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: k */
    public final void mo3941k(zzhv zzhvVar, boolean z) {
    }
}
