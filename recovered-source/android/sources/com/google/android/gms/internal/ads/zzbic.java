package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbic {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbic$1 */
    public static /* synthetic */ class C51621 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7897a;

        static {
            int[] iArr = new int[zzieo.values().length];
            f7897a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7897a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7897a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7897a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7897a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7897a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7897a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final class zza extends zziep<zza, zzb> implements zzf {
        private static final zza zzB;
        private static volatile zzigh<zza> zzC = null;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private zzifb<zzat> zzA;
        private int zzl;
        private int zzm;
        private int zzn = 1000;
        private zzg zzo;
        private zzi zzp;
        private zzifb<zzd> zzu;
        private zzk zzv;
        private zzah zzw;
        private zzac zzx;
        private zzx zzy;
        private zzz zzz;

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbic$zza$zza, reason: collision with other inner class name */
        public enum EnumC6586zza implements zziet {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);


            /* JADX INFO: renamed from: s */
            public final int f7911s;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbic$zza$zza$zza, reason: collision with other inner class name */
            final class C6587zza implements zziev {

                /* JADX INFO: renamed from: a */
                public static final zziev f7912a = new C6587zza();

                private C6587zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziev
                public final boolean zza(int i2) {
                    EnumC6586zza enumC6586zza;
                    switch (i2) {
                        case 0:
                            enumC6586zza = EnumC6586zza.AD_INITIATER_UNSPECIFIED;
                            break;
                        case 1:
                            enumC6586zza = EnumC6586zza.BANNER;
                            break;
                        case 2:
                            enumC6586zza = EnumC6586zza.DFP_BANNER;
                            break;
                        case 3:
                            enumC6586zza = EnumC6586zza.INTERSTITIAL;
                            break;
                        case 4:
                            enumC6586zza = EnumC6586zza.DFP_INTERSTITIAL;
                            break;
                        case 5:
                            enumC6586zza = EnumC6586zza.NATIVE_EXPRESS;
                            break;
                        case 6:
                            enumC6586zza = EnumC6586zza.AD_LOADER;
                            break;
                        case 7:
                            enumC6586zza = EnumC6586zza.REWARD_BASED_VIDEO_AD;
                            break;
                        case 8:
                            enumC6586zza = EnumC6586zza.BANNER_SEARCH_ADS;
                            break;
                        case 9:
                            enumC6586zza = EnumC6586zza.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                            break;
                        case 10:
                            enumC6586zza = EnumC6586zza.APP_OPEN;
                            break;
                        case 11:
                            enumC6586zza = EnumC6586zza.REWARDED_INTERSTITIAL;
                            break;
                        default:
                            EnumC6586zza enumC6586zza2 = EnumC6586zza.AD_INITIATER_UNSPECIFIED;
                            enumC6586zza = null;
                            break;
                    }
                    return enumC6586zza != null;
                }
            }

            static {
                new zzieu<EnumC6586zza>() { // from class: com.google.android.gms.internal.ads.zzbic.zza.zza.1
                };
            }

            EnumC6586zza(int i2) {
                this.f7911s = i2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.f7911s);
            }

            @Override // com.google.android.gms.internal.ads.zziet
            public final int zza() {
                return this.f7911s;
            }
        }

        public final class zzb extends zziej<zza, zzb> implements zzf {
            public /* synthetic */ zzb(int i2) {
                this();
            }

            private zzb() {
                super(zza.zzB);
            }
        }

        static {
            zza zzaVar = new zza();
            zzB = zzaVar;
            zziep.m8338y(zza.class, zzaVar);
        }

        private zza() {
            zzigk zzigkVar = zzigk.f19864w;
            this.zzu = zzigkVar;
            this.zzA = zzigkVar;
        }

        /* JADX INFO: renamed from: D */
        public static zza m4899D() {
            return zzB;
        }

        /* JADX INFO: renamed from: E */
        public final void m4901E(EnumC6586zza enumC6586zza) {
            this.zzm = enumC6586zza.f7911s;
            this.zzl |= 1;
        }

        /* JADX INFO: renamed from: F */
        public final void m4902F(zzi zziVar) {
            this.zzp = zziVar;
            this.zzl |= 8;
        }

        /* JADX INFO: renamed from: H */
        public final zzi m4903H() {
            zzi zziVar = this.zzp;
            return zziVar == null ? zzi.m4981D() : zziVar;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                EnumC6586zza enumC6586zza = EnumC6586zza.AD_INITIATER_UNSPECIFIED;
                zziev zzievVar = EnumC6586zza.C6587zza.f7912a;
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", zzievVar, "zzn", zzq.zza.f7972a, "zzo", "zzp", "zzu", zzd.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzat.class});
            }
            if (iOrdinal == 3) {
                return new zza();
            }
            if (iOrdinal == 4) {
                return new zzb(0);
            }
            if (iOrdinal == 5) {
                return zzB;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zza> zzighVar = zzC;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zza.class) {
                try {
                    zziekVar = zzC;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzB);
                        zzC = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzaa extends zziga {
    }

    public final class zzab extends zziep<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzf;
        private static volatile zzigh<zzab> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zziej<zzab, zza> implements zzae {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzab.zzf);
            }
        }

        public enum zzb implements zziet {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);


            /* JADX INFO: renamed from: s */
            public final int f7918s;

            final class zza implements zziev {

                /* JADX INFO: renamed from: a */
                public static final zziev f7919a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziev
                public final boolean zza(int i2) {
                    zzb zzbVar;
                    if (i2 == 0) {
                        zzbVar = zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    } else if (i2 == 1) {
                        zzbVar = zzb.TWO_G;
                    } else if (i2 == 2) {
                        zzbVar = zzb.THREE_G;
                    } else if (i2 != 4) {
                        zzb zzbVar2 = zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                        zzbVar = null;
                    } else {
                        zzbVar = zzb.LTE;
                    }
                    return zzbVar != null;
                }
            }

            static {
                new zzieu<zzb>() { // from class: com.google.android.gms.internal.ads.zzbic.zzab.zzb.1
                };
            }

            zzb(int i2) {
                this.f7918s = i2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.f7918s);
            }

            @Override // com.google.android.gms.internal.ads.zziet
            public final int zza() {
                return this.f7918s;
            }
        }

        public enum zzc implements zziet {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);


            /* JADX INFO: renamed from: s */
            public final int f7924s;

            final class zza implements zziev {

                /* JADX INFO: renamed from: a */
                public static final zziev f7925a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziev
                public final boolean zza(int i2) {
                    zzc zzcVar;
                    if (i2 == 0) {
                        zzcVar = zzc.NETWORKTYPE_UNSPECIFIED;
                    } else if (i2 == 1) {
                        zzcVar = zzc.CELL;
                    } else if (i2 != 2) {
                        zzc zzcVar2 = zzc.NETWORKTYPE_UNSPECIFIED;
                        zzcVar = null;
                    } else {
                        zzcVar = zzc.WIFI;
                    }
                    return zzcVar != null;
                }
            }

            static {
                new zzieu<zzc>() { // from class: com.google.android.gms.internal.ads.zzbic.zzab.zzc.1
                };
            }

            zzc(int i2) {
                this.f7924s = i2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.f7924s);
            }

            @Override // com.google.android.gms.internal.ads.zziet
            public final int zza() {
                return this.f7924s;
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzf = zzabVar;
            zziep.m8338y(zzab.class, zzabVar);
        }

        private zzab() {
        }

        /* JADX INFO: renamed from: D */
        public static zza m4904D() {
            return (zza) zzf.m8346v();
        }

        /* JADX INFO: renamed from: E */
        public final void m4906E(zzc zzcVar) {
            this.zzd = zzcVar.f7924s;
            this.zzc |= 1;
        }

        /* JADX INFO: renamed from: F */
        public final void m4907F(zzb zzbVar) {
            this.zze = zzbVar.f7918s;
            this.zzc |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzc zzcVar = zzc.NETWORKTYPE_UNSPECIFIED;
                zziev zzievVar = zzc.zza.f7925a;
                zzb zzbVar = zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", zzievVar, "zze", zzb.zza.f7919a});
            }
            if (iOrdinal == 3) {
                return new zzab();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzab> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzab.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public final class zzac extends zziep<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzf;
        private static volatile zzigh<zzac> zzg;
        private int zzc;
        private int zzd;
        private zzap zze;

        public final class zza extends zziej<zzac, zza> implements zzad {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzac.zzf);
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzf = zzacVar;
            zziep.m8338y(zzac.class, zzacVar);
        }

        private zzac() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzq.zza.f7972a, "zze"});
            }
            if (iOrdinal == 3) {
                return new zzac();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzac> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzac.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzad extends zziga {
    }

    public interface zzae extends zziga {
    }

    public final class zzaf extends zziep<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzv;
        private static volatile zzigh<zzaf> zzw;
        private int zzi;
        private int zzk;
        private int zzl;
        private long zzm;
        private long zzp;
        private int zzu;
        private zzifb<zza> zzj = zzigk.f19864w;
        private String zzn = "";
        private String zzo = "";

        public final class zza extends zziep<zza, C6588zza> implements zzb {
            private static final zza zzG;
            private static volatile zzigh<zza> zzH = null;
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zziey<zzd.zza> zzx = new zziey<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbic.zzaf.zza.1
            };
            private int zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private long zzF;
            private int zzn;
            private long zzo;
            private int zzp;
            private long zzu;
            private long zzv;
            private zziex zzw = zzieq.f19791w;
            private zzab zzy;
            private int zzz;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbic$zzaf$zza$zza, reason: collision with other inner class name */
            public final class C6588zza extends zziej<zza, C6588zza> implements zzb {
                public /* synthetic */ C6588zza(int i2) {
                    this();
                }

                private C6588zza() {
                    super(zza.zzG);
                }
            }

            static {
                zza zzaVar = new zza();
                zzG = zzaVar;
                zziep.m8338y(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: renamed from: T */
            public static zza m4920T(byte[] bArr) {
                zza zzaVar = zzG;
                int length = bArr.length;
                zzidz zzidzVar = zzidz.f19758b;
                int i2 = zzicy.f19697a;
                zziep zziepVarM8331B = zziep.m8331B(zzaVar, bArr, length, zzidz.f19759c);
                zziep.m8332C(zziepVarM8331B);
                return (zza) zziepVarM8331B;
            }

            /* JADX INFO: renamed from: U */
            public static C6588zza m4921U() {
                return (C6588zza) zzG.m8346v();
            }

            /* JADX INFO: renamed from: D */
            public final void m4922D(long j2) {
                this.zzn |= 1;
                this.zzo = j2;
            }

            /* JADX INFO: renamed from: E */
            public final void m4923E(zzq zzqVar) {
                this.zzp = zzqVar.f7971s;
                this.zzn |= 2;
            }

            /* JADX INFO: renamed from: F */
            public final void m4924F(long j2) {
                this.zzn |= 4;
                this.zzu = j2;
            }

            /* JADX INFO: renamed from: G */
            public final void m4925G(long j2) {
                this.zzn |= 8;
                this.zzv = j2;
            }

            /* JADX INFO: renamed from: H */
            public final void m4926H(ArrayList arrayList) {
                zziex zziexVar = this.zzw;
                if (!zziexVar.zza()) {
                    int size = zziexVar.size();
                    this.zzw = zziexVar.mo8128l(size + size);
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    this.zzw.mo8348I(((zzd.zza) obj).f7959s);
                }
            }

            /* JADX INFO: renamed from: I */
            public final void m4927I(zzab zzabVar) {
                this.zzy = zzabVar;
                this.zzn |= 16;
            }

            /* JADX INFO: renamed from: J */
            public final void m4928J(zzq zzqVar) {
                this.zzz = zzqVar.f7971s;
                this.zzn |= 32;
            }

            /* JADX INFO: renamed from: K */
            public final void m4929K(zzq zzqVar) {
                this.zzA = zzqVar.f7971s;
                this.zzn |= 64;
            }

            /* JADX INFO: renamed from: L */
            public final void m4930L(zzq zzqVar) {
                this.zzB = zzqVar.f7971s;
                this.zzn |= 128;
            }

            /* JADX INFO: renamed from: M */
            public final void m4931M(int i2) {
                this.zzn |= 256;
                this.zzC = i2;
            }

            /* JADX INFO: renamed from: N */
            public final void m4932N(zzq zzqVar) {
                this.zzD = zzqVar.f7971s;
                this.zzn |= 512;
            }

            /* JADX INFO: renamed from: O */
            public final void m4933O(zzd zzdVar) {
                this.zzE = zzdVar.f7933s;
                this.zzn |= 1024;
            }

            /* JADX INFO: renamed from: P */
            public final void m4934P(long j2) {
                this.zzn |= 2048;
                this.zzF = j2;
            }

            /* JADX INFO: renamed from: R */
            public final long m4935R() {
                return this.zzo;
            }

            /* JADX INFO: renamed from: S */
            public final zzq m4936S() {
                zzq zzqVar;
                int i2 = this.zzp;
                if (i2 == 0) {
                    zzqVar = zzq.ENUM_FALSE;
                } else if (i2 == 1) {
                    zzqVar = zzq.ENUM_TRUE;
                } else if (i2 != 1000) {
                    zzq zzqVar2 = zzq.ENUM_FALSE;
                    zzqVar = null;
                } else {
                    zzqVar = zzq.ENUM_UNKNOWN;
                }
                return zzqVar == null ? zzq.ENUM_FALSE : zzqVar;
            }

            @Override // com.google.android.gms.internal.ads.zziep
            /* JADX INFO: renamed from: z */
            public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
                zzigh zziekVar;
                int iOrdinal = zzieoVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    zzq zzqVar = zzq.ENUM_FALSE;
                    zziev zzievVar = zzq.zza.f7972a;
                    zzd.zza zzaVar = zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    zziev zzievVar2 = zzd.zza.C6591zza.f7960a;
                    zzd zzdVar = zzd.UNSPECIFIED;
                    return new zzigl(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", zzievVar, "zzu", "zzv", "zzw", zzievVar2, "zzy", "zzz", zzievVar, "zzA", zzievVar, "zzB", zzievVar, "zzC", "zzD", zzievVar, "zzE", zzd.zza.f7934a, "zzF"});
                }
                if (iOrdinal == 3) {
                    return new zza();
                }
                if (iOrdinal == 4) {
                    return new C6588zza(0);
                }
                if (iOrdinal == 5) {
                    return zzG;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzigh<zza> zzighVar = zzH;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zza.class) {
                    try {
                        zziekVar = zzH;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzG);
                            zzH = zziekVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziekVar;
            }
        }

        public interface zzb extends zziga {
        }

        public final class zzc extends zziej<zzaf, zzc> implements zzag {
            public /* synthetic */ zzc(int i2) {
                this();
            }

            private zzc() {
                super(zzaf.zzv);
            }
        }

        public enum zzd implements zziet {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);


            /* JADX INFO: renamed from: s */
            public final int f7933s;

            final class zza implements zziev {

                /* JADX INFO: renamed from: a */
                public static final zziev f7934a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziev
                public final boolean zza(int i2) {
                    zzd zzdVar;
                    if (i2 == 0) {
                        zzdVar = zzd.UNSPECIFIED;
                    } else if (i2 == 1) {
                        zzdVar = zzd.CONNECTING;
                    } else if (i2 == 2) {
                        zzdVar = zzd.CONNECTED;
                    } else if (i2 == 3) {
                        zzdVar = zzd.DISCONNECTING;
                    } else if (i2 == 4) {
                        zzdVar = zzd.DISCONNECTED;
                    } else if (i2 != 5) {
                        zzd zzdVar2 = zzd.UNSPECIFIED;
                        zzdVar = null;
                    } else {
                        zzdVar = zzd.SUSPENDED;
                    }
                    return zzdVar != null;
                }
            }

            static {
                new zzieu<zzd>() { // from class: com.google.android.gms.internal.ads.zzbic.zzaf.zzd.1
                };
            }

            zzd(int i2) {
                this.f7933s = i2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.f7933s);
            }

            @Override // com.google.android.gms.internal.ads.zziet
            public final int zza() {
                return this.f7933s;
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzv = zzafVar;
            zziep.m8338y(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        /* JADX INFO: renamed from: D */
        public static zzc m4909D() {
            return (zzc) zzv.m8346v();
        }

        /* JADX INFO: renamed from: E */
        public final void m4911E(ArrayList arrayList) {
            zzifb<zza> zzifbVar = this.zzj;
            if (!zzifbVar.zza()) {
                int size = zzifbVar.size();
                this.zzj = zzifbVar.mo8128l(size + size);
            }
            zzicu.m8096l(arrayList, this.zzj);
        }

        /* JADX INFO: renamed from: F */
        public final void m4912F(int i2) {
            this.zzi |= 1;
            this.zzk = i2;
        }

        /* JADX INFO: renamed from: G */
        public final void m4913G(int i2) {
            this.zzi |= 2;
            this.zzl = i2;
        }

        /* JADX INFO: renamed from: H */
        public final void m4914H(long j2) {
            this.zzi |= 4;
            this.zzm = j2;
        }

        /* JADX INFO: renamed from: I */
        public final void m4915I(String str) {
            str.getClass();
            this.zzi |= 8;
            this.zzn = str;
        }

        /* JADX INFO: renamed from: J */
        public final void m4916J() {
            String str = Build.MODEL;
            str.getClass();
            this.zzi |= 16;
            this.zzo = str;
        }

        /* JADX INFO: renamed from: K */
        public final void m4917K(long j2) {
            this.zzi |= 32;
            this.zzp = j2;
        }

        /* JADX INFO: renamed from: L */
        public final void m4918L(int i2) {
            this.zzi |= 64;
            this.zzu = i2;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", zza.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
            }
            if (iOrdinal == 3) {
                return new zzaf();
            }
            if (iOrdinal == 4) {
                return new zzc(0);
            }
            if (iOrdinal == 5) {
                return zzv;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzaf> zzighVar = zzw;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzaf.class) {
                try {
                    zziekVar = zzw;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzv);
                        zzw = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzag extends zziga {
    }

    public final class zzah extends zziep<zzah, zza> implements zzak {
        private static final zzah zzB;
        private static volatile zzigh<zzah> zzC = null;
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private zzai zzA;
        private int zzl;
        private int zzm = 1000;
        private int zzn = 1000;
        private int zzo;
        private int zzp;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        public final class zza extends zziej<zzah, zza> implements zzak {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzah.zzB);
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzB = zzahVar;
            zziep.m8338y(zzah.class, zzahVar);
        }

        private zzah() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                zziev zzievVar = zzq.zza.f7972a;
                return new zzigl(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", zzievVar, "zzn", zzievVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
            }
            if (iOrdinal == 3) {
                return new zzah();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzB;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzah> zzighVar = zzC;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzah.class) {
                try {
                    zziekVar = zzC;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzB);
                        zzC = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public final class zzai extends zziep<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzf;
        private static volatile zzigh<zzai> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zziej<zzai, zza> implements zzaj {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzai.zzf);
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzf = zzaiVar;
            zziep.m8338y(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (iOrdinal == 3) {
                return new zzai();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzai> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzai.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzaj extends zziga {
    }

    public interface zzak extends zziga {
    }

    public final class zzal extends zziep<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzf;
        private static volatile zzigh<zzal> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zziej<zzal, zza> implements zzam {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzal.zzf);
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzf = zzalVar;
            zziep.m8338y(zzal.class, zzalVar);
        }

        private zzal() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (iOrdinal == 3) {
                return new zzal();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzal> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzal.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzam extends zziga {
    }

    public final class zzan extends zziep<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzh;
        private static volatile zzigh<zzan> zzi;
        private int zzd;
        private String zze = "";
        private int zzf;
        private zzap zzg;

        public final class zza extends zziej<zzan, zza> implements zzao {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzan.zzh);
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzh = zzanVar;
            zziep.m8338y(zzan.class, zzanVar);
        }

        private zzan() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzq.zza.f7972a, "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzan();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzan> zzighVar = zzi;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzan.class) {
                try {
                    zziekVar = zzi;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzh);
                        zzi = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzao extends zziga {
    }

    public final class zzap extends zziep<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzf;
        private static volatile zzigh<zzap> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zziej<zzap, zza> implements zzaq {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzap.zzf);
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzf = zzapVar;
            zziep.m8338y(zzap.class, zzapVar);
        }

        private zzap() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (iOrdinal == 3) {
                return new zzap();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzap> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzap.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzaq extends zziga {
    }

    public final class zzar extends zziep<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzh;
        private static volatile zzigh<zzar> zzi;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public final class zza extends zziej<zzar, zza> implements zzas {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzar.zzh);
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzh = zzarVar;
            zziep.m8338y(zzar.class, zzarVar);
        }

        private zzar() {
        }

        /* JADX INFO: renamed from: F */
        public static zza m4943F() {
            return (zza) zzh.m8346v();
        }

        /* JADX INFO: renamed from: D */
        public final void m4944D(int i2) {
            this.zzd |= 4;
            this.zzg = i2;
        }

        /* JADX INFO: renamed from: G */
        public final void m4945G(int i2) {
            this.zzd |= 1;
            this.zze = i2;
        }

        /* JADX INFO: renamed from: H */
        public final void m4946H(int i2) {
            this.zzd |= 2;
            this.zzf = i2;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzar();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzar> zzighVar = zzi;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzar.class) {
                try {
                    zziekVar = zzi;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzh);
                        zzi = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzas extends zziga {
    }

    public final class zzat extends zziep<zzat, zza> implements zzbi {
        private static final zzat zzL;
        private static volatile zzigh<zzat> zzM = null;
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private zzbc zzA;
        private zzay zzB;
        private int zzC;
        private int zzD;
        private zzap zzE;
        private int zzF;
        private int zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private long zzK;
        private int zzu;
        private zzba zzv;
        private zzbe zzw;
        private zzbg zzx;
        private zzbj zzy;
        private zzau zzz;

        public final class zza extends zziej<zzat, zza> implements zzbi {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzat.zzL);
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzL = zzatVar;
            zziep.m8338y(zzat.class, zzatVar);
        }

        private zzat() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
            }
            if (iOrdinal == 3) {
                return new zzat();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzL;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzat> zzighVar = zzM;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzat.class) {
                try {
                    zziekVar = zzM;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzL);
                        zzM = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public final class zzau extends zziep<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzh;
        private static volatile zzigh<zzau> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zziej<zzau, zza> implements zzav {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzau.zzh);
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzh = zzauVar;
            zziep.m8338y(zzau.class, zzauVar);
        }

        private zzau() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zza.f7972a, "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzau();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzau> zzighVar = zzi;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzau.class) {
                try {
                    zziekVar = zzi;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzh);
                        zzi = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzav extends zziga {
    }

    public final class zzaw extends zziep<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzd;
        private static volatile zzigh<zzaw> zze;
        private int zzb;
        private int zzc;

        public final class zza extends zziej<zzaw, zza> implements zzax {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzaw.zzd);
            }
        }

        public enum zzb implements zziet {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);


            /* JADX INFO: renamed from: s */
            public final int f7940s;

            final class zza implements zziev {

                /* JADX INFO: renamed from: a */
                public static final zziev f7941a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziev
                public final boolean zza(int i2) {
                    zzb zzbVar;
                    if (i2 == 0) {
                        zzbVar = zzb.VIDEO_ERROR_CODE_UNSPECIFIED;
                    } else if (i2 == 1) {
                        zzbVar = zzb.OPENGL_RENDERING_FAILED;
                    } else if (i2 == 2) {
                        zzbVar = zzb.CACHE_LOAD_FAILED;
                    } else if (i2 != 3) {
                        zzb zzbVar2 = zzb.VIDEO_ERROR_CODE_UNSPECIFIED;
                        zzbVar = null;
                    } else {
                        zzbVar = zzb.ANDROID_TARGET_API_TOO_LOW;
                    }
                    return zzbVar != null;
                }
            }

            static {
                new zzieu<zzb>() { // from class: com.google.android.gms.internal.ads.zzbic.zzaw.zzb.1
                };
            }

            zzb(int i2) {
                this.f7940s = i2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.f7940s);
            }

            @Override // com.google.android.gms.internal.ads.zziet
            public final int zza() {
                return this.f7940s;
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzd = zzawVar;
            zziep.m8338y(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzb zzbVar = zzb.VIDEO_ERROR_CODE_UNSPECIFIED;
                return new zzigl(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", zzb.zza.f7941a});
            }
            if (iOrdinal == 3) {
                return new zzaw();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzd;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzaw> zzighVar = zze;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzaw.class) {
                try {
                    zziekVar = zze;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzd);
                        zze = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzax extends zziga {
    }

    public final class zzay extends zziep<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zzj;
        private static volatile zzigh<zzay> zzk;
        private int zze;
        private zzar zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        public final class zza extends zziej<zzay, zza> implements zzaz {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzay.zzj);
            }
        }

        static {
            zzay zzayVar = new zzay();
            zzj = zzayVar;
            zziep.m8338y(zzay.class, zzayVar);
        }

        private zzay() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", zzq.zza.f7972a, "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzay();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzj;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzay> zzighVar = zzk;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzay.class) {
                try {
                    zziekVar = zzk;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzj);
                        zzk = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzaz extends zziga {
    }

    public final class zzb extends zziep<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzc;
        private static volatile zzigh<zzb> zzd;
        private zzifb<zza> zzb = zzigk.f19864w;

        public final class zza extends zziep<zza, C6589zza> implements InterfaceC6590zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzh;
            private static volatile zzigh<zza> zzi;
            private int zzd;
            private int zze;
            private zze zzf;
            private zzg zzg;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbic$zzb$zza$zza, reason: collision with other inner class name */
            public final class C6589zza extends zziej<zza, C6589zza> implements InterfaceC6590zzb {
                public /* synthetic */ C6589zza(int i2) {
                    this();
                }

                private C6589zza() {
                    super(zza.zzh);
                }
            }

            static {
                zza zzaVar = new zza();
                zzh = zzaVar;
                zziep.m8338y(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: renamed from: F */
            public static C6589zza m4955F() {
                return (C6589zza) zzh.m8346v();
            }

            /* JADX INFO: renamed from: D */
            public final void m4956D(zzg zzgVar) {
                this.zzg = zzgVar;
                this.zzd |= 4;
            }

            /* JADX INFO: renamed from: G */
            public final void m4957G() {
                zzd zzdVar = zzd.UNSPECIFIED;
                this.zze = 1;
                this.zzd = 1 | this.zzd;
            }

            /* JADX INFO: renamed from: H */
            public final void m4958H(zze zzeVar) {
                zzeVar.getClass();
                this.zzf = zzeVar;
                this.zzd |= 2;
            }

            @Override // com.google.android.gms.internal.ads.zziep
            /* JADX INFO: renamed from: z */
            public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
                zzigh zziekVar;
                int iOrdinal = zzieoVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    zzd zzdVar = zzd.UNSPECIFIED;
                    return new zzigl(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzd.zza.f7946a, "zzf", "zzg"});
                }
                if (iOrdinal == 3) {
                    return new zza();
                }
                if (iOrdinal == 4) {
                    return new C6589zza(0);
                }
                if (iOrdinal == 5) {
                    return zzh;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzigh<zza> zzighVar = zzi;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zza.class) {
                    try {
                        zziekVar = zzi;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzh);
                            zzi = zziekVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziekVar;
            }
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbic$zzb$zzb, reason: collision with other inner class name */
        public interface InterfaceC6590zzb extends zziga {
        }

        public final class zzc extends zziej<zzb, zzc> implements zzc {
            public /* synthetic */ zzc(int i2) {
                this();
            }

            private zzc() {
                super(zzb.zzc);
            }
        }

        public enum zzd implements zziet {
            UNSPECIFIED(0),
            IN_MEMORY(1);


            /* JADX INFO: renamed from: s */
            public final int f7945s;

            final class zza implements zziev {

                /* JADX INFO: renamed from: a */
                public static final zziev f7946a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziev
                public final boolean zza(int i2) {
                    zzd zzdVar;
                    if (i2 == 0) {
                        zzdVar = zzd.UNSPECIFIED;
                    } else if (i2 != 1) {
                        zzd zzdVar2 = zzd.UNSPECIFIED;
                        zzdVar = null;
                    } else {
                        zzdVar = zzd.IN_MEMORY;
                    }
                    return zzdVar != null;
                }
            }

            static {
                new zzieu<zzd>() { // from class: com.google.android.gms.internal.ads.zzbic.zzb.zzd.1
                };
            }

            zzd(int i2) {
                this.f7945s = i2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.f7945s);
            }

            @Override // com.google.android.gms.internal.ads.zziet
            public final int zza() {
                return this.f7945s;
            }
        }

        public final class zze extends zziep<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzf;
            private static volatile zzigh<zze> zzg;
            private int zzc;
            private boolean zzd;
            private int zze;

            public final class zza extends zziej<zze, zza> implements zzf {
                public /* synthetic */ zza(int i2) {
                    this();
                }

                private zza() {
                    super(zze.zzf);
                }
            }

            static {
                zze zzeVar = new zze();
                zzf = zzeVar;
                zziep.m8338y(zze.class, zzeVar);
            }

            private zze() {
            }

            /* JADX INFO: renamed from: D */
            public static zza m4959D() {
                return (zza) zzf.m8346v();
            }

            /* JADX INFO: renamed from: E */
            public static zze m4960E() {
                return zzf;
            }

            /* JADX INFO: renamed from: F */
            public final void m4962F(boolean z) {
                this.zzc |= 1;
                this.zzd = z;
            }

            /* JADX INFO: renamed from: G */
            public final void m4963G(int i2) {
                this.zzc |= 2;
                this.zze = i2;
            }

            @Override // com.google.android.gms.internal.ads.zziep
            /* JADX INFO: renamed from: z */
            public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
                zzigh zziekVar;
                int iOrdinal = zzieoVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
                }
                if (iOrdinal == 3) {
                    return new zze();
                }
                if (iOrdinal == 4) {
                    return new zza(0);
                }
                if (iOrdinal == 5) {
                    return zzf;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzigh<zze> zzighVar = zzg;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zze.class) {
                    try {
                        zziekVar = zzg;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzf);
                            zzg = zziekVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziekVar;
            }
        }

        public interface zzf extends zziga {
        }

        public final class zzg extends zziep<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzh;
            private static volatile zzigh<zzg> zzi;
            private int zzd;
            private boolean zze;
            private boolean zzf;
            private int zzg;

            public final class zza extends zziej<zzg, zza> implements zzh {
                public /* synthetic */ zza(int i2) {
                    this();
                }

                private zza() {
                    super(zzg.zzh);
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzh = zzgVar;
                zziep.m8338y(zzg.class, zzgVar);
            }

            private zzg() {
            }

            /* JADX INFO: renamed from: F */
            public static zza m4965F() {
                return (zza) zzh.m8346v();
            }

            /* JADX INFO: renamed from: D */
            public final void m4966D(int i2) {
                this.zzd |= 4;
                this.zzg = i2;
            }

            /* JADX INFO: renamed from: G */
            public final void m4967G(boolean z) {
                this.zzd |= 1;
                this.zze = z;
            }

            /* JADX INFO: renamed from: H */
            public final void m4968H(boolean z) {
                this.zzd |= 2;
                this.zzf = z;
            }

            @Override // com.google.android.gms.internal.ads.zziep
            /* JADX INFO: renamed from: z */
            public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
                zzigh zziekVar;
                int iOrdinal = zzieoVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return new zzigl(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                }
                if (iOrdinal == 3) {
                    return new zzg();
                }
                if (iOrdinal == 4) {
                    return new zza(0);
                }
                if (iOrdinal == 5) {
                    return zzh;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzigh<zzg> zzighVar = zzi;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzg.class) {
                    try {
                        zziekVar = zzi;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzh);
                            zzi = zziekVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziekVar;
            }
        }

        public interface zzh extends zziga {
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zziep.m8338y(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: renamed from: E */
        public static zzc m4952E() {
            return (zzc) zzc.m8346v();
        }

        /* JADX INFO: renamed from: F */
        public final void m4953F(zza zzaVar) {
            zzifb<zza> zzifbVar = this.zzb;
            if (!zzifbVar.zza()) {
                int size = zzifbVar.size();
                this.zzb = zzifbVar.mo8128l(size + size);
            }
            this.zzb.add(zzaVar);
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zza.class});
            }
            if (iOrdinal == 3) {
                return new zzb();
            }
            if (iOrdinal == 4) {
                return new zzc(0);
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzb> zzighVar = zzd;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzb.class) {
                try {
                    zziekVar = zzd;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzc);
                        zzd = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public final class zzba extends zziep<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzl;
        private static volatile zzigh<zzba> zzm;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private int zzi;
        private int zzj;
        private int zzk;

        public final class zza extends zziej<zzba, zza> implements zzbb {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzba.zzl);
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzl = zzbaVar;
            zziep.m8338y(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", zzq.zza.f7972a, "zzh", "zzi", "zzj", "zzk"});
            }
            if (iOrdinal == 3) {
                return new zzba();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzl;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzba> zzighVar = zzm;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzba.class) {
                try {
                    zziekVar = zzm;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzl);
                        zzm = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzbb extends zziga {
    }

    public final class zzbc extends zziep<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzh;
        private static volatile zzigh<zzbc> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zziej<zzbc, zza> implements zzbd {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzbc.zzh);
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzh = zzbcVar;
            zziep.m8338y(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zza.f7972a, "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzbc();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzbc> zzighVar = zzi;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzbc.class) {
                try {
                    zziekVar = zzi;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzh);
                        zzi = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzbd extends zziga {
    }

    public final class zzbe extends zziep<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzn;
        private static volatile zzigh<zzbe> zzo;
        private int zzg;
        private int zzh = 1000;
        private zzaw zzi;
        private int zzj;
        private int zzk;
        private int zzl;
        private long zzm;

        public final class zza extends zziej<zzbe, zza> implements zzbf {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzbe.zzn);
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzn = zzbeVar;
            zziep.m8338y(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", zzq.zza.f7972a, "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            if (iOrdinal == 3) {
                return new zzbe();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzn;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzbe> zzighVar = zzo;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzbe.class) {
                try {
                    zziekVar = zzo;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzn);
                        zzo = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzbf extends zziga {
    }

    public final class zzbg extends zziep<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzh;
        private static volatile zzigh<zzbg> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zziej<zzbg, zza> implements zzbh {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzbg.zzh);
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzh = zzbgVar;
            zziep.m8338y(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zza.f7972a, "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzbg();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzbg> zzighVar = zzi;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzbg.class) {
                try {
                    zziekVar = zzi;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzh);
                        zzi = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzbh extends zziga {
    }

    public interface zzbi extends zziga {
    }

    public final class zzbj extends zziep<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzf;
        private static volatile zzigh<zzbj> zzg;
        private int zzc;
        private int zzd = 1000;
        private zzaw zze;

        public final class zza extends zziej<zzbj, zza> implements zzbk {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzbj.zzf);
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzf = zzbjVar;
            zziep.m8338y(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzq.zza.f7972a, "zze"});
            }
            if (iOrdinal == 3) {
                return new zzbj();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzbj> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzbj.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzbk extends zziga {
    }

    public final class zzbl extends zziep<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzf;
        private static volatile zzigh<zzbl> zzg;
        private int zzc;
        private boolean zzd;
        private int zze;

        public final class zza extends zziej<zzbl, zza> implements zzbm {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzbl.zzf);
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzf = zzblVar;
            zziep.m8338y(zzbl.class, zzblVar);
        }

        private zzbl() {
        }

        /* JADX INFO: renamed from: E */
        public static zza m4974E() {
            return (zza) zzf.m8346v();
        }

        /* JADX INFO: renamed from: D */
        public final boolean m4976D() {
            return this.zzd;
        }

        /* JADX INFO: renamed from: F */
        public final void m4977F(boolean z) {
            this.zzc |= 1;
            this.zzd = z;
        }

        /* JADX INFO: renamed from: G */
        public final void m4978G(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (iOrdinal == 3) {
                return new zzbl();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzbl> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzbl.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzbm extends zziga {
    }

    public interface zzc extends zziga {
    }

    public final class zzd extends zziep<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzf;
        private static volatile zzigh<zzd> zzg;
        private int zzc;
        private int zzd;
        private zzal zze;

        public enum zza implements zziet {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);


            /* JADX INFO: renamed from: s */
            public final int f7959s;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbic$zzd$zza$zza, reason: collision with other inner class name */
            final class C6591zza implements zziev {

                /* JADX INFO: renamed from: a */
                public static final zziev f7960a = new C6591zza();

                private C6591zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziev
                public final boolean zza(int i2) {
                    zza zzaVar;
                    switch (i2) {
                        case 0:
                            zzaVar = zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        case 1:
                            zzaVar = zza.BANNER;
                            break;
                        case 2:
                            zzaVar = zza.INTERSTITIAL;
                            break;
                        case 3:
                            zzaVar = zza.NATIVE_EXPRESS;
                            break;
                        case 4:
                            zzaVar = zza.NATIVE_CONTENT;
                            break;
                        case 5:
                            zzaVar = zza.NATIVE_APP_INSTALL;
                            break;
                        case 6:
                            zzaVar = zza.NATIVE_CUSTOM_TEMPLATE;
                            break;
                        case 7:
                            zzaVar = zza.DFP_BANNER;
                            break;
                        case 8:
                            zzaVar = zza.DFP_INTERSTITIAL;
                            break;
                        case 9:
                            zzaVar = zza.REWARD_BASED_VIDEO_AD;
                            break;
                        case 10:
                            zzaVar = zza.BANNER_SEARCH_ADS;
                            break;
                        default:
                            zza zzaVar2 = zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            zzaVar = null;
                            break;
                    }
                    return zzaVar != null;
                }
            }

            static {
                new zzieu<zza>() { // from class: com.google.android.gms.internal.ads.zzbic.zzd.zza.1
                };
            }

            zza(int i2) {
                this.f7959s = i2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.f7959s);
            }

            @Override // com.google.android.gms.internal.ads.zziet
            public final int zza() {
                return this.f7959s;
            }
        }

        public final class zzb extends zziej<zzd, zzb> implements zze {
            public /* synthetic */ zzb(int i2) {
                this();
            }

            private zzb() {
                super(zzd.zzf);
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzf = zzdVar;
            zziep.m8338y(zzd.class, zzdVar);
        }

        private zzd() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zza zzaVar = zza.AD_FORMAT_TYPE_UNSPECIFIED;
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zza.C6591zza.f7960a, "zze"});
            }
            if (iOrdinal == 3) {
                return new zzd();
            }
            if (iOrdinal == 4) {
                return new zzb(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzd> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzd.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zze extends zziga {
    }

    public interface zzf extends zziga {
    }

    public final class zzg extends zziep<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzh;
        private static volatile zzigh<zzg> zzi;
        private int zzd;
        private String zze = "";
        private zzifb<zzd> zzf = zzigk.f19864w;
        private int zzg;

        public final class zza extends zziej<zzg, zza> implements zzh {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzg.zzh);
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzh = zzgVar;
            zziep.m8338y(zzg.class, zzgVar);
        }

        private zzg() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzd.class, "zzg", zzq.zza.f7972a});
            }
            if (iOrdinal == 3) {
                return new zzg();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzg> zzighVar = zzi;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzg.class) {
                try {
                    zziekVar = zzi;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzh);
                        zzi = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzh extends zziga {
    }

    public final class zzi extends zziep<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzl;
        private static volatile zzigh<zzi> zzm;
        private int zzf;
        private String zzg = "";
        private zzifb<zzd> zzh = zzigk.f19864w;
        private int zzi = 1000;
        private int zzj = 1000;
        private int zzk = 1000;

        public final class zza extends zziej<zzi, zza> implements zzj {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzi.zzl);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzl = zziVar;
            zziep.m8338y(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: renamed from: D */
        public static zzi m4981D() {
            return zzl;
        }

        /* JADX INFO: renamed from: E */
        public final void m4983E(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                zziev zzievVar = zzq.zza.f7972a;
                return new zzigl(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzievVar, "zzj", zzievVar, "zzk", zzievVar});
            }
            if (iOrdinal == 3) {
                return new zzi();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzl;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzi> zzighVar = zzm;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzi.class) {
                try {
                    zziekVar = zzm;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzl);
                        zzm = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzj extends zziga {
    }

    public final class zzk extends zziep<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzn;
        private static volatile zzigh<zzk> zzo;
        private int zzg;
        private int zzh;
        private zzap zzi;
        private zzap zzj;
        private zzap zzk;
        private zzifb<zzap> zzl = zzigk.f19864w;
        private int zzm;

        public final class zza extends zziej<zzk, zza> implements zzl {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzk.zzn);
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzn = zzkVar;
            zziep.m8338y(zzk.class, zzkVar);
        }

        private zzk() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return new zzigl(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzap.class, "zzm"});
            }
            if (iOrdinal == 3) {
                return new zzk();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzn;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzk> zzighVar = zzo;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzk.class) {
                try {
                    zziekVar = zzo;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzn);
                        zzo = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzl extends zziga {
    }

    public final class zzm extends zziep<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzv;
        private static volatile zzigh<zzm> zzw;
        private int zzi;
        private zzap zzk;
        private int zzl;
        private zzar zzm;
        private int zzn;
        private String zzj = "";
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu = 1000;

        public final class zza extends zziej<zzm, zza> implements zzn {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzm.zzv);
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzv = zzmVar;
            zziep.m8338y(zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: renamed from: D */
        public static zzm m4985D() {
            return zzv;
        }

        /* JADX INFO: renamed from: E */
        public final void m4987E(String str) {
            this.zzi |= 1;
            this.zzj = str;
        }

        /* JADX INFO: renamed from: F */
        public final void m4988F(zzar zzarVar) {
            this.zzm = zzarVar;
            this.zzi |= 8;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                zziev zzievVar = zzq.zza.f7972a;
                return new zzigl(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzievVar, "zzp", zzievVar, "zzu", zzievVar});
            }
            if (iOrdinal == 3) {
                return new zzm();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzv;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzm> zzighVar = zzw;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzm.class) {
                try {
                    zziekVar = zzw;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzv);
                        zzw = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzn extends zziga {
    }

    public final class zzo extends zziep<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zzj;
        private static volatile zzigh<zzo> zzk;
        private int zze;
        private int zzf;
        private zzar zzg;
        private String zzh = "";
        private String zzi = "";

        public final class zza extends zziej<zzo, zza> implements zzp {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzo.zzj);
            }
        }

        public enum zzb implements zziet {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);


            /* JADX INFO: renamed from: s */
            public final int f7965s;

            final class zza implements zziev {

                /* JADX INFO: renamed from: a */
                public static final zziev f7966a = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziev
                public final boolean zza(int i2) {
                    zzb zzbVar;
                    if (i2 == 0) {
                        zzbVar = zzb.PLATFORM_UNSPECIFIED;
                    } else if (i2 == 1) {
                        zzbVar = zzb.IOS;
                    } else if (i2 != 2) {
                        zzb zzbVar2 = zzb.PLATFORM_UNSPECIFIED;
                        zzbVar = null;
                    } else {
                        zzbVar = zzb.ANDROID;
                    }
                    return zzbVar != null;
                }
            }

            static {
                new zzieu<zzb>() { // from class: com.google.android.gms.internal.ads.zzbic.zzo.zzb.1
                };
            }

            zzb(int i2) {
                this.f7965s = i2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.f7965s);
            }

            @Override // com.google.android.gms.internal.ads.zziet
            public final int zza() {
                return this.f7965s;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzj = zzoVar;
            zziep.m8338y(zzo.class, zzoVar);
        }

        private zzo() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzb zzbVar = zzb.PLATFORM_UNSPECIFIED;
                return new zzigl(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzb.zza.f7966a, "zzg", "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzo();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzj;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzo> zzighVar = zzk;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzo.class) {
                try {
                    zziekVar = zzk;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzj);
                        zzk = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzp extends zziga {
    }

    public enum zzq implements zziet {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);


        /* JADX INFO: renamed from: s */
        public final int f7971s;

        final class zza implements zziev {

            /* JADX INFO: renamed from: a */
            public static final zziev f7972a = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zziev
            public final boolean zza(int i2) {
                zzq zzqVar;
                if (i2 == 0) {
                    zzqVar = zzq.ENUM_FALSE;
                } else if (i2 == 1) {
                    zzqVar = zzq.ENUM_TRUE;
                } else if (i2 != 1000) {
                    zzq zzqVar2 = zzq.ENUM_FALSE;
                    zzqVar = null;
                } else {
                    zzqVar = zzq.ENUM_UNKNOWN;
                }
                return zzqVar != null;
            }
        }

        static {
            new zzieu<zzq>() { // from class: com.google.android.gms.internal.ads.zzbic.zzq.1
            };
        }

        zzq(int i2) {
            this.f7971s = i2;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.f7971s);
        }

        @Override // com.google.android.gms.internal.ads.zziet
        public final int zza() {
            return this.f7971s;
        }
    }

    public final class zzr extends zziep<zzr, zza> implements zzs {
        private static final zzr zzB;
        private static volatile zzigh<zzr> zzC = null;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private int zzk;
        private int zzl;
        private zzar zzn;
        private int zzo;
        private int zzv;
        private int zzw;
        private zziex zzx;
        private zziex zzz;
        private static final zziey<zzd.zza> zzy = new zziey<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbic.zzr.1
        };
        private static final zziey<zzd.zza> zzA = new zziey<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbic.zzr.2
        };
        private String zzm = "";
        private String zzp = "";
        private String zzu = "";

        public final class zza extends zziej<zzr, zza> implements zzs {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzr.zzB);
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzB = zzrVar;
            zziep.m8338y(zzr.class, zzrVar);
        }

        private zzr() {
            zzieq zzieqVar = zzieq.f19791w;
            this.zzx = zzieqVar;
            this.zzz = zzieqVar;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzo.zzb zzbVar = zzo.zzb.PLATFORM_UNSPECIFIED;
                zziev zzievVar = zzo.zzb.zza.f7966a;
                zzab.zzc zzcVar = zzab.zzc.NETWORKTYPE_UNSPECIFIED;
                zziev zzievVar2 = zzab.zzc.zza.f7925a;
                zza.EnumC6586zza enumC6586zza = zza.EnumC6586zza.AD_INITIATER_UNSPECIFIED;
                zziev zzievVar3 = zza.EnumC6586zza.C6587zza.f7912a;
                zzd.zza zzaVar = zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                zziev zzievVar4 = zzd.zza.C6591zza.f7960a;
                return new zzigl(zzB, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", zzievVar, "zzp", "zzu", "zzv", zzievVar2, "zzw", zzievVar3, "zzx", zzievVar4, "zzz", zzievVar4});
            }
            if (iOrdinal == 3) {
                return new zzr();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzB;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzr> zzighVar = zzC;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzr.class) {
                try {
                    zziekVar = zzC;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzB);
                        zzC = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzs extends zziga {
    }

    public final class zzt extends zziep<zzt, zza> implements zzu {
        private static final zzt zzF;
        private static volatile zzigh<zzt> zzG = null;
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private zzab zzA;
        private zza zzB;
        private zzaf zzC;
        private zzbl zzD;
        private zzb zzE;
        private int zzn;
        private int zzo;
        private int zzu;
        private zzar zzw;
        private zzm zzy;
        private zzo zzz;
        private String zzp = "";
        private int zzv = 1000;
        private zzifa zzx = zzifn.f19826w;

        public final class zza extends zziej<zzt, zza> implements zzu {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzt.zzF);
            }
        }

        static {
            zzt zztVar = new zzt();
            zzF = zztVar;
            zziep.m8338y(zzt.class, zztVar);
        }

        private zzt() {
        }

        /* JADX INFO: renamed from: P */
        public static zza m4992P() {
            return (zza) zzF.m8346v();
        }

        /* JADX INFO: renamed from: D */
        public final zzm m4993D() {
            zzm zzmVar = this.zzy;
            return zzmVar == null ? zzm.m4985D() : zzmVar;
        }

        /* JADX INFO: renamed from: E */
        public final void m4994E(String str) {
            str.getClass();
            this.zzn |= 2;
            this.zzp = str;
        }

        /* JADX INFO: renamed from: F */
        public final zza m4995F() {
            zza zzaVar = this.zzB;
            return zzaVar == null ? zza.m4899D() : zzaVar;
        }

        /* JADX INFO: renamed from: G */
        public final void m4996G(zzb zzbVar) {
            this.zzE = zzbVar;
            this.zzn |= 2048;
        }

        /* JADX INFO: renamed from: I */
        public final void m4997I(ArrayList arrayList) {
            zzifa zzifaVar = this.zzx;
            if (!zzifaVar.zza()) {
                int size = zzifaVar.size();
                this.zzx = zzifaVar.mo8128l(size + size);
            }
            zzicu.m8096l(arrayList, this.zzx);
        }

        /* JADX INFO: renamed from: J */
        public final void m4998J() {
            this.zzx = zzifn.f19826w;
        }

        /* JADX INFO: renamed from: K */
        public final void m4999K(zzm zzmVar) {
            this.zzy = zzmVar;
            this.zzn |= 32;
        }

        /* JADX INFO: renamed from: L */
        public final void m5000L(zza zzaVar) {
            this.zzB = zzaVar;
            this.zzn |= 256;
        }

        /* JADX INFO: renamed from: M */
        public final void m5001M(zzaf zzafVar) {
            this.zzC = zzafVar;
            this.zzn |= 512;
        }

        /* JADX INFO: renamed from: N */
        public final void m5002N(zzbl zzblVar) {
            this.zzD = zzblVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: renamed from: O */
        public final String m5003O() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", zzq.zza.f7972a, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
            }
            if (iOrdinal == 3) {
                return new zzt();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzF;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzt> zzighVar = zzG;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzt.class) {
                try {
                    zziekVar = zzG;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzF);
                        zzG = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzu extends zziga {
    }

    public final class zzv extends zziep<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zzj;
        private static volatile zzigh<zzv> zzk;
        private int zze;
        private int zzg;
        private zzap zzi;
        private String zzf = "";
        private zziex zzh = zzieq.f19791w;

        public final class zza extends zziej<zzv, zza> implements zzw {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzv.zzj);
            }
        }

        static {
            zzv zzvVar = new zzv();
            zzj = zzvVar;
            zziep.m8338y(zzv.class, zzvVar);
        }

        private zzv() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzq.zza.f7972a, "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzv();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzj;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzv> zzighVar = zzk;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzv.class) {
                try {
                    zziekVar = zzk;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzj);
                        zzk = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzw extends zziga {
    }

    public final class zzx extends zziep<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzf;
        private static volatile zzigh<zzx> zzg;
        private int zzc;
        private int zzd;
        private zziex zze = zzieq.f19791w;

        public final class zza extends zziej<zzx, zza> implements zzy {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzx.zzf);
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzf = zzxVar;
            zziep.m8338y(zzx.class, zzxVar);
        }

        private zzx() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzc", "zzd", zzq.zza.f7972a, "zze"});
            }
            if (iOrdinal == 3) {
                return new zzx();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzx> zzighVar = zzg;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzx.class) {
                try {
                    zziekVar = zzg;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzf);
                        zzg = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    public interface zzy extends zziga {
    }

    public final class zzz extends zziep<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zzj;
        private static volatile zzigh<zzz> zzk;
        private int zze;
        private zzv zzf;
        private zzifb<zzan> zzg = zzigk.f19864w;
        private int zzh;
        private zzap zzi;

        public final class zza extends zziej<zzz, zza> implements zzaa {
            public /* synthetic */ zza(int i2) {
                this();
            }

            private zza() {
                super(zzz.zzj);
            }
        }

        static {
            zzz zzzVar = new zzz();
            zzj = zzzVar;
            zziep.m8338y(zzz.class, zzzVar);
        }

        private zzz() {
        }

        @Override // com.google.android.gms.internal.ads.zziep
        /* JADX INFO: renamed from: z */
        public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
            zzigh zziekVar;
            int iOrdinal = zzieoVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                zzq zzqVar = zzq.ENUM_FALSE;
                return new zzigl(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzan.class, "zzh", zzq.zza.f7972a, "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzz();
            }
            if (iOrdinal == 4) {
                return new zza(0);
            }
            if (iOrdinal == 5) {
                return zzj;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzigh<zzz> zzighVar = zzk;
            if (zzighVar != null) {
                return zzighVar;
            }
            synchronized (zzz.class) {
                try {
                    zziekVar = zzk;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzj);
                        zzk = zziekVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziekVar;
        }
    }

    private zzbic() {
    }
}
