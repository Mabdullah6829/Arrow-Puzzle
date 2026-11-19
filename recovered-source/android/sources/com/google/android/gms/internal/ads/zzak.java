package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzak {

    /* JADX INFO: renamed from: a */
    public final String f5573a;

    /* JADX INFO: renamed from: b */
    public final zzag f5574b;

    /* JADX INFO: renamed from: c */
    public final zzaf f5575c;

    /* JADX INFO: renamed from: d */
    public final zzan f5576d;

    /* JADX INFO: renamed from: e */
    public final zzac f5577e;

    /* JADX INFO: renamed from: f */
    public final zzai f5578f;

    static {
        new zzz().m9054a();
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzak(String str, zzac zzacVar, zzag zzagVar, zzaf zzafVar, zzan zzanVar, zzai zzaiVar) {
        this.f5573a = str;
        this.f5574b = zzagVar;
        this.f5575c = zzafVar;
        this.f5576d = zzanVar;
        this.f5577e = zzacVar;
        this.f5578f = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzakVar = (zzak) obj;
        return this.f5573a.equals(zzakVar.f5573a) && this.f5577e.equals(zzakVar.f5577e) && Objects.equals(this.f5574b, zzakVar.f5574b) && this.f5575c.equals(zzakVar.f5575c) && Objects.equals(this.f5576d, zzakVar.f5576d) && Objects.equals(this.f5578f, zzakVar.f5578f);
    }

    public final int hashCode() {
        int iHashCode = this.f5573a.hashCode() * 31;
        zzag zzagVar = this.f5574b;
        return (this.f5576d.hashCode() + ((this.f5577e.hashCode() + ((this.f5575c.hashCode() + ((iHashCode + (zzagVar != null ? zzagVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
