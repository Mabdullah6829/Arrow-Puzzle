package com.instagram.common.viewpoint.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.om */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SurfaceHolderCallbackC4971om implements InterfaceC2878GQ, InterfaceC24278p, InterfaceC2757ES, InterfaceC2586Bf, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"mdkndyL3N", "34XFwDl9WvKoMHQUixXhMeiNQCyC6vNP", "5uafIaN5", "lxzaK8fg5Pf0nzPouXyzPKk1aT8cB3T1", "DTIJ", "0UAV", "B5vkeIjqEzHsmqRbylQSobdgrKqNmXUo", "pkzfV8UoB1KOSL3E8gfET47OMeTC19My"};
    public final /* synthetic */ C2493AA A00;

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final /* synthetic */ void AD4(C5064qI c5064qI, C22746L c22746l) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final /* synthetic */ void AD5(long j2) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final /* synthetic */ void AD6(Exception exc) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final /* synthetic */ void ADU(int i2, long j2) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final /* synthetic */ void AFy(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final /* synthetic */ void AGV(C5064qI c5064qI, C22746L c22746l) {
    }

    public SurfaceHolderCallbackC4971om(C2493AA c2493aa) {
        this.A00 = c2493aa;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final void AD0(String str, long j2, long j3) {
        Iterator it = this.A00.A0H.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "1hpUDXdDopjYnxDN8fIPsNGSxN8OzRvU";
            if (zHasNext) {
                ((InterfaceC24278p) it.next()).AD0(str, j2, j3);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final void AD1(C22716I c22716i) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC24278p) it.next()).AD1(c22716i);
        }
        this.A00.A07 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final void AD2(C22716I c22716i) {
        this.A00.A09 = c22716i;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC24278p) it.next()).AD2(c22716i);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final void AD3(C5064qI c5064qI) {
        this.A00.A07 = c5064qI;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC24278p) it.next()).AD3(c5064qI);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24278p
    public final void AD9(int i2, long j2, long j3) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC24278p) it.next()).AD9(i2, j2, j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2757ES
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ADZ(C5012pR c5012pR) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC20983U) it.next()).ADZ(c5012pR);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2757ES
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ADa(List<C5014pT> list) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC20983U) it.next()).ADa(list);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final void ADl(int i2, long j2) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC2878GQ) it.next()).ADl(i2, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2586Bf
    public final void AEt(Metadata metadata, long j2) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((InterfaceC2586Bf) it.next()).AEt(metadata, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final void AFf(Object obj, long j2) {
        if (this.A00.A03 == obj) {
            Iterator it = this.A00.A0L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2878GQ) it2.next()).AFf(obj, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final void AGN(String str, long j2, long j3) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC2878GQ) it.next()).AGN(str, j2, j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final void AGO(C22716I c22716i) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC2878GQ) it.next()).AGO(c22716i);
        }
        this.A00.A08 = null;
        this.A00.A0A = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final void AGP(C22716I c22716i) {
        this.A00.A0A = c22716i;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "MKCckBbCZrSSu6G06Z7NkbaNocq2WvpN";
            strArr[6] = "V8qjKHPFdvtphjyj0wrcUTYdTARdRgua";
            if (zHasNext) {
                ((InterfaceC2878GQ) it.next()).AGP(c22716i);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final void AGU(C5064qI c5064qI) {
        this.A00.A08 = c5064qI;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "2z1T7IcDfmpzuxqypnwVKmOXmU8bKGPo";
            if (zHasNext) {
                ((InterfaceC2878GQ) it.next()).AGU(c5064qI);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2878GQ
    public final void AGb(C5017pW c5017pW) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC22125L) it.next()).AGa(c5017pW.A03, c5017pW.A01, c5017pW.A02, c5017pW.A00);
        }
        for (InterfaceC2878GQ interfaceC2878GQ : this.A00.A0K) {
            String[] strArr = A01;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[1] = "q7eFcMKXm9CoB0iVpo1HKrbod3G9GfaY";
            interfaceC2878GQ.AGb(c5017pW);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.A00.A0F(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
