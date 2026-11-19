package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzavq implements zzawl {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ zzavq f7031b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zzavq f7032c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zzavq f7033d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ zzavq f7034e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ zzavq f7035f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ zzavq f7036g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ zzavq f7037h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ zzavq f7038i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ zzavq f7039j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ zzavq f7040k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ zzavq f7041l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ zzavq f7042m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ zzavq f7043n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ zzavq f7044o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ zzavq f7045p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ zzavq f7046q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ zzavq f7047r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ zzavq f7048s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ zzavq f7049t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ zzavq f7050u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ zzavq f7051v;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7052a;

    static {
        int i2 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i3 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i4 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i5 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i6 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i7 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i8 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        f7051v = new zzavq((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        f7050u = new zzavq((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        f7049t = new zzavq((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        f7048s = new zzavq(i8);
        f7047r = new zzavq(i5);
        f7046q = new zzavq(i6);
        zzavq zzavqVar = new zzavq(i7);
        int i9 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i10 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i11 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i12 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i13 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i14 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i15 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i16 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i17 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        f7045p = zzavqVar;
        f7044o = new zzavq(i4);
        f7043n = new zzavq(i9);
        f7042m = new zzavq(i10);
        f7041l = new zzavq(i11);
        f7040k = new zzavq(i3);
        f7039j = new zzavq(i12);
        f7038i = new zzavq(i13);
        f7037h = new zzavq(i14);
        f7036g = new zzavq(i2);
        f7035f = new zzavq(i15);
        f7034e = new zzavq(i16);
        f7033d = new zzavq(i17);
        f7032c = new zzavq(1);
        f7031b = new zzavq(0);
    }

    public /* synthetic */ zzavq(int i2) {
        this.f7052a = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x01b8 A[Catch: zzawj -> 0x0044, zzawg | zzawi -> 0x00c4, ClassNotFoundException -> 0x01c8, zzawq -> 0x01cc, TryCatch #2 {zzawg | zzawi -> 0x00c4, blocks: (B:5:0x0016, B:9:0x0032, B:11:0x003a, B:16:0x004b, B:18:0x0056, B:31:0x00b5, B:19:0x005f, B:20:0x0064, B:21:0x0065, B:23:0x006d, B:24:0x0072, B:28:0x007a, B:30:0x0082, B:34:0x00bd, B:35:0x00c2, B:36:0x00c3, B:41:0x00d3, B:42:0x00e5, B:44:0x00eb, B:46:0x00f9, B:47:0x00fb, B:49:0x0100, B:50:0x0107, B:52:0x011f, B:53:0x0122, B:60:0x0141, B:65:0x015f, B:98:0x01bc, B:69:0x016a, B:73:0x0175, B:80:0x0189, B:84:0x0194, B:88:0x019f, B:92:0x01aa, B:96:0x01b5, B:97:0x01b8, B:104:0x01d4, B:108:0x01eb, B:118:0x0229, B:118:0x0229, B:124:0x0253, B:134:0x0285, B:136:0x029b, B:137:0x029d, B:139:0x02a2, B:143:0x02b3, B:145:0x02cb, B:146:0x02ce, B:150:0x02df, B:169:0x035f, B:171:0x038b, B:173:0x0392, B:176:0x039c, B:178:0x03a2, B:182:0x03c2, B:184:0x03c8, B:185:0x03dd, B:188:0x03e8, B:207:0x0432, B:213:0x0460, B:217:0x0483, B:221:0x04cf, B:225:0x04ec, B:238:0x0537, B:242:0x055d, B:246:0x0580), top: B:253:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zzavd zzavdVar;
        long j2;
        zzavd zzavdVar2;
        zzavd zzavdVar3;
        int i2 = this.f7052a;
        long j3 = 1;
        Class<?> cls = Void.TYPE;
        long j4 = 0;
        int i3 = 0;
        try {
            try {
                try {
                    try {
                        switch (i2) {
                            case 0:
                                zzawk zzawkVar = ((zzawo) obj).f7179b;
                                zzawkVar.m4462b(zzawt.m4467b(zzawkVar.m4463c().m4478m() + zzawkVar.m4463c().m4478m()));
                                return Optional.empty();
                            case 1:
                                zzawk zzawkVar2 = ((zzawo) obj).f7179b;
                                zzawkVar2.m4462b(zzawt.m4468c(zzawkVar2.m4463c().m4482q() + zzawkVar2.m4463c().m4482q()));
                                return Optional.empty();
                            case 2:
                                zzawk zzawkVar3 = ((zzawo) obj).f7179b;
                                zzawkVar3.m4462b(zzawt.m4469d(zzawkVar3.m4463c().m4479n().m4450d(zzawkVar3.m4463c().m4479n())));
                                return Optional.empty();
                            case 3:
                                zzawo zzawoVar = (zzawo) obj;
                                try {
                                    long jM4457e = zzawoVar.f7181d.m4457e();
                                    for (long j5 = 0; j5 < jM4457e; j5++) {
                                        zzawoVar.f7179b.m4462b(zzawt.m4466a(null));
                                    }
                                    return Optional.empty();
                                } catch (zzawj unused) {
                                    zzavdVar = zzavd.f7004t;
                                    return Optional.of(zzavdVar);
                                }
                            case 4:
                                zzawk zzawkVar4 = ((zzawo) obj).f7179b;
                                zzawkVar4.m4462b(zzawt.m4467b(zzawkVar4.m4463c().m4478m() & zzawkVar4.m4463c().m4478m()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j6 = jArr[0];
                                long j7 = jArr[1];
                                long j8 = jArr[2];
                                long j9 = jArr[3];
                                long j10 = jArr[4];
                                long j11 = jArr[5];
                                long j12 = jArr[6];
                                long j13 = jArr[7];
                                long j14 = (((((~j6) & j7) | j8) + (j10 | (j6 & j9))) - j11) + j12;
                                long j15 = j13 % 102194872;
                                zzawk zzawkVar5 = ((zzawo) obj).f7179b;
                                zzawkVar5.m4462b(zzawt.m4467b((j14 ^ j15) ^ zzawkVar5.m4463c().m4478m()));
                                return Optional.empty();
                            case 6:
                                zzawk zzawkVar6 = ((zzawo) obj).f7179b;
                                zzawkVar6.m4462b(zzawt.m4467b(zzawkVar6.m4463c().m4478m() | zzawkVar6.m4463c().m4478m()));
                                return Optional.empty();
                            case 7:
                                zzawk zzawkVar7 = ((zzawo) obj).f7179b;
                                zzawkVar7.m4462b(zzawt.m4467b(zzawkVar7.m4463c().m4478m() ^ zzawkVar7.m4463c().m4478m()));
                                return Optional.empty();
                            case 8:
                                zzawo zzawoVar2 = (zzawo) obj;
                                try {
                                    zzawk zzawkVar8 = zzawoVar2.f7179b;
                                    long jM4478m = zzawkVar8.m4463c().m4478m();
                                    zzawh zzawhVar = zzawoVar2.f7180c;
                                    zzawc zzawcVar = zzawoVar2.f7181d;
                                    zzawhVar.m4459a(zzawcVar.m4454b(), 0L, zzawkVar8.f7176b);
                                    zzawcVar.m4453a(jM4478m);
                                    return Optional.empty();
                                } catch (zzawa | zzawb unused2) {
                                    zzavdVar = zzavd.f6984K;
                                    return Optional.of(zzavdVar);
                                } catch (zzawf unused3) {
                                    zzavdVar = zzavd.f6994U;
                                    return Optional.of(zzavdVar);
                                }
                            case 9:
                                try {
                                    zzawk zzawkVar9 = ((zzawo) obj).f7179b;
                                    long jM4478m2 = zzawkVar9.m4463c().m4478m();
                                    ArrayList arrayList = (ArrayList) zzawkVar9.m4463c().m4480o();
                                    int size = arrayList.size();
                                    Object objM4474h = zzawkVar9.m4463c().m4474h();
                                    Object objM4477l = zzawkVar9.m4463c().m4477l();
                                    if (objM4477l instanceof Method) {
                                        Method method = (Method) objM4477l;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objM4474h instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objM4474h).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                ArrayList arrayList2 = (ArrayList) ((zzawt) arrayList.get(0)).m4480o();
                                                if (arrayList2.size() == length) {
                                                    int i4 = 0;
                                                    while (i4 < arrayList2.size()) {
                                                        objArr2[i4] = ((zzawt) arrayList2.get(i4)).m4475i(parameterTypes2[i4]);
                                                        i4++;
                                                        j4 = j4;
                                                    }
                                                    j2 = j4;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                j2 = 0;
                                                while (i3 < size) {
                                                    objArr[i3] = ((zzawt) arrayList.get(i3)).m4475i(parameterTypes[i3]);
                                                    i3++;
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objM4474h, objArr);
                                                zzawkVar9.m4462b((method.getReturnType() == Void.class || method.getReturnType() == cls) ? zzawt.m4466a(0) : jM4478m2 != j2 ? zzawt.m4472g(objInvoke) : zzawt.m4466a(objInvoke));
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzavdVar = zzavd.f6983J;
                                                return Optional.of(zzavdVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzavd.f6982I);
                                } catch (zzawq unused5) {
                                    zzavdVar = zzavd.f6982I;
                                }
                                break;
                            case 10:
                                zzawo zzawoVar3 = (zzawo) obj;
                                zzawk zzawkVar10 = zzawoVar3.f7179b;
                                int intExact = Math.toIntExact(zzawkVar10.m4463c().m4478m());
                                zzavx zzavxVarM4479n = zzawkVar10.m4463c().m4479n();
                                zzavx zzavxVarM4479n2 = zzawkVar10.m4463c().m4479n();
                                if (zzavxVarM4479n.f7096a.length != 16) {
                                    return Optional.of(zzavd.f7000a0);
                                }
                                int[] iArr = new int[4];
                                ByteBuffer.wrap(zzavxVarM4479n.m4447a()).asIntBuffer().get(iArr);
                                zzavp zzavpVar = new zzavp(intExact, iArr);
                                byte[] bArrM4447a = zzavxVarM4479n2.m4447a();
                                byte[] bArr = new byte[8];
                                int i5 = 0;
                                while (i5 < bArrM4447a.length) {
                                    if (i5 % 8 == 0) {
                                        zzavpVar.m4441a(i5 >>> 3, bArr);
                                    } else if (i5 == 0) {
                                        i5 = 0;
                                        zzavpVar.m4441a(i5 >>> 3, bArr);
                                    }
                                    bArrM4447a[i5] = (byte) (((bArrM4447a[i5] ^ bArr[i5 % 8]) << 24) >> 24);
                                    i5++;
                                }
                                zzawoVar3.f7179b.m4462b(zzawt.m4469d(zzavx.m4445e(bArrM4447a)));
                                return Optional.empty();
                            case 11:
                                zzawk zzawkVar11 = ((zzawo) obj).f7179b;
                                double dM4482q = zzawkVar11.m4463c().m4482q();
                                double dM4482q2 = zzawkVar11.m4463c().m4482q();
                                if (dM4482q == 0.0d) {
                                    zzavdVar2 = zzavd.f6998Y;
                                    return Optional.of(zzavdVar2);
                                }
                                zzawkVar11.m4462b(zzawt.m4468c(dM4482q2 / dM4482q));
                                return Optional.empty();
                            case 12:
                                zzawk zzawkVar12 = ((zzawo) obj).f7179b;
                                long jM4478m3 = zzawkVar12.m4463c().m4478m();
                                long jM4478m4 = zzawkVar12.m4463c().m4478m();
                                if (jM4478m3 == 0) {
                                    zzavdVar2 = zzavd.f6998Y;
                                    return Optional.of(zzavdVar2);
                                }
                                zzawkVar12.m4462b(zzawt.m4467b(jM4478m4 / jM4478m3));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzawo) obj).f7179b.m4463c();
                                    return Optional.empty();
                                } catch (zzawi unused6) {
                                    zzavdVar = zzavd.f6993T;
                                    return Optional.of(zzavdVar);
                                }
                            case 14:
                                zzawo zzawoVar4 = (zzawo) obj;
                                long jM4478m5 = zzawoVar4.f7179b.m4463c().m4478m();
                                zzawk zzawkVar13 = zzawoVar4.f7179b;
                                zzawkVar13.m4462b(zzawt.m4473j(zzawkVar13.m4464d(jM4478m5)));
                                return Optional.empty();
                            case 15:
                                zzawo zzawoVar5 = (zzawo) obj;
                                long jM4478m6 = zzawoVar5.f7180c.m4460b().f7172b + zzawoVar5.f7179b.m4463c().m4478m();
                                zzawk zzawkVar14 = zzawoVar5.f7179b;
                                zzawkVar14.m4462b(zzawt.m4473j(zzawkVar14.m4464d(-jM4478m6)));
                                return Optional.empty();
                            case 16:
                                zzawo zzawoVar6 = (zzawo) obj;
                                long jM4457e2 = zzawoVar6.f7180c.m4460b().f7172b + zzawoVar6.f7181d.m4457e();
                                zzawk zzawkVar15 = zzawoVar6.f7179b;
                                zzawkVar15.m4462b(zzawt.m4473j(zzawkVar15.m4464d(-jM4457e2)));
                                return Optional.empty();
                            case 17:
                                try {
                                    zzawk zzawkVar16 = ((zzawo) obj).f7179b;
                                    if (new zzawp(true).compare(zzawkVar16.m4463c(), zzawkVar16.m4463c()) != 0) {
                                        j3 = 0;
                                    }
                                    zzawkVar16.m4462b(zzawt.m4467b(j3));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzavdVar = zzavd.f7007w;
                                    return Optional.of(zzavdVar);
                                }
                            case 18:
                                try {
                                    zzawk zzawkVar17 = ((zzawo) obj).f7179b;
                                    String strM4449c = zzawkVar17.m4463c().m4479n().m4449c();
                                    switch (strM4449c.hashCode()) {
                                        case -1325958191:
                                            if (strM4449c.equals("double")) {
                                                cls = Double.TYPE;
                                            } else {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        case 104431:
                                            if (strM4449c.equals("int")) {
                                                cls = Integer.TYPE;
                                            } else {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        case 3039496:
                                            if (strM4449c.equals("byte")) {
                                                cls = Byte.TYPE;
                                            } else {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        case 3052374:
                                            if (strM4449c.equals("char")) {
                                                cls = Character.TYPE;
                                            } else {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        case 3327612:
                                            if (strM4449c.equals("long")) {
                                                cls = Long.TYPE;
                                            } else {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        case 3625364:
                                            if (!strM4449c.equals("void")) {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        case 64711720:
                                            if (strM4449c.equals(TypedValues.Custom.S_BOOLEAN)) {
                                                cls = Boolean.TYPE;
                                            } else {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        case 97526364:
                                            if (strM4449c.equals(TypedValues.Custom.S_FLOAT)) {
                                                cls = Float.TYPE;
                                            } else {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        case 109413500:
                                            if (strM4449c.equals("short")) {
                                                cls = Short.TYPE;
                                            } else {
                                                cls = Class.forName(strM4449c);
                                            }
                                            break;
                                        default:
                                            cls = Class.forName(strM4449c);
                                            break;
                                    }
                                    zzawkVar17.m4462b(zzawt.m4466a(cls));
                                    return Optional.empty();
                                } catch (zzawq unused8) {
                                    zzavdVar = zzavd.f6978E;
                                    return Optional.of(zzavdVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzavdVar = zzavd.f6979F;
                                    return Optional.of(zzavdVar);
                                }
                            case 19:
                                try {
                                    zzawk zzawkVar18 = ((zzawo) obj).f7179b;
                                    ArrayList arrayList3 = (ArrayList) zzawkVar18.m4463c().m4480o();
                                    Class<?>[] clsArr = new Class[arrayList3.size()];
                                    while (i3 < arrayList3.size()) {
                                        Object objM4477l2 = ((zzawt) arrayList3.get(i3)).m4477l();
                                        if (!(objM4477l2 instanceof Class)) {
                                            zzavdVar3 = zzavd.f6980G;
                                            return Optional.of(zzavdVar3);
                                        }
                                        clsArr[i3] = (Class) objM4477l2;
                                        i3++;
                                    }
                                    String strM4449c2 = zzawkVar18.m4463c().m4479n().m4449c();
                                    Object objM4477l3 = zzawkVar18.m4463c().m4477l();
                                    if (objM4477l3 instanceof Class) {
                                        zzawkVar18.m4462b(zzawt.m4466a(((Class) objM4477l3).getMethod(strM4449c2, clsArr)));
                                        return Optional.empty();
                                    }
                                    zzavdVar3 = zzavd.f6980G;
                                    return Optional.of(zzavdVar3);
                                } catch (zzawq unused10) {
                                    zzavdVar = zzavd.f6980G;
                                    return Optional.of(zzavdVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzavdVar = zzavd.f6981H;
                                    return Optional.of(zzavdVar);
                                } catch (SecurityException unused12) {
                                    zzavdVar = zzavd.f6995V;
                                    return Optional.of(zzavdVar);
                                }
                            default:
                                zzawk zzawkVar19 = ((zzawo) obj).f7179b;
                                long jM4478m7 = zzawkVar19.m4463c().m4478m();
                                zzawt zzawtVarM4463c = zzawkVar19.m4463c();
                                zzawt zzawtVarM4463c2 = zzawkVar19.m4463c();
                                int i6 = zzawtVarM4463c2.f7190g;
                                int i7 = i6 - 1;
                                if (i6 == 0) {
                                    throw null;
                                }
                                if (i7 == 3) {
                                    zzavx zzavxVarM4479n3 = zzawtVarM4463c2.m4479n();
                                    if (jM4478m7 < 0) {
                                        jM4478m7 += (long) zzavxVarM4479n3.f7096a.length;
                                    }
                                    if (zzawtVarM4463c.f7190g != 4) {
                                        throw new zzawq();
                                    }
                                    if (jM4478m7 >= 0 && jM4478m7 < zzavxVarM4479n3.f7096a.length) {
                                        char cCharAt = zzavxVarM4479n3.m4449c().charAt((int) jM4478m7);
                                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb.append(cCharAt);
                                        zzawtVarM4463c = zzawt.m4469d(zzavx.m4445e(sb.toString().getBytes(Charset.forName(zzavv.m4444a("Hn2H4l0=")))));
                                    }
                                } else {
                                    if (i7 != 4) {
                                        throw new zzawq();
                                    }
                                    List listM4480o = zzawtVarM4463c2.m4480o();
                                    if (jM4478m7 < 0) {
                                        jM4478m7 += (long) ((ArrayList) listM4480o).size();
                                    }
                                    if (jM4478m7 >= 0) {
                                        ArrayList arrayList4 = (ArrayList) listM4480o;
                                        if (jM4478m7 < arrayList4.size()) {
                                            zzawtVarM4463c = (zzawt) arrayList4.get((int) jM4478m7);
                                        }
                                    }
                                }
                                zzawkVar19.m4462b(zzawtVarM4463c);
                                return Optional.empty();
                        }
                    } catch (zzawg | zzawi unused13) {
                        zzavdVar = zzavd.f6990Q;
                    }
                } catch (zzawi unused14) {
                    zzavdVar = zzavd.f7009y;
                }
            } catch (zzawj e) {
                throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzavz | zzawb | zzawq unused15) {
            zzavdVar = zzavd.f6991R;
        }
    }
}
