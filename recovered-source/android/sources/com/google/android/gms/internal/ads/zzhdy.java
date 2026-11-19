package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdy implements zzhem {

    /* JADX INFO: renamed from: b */
    public static final Charset f18544b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final ByteArrayInputStream f18545a;

    public zzhdy(ByteArrayInputStream byteArrayInputStream) {
        this.f18545a = byteArrayInputStream;
    }

    /* JADX INFO: renamed from: b */
    public static int m7403b(zzibr zzibrVar) throws IOException {
        if (!(zzibrVar instanceof zzibv)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(zzibrVar.m8055d().f19624s instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number numberM8058g = zzibrVar.m8055d().m8058g();
        try {
            if (!(numberM8058g instanceof zzhly)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long j2 = Long.parseLong(((zzhly) numberM8058g).f18964s);
            if (j2 > 4294967295L || j2 < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) j2;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x021d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    /* JADX INFO: renamed from: a */
    public final zzhtk m7404a() throws IOException {
        byte b;
        int i2;
        byte b2;
        zzhtx zzhtxVar;
        byte b3;
        zzhta zzhtaVar;
        String str = NotificationCompat.CATEGORY_STATUS;
        String str2 = "keyData";
        ByteArrayInputStream byteArrayInputStream = this.f18545a;
        try {
            try {
                int i3 = zzhfb.f18582a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i4 = byteArrayInputStream.read(bArr);
                    if (i4 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i4);
                }
                zzibt zzibtVarM8054b = zzhlz.m7554b(new String(byteArrayOutputStream.toByteArray(), f18544b)).m8054b();
                zzich zzichVar = zzibtVarM8054b.f19623s;
                if (!zzichVar.containsKey("key")) {
                    throw new zzibu("invalid keyset: no key");
                }
                zzibr zzibrVarM8056g = zzibtVarM8054b.m8056g("key");
                if (!(zzibrVarM8056g instanceof zzibq)) {
                    throw new zzibu("invalid keyset: key must be an array");
                }
                zzibrVarM8056g.getClass();
                if (!(zzibrVarM8056g instanceof zzibq)) {
                    throw new IllegalStateException("Not a JSON Array: ".concat(zzibrVarM8056g.toString()));
                }
                ArrayList arrayList = ((zzibq) zzibrVarM8056g).f19621s;
                if (arrayList.size() == 0) {
                    throw new zzibu("invalid keyset: key is empty");
                }
                zzhth zzhthVarM7821J = zzhtk.m7821J();
                if (zzichVar.containsKey("primaryKeyId")) {
                    int iM7403b = m7403b(zzibtVarM8054b.m8056g("primaryKeyId"));
                    zzhthVarM7821J.m8326l();
                    ((zzhtk) zzhthVarM7821J.f19780t).m7826K(iM7403b);
                }
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    zzibt zzibtVarM8054b2 = ((zzibr) arrayList.get(i5)).m8054b();
                    zzich zzichVar2 = zzibtVarM8054b2.f19623s;
                    if (!zzichVar2.containsKey(str2) || !zzichVar2.containsKey(str) || !zzichVar2.containsKey("keyId") || !zzichVar2.containsKey("outputPrefixType")) {
                        throw new zzibu("invalid key");
                    }
                    zzibr zzibrVarM8056g2 = zzibtVarM8054b2.m8056g(str2);
                    if (!(zzibrVarM8056g2 instanceof zzibt)) {
                        throw new zzibu("invalid key: keyData must be an object");
                    }
                    zzhti zzhtiVarM7809H = zzhtj.m7809H();
                    String strMo8053a = zzibtVarM8054b2.m8056g(str).mo8053a();
                    String str3 = str;
                    int iHashCode = strMo8053a.hashCode();
                    String str4 = str2;
                    int i6 = i5;
                    if (iHashCode != -891611359) {
                        if (iHashCode != 478389753) {
                            if (iHashCode == 1053567612 && strMo8053a.equals("DISABLED")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (strMo8053a.equals("DESTROYED")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strMo8053a.equals("ENABLED")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        i2 = 3;
                    } else if (b == 1) {
                        i2 = 4;
                    } else {
                        if (b != 2) {
                            throw new zzibu("unknown status: ".concat(strMo8053a));
                        }
                        i2 = 5;
                    }
                    zzhtiVarM7809H.m8326l();
                    ((zzhtj) zzhtiVarM7809H.f19780t).m7818M(i2);
                    int iM7403b2 = m7403b(zzibtVarM8054b2.m8056g("keyId"));
                    zzhtiVarM7809H.m8326l();
                    ((zzhtj) zzhtiVarM7809H.f19780t).m7815J(iM7403b2);
                    String strMo8053a2 = zzibtVarM8054b2.m8056g("outputPrefixType").mo8053a();
                    switch (strMo8053a2) {
                        case "LEGACY":
                            b2 = 2;
                            break;
                        case "RAW":
                            b2 = 1;
                            break;
                        case "TINK":
                            b2 = 0;
                            break;
                        case "CRUNCHY":
                            b2 = 3;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        zzhtxVar = zzhtx.TINK;
                    } else if (b2 == 1) {
                        zzhtxVar = zzhtx.RAW;
                    } else if (b2 == 2) {
                        zzhtxVar = zzhtx.LEGACY;
                    } else {
                        if (b2 != 3) {
                            throw new zzibu("unknown output prefix type: ".concat(strMo8053a2));
                        }
                        zzhtxVar = zzhtx.CRUNCHY;
                    }
                    zzhtiVarM7809H.m8326l();
                    ((zzhtj) zzhtiVarM7809H.f19780t).m7816K(zzhtxVar);
                    zzibt zzibtVarM8054b3 = zzibrVarM8056g2.m8054b();
                    zzich zzichVar3 = zzibtVarM8054b3.f19623s;
                    if (!zzichVar3.containsKey("typeUrl") || !zzichVar3.containsKey("value") || !zzichVar3.containsKey("keyMaterialType")) {
                        throw new zzibu("invalid keyData");
                    }
                    byte[] bArrM8022a = zzhzv.m8022a(zzibtVarM8054b3.m8056g("value").mo8053a());
                    zzhsz zzhszVarM7788G = zzhtb.m7788G();
                    String strMo8053a3 = zzibtVarM8054b3.m8056g("typeUrl").mo8053a();
                    zzhszVarM7788G.m8326l();
                    ((zzhtb) zzhszVarM7788G.f19780t).m7793I(strMo8053a3);
                    zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8022a, 0, bArrM8022a.length);
                    zzhszVarM7788G.m8326l();
                    ((zzhtb) zzhszVarM7788G.f19780t).m7794J(zzidlVarM8149y);
                    String strMo8053a4 = zzibtVarM8054b3.m8056g("keyMaterialType").mo8053a();
                    switch (strMo8053a4) {
                        case "REMOTE":
                            b3 = 3;
                            break;
                        case "SYMMETRIC":
                            b3 = 0;
                            break;
                        case "ASYMMETRIC_PRIVATE":
                            b3 = 1;
                            break;
                        case "ASYMMETRIC_PUBLIC":
                            b3 = 2;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    if (b3 == 0) {
                        zzhtaVar = zzhta.SYMMETRIC;
                    } else if (b3 == 1) {
                        zzhtaVar = zzhta.ASYMMETRIC_PRIVATE;
                    } else if (b3 == 2) {
                        zzhtaVar = zzhta.ASYMMETRIC_PUBLIC;
                    } else {
                        if (b3 != 3) {
                            throw new zzibu("unknown key material type: ".concat(strMo8053a4));
                        }
                        zzhtaVar = zzhta.REMOTE;
                    }
                    zzhszVarM7788G.m8326l();
                    ((zzhtb) zzhszVarM7788G.f19780t).m7795K(zzhtaVar);
                    zzhtb zzhtbVar = (zzhtb) zzhszVarM7788G.m8328o();
                    zzhtiVarM7809H.m8326l();
                    ((zzhtj) zzhtiVarM7809H.f19780t).m7814I(zzhtbVar);
                    zzhtj zzhtjVar = (zzhtj) zzhtiVarM7809H.m8328o();
                    zzhthVarM7821J.m8326l();
                    ((zzhtk) zzhthVarM7821J.f19780t).m7827L(zzhtjVar);
                    i5 = i6 + 1;
                    str = str3;
                    str2 = str4;
                }
                zzhtk zzhtkVar = (zzhtk) zzhthVarM7821J.m8328o();
                byteArrayInputStream.close();
                return zzhtkVar;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (zzibu e) {
            e = e;
            throw new IOException(e);
        } catch (IllegalStateException e2) {
            e = e2;
            throw new IOException(e);
        }
    }
}
