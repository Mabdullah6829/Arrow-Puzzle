package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpt implements zzno {

    /* JADX INFO: renamed from: a */
    public final zzdp f20555a;

    /* JADX INFO: renamed from: b */
    public final zzbd f20556b;

    /* JADX INFO: renamed from: c */
    public final zzbe f20557c;

    /* JADX INFO: renamed from: d */
    public final zzps f20558d;

    /* JADX INFO: renamed from: e */
    public final SparseArray f20559e;

    /* JADX INFO: renamed from: f */
    public zzeg f20560f;

    /* JADX INFO: renamed from: g */
    public zzbb f20561g;

    /* JADX INFO: renamed from: h */
    public zzea f20562h;

    /* JADX INFO: renamed from: i */
    public boolean f20563i;

    public zzpt(zzdp zzdpVar) {
        zzdpVar.getClass();
        this.f20555a = zzdpVar;
        String str = zzfm.f16091a;
        Looper looperMyLooper = Looper.myLooper();
        this.f20560f = new zzeg((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        zzbd zzbdVar = new zzbd();
        this.f20556b = zzbdVar;
        this.f20557c = new zzbe();
        this.f20558d = new zzps(zzbdVar);
        this.f20559e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: I */
    public final void mo4643I(final int i2) {
        final zznp zznpVarM8815s = m8815s();
        m8814r(zznpVarM8815s, 4, new zzeb(zznpVarM8815s, i2) { // from class: com.google.android.gms.internal.ads.zzow

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f20534a;

            {
                this.f20534a = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo5544c(this.f20534a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: J */
    public final void mo4644J(final zzbv zzbvVar) {
        final zznp zznpVarM8818w = m8818w();
        m8814r(zznpVarM8818w, 25, new zzeb(zznpVarM8818w, zzbvVar) { // from class: com.google.android.gms.internal.ads.zzpi

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zzbv f20542a;

            {
                this.f20542a = zzbvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                zzbv zzbvVar2 = this.f20542a;
                ((zznr) obj).mo5545h(zzbvVar2);
                int i2 = zzbvVar2.f9426a;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: K */
    public final void mo4645K(final int i2, final zzba zzbaVar, final zzba zzbaVar2) {
        if (i2 == 1) {
            this.f20563i = false;
            i2 = 1;
        }
        zzbb zzbbVar = this.f20561g;
        zzbbVar.getClass();
        zzps zzpsVar = this.f20558d;
        zzpsVar.f20552d = zzps.m8810c(zzbbVar, zzpsVar.f20550b, zzpsVar.f20553e, zzpsVar.f20549a);
        final zznp zznpVarM8815s = m8815s();
        m8814r(zznpVarM8815s, 11, new zzeb(zznpVarM8815s, i2, zzbaVar, zzbaVar2) { // from class: com.google.android.gms.internal.ads.zzpd

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f20541a;

            {
                this.f20541a = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo8805a(this.f20541a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: L */
    public final void mo4646L(zzau zzauVar) {
        zzxl zzxlVar;
        m8814r((!(zzauVar instanceof zzjm) || (zzxlVar = ((zzjm) zzauVar).f20141z) == null) ? m8815s() : m8817v(zzxlVar), 10, new zzpc());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: M */
    public final void mo4647M(final zzau zzauVar) {
        zzxl zzxlVar;
        final zznp zznpVarM8815s = (!(zzauVar instanceof zzjm) || (zzxlVar = ((zzjm) zzauVar).f20141z) == null) ? m8815s() : m8817v(zzxlVar);
        m8814r(zznpVarM8815s, 10, new zzeb(zznpVarM8815s, zzauVar) { // from class: com.google.android.gms.internal.ads.zzpb

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zzau f20540a;

            {
                this.f20540a = zzauVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo5548l(this.f20540a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: a */
    public final void mo4648a() {
        m8814r(m8815s(), 14, new zzpf());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: b */
    public final void mo4649b() {
        m8814r(m8815s(), 3, new zzot());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: c */
    public final void mo4650c() {
        m8814r(m8815s(), 13, new zzou());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: d */
    public final void mo4651d() {
        m8814r(m8815s(), 2, new zzos());
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: e */
    public final void mo8737e(int i2, zzxl zzxlVar, final zzxh zzxhVar) {
        final zznp zznpVarM8819x = m8819x(i2, zzxlVar);
        m8814r(zznpVarM8819x, PointerIconCompat.TYPE_WAIT, new zzeb() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo8807f(zznpVarM8819x, zzxhVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: f */
    public final void mo4652f() {
        m8814r(m8818w(), 21, new zzph());
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: g */
    public final void mo8738g(int i2, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar) {
        m8814r(m8819x(i2, zzxlVar), 1001, new zzol());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: h */
    public final void mo4653h() {
        m8814r(m8818w(), 23, new zzpg());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: i */
    public final void mo4654i() {
        m8814r(m8815s(), 12, new zzpe());
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: j */
    public final void mo8739j(int i2, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar) {
        m8814r(m8819x(i2, zzxlVar), 1002, new zzom());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: k */
    public final void mo4655k() {
        m8814r(m8818w(), 24, new zzoj());
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: l */
    public final void mo8740l(int i2, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar, final IOException iOException, final boolean z) {
        final zznp zznpVarM8819x = m8819x(i2, zzxlVar);
        m8814r(zznpVarM8819x, PointerIconCompat.TYPE_HELP, new zzeb(zznpVarM8819x, zzxcVar, zzxhVar, iOException, z) { // from class: com.google.android.gms.internal.ads.zzon

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IOException f20531a;

            {
                this.f20531a = iOException;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo5550p(this.f20531a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* JADX INFO: renamed from: m */
    public final void mo8801m() {
        m8814r(m8815s(), 1034, new zzoi());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    /* JADX INFO: renamed from: n */
    public final void mo4656n() {
        m8814r(m8818w(), 22, new zznx());
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* JADX INFO: renamed from: o */
    public final void mo8802o(List list, zzxl zzxlVar) {
        zzbb zzbbVar = this.f20561g;
        zzbbVar.getClass();
        zzps zzpsVar = this.f20558d;
        zzpsVar.getClass();
        zzpsVar.f20550b = zzgwt.m7220t(list);
        if (!list.isEmpty()) {
            zzpsVar.f20553e = (zzxl) list.get(0);
            zzxlVar.getClass();
            zzpsVar.f20554f = zzxlVar;
        }
        if (zzpsVar.f20552d == null) {
            zzpsVar.f20552d = zzps.m8810c(zzbbVar, zzpsVar.f20550b, zzpsVar.f20553e, zzpsVar.f20549a);
        }
        zzpsVar.m8812a(zzbbVar.mo4709f());
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: p */
    public final void mo8741p(int i2, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar, int i3) {
        m8814r(m8819x(i2, zzxlVar), 1000, new zzok());
    }

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
    @Override // com.google.android.gms.internal.ads.zzabq
    /* JADX INFO: renamed from: q */
    public final void mo3931q(final int i2, final long j2, final long j3) {
        Object next;
        Object objLast;
        zzxl zzxlVar;
        zzps zzpsVar = this.f20558d;
        if (zzpsVar.f20550b.isEmpty()) {
            zzxlVar = null;
        } else {
            List list = zzpsVar.f20550b;
            if (list != null) {
                if (list.isEmpty()) {
                    throw new NoSuchElementException();
                }
                objLast = list.get(list.size() - 1);
            } else if (list instanceof SortedSet) {
                objLast = ((SortedSet) list).last();
            } else {
                Iterator it = list.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                objLast = next;
            }
            zzxlVar = (zzxl) objLast;
        }
        final zznp zznpVarM8817v = m8817v(zzxlVar);
        m8814r(zznpVarM8817v, PointerIconCompat.TYPE_CELL, new zzeb(i2, j2, j3) { // from class: com.google.android.gms.internal.ads.zzpk

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f20544b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f20545c;

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo8808n(this.f20543a, this.f20544b, this.f20545c);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m8814r(zznp zznpVar, int i2, zzeb zzebVar) {
        this.f20559e.put(i2, zznpVar);
        zzeg zzegVar = this.f20560f;
        zzegVar.m6197c(i2, zzebVar);
        zzegVar.m6198d();
    }

    /* JADX INFO: renamed from: s */
    public final zznp m8815s() {
        return m8817v(this.f20558d.f20552d);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* JADX INFO: renamed from: t */
    public final void mo8803t() {
        m8814r(m8818w(), 1033, new zzoo());
    }

    /* JADX INFO: renamed from: u */
    public final zznp m8816u(zzbf zzbfVar, int i2, zzxl zzxlVar) {
        zzxl zzxlVar2 = true == zzbfVar.m4833g() ? null : zzxlVar;
        long jZzb = this.f20555a.zzb();
        boolean z = zzbfVar.equals(this.f20561g.mo4709f()) && i2 == this.f20561g.mo4710h();
        long jM6518t = 0;
        if (zzxlVar2 == null || !zzxlVar2.m9025b()) {
            if (z) {
                jM6518t = this.f20561g.mo4707C();
            } else if (!zzbfVar.m4833g()) {
                zzbfVar.mo4736b(i2, this.f20557c, 0L).getClass();
                jM6518t = zzfm.m6518t(0L);
            }
        } else if (z && this.f20561g.mo4713l() == zzxlVar2.f21279b && this.f20561g.mo4716x() == zzxlVar2.f21280c) {
            jM6518t = this.f20561g.mo4712k();
        }
        return new zznp(jZzb, zzbfVar, i2, zzxlVar2, jM6518t, this.f20561g.mo4709f(), this.f20561g.mo4710h(), this.f20558d.f20552d, this.f20561g.mo4712k(), this.f20561g.mo4717z());
    }

    /* JADX INFO: renamed from: v */
    public final zznp m8817v(zzxl zzxlVar) {
        this.f20561g.getClass();
        zzbf zzbfVar = zzxlVar == null ? null : (zzbf) this.f20558d.f20551c.get(zzxlVar);
        if (zzxlVar != null && zzbfVar != null) {
            return m8816u(zzbfVar, zzbfVar.mo4841o(zzxlVar.f21278a, this.f20556b).f7634c, zzxlVar);
        }
        int iMo4710h = this.f20561g.mo4710h();
        zzbf zzbfVarMo4709f = this.f20561g.mo4709f();
        if (iMo4710h >= zzbfVarMo4709f.mo4735a()) {
            zzbfVarMo4709f = zzbf.f7725a;
        }
        return m8816u(zzbfVarMo4709f, iMo4710h, null);
    }

    /* JADX INFO: renamed from: w */
    public final zznp m8818w() {
        return m8817v(this.f20558d.f20554f);
    }

    /* JADX INFO: renamed from: x */
    public final zznp m8819x(int i2, zzxl zzxlVar) {
        zzbb zzbbVar = this.f20561g;
        zzbbVar.getClass();
        if (zzxlVar != null) {
            return ((zzbf) this.f20558d.f20551c.get(zzxlVar)) != null ? m8817v(zzxlVar) : m8816u(zzbf.f7725a, i2, zzxlVar);
        }
        zzbf zzbfVarMo4709f = zzbbVar.mo4709f();
        if (i2 >= zzbfVarMo4709f.mo4735a()) {
            zzbfVarMo4709f = zzbf.f7725a;
        }
        return m8816u(zzbfVarMo4709f, i2, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m8820y(final zznm zznmVar, Looper looper) {
        boolean z = true;
        if (this.f20561g != null && !this.f20558d.f20550b.isEmpty()) {
            z = false;
        }
        zzgtr.m7133f(z);
        zznmVar.getClass();
        this.f20561g = zznmVar;
        zzdp zzdpVar = this.f20555a;
        this.f20562h = zzdpVar.mo5975a(looper, null);
        zzeg zzegVar = this.f20560f;
        zzec zzecVar = new zzec() { // from class: com.google.android.gms.internal.ads.zzpr
            @Override // com.google.android.gms.internal.ads.zzec
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo6149a(Object obj, zzs zzsVar) {
                ((zznr) obj).mo8806d(zznmVar, new zznq(zzsVar, this.f20547a.f20559e));
            }
        };
        zzegVar.getClass();
        this.f20560f = new zzeg(zzegVar.f13835d, looper, looper.getThread(), zzdpVar, zzecVar, zzegVar.f13840i);
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb() {
        zzbb zzbbVar = this.f20561g;
        zzbbVar.getClass();
        zzps zzpsVar = this.f20558d;
        zzpsVar.f20552d = zzps.m8810c(zzbbVar, zzpsVar.f20550b, zzpsVar.f20553e, zzpsVar.f20549a);
        zzpsVar.m8812a(zzbbVar.mo4709f());
        m8814r(m8815s(), 0, new zzoq());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc() {
        m8814r(m8815s(), 1, new zzor());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh() {
        m8814r(m8815s(), -1, new zzov());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj() {
        m8814r(m8815s(), 5, new zzox());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk() {
        m8814r(m8815s(), 6, new zzoy());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl() {
        m8814r(m8815s(), 7, new zzpa());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza() {
    }
}
