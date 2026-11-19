package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzadp<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzaca<MessageType, BuilderType> {

    /* JADX INFO: renamed from: s */
    public final zzadu f22029s;

    /* JADX INFO: renamed from: t */
    public zzadu f22030t;

    public zzadp(zzadu zzaduVar) {
        this.f22029s = zzaduVar;
        if (zzaduVar.m9568m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f22030t = zzaduVar.m9570p();
    }

    @Override // com.google.android.gms.internal.measurement.zzaca
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ zzaca mo9340l(int i2, byte[] bArr) throws zzaeh {
        zzadf zzadfVar = zzadf.f22012b;
        int i3 = zzacf.f21956a;
        m9557t(bArr, i2, zzadf.f22013c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ zzaca mo9341m(byte[] bArr, int i2, zzadf zzadfVar) throws zzaeh {
        m9557t(bArr, i2, zzadfVar);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m9552o() {
        if (this.f22030t.m9568m()) {
            return;
        }
        zzadu zzaduVarM9570p = this.f22029s.m9570p();
        zzafl.f22093c.m9649a(zzaduVarM9570p.getClass()).mo9631a(zzaduVarM9570p, this.f22030t);
        this.f22030t = zzaduVarM9570p;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final zzadp clone() {
        zzadp zzadpVar = (zzadp) this.f22029s.mo9574z(5);
        zzadpVar.f22030t = mo9558w();
        return zzadpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafb
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final zzadu mo9558w() {
        if (!this.f22030t.m9568m()) {
            return this.f22030t;
        }
        zzadu zzaduVar = this.f22030t;
        zzaduVar.getClass();
        zzafl.f22093c.m9649a(zzaduVar.getClass()).mo9633c(zzaduVar);
        zzaduVar.m9569o();
        return this.f22030t;
    }

    /* JADX INFO: renamed from: r */
    public final zzadu m9555r() {
        zzadu zzaduVarMo9558w = mo9558w();
        zzaduVarMo9558w.getClass();
        if (zzadu.m9563x(zzaduVarMo9558w, true)) {
            return zzaduVarMo9558w;
        }
        throw new zzafy();
    }

    /* JADX INFO: renamed from: s */
    public final void m9556s(zzadu zzaduVar) {
        zzadu zzaduVar2 = this.f22029s;
        if (zzaduVar2.equals(zzaduVar)) {
            return;
        }
        if (!this.f22030t.m9568m()) {
            zzadu zzaduVarM9570p = zzaduVar2.m9570p();
            zzafl.f22093c.m9649a(zzaduVarM9570p.getClass()).mo9631a(zzaduVarM9570p, this.f22030t);
            this.f22030t = zzaduVarM9570p;
        }
        zzadu zzaduVar3 = this.f22030t;
        zzafl.f22093c.m9649a(zzaduVar3.getClass()).mo9631a(zzaduVar3, zzaduVar);
    }

    /* JADX INFO: renamed from: t */
    public final void m9557t(byte[] bArr, int i2, zzadf zzadfVar) throws zzaeh {
        if (!this.f22030t.m9568m()) {
            zzadu zzaduVarM9570p = this.f22029s.m9570p();
            zzafl.f22093c.m9649a(zzaduVarM9570p.getClass()).mo9631a(zzaduVarM9570p, this.f22030t);
            this.f22030t = zzaduVarM9570p;
        }
        try {
            zzafl.f22093c.m9649a(this.f22030t.getClass()).mo9637g(this.f22030t, bArr, 0, i2, new zzacg(zzadfVar));
        } catch (zzaeh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
