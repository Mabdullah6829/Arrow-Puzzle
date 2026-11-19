package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzavu implements zzawl {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ zzavu f7076b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zzavu f7077c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zzavu f7078d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ zzavu f7079e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ zzavu f7080f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ zzavu f7081g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ zzavu f7082h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ zzavu f7083i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ zzavu f7084j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ zzavu f7085k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ zzavu f7086l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ zzavu f7087m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ zzavu f7088n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ zzavu f7089o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ zzavu f7090p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ zzavu f7091q;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7092a;

    static {
        int i2 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i3 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i4 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i5 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i6 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i7 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i8 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i9 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i10 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i11 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i12 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i13 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f7091q = new zzavu((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f7090p = new zzavu((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f7089o = new zzavu(i13);
        f7088n = new zzavu(i4);
        f7087m = new zzavu(i5);
        f7086l = new zzavu(i6);
        f7085k = new zzavu(i3);
        f7084j = new zzavu(i7);
        f7083i = new zzavu(i8);
        f7082h = new zzavu(i9);
        f7081g = new zzavu(i2);
        f7080f = new zzavu(i10);
        f7079e = new zzavu(i11);
        f7078d = new zzavu(i12);
        f7077c = new zzavu(1);
        f7076b = new zzavu(0);
    }

    public /* synthetic */ zzavu(int i2) {
        this.f7092a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zzavd zzavdVar;
        zzawt zzawtVarM4463c;
        int i2 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f7092a) {
                                case 0:
                                    return ((zzawo) obj).m4465a();
                                case 1:
                                    try {
                                        zzawk zzawkVar = ((zzawo) obj).f7179b;
                                        long jM4478m = zzawkVar.m4463c().m4478m();
                                        zzawt zzawtVarM4463c2 = zzawkVar.m4463c();
                                        List listM4480o = zzawtVarM4463c2.m4480o();
                                        if (jM4478m < 0) {
                                            jM4478m += (long) ((ArrayList) listM4480o).size();
                                        }
                                        if (jM4478m >= 0) {
                                            ArrayList arrayList = (ArrayList) listM4480o;
                                            if (jM4478m < arrayList.size()) {
                                                arrayList.remove((int) jM4478m);
                                                zzawkVar.m4462b(zzawtVarM4463c2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new zzawr();
                                    } catch (zzawr unused) {
                                        zzavdVar = zzavd.f7001b0;
                                    }
                                    break;
                                case 2:
                                    zzawo zzawoVar = (zzawo) obj;
                                    zzawk zzawkVar2 = zzawoVar.f7179b;
                                    zzawt zzawtVarM4463c3 = zzawkVar2.m4463c();
                                    zzavx zzavxVarM4479n = zzawkVar2.m4463c().m4479n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzawtVarM4463c3.m4476k(byteArrayOutputStream);
                                    zzawoVar.f7179b.m4462b(zzawt.m4469d(zzavxVarM4479n.m4450d(zzavx.m4445e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzawo zzawoVar2 = (zzawo) obj;
                                    zzawk zzawkVar3 = zzawoVar2.f7179b;
                                    zzawt zzawtVarM4463c4 = zzawkVar3.m4463c();
                                    zzavx zzavxVarM4479n2 = zzawkVar3.m4463c().m4479n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzavt.m4443b(zzawtVarM4463c4.m4478m(), new zzaws(byteArrayOutputStream2), false);
                                    zzawoVar2.f7179b.m4462b(zzawt.m4469d(zzavxVarM4479n2.m4450d(zzavx.m4445e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzawo zzawoVar3 = (zzawo) obj;
                                    zzawc zzawcVar = zzawoVar3.f7181d;
                                    zzawk zzawkVar4 = zzawoVar3.f7179b;
                                    zzawkVar4.f7175a.set(zzawkVar4.m4461a(-(zzawoVar3.f7180c.m4460b().f7172b + zzawcVar.m4457e())), zzawkVar4.m4463c());
                                    return Optional.empty();
                                case 5:
                                    zzawk zzawkVar5 = ((zzawo) obj).f7179b;
                                    zzawkVar5.m4462b(zzawt.m4467b(zzawkVar5.m4463c().m4478m() << ((int) zzawkVar5.m4463c().m4478m())));
                                    return Optional.empty();
                                case 6:
                                    zzawk zzawkVar6 = ((zzawo) obj).f7179b;
                                    zzawkVar6.m4462b(zzawt.m4467b(zzawkVar6.m4463c().m4478m() >>> ((int) zzawkVar6.m4463c().m4478m())));
                                    return Optional.empty();
                                case 7:
                                    zzawk zzawkVar7 = ((zzawo) obj).f7179b;
                                    zzawkVar7.m4462b(zzawt.m4468c(zzawkVar7.m4463c().m4482q() - zzawkVar7.m4463c().m4482q()));
                                    return Optional.empty();
                                case 8:
                                    zzawk zzawkVar8 = ((zzawo) obj).f7179b;
                                    zzawkVar8.m4462b(zzawt.m4467b(zzawkVar8.m4463c().m4478m() - zzawkVar8.m4463c().m4478m()));
                                    return Optional.empty();
                                case 9:
                                    zzawo zzawoVar4 = (zzawo) obj;
                                    zzawk zzawkVar9 = zzawoVar4.f7179b;
                                    long jM4478m2 = zzawkVar9.m4463c().m4478m();
                                    zzawt zzawtVarM4463c5 = zzawkVar9.m4463c();
                                    zzawk zzawkVar10 = zzawoVar4.f7179b;
                                    zzawt zzawtVarM4464d = zzawkVar10.m4464d(jM4478m2);
                                    zzawkVar10.f7175a.set(zzawkVar10.m4461a(jM4478m2), zzawtVarM4463c5);
                                    zzawkVar10.m4462b(zzawtVarM4464d);
                                    return Optional.empty();
                                case 10:
                                    zzawo zzawoVar5 = (zzawo) obj;
                                    zzawk zzawkVar11 = zzawoVar5.f7179b;
                                    long jM4478m3 = zzawoVar5.f7180c.m4460b().f7172b + zzawkVar11.m4463c().m4478m();
                                    zzawt zzawtVarM4463c6 = zzawkVar11.m4463c();
                                    zzawk zzawkVar12 = zzawoVar5.f7179b;
                                    long j2 = -jM4478m3;
                                    zzawt zzawtVarM4464d2 = zzawkVar12.m4464d(j2);
                                    zzawkVar12.f7175a.set(zzawkVar12.m4461a(j2), zzawtVarM4463c6);
                                    zzawkVar12.m4462b(zzawtVarM4464d2);
                                    return Optional.empty();
                                case 11:
                                    zzawo zzawoVar6 = (zzawo) obj;
                                    zzawc zzawcVar2 = zzawoVar6.f7181d;
                                    zzawk zzawkVar13 = zzawoVar6.f7179b;
                                    long jM4457e = zzawoVar6.f7180c.m4460b().f7172b + zzawcVar2.m4457e();
                                    zzawt zzawtVarM4463c7 = zzawkVar13.m4463c();
                                    long j3 = -jM4457e;
                                    zzawt zzawtVarM4464d3 = zzawkVar13.m4464d(j3);
                                    zzawkVar13.f7175a.set(zzawkVar13.m4461a(j3), zzawtVarM4463c7);
                                    zzawkVar13.m4462b(zzawtVarM4464d3);
                                    return Optional.empty();
                                case 12:
                                    zzawo zzawoVar7 = (zzawo) obj;
                                    long jM4478m4 = zzawoVar7.f7179b.m4463c().m4478m();
                                    try {
                                        zzawk zzawkVar14 = zzawoVar7.f7179b;
                                        if (jM4478m4 == 0) {
                                            zzawtVarM4463c = zzawkVar14.m4463c();
                                        } else {
                                            int iM4461a = zzawkVar14.m4461a(jM4478m4);
                                            zzawkVar14.f7176b--;
                                            zzawtVarM4463c = (zzawt) zzawkVar14.f7175a.remove(iM4461a);
                                        }
                                        zzawkVar14.m4462b(zzawtVarM4463c);
                                        return Optional.empty();
                                    } catch (zzawi unused2) {
                                        zzavdVar = zzavd.f7010z;
                                    }
                                    break;
                                case 13:
                                    zzawo zzawoVar8 = (zzawo) obj;
                                    try {
                                        zzawk zzawkVar15 = zzawoVar8.f7179b;
                                        long jM4478m5 = zzawkVar15.m4463c().m4478m();
                                        long jM4478m6 = zzawkVar15.m4463c().m4478m();
                                        zzawh zzawhVar = zzawoVar8.f7180c;
                                        zzawc zzawcVar3 = zzawoVar8.f7181d;
                                        zzawhVar.m4459a(zzawcVar3.m4454b(), jM4478m6, zzawhVar.m4460b().f7172b);
                                        zzawcVar3.m4453a(jM4478m5);
                                        return Optional.empty();
                                    } catch (zzawa | zzawb unused3) {
                                        zzavdVar = zzavd.f6984K;
                                    } catch (zzawf unused4) {
                                        zzavdVar = zzavd.f6994U;
                                    } catch (zzawg unused5) {
                                        zzavdVar = zzavd.f6989P;
                                    }
                                    break;
                                case 14:
                                    zzawo zzawoVar9 = (zzawo) obj;
                                    try {
                                        zzawoVar9.f7179b.m4462b(zzawt.m4472g(zzawoVar9.f7179b.m4463c().m4477l()));
                                        return Optional.empty();
                                    } catch (zzawq unused6) {
                                        zzavdVar = zzavd.f6982I;
                                    }
                                    break;
                                default:
                                    try {
                                        zzawk zzawkVar16 = ((zzawo) obj).f7179b;
                                        ArrayList arrayList2 = (ArrayList) zzawkVar16.m4463c().m4480o();
                                        int size = arrayList2.size();
                                        while (i2 < size) {
                                            Object obj2 = arrayList2.get(i2);
                                            i2++;
                                            zzawkVar16.m4462b((zzawt) obj2);
                                        }
                                        return Optional.empty();
                                    } catch (zzawj unused7) {
                                        zzavdVar = zzavd.f7004t;
                                    }
                                    break;
                            }
                        } catch (zzawg | zzawi unused8) {
                            zzavdVar = zzavd.f6990Q;
                        }
                    } catch (zzawj e) {
                        e = e;
                        throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (zzavz | zzawb | zzawq unused9) {
                    zzavdVar = zzavd.f6991R;
                }
            } catch (zzawi unused10) {
                zzavdVar = zzavd.f6974A;
            }
        } catch (zzawq unused11) {
            zzavdVar = zzavd.f6977D;
        } catch (IOException e2) {
            e = e2;
            throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(zzavdVar);
    }
}
