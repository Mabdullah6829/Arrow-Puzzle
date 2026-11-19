package p030R;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p001B.AbstractC0081g;
import p034T.C0647E1;
import p034T.C0764n1;
import p036U.C0828i;

/* JADX INFO: renamed from: R.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0572o implements InterfaceC0574p, InterfaceC0557g0, InterfaceC0585u0, InterfaceC0551d0 {

    /* JADX INFO: renamed from: t */
    public static final C0572o f1219t = new C0572o(0);

    /* JADX INFO: renamed from: u */
    public static final byte[] f1220u = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1221s;

    public /* synthetic */ C0572o(int i2) {
        this.f1221s = i2;
    }

    @Override // p030R.InterfaceC0551d0
    /* JADX INFO: renamed from: a */
    public String mo1287a(Object obj) {
        return (String) obj;
    }

    @Override // p030R.InterfaceC0574p
    /* JADX INFO: renamed from: b */
    public InputStream mo1335b(C0647E1 c0647e1) {
        switch (this.f1221s) {
            case 0:
                return c0647e1;
            default:
                return new GZIPInputStream(c0647e1);
        }
    }

    @Override // p030R.InterfaceC0574p
    /* JADX INFO: renamed from: c */
    public OutputStream mo1336c(C0764n1 c0764n1) {
        switch (this.f1221s) {
            case 0:
                return c0764n1;
            default:
                return new GZIPOutputStream(c0764n1);
        }
    }

    @Override // p030R.InterfaceC0585u0
    /* JADX INFO: renamed from: d */
    public boolean mo1337d(Object obj) {
        switch (this.f1221s) {
            case 6:
                ((AbstractC0539V) obj).getClass();
                break;
            case 7:
                ((AbstractC0543Z) obj).getClass();
                break;
            default:
                ((AbstractC0575p0) obj).getClass();
                break;
        }
        return true;
    }

    @Override // p030R.InterfaceC0585u0
    /* JADX INFO: renamed from: e */
    public int mo1338e(Object obj) {
        switch (this.f1221s) {
            case 6:
                ((AbstractC0539V) obj).getClass();
                return 5;
            case 7:
                ((C0828i) ((AbstractC0543Z) obj)).getClass();
                try {
                    Class.forName("android.app.Application", false, C0828i.class.getClassLoader());
                    return 8;
                } catch (Exception unused) {
                    return 3;
                }
            default:
                ((AbstractC0575p0) obj).getClass();
                return 5;
        }
    }

    @Override // p030R.InterfaceC0557g0
    /* JADX INFO: renamed from: g */
    public Object mo1293g(byte[] bArr) {
        int i2;
        byte b;
        switch (this.f1221s) {
            case 1:
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b2 = bArr[i3];
                    if (b2 < 32 || b2 >= 126 || (b2 == 37 && i3 + 2 < bArr.length)) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                        int i4 = 0;
                        while (i4 < bArr.length) {
                            if (bArr[i4] == 37 && i4 + 2 < bArr.length) {
                                try {
                                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i4 + 1, 2, AbstractC0081g.f107a), 16));
                                    i4 += 3;
                                } catch (NumberFormatException unused) {
                                    byteBufferAllocate.put(bArr[i4]);
                                    i4++;
                                }
                            }
                            byteBufferAllocate.put(bArr[i4]);
                            i4++;
                        }
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC0081g.f108b);
                    }
                }
                return new String(bArr, 0);
            default:
                char c = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return C0589w0.f1275e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                        i2 = (b - 48) * 10;
                        c = 1;
                    }
                    return C0589w0.f1277g.m1354g("Unknown code ".concat(new String(bArr, AbstractC0081g.f107a)));
                }
                i2 = 0;
                byte b3 = bArr[c];
                if (b3 >= 48 && b3 <= 57) {
                    int i5 = (b3 - 48) + i2;
                    List list = C0589w0.f1274d;
                    if (i5 < list.size()) {
                        return (C0589w0) list.get(i5);
                    }
                }
                return C0589w0.f1277g.m1354g("Unknown code ".concat(new String(bArr, AbstractC0081g.f107a)));
        }
    }

    @Override // p030R.InterfaceC0574p
    public String getMessageEncoding() {
        switch (this.f1221s) {
            case 0:
                return "identity";
            default:
                return "gzip";
        }
    }

    public String toString() {
        switch (this.f1221s) {
            case 5:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    public C0572o(SSLSession sSLSession) {
        this.f1221s = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e) {
            C0526H.f1117d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e);
        }
    }

    @Override // p030R.InterfaceC0557g0
    /* JADX INFO: renamed from: a */
    public byte[] mo1292a(Object obj) {
        switch (this.f1221s) {
            case 1:
                byte[] bytes = ((String) obj).getBytes(AbstractC0081g.f108b);
                int i2 = 0;
                while (i2 < bytes.length) {
                    byte b = bytes[i2];
                    if (b < 32 || b >= 126 || b == 37) {
                        byte[] bArr = new byte[((bytes.length - i2) * 3) + i2];
                        if (i2 != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i2);
                        }
                        int i3 = i2;
                        while (i2 < bytes.length) {
                            byte b2 = bytes[i2];
                            if (b2 < 32 || b2 >= 126 || b2 == 37) {
                                bArr[i3] = 37;
                                byte[] bArr2 = f1220u;
                                bArr[i3 + 1] = bArr2[(b2 >> 4) & 15];
                                bArr[i3 + 2] = bArr2[b2 & 15];
                                i3 += 3;
                            } else {
                                bArr[i3] = b2;
                                i3++;
                            }
                            i2++;
                        }
                        return Arrays.copyOf(bArr, i3);
                    }
                    i2++;
                }
                return bytes;
            default:
                return ((C0589w0) obj).f1287a.f1266t;
        }
    }

    @Override // p030R.InterfaceC0551d0
    /* JADX INFO: renamed from: f */
    public Object mo1288f(String str) {
        return str;
    }
}
