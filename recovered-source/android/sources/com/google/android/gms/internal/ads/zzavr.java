package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzavr implements zzawl {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ zzavr f7053b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zzavr f7054c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zzavr f7055d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ zzavr f7056e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ zzavr f7057f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ zzavr f7058g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ zzavr f7059h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ zzavr f7060i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ zzavr f7061j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ zzavr f7062k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ zzavr f7063l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ zzavr f7064m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ zzavr f7065n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ zzavr f7066o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ zzavr f7067p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ zzavr f7068q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ zzavr f7069r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ zzavr f7070s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ zzavr f7071t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ zzavr f7072u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ zzavr f7073v;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7074a;

    static {
        int i2 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i3 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i4 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i5 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i6 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i7 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i8 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f7073v = new zzavr((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f7072u = new zzavr((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f7071t = new zzavr((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f7070s = new zzavr(i8);
        f7069r = new zzavr(i5);
        f7068q = new zzavr(i6);
        zzavr zzavrVar = new zzavr(i7);
        int i9 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i10 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i11 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i12 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i13 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i14 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i15 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i16 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i17 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f7067p = zzavrVar;
        f7066o = new zzavr(i4);
        f7065n = new zzavr(i9);
        f7064m = new zzavr(i10);
        f7063l = new zzavr(i11);
        f7062k = new zzavr(i3);
        f7061j = new zzavr(i12);
        f7060i = new zzavr(i13);
        f7059h = new zzavr(i14);
        f7058g = new zzavr(i2);
        f7057f = new zzavr(i15);
        f7056e = new zzavr(i16);
        f7055d = new zzavr(i17);
        f7054c = new zzavr(1);
        f7053b = new zzavr(0);
    }

    public /* synthetic */ zzavr(int i2) {
        this.f7074a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zzavd zzavdVar;
        long j2 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f7074a) {
                                            case 0:
                                                zzawo zzawoVar = (zzawo) obj;
                                                zzawk zzawkVar = zzawoVar.f7179b;
                                                long jM4478m = zzawkVar.m4463c().m4478m();
                                                if (zzawkVar.m4463c().m4478m() != 0) {
                                                    zzawoVar.f7181d.m4453a(jM4478m);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzawk zzawkVar2 = ((zzawo) obj).f7179b;
                                                    long jM4478m2 = zzawkVar2.m4463c().m4478m();
                                                    zzawt zzawtVarM4463c = zzawkVar2.m4463c();
                                                    zzawt zzawtVarM4463c2 = zzawkVar2.m4463c();
                                                    List listM4480o = zzawtVarM4463c2.m4480o();
                                                    if (jM4478m2 < 0) {
                                                        jM4478m2 += (long) (((ArrayList) listM4480o).size() + 1);
                                                    }
                                                    if (jM4478m2 >= 0) {
                                                        ArrayList arrayList = (ArrayList) listM4480o;
                                                        if (jM4478m2 < arrayList.size() + 1) {
                                                            arrayList.add((int) jM4478m2, zzawtVarM4463c);
                                                            zzawkVar2.m4462b(zzawtVarM4463c2);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new zzawr();
                                                } catch (zzawr unused) {
                                                    zzavdVar = zzavd.f7001b0;
                                                }
                                                break;
                                            case 2:
                                                zzawo zzawoVar2 = (zzawo) obj;
                                                zzawk zzawkVar3 = zzawoVar2.f7179b;
                                                long jM4478m3 = zzawkVar3.m4463c().m4478m();
                                                if (zzawkVar3.m4463c().m4478m() == 0) {
                                                    zzawoVar2.f7181d.m4453a(jM4478m3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                zzawk zzawkVar4 = ((zzawo) obj).f7179b;
                                                zzawkVar4.m4462b(zzawt.m4467b(((ArrayList) zzawkVar4.m4463c().m4480o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                zzawk zzawkVar5 = ((zzawo) obj).f7179b;
                                                zzawkVar5.m4462b(zzawt.m4467b(zzawkVar5.m4463c().m4479n().f7096a.length));
                                                return Optional.empty();
                                            case 5:
                                                zzawk zzawkVar6 = ((zzawo) obj).f7179b;
                                                zzawkVar6.m4462b(zzawt.m4468c(Math.log(zzawkVar6.m4463c().m4482q())));
                                                return Optional.empty();
                                            case 6:
                                                zzawk zzawkVar7 = ((zzawo) obj).f7179b;
                                                long jM4478m4 = zzawkVar7.m4463c().m4478m();
                                                long jM4478m5 = zzawkVar7.m4463c().m4478m();
                                                if (jM4478m4 == 0 || jM4478m5 == 0) {
                                                    j2 = 0;
                                                }
                                                zzawkVar7.m4462b(zzawt.m4467b(j2));
                                                return Optional.empty();
                                            case 7:
                                                zzawk zzawkVar8 = ((zzawo) obj).f7179b;
                                                if (zzawkVar8.m4463c().m4478m() != 0) {
                                                    j2 = 0;
                                                }
                                                zzawkVar8.m4462b(zzawt.m4467b(j2));
                                                return Optional.empty();
                                            case 8:
                                                zzawk zzawkVar9 = ((zzawo) obj).f7179b;
                                                long jM4478m6 = zzawkVar9.m4463c().m4478m();
                                                long jM4478m7 = zzawkVar9.m4463c().m4478m();
                                                if (jM4478m6 == 0 && jM4478m7 == 0) {
                                                    j2 = 0;
                                                }
                                                zzawkVar9.m4462b(zzawt.m4467b(j2));
                                                return Optional.empty();
                                            case 9:
                                                zzawo zzawoVar3 = (zzawo) obj;
                                                zzawk zzawkVar10 = zzawoVar3.f7179b;
                                                try {
                                                    int iCompare = new zzawp(false).compare(zzawkVar10.m4463c(), zzawkVar10.m4463c());
                                                    zzawk zzawkVar11 = zzawoVar3.f7179b;
                                                    if (iCompare >= 0) {
                                                        j2 = 0;
                                                    }
                                                    zzawkVar11.m4462b(zzawt.m4467b(j2));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzavd.f7007w);
                                                }
                                            case 10:
                                                zzawo zzawoVar4 = (zzawo) obj;
                                                try {
                                                    zzawk zzawkVar12 = zzawoVar4.f7179b;
                                                    long jM4478m8 = zzawkVar12.m4463c().m4478m();
                                                    zzavj zzavjVar = zzawoVar4.f7178a;
                                                    zzawk zzawkVar13 = new zzawk();
                                                    for (int i2 = 0; i2 < zzawkVar12.f7176b; i2++) {
                                                        try {
                                                            zzawkVar13.m4462b(zzawt.m4473j((zzawt) zzawkVar12.f7175a.get(i2)));
                                                        } catch (zzawj e) {
                                                            throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
                                                        }
                                                    }
                                                    zzawc zzawcVar = zzawoVar4.f7181d;
                                                    zzavx zzavxVar = zzawcVar.f7165b;
                                                    int i3 = zzawcVar.f7164a;
                                                    zzavl zzavlVarZzc = zzawcVar.f7166c.zzc();
                                                    zzavo zzavoVar = zzawcVar.f7167d;
                                                    zzawc zzawcVar2 = new zzawc(zzavxVar, i3, zzavlVarZzc);
                                                    zzawcVar2.f7167d = zzavoVar;
                                                    new zzawo(zzavjVar, zzawkVar13, zzawcVar2);
                                                    zzawcVar2.m4453a(jM4478m8);
                                                    zzawkVar12.m4462b(zzawt.m4466a(new zzavt()));
                                                    return Optional.empty();
                                                } catch (zzawa | zzawb unused3) {
                                                    zzavdVar = zzavd.f6986M;
                                                }
                                                break;
                                            case 11:
                                                try {
                                                    zzawk zzawkVar14 = ((zzawo) obj).f7179b;
                                                    zzawkVar14.m4462b(zzawt.m4466a(zzawkVar14.m4463c().m4475i((Class) zzawkVar14.m4463c().m4477l())));
                                                    return Optional.empty();
                                                } catch (zzawq unused4) {
                                                    zzavdVar = zzavd.f6982I;
                                                }
                                                break;
                                            case 12:
                                                zzawk zzawkVar15 = ((zzawo) obj).f7179b;
                                                long jM4478m9 = zzawkVar15.m4463c().m4478m();
                                                long jM4478m10 = zzawkVar15.m4463c().m4478m();
                                                if (jM4478m9 == 0) {
                                                    return Optional.of(zzavd.f6998Y);
                                                }
                                                zzawkVar15.m4462b(zzawt.m4467b(jM4478m10 % jM4478m9));
                                                return Optional.empty();
                                            case 13:
                                                zzawk zzawkVar16 = ((zzawo) obj).f7179b;
                                                zzawkVar16.m4462b(zzawt.m4468c(zzawkVar16.m4463c().m4482q() * zzawkVar16.m4463c().m4482q()));
                                                return Optional.empty();
                                            case 14:
                                                zzawk zzawkVar17 = ((zzawo) obj).f7179b;
                                                zzawkVar17.m4462b(zzawt.m4467b(zzawkVar17.m4463c().m4478m() * zzawkVar17.m4463c().m4478m()));
                                                return Optional.empty();
                                            case 15:
                                                zzawk zzawkVar18 = ((zzawo) obj).f7179b;
                                                long jM4478m11 = zzawkVar18.m4463c().m4478m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j3 = 0; j3 < jM4478m11; j3++) {
                                                    arrayList2.add(zzawkVar18.m4463c());
                                                }
                                                Collections.reverse(arrayList2);
                                                zzawkVar18.m4462b(zzawt.m4470e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                zzawk zzawkVar19 = ((zzawo) obj).f7179b;
                                                zzawkVar19.m4462b(zzawt.m4468c(Math.pow(zzawkVar19.m4463c().m4482q(), zzawkVar19.m4463c().m4482q())));
                                                return Optional.empty();
                                            case 17:
                                                ((zzawo) obj).f7179b.m4462b(zzawt.m4466a(null));
                                                return Optional.empty();
                                            case 18:
                                                zzawo zzawoVar5 = (zzawo) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzawoVar5.f7181d.m4458f(64L).m4447a());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzawoVar5.f7179b.m4462b(zzawt.m4468c(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzawo zzawoVar6 = (zzawo) obj;
                                                zzawoVar6.f7179b.m4462b(zzawt.m4467b(zzawoVar6.f7181d.m4457e()));
                                                return Optional.empty();
                                            default:
                                                zzawo zzawoVar7 = (zzawo) obj;
                                                zzawc zzawcVar3 = zzawoVar7.f7181d;
                                                long jM4457e = zzawcVar3.m4457e();
                                                if (jM4457e >= 0 && jM4457e <= 2147483647L) {
                                                    if ((7 & jM4457e) != 0) {
                                                        return Optional.of(zzavd.f7008x);
                                                    }
                                                    zzawoVar7.f7179b.m4462b(zzawt.m4469d(zzawcVar3.m4458f(jM4457e)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(zzavd.f6992S);
                                        }
                                    } catch (zzavz unused5) {
                                        zzavdVar = zzavd.f6996W;
                                    }
                                } catch (zzawq unused6) {
                                    zzavdVar = zzavd.f6991R;
                                }
                            } catch (zzawj unused7) {
                                zzavdVar = zzavd.f7004t;
                            }
                        } catch (zzawb unused8) {
                            zzavdVar = zzavd.f6992S;
                        }
                    } catch (zzawj e2) {
                        e = e2;
                        throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (zzawa | zzawb unused9) {
                    zzavdVar = zzavd.f6975B;
                }
            } catch (zzawa e3) {
                e = e3;
                throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzawi unused10) {
            zzavdVar = zzavd.f6990Q;
        }
        return Optional.of(zzavdVar);
    }
}
