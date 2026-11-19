package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zziej;
import com.google.android.gms.internal.ads.zziep;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zziej<MessageType extends zziep<MessageType, BuilderType>, BuilderType extends zziej<MessageType, BuilderType>> extends zzict<MessageType, BuilderType> {

    /* JADX INFO: renamed from: s */
    public final zziep f19779s;

    /* JADX INFO: renamed from: t */
    public zziep f19780t;

    public zziej(zziep zziepVar) {
        this.f19779s = zziepVar;
        if (zziepVar.m8343o()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19780t = zziepVar.m8345u();
    }

    @Override // com.google.android.gms.internal.ads.zzict
    public final Object clone() {
        zziej zziejVar = (zziej) this.f19779s.mo4492z(zzieo.f19786w, null);
        zziejVar.f19780t = mo8324j();
        return zziejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzict
    /* JADX INFO: renamed from: g */
    public final zziej clone() {
        zziej zziejVar = (zziej) this.f19779s.mo4492z(zzieo.f19786w, null);
        zziejVar.f19780t = mo8324j();
        return zziejVar;
    }

    /* JADX INFO: renamed from: k */
    public final zziej m8325k(byte[] bArr, int i2, zzidz zzidzVar) throws zzifh {
        m8326l();
        try {
            zzigj.f19860c.m8411a(this.f19780t.getClass()).mo8397e(this.f19780t, bArr, 0, i2, new zzicz(zzidzVar));
            return this;
        } catch (zzifh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8326l() {
        if (this.f19780t.m8343o()) {
            return;
        }
        zziep zziepVarM8345u = this.f19779s.m8345u();
        zzigj.f19860c.m8411a(zziepVarM8345u.getClass()).mo8393a(zziepVarM8345u, this.f19780t);
        this.f19780t = zziepVarM8345u;
    }

    @Override // com.google.android.gms.internal.ads.zzify
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final zziep mo8324j() {
        if (!this.f19780t.m8343o()) {
            return this.f19780t;
        }
        zziep zziepVar = this.f19780t;
        zziepVar.getClass();
        zzigj.f19860c.m8411a(zziepVar.getClass()).mo8395c(zziepVar);
        zziepVar.m8344p();
        return this.f19780t;
    }

    /* JADX INFO: renamed from: o */
    public final zziep m8328o() {
        zziep zziepVarMo8324j = mo8324j();
        zziepVarMo8324j.getClass();
        if (zziep.m8330A(zziepVarMo8324j, true)) {
            return zziepVarMo8324j;
        }
        throw new zzihc();
    }

    /* JADX INFO: renamed from: p */
    public final zziej m8329p(zziep zziepVar) {
        if (this.f19779s.equals(zziepVar)) {
            return this;
        }
        m8326l();
        zziep zziepVar2 = this.f19780t;
        zzigj.f19860c.m8411a(zziepVar2.getClass()).mo8393a(zziepVar2, zziepVar);
        return this;
    }
}
