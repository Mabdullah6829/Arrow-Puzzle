package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4924o0 extends Thread implements InterfaceC2622CG {
    public static String[] A09 = {"WULC9DYlvQgZjojDU2bdZ9xs7wQbeGsA", "0RzPpdpgLbDOZ8gUAj9sr", "fywSSsB8oN823aa6hQ2avodpE9Fj6EUo", "rQ4mhJZFramri", "thNzrz2pgMkLR", "sKcdOZc1ZRugYqEHWVRtFgFPdRxve1CE", "006dlWDsgbMi7GTsUIBgGpVxQZYkiOjN", "1EnGqdZRllbwfzBFLuDlK"};
    public long A00;
    public Exception A01;
    public final int A02;
    public final C2613C6 A03;
    public final DownloadRequest A04;
    public final InterfaceC2623CH A05;
    public final boolean A06;
    public volatile HandlerC2609C2 A07;
    public volatile boolean A08;

    public C4924o0(DownloadRequest downloadRequest, InterfaceC2623CH interfaceC2623CH, C2613C6 c2613c6, boolean z, int i2, HandlerC2609C2 handlerC2609C2) {
        this.A04 = downloadRequest;
        this.A05 = interfaceC2623CH;
        this.A03 = c2613c6;
        this.A06 = z;
        this.A02 = i2;
        this.A07 = handlerC2609C2;
        this.A00 = -1L;
    }

    public static int A00(int i2) {
        return Math.min((i2 - 1) * 1000, 5000);
    }

    public final void A05(boolean z) {
        if (z) {
            this.A07 = null;
        }
        if (!this.A08) {
            this.A08 = true;
            this.A05.cancel();
            if (A09[5].charAt(29) == 'B') {
                throw new RuntimeException();
            }
            A09[5] = "eeNE7Qy6MuAlBYtV44JqSUiJf46fCooo";
            interrupt();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2622CG
    public final void AFW(long j2, long j3, float f2) {
        this.A03.A01 = j3;
        this.A03.A00 = f2;
        if (j2 != this.A00) {
            this.A00 = j2;
            HandlerC2609C2 handlerC2609C2 = this.A07;
            if (handlerC2609C2 != null) {
                handlerC2609C2.obtainMessage(10, (int) (j2 >> 32), (int) j2, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A06) {
                    this.A05.remove();
                } else {
                    int i2 = 0;
                    long j2 = -1;
                    while (!this.A08) {
                        try {
                            this.A05.A63(this);
                            break;
                        } catch (IOException e) {
                            if (!this.A08) {
                                long j3 = this.A03.A01;
                                int errorCount = A09[2].charAt(8);
                                if (errorCount != 71) {
                                    String[] strArr = A09;
                                    strArr[0] = "VpOvMV7lY4vr3Fu5UlYiKKcH9ACGqt7g";
                                    strArr[6] = "gAlRMyi1pPzVqBLwURYLCrt7UwpliGsz";
                                    if (j3 != j2) {
                                        j2 = j3;
                                        i2 = 0;
                                    }
                                    i2++;
                                    if (i2 <= this.A02) {
                                        Thread.sleep(A00(i2));
                                    } else {
                                        throw e;
                                    }
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                AbstractC3863WU.A00(th, this);
                if (A09[5].charAt(29) == 'B') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[0] = "35cAsSHzLcpGFjLAU34RIcGdZnNZcSm1";
                strArr2[6] = "9oN8QLA5AyCkKiMzUX6AKpAi6mTPSF3S";
                return;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.A01 = e2;
        }
        Handler internalHandler = this.A07;
        if (internalHandler != null) {
            internalHandler.obtainMessage(9, this).sendToTarget();
        }
    }
}
