package com.google.android.gms.internal.ads;

import java.io.StringReader;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzaiu implements zzaga {

    /* JADX INFO: renamed from: b */
    public zzagd f5479b;

    /* JADX INFO: renamed from: c */
    public int f5480c;

    /* JADX INFO: renamed from: d */
    public int f5481d;

    /* JADX INFO: renamed from: e */
    public int f5482e;

    /* JADX INFO: renamed from: g */
    public zzajb f5484g;

    /* JADX INFO: renamed from: h */
    public zzagb f5485h;

    /* JADX INFO: renamed from: i */
    public zzahi f5486i;

    /* JADX INFO: renamed from: j */
    public zzami f5487j;

    /* JADX INFO: renamed from: a */
    public final zzeu f5478a = new zzeu(2);

    /* JADX INFO: renamed from: f */
    public long f5483f = -1;

    /* JADX INFO: renamed from: a */
    public final void m4146a() {
        zzagd zzagdVar = this.f5479b;
        zzagdVar.getClass();
        zzagdVar.mo4110v();
        this.f5479b.mo4108d(new zzahc(-9223372036854775807L, 0L));
        this.f5480c = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        if (j2 == 0) {
            this.f5480c = 0;
            this.f5487j = null;
        } else if (this.f5480c == 5) {
            zzami zzamiVar = this.f5487j;
            zzamiVar.getClass();
            zzamiVar.mo4104g(j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        String strM6387m;
        zzeu zzeuVar = this.f5478a;
        zzeuVar.m6396y(2);
        zzagbVar.mo4078H(zzeuVar.f14887a, 0, 2);
        if (zzeuVar.m6370L() == 65496) {
            while (true) {
                zzeuVar.m6396y(2);
                zzagbVar.mo4078H(zzeuVar.f14887a, 0, 2);
                int iM6370L = zzeuVar.m6370L();
                this.f5481d = iM6370L;
                if (iM6370L == 65498) {
                    break;
                }
                zzeuVar.m6396y(2);
                zzagbVar.mo4078H(zzeuVar.f14887a, 0, 2);
                int iM6370L2 = zzeuVar.m6370L() - 2;
                if (iM6370L2 < 0) {
                    break;
                }
                if (this.f5481d != 65505) {
                    zzagbVar.mo4075E(iM6370L2);
                } else {
                    zzeuVar.m6396y(iM6370L2);
                    zzagbVar.mo4078H(zzeuVar.f14887a, 0, iM6370L2);
                    if (Objects.equals(zzeuVar.m6387m(), "http://ns.adobe.com/xap/1.0/") && (strM6387m = zzeuVar.m6387m()) != null) {
                        for (int i2 = 0; i2 < 4; i2++) {
                            if (strM6387m.contains(String.valueOf(zzaix.f5493a[i2]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5479b = zzagdVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0224  */
    /* JADX WARN: Code duplicated, block: B:115:0x0229  */
    /* JADX WARN: Code duplicated, block: B:117:0x0234  */
    /* JADX WARN: Code duplicated, block: B:123:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x0249  */
    /* JADX WARN: Code duplicated, block: B:170:0x024b A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        String strM6387m;
        long j2;
        zzaiw zzaiwVar;
        zzgyo zzgyoVar;
        int i2;
        int i3;
        long j3;
        long j4;
        long j5;
        long j6;
        zzaiv zzaivVar;
        String str;
        boolean z;
        long j7;
        long j8;
        int i4 = this.f5480c;
        zzeu zzeuVar = this.f5478a;
        long j9 = -1;
        if (i4 == 0) {
            zzeuVar.m6396y(2);
            zzagbVar.mo4076F(zzeuVar.f14887a, 0, 2);
            int iM6370L = zzeuVar.m6370L();
            this.f5481d = iM6370L;
            if (iM6370L == 65498) {
                if (this.f5483f != -1) {
                    this.f5480c = 4;
                    return 0;
                }
                m4146a();
                return 0;
            }
            if ((iM6370L < 65488 || iM6370L > 65497) && iM6370L != 65281) {
                this.f5480c = 1;
            }
            return 0;
        }
        if (i4 == 1) {
            zzeuVar.m6396y(2);
            zzagbVar.mo4078H(zzeuVar.f14887a, 0, 2);
            this.f5482e = zzeuVar.m6370L() - 2;
            zzagbVar.mo4091o(2);
            this.f5480c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 4) {
                if (i4 != 5) {
                    if (i4 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f5486i == null || zzagbVar != this.f5485h) {
                    this.f5485h = zzagbVar;
                    this.f5486i = new zzahi(zzagbVar, this.f5483f);
                }
                zzami zzamiVar = this.f5487j;
                zzamiVar.getClass();
                int iMo4107j = zzamiVar.mo4107j(this.f5486i, zzahaVar);
                if (iMo4107j == 1) {
                    zzahaVar.f5303a += this.f5483f;
                }
                return iMo4107j;
            }
            long jMo4086g = zzagbVar.mo4086g();
            long j10 = this.f5483f;
            if (jMo4086g != j10) {
                zzahaVar.f5303a = j10;
                return 1;
            }
            if (!zzagbVar.mo4081K(zzeuVar.f14887a, 0, 1, true)) {
                m4146a();
                return 0;
            }
            zzagbVar.zzl();
            if (this.f5487j == null) {
                this.f5487j = new zzami(8, zzanq.f6138a);
            }
            zzahi zzahiVar = new zzahi(zzagbVar, this.f5483f);
            this.f5486i = zzahiVar;
            if (!this.f5487j.mo4105h(zzahiVar)) {
                m4146a();
                return 0;
            }
            zzami zzamiVar2 = this.f5487j;
            long j11 = this.f5483f;
            zzagd zzagdVar = this.f5479b;
            zzagdVar.getClass();
            zzamiVar2.mo4106i(new zzahk(j11, zzagdVar));
            zzajb zzajbVar = this.f5484g;
            zzajbVar.getClass();
            zzagd zzagdVar2 = this.f5479b;
            zzagdVar2.getClass();
            zzahm zzahmVarMo4109f = zzagdVar2.mo4109f(1024, 4);
            zzt zztVar = new zzt();
            zztVar.m8852d("image/jpeg");
            zztVar.f20799k = new zzap(zzajbVar);
            zzahmVarMo4109f.mo4097e(new zzv(zztVar));
            this.f5480c = 5;
            return 0;
        }
        if (this.f5481d == 65505) {
            zzeu zzeuVar2 = new zzeu(this.f5482e);
            zzagbVar.mo4076F(zzeuVar2.f14887a, 0, this.f5482e);
            if (this.f5484g == null && "http://ns.adobe.com/xap/1.0/".equals(zzeuVar2.m6387m()) && (strM6387m = zzeuVar2.m6387m()) != null) {
                long jMo4089j = zzagbVar.mo4089j();
                zzajb zzajbVar2 = null;
                if (jMo4089j != -1) {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setInput(new StringReader(strM6387m));
                        xmlPullParserNewPullParser.next();
                        try {
                            if (!zzfv.m6727b(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                throw zzat.m4383a(null, "Couldn't find xmp metadata");
                            }
                            zzgzi zzgziVar = zzgwt.f18303t;
                            zzgwt zzgwtVarM7217q = zzgyo.f18355w;
                            long j12 = -9223372036854775807L;
                            loop0: while (true) {
                                xmlPullParserNewPullParser.next();
                                j2 = j9;
                                if (zzfv.m6727b(xmlPullParserNewPullParser, "rdf:Description")) {
                                    String[] strArr = zzaix.f5493a;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < 4) {
                                            String strM6728c = zzfv.m6728c(xmlPullParserNewPullParser, strArr[i5]);
                                            if (strM6728c == null) {
                                                i5++;
                                            } else if (Integer.parseInt(strM6728c) == 1) {
                                                String[] strArr2 = zzaix.f5494b;
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 < 4) {
                                                        String strM6728c2 = zzfv.m6728c(xmlPullParserNewPullParser, strArr2[i6]);
                                                        if (strM6728c2 != null) {
                                                            long j13 = Long.parseLong(strM6728c2);
                                                            if (j13 != j2) {
                                                                j12 = j13;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        i6++;
                                                    }
                                                    j12 = -9223372036854775807L;
                                                    break;
                                                }
                                                String[] strArr3 = zzaix.f5495c;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 >= 2) {
                                                        zzgwtVarM7217q = zzgyo.f18355w;
                                                        break;
                                                    }
                                                    String strM6728c3 = zzfv.m6728c(xmlPullParserNewPullParser, strArr3[i7]);
                                                    if (strM6728c3 != null) {
                                                        zzgwtVarM7217q = zzgwt.m7217q(new zzaiv("image/jpeg", 0L, 0L), new zzaiv("video/mp4", Long.parseLong(strM6728c3), 0L));
                                                        break;
                                                    }
                                                    i7++;
                                                }
                                            }
                                        }
                                        zzaiwVar = null;
                                        break loop0;
                                    }
                                }
                                if (zzfv.m6727b(xmlPullParserNewPullParser, "Container:Directory")) {
                                    zzgwtVarM7217q = zzaix.m4147a(xmlPullParserNewPullParser, "Container", "Item");
                                } else if (zzfv.m6727b(xmlPullParserNewPullParser, "GContainer:Directory")) {
                                    zzgwtVarM7217q = zzaix.m4147a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                                }
                                long j14 = j12;
                                if (zzfv.m6726a(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                    if (!zzgwtVarM7217q.isEmpty()) {
                                        zzaiwVar = new zzaiw(zzgwtVarM7217q, j14);
                                        break;
                                    }
                                    zzaiwVar = null;
                                    break loop0;
                                }
                                j12 = j14;
                                j9 = j2;
                            }
                            if (zzaiwVar != null && (i2 = (zzgyoVar = (zzgyo) zzaiwVar.f5492b).f18357v) >= 2) {
                                j3 = j2;
                                j4 = j3;
                                j5 = j4;
                                j6 = j5;
                                for (i3 = i2 - 1; i3 >= 0; i3--) {
                                    zzaivVar = (zzaiv) zzgyoVar.get(i3);
                                    str = zzaivVar.f5488a;
                                    if (!str.equals("video/mp4") || str.equals("video/quicktime")) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i3 == 0) {
                                        jMo4089j -= zzaivVar.f5490c;
                                        j7 = 0;
                                    } else {
                                        j7 = jMo4089j - zzaivVar.f5489b;
                                    }
                                    long j15 = j7;
                                    j8 = jMo4089j;
                                    jMo4089j = j15;
                                    if (z && jMo4089j != j8) {
                                        j6 = j8 - jMo4089j;
                                        j5 = jMo4089j;
                                    }
                                    if (i3 == 0) {
                                        j4 = j8;
                                    }
                                    if (i3 == 0) {
                                        j3 = jMo4089j;
                                    }
                                }
                                if (j5 != j2 && j6 != j2 && j3 != j2 && j4 != j2) {
                                    zzajbVar2 = new zzajb(j3, j4, zzaiwVar.f5491a, j5, j6);
                                }
                            }
                        } catch (zzat | NumberFormatException | XmlPullParserException unused) {
                            zzeh.m6211c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        }
                    } catch (zzat | NumberFormatException | XmlPullParserException unused2) {
                        j2 = j9;
                    }
                    zzeh.m6211c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                    zzaiwVar = null;
                    if (zzaiwVar != null) {
                        j3 = j2;
                        j4 = j3;
                        j5 = j4;
                        j6 = j5;
                        while (i3 >= 0) {
                            zzaivVar = (zzaiv) zzgyoVar.get(i3);
                            str = zzaivVar.f5488a;
                            if (str.equals("video/mp4")) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (i3 == 0) {
                                jMo4089j -= zzaivVar.f5490c;
                                j7 = 0;
                            } else {
                                j7 = jMo4089j - zzaivVar.f5489b;
                            }
                            long j16 = j7;
                            j8 = jMo4089j;
                            jMo4089j = j16;
                            if (z) {
                                j6 = j8 - jMo4089j;
                                j5 = jMo4089j;
                            }
                            if (i3 == 0) {
                                j4 = j8;
                            }
                            if (i3 == 0) {
                                j3 = jMo4089j;
                            }
                        }
                        if (j5 != j2) {
                            zzajbVar2 = new zzajb(j3, j4, zzaiwVar.f5491a, j5, j6);
                        }
                    }
                }
                this.f5484g = zzajbVar2;
                if (zzajbVar2 != null) {
                    this.f5483f = zzajbVar2.f5507d;
                }
            }
        } else {
            zzagbVar.mo4091o(this.f5482e);
        }
        this.f5480c = 0;
        return 0;
    }
}
