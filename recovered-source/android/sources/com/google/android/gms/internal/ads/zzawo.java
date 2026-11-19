package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawo {

    /* JADX INFO: renamed from: a */
    public final zzavj f7178a;

    /* JADX INFO: renamed from: b */
    public final zzawk f7179b;

    /* JADX INFO: renamed from: c */
    public final zzawh f7180c = new zzawh();

    /* JADX INFO: renamed from: d */
    public final zzawc f7181d;

    public zzawo(zzavj zzavjVar, zzawk zzawkVar, zzawc zzawcVar) {
        this.f7178a = zzavjVar;
        this.f7179b = zzawkVar;
        this.f7181d = zzawcVar;
    }

    /* JADX INFO: renamed from: a */
    public final Optional m4465a() {
        zzavd zzavdVar;
        try {
            ArrayDeque arrayDeque = this.f7180c.f7174a;
            if (arrayDeque.isEmpty()) {
                throw new zzawg();
            }
            zzawe zzaweVar = (zzawe) arrayDeque.pop();
            long j2 = zzaweVar.f7171a;
            long j3 = zzaweVar.f7172b;
            long j4 = zzaweVar.f7173c;
            zzawk zzawkVar = this.f7179b;
            if (zzawkVar.f7176b < j3) {
                return Optional.of(zzavd.f6999Z);
            }
            this.f7181d.m4453a(j2);
            if (j4 == 0) {
                while (zzawkVar.f7176b > j3) {
                    zzawkVar.m4463c();
                }
            }
            return Optional.empty();
        } catch (zzawa e) {
            e = e;
            throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
        } catch (zzawb e2) {
            e = e2;
            throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
        } catch (zzawg unused) {
            zzavdVar = zzavd.f6989P;
            return Optional.of(zzavdVar);
        } catch (zzawi unused2) {
            zzavdVar = zzavd.f6999Z;
            return Optional.of(zzavdVar);
        }
    }
}
