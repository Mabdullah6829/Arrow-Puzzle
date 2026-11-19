package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zziks extends zziep implements zziga {
    private static final zziks zzQ;
    private static volatile zzigh zzR;
    private zziko zzA;
    private zzifb zzB;
    private zziiz zzC;
    private String zzD;
    private zziir zzE;
    private zzifb zzF;
    private int zzG;
    private zzifb zzH;
    private zzifb zzI;
    private long zzJ;
    private zzikr zzK;
    private zzijs zzL;
    private String zzM;
    private zzikl zzN;
    private zzifb zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private zziiv zzg;
    private zzifb zzh;
    private zzifb zzi;
    private String zzj;
    private zzijy zzk;
    private boolean zzl;
    private zzifb zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private zzidl zzu;
    private zzikf zzv;
    private boolean zzw;
    private String zzx;
    private zzifb zzy;
    private zzifb zzz;
    private byte zzP = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zziks zziksVar = new zziks();
        zzQ = zziksVar;
        zziep.m8338y(zziks.class, zziksVar);
    }

    private zziks() {
        zzigk zzigkVar = zzigk.f19864w;
        this.zzh = zzigkVar;
        this.zzi = zzigkVar;
        this.zzj = "";
        this.zzm = zzigkVar;
        this.zzn = "";
        this.zzu = zzidl.f19719t;
        this.zzx = "";
        this.zzy = zzigkVar;
        this.zzz = zzigkVar;
        this.zzB = zzigkVar;
        this.zzD = "";
        this.zzF = zzigkVar;
        this.zzH = zzigkVar;
        this.zzI = zzigkVar;
        this.zzM = "";
        this.zzO = zzigkVar;
    }

    /* JADX INFO: renamed from: G */
    public static zziit m8523G() {
        return (zziit) zzQ.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final String m8524D() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: E */
    public final List m8525E() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: F */
    public final String m8526F() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m8527H(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m8528I(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m8529J(zziiv zziivVar) {
        this.zzg = zziivVar;
        this.zza |= 32;
    }

    /* JADX INFO: renamed from: K */
    public final void m8530K(zzikd zzikdVar) {
        zzifb zzifbVar = this.zzh;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzh = zzifbVar.mo8128l(size + size);
        }
        this.zzh.add(zzikdVar);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m8531L(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m8532M() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m8533N(zzijy zzijyVar) {
        this.zzk = zzijyVar;
        this.zza |= 128;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m8534O(zzikf zzikfVar) {
        this.zzv = zzikfVar;
        this.zza |= 8192;
    }

    /* JADX INFO: renamed from: P */
    public final void m8535P(ArrayList arrayList) {
        zzifb zzifbVar = this.zzy;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzy = zzifbVar.mo8128l(size + size);
        }
        zzicu.m8096l(arrayList, this.zzy);
    }

    /* JADX INFO: renamed from: Q */
    public final void m8536Q(ArrayList arrayList) {
        zzifb zzifbVar = this.zzz;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzz = zzifbVar.mo8128l(size + size);
        }
        zzicu.m8096l(arrayList, this.zzz);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m8537R(int i2) {
        this.zzb = i2 - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        switch (zzieoVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                this.zzP = zziepVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new zzigl(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", zzikd.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", zzijz.f19947a, "zzc", zziis.f19939a, "zzg", "zzj", "zzk", "zzu", "zzi", zzikw.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzilc.class, "zzC", "zzD", "zzE", "zzF", zzijd.class, "zzG", zzikm.f19951a, "zzH", zzijq.class, "zzI", zzijv.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", zziki.class});
            case 3:
                return new zziks();
            case 4:
                return new zziit(zzQ);
            case 5:
                return zzQ;
            case 6:
                zzigh zzighVar = zzR;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zziks.class) {
                    try {
                        zziekVar = zzR;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzQ);
                            zzR = zziekVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zziekVar;
            default:
                throw null;
        }
    }
}
