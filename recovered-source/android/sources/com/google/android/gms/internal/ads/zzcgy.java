package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgy extends zzcha implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: L */
    public static final HashMap f9983L;

    /* JADX INFO: renamed from: A */
    public MediaPlayer f9984A;

    /* JADX INFO: renamed from: B */
    public Uri f9985B;

    /* JADX INFO: renamed from: C */
    public int f9986C;

    /* JADX INFO: renamed from: D */
    public int f9987D;

    /* JADX INFO: renamed from: E */
    public int f9988E;

    /* JADX INFO: renamed from: F */
    public zzchs f9989F;

    /* JADX INFO: renamed from: G */
    public final boolean f9990G;

    /* JADX INFO: renamed from: H */
    public int f9991H;

    /* JADX INFO: renamed from: I */
    public zzchi f9992I;

    /* JADX INFO: renamed from: J */
    public boolean f9993J;

    /* JADX INFO: renamed from: K */
    public Integer f9994K;

    /* JADX INFO: renamed from: u */
    public final zzchu f9995u;

    /* JADX INFO: renamed from: v */
    public final zzchv f9996v;

    /* JADX INFO: renamed from: w */
    public final boolean f9997w;

    /* JADX INFO: renamed from: x */
    public final zzdzt f9998x;

    /* JADX INFO: renamed from: y */
    public int f9999y;

    /* JADX INFO: renamed from: z */
    public int f10000z;

    static {
        HashMap map = new HashMap();
        f9983L = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(Integer.valueOf(TypedValues.TransitionType.TYPE_FROM), "MEDIA_INFO_BUFFERING_START");
        map.put(Integer.valueOf(TypedValues.TransitionType.TYPE_TO), "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(Integer.valueOf(TypedValues.Custom.TYPE_FLOAT), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(Integer.valueOf(TypedValues.Custom.TYPE_COLOR), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcgy(Context context, zzchu zzchuVar, boolean z, boolean z2, zzchv zzchvVar, zzdzt zzdztVar) {
        super(context);
        this.f9999y = 0;
        this.f10000z = 0;
        this.f9993J = false;
        this.f9994K = null;
        this.f9995u = zzchuVar;
        this.f9996v = zzchvVar;
        this.f9990G = z;
        this.f9997w = z2;
        zzchvVar.m5480a(this);
        this.f9998x = zzdztVar;
    }

    /* JADX INFO: renamed from: D */
    public final void m5404D() {
        SurfaceTexture surfaceTexture;
        zzdzt zzdztVar;
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f9985B == null || surfaceTexture2 == null) {
            return;
        }
        m5405E(false);
        try {
            com.google.android.gms.ads.internal.overlay.zzae zzaeVar = com.google.android.gms.ads.internal.zzt.f3698C.f3721u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f9984A = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f9984A.setOnCompletionListener(this);
            this.f9984A.setOnErrorListener(this);
            this.f9984A.setOnInfoListener(this);
            this.f9984A.setOnPreparedListener(this);
            this.f9984A.setOnVideoSizeChangedListener(this);
            this.f9988E = 0;
            if (this.f9990G) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8187Ke)).booleanValue() && (zzdztVar = this.f9998x) != null) {
                    zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                    zzdzsVarM6111a.m6107b("action", "svp_ampv");
                    zzdzsVarM6111a.m6108c();
                }
                zzchs zzchsVar = new zzchs(getContext());
                this.f9989F = zzchsVar;
                int width = getWidth();
                int height = getHeight();
                zzchsVar.f10057E = width;
                zzchsVar.f10056D = height;
                zzchsVar.f10059G = surfaceTexture2;
                zzchs zzchsVar2 = this.f9989F;
                zzchsVar2.start();
                if (zzchsVar2.f10059G == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        zzchsVar2.f10064L.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = zzchsVar2.f10058F;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f9989F.m5462b();
                    this.f9989F = null;
                }
            }
            this.f9984A.setDataSource(getContext(), this.f9985B);
            this.f9984A.setSurface(new Surface(surfaceTexture2));
            this.f9984A.setAudioStreamType(3);
            this.f9984A.setScreenOnWhilePlaying(true);
            this.f9984A.prepareAsync();
            m5407G(1);
        } catch (IOException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f9985B)), e);
            onError(this.f9984A, 1, 0);
        } catch (IllegalArgumentException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f9985B)), e);
            onError(this.f9984A, 1, 0);
        } catch (IllegalStateException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f9985B)), e);
            onError(this.f9984A, 1, 0);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m5405E(boolean z) {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView release");
        zzchs zzchsVar = this.f9989F;
        if (zzchsVar != null) {
            zzchsVar.m5462b();
            this.f9989F = null;
        }
        MediaPlayer mediaPlayer = this.f9984A;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f9984A.release();
            this.f9984A = null;
            m5407G(0);
            if (z) {
                this.f10000z = 0;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m5406F() {
        int i2;
        return (this.f9984A == null || (i2 = this.f9999y) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public final void m5407G(int i2) {
        zzchy zzchyVar = this.f10006t;
        zzchv zzchvVar = this.f9996v;
        if (i2 == 3) {
            zzchvVar.m5483d();
            zzchyVar.f10117d = true;
            zzchyVar.m5485a();
        } else if (this.f9999y == 3) {
            zzchvVar.f10107m = false;
            zzchyVar.f10117d = false;
            zzchyVar.m5485a();
        }
        this.f9999y = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzchx
    /* JADX INFO: renamed from: f */
    public final void mo5408f() {
        zzchy zzchyVar = this.f10006t;
        float f2 = zzchyVar.f10116c ? zzchyVar.f10118e ? 0.0f : zzchyVar.f10119f : 0.0f;
        MediaPlayer mediaPlayer = this.f9984A;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: i */
    public final String mo5409i() {
        return "MediaPlayer".concat(true != this.f9990G ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: j */
    public final void mo5410j(zzchi zzchiVar) {
        this.f9992I = zzchiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: k */
    public final void mo5411k(String str) {
        Uri uri = Uri.parse(str);
        zzbhi zzbhiVarM4889w = zzbhi.m4889w(uri);
        if (zzbhiVarM4889w == null || zzbhiVarM4889w.f7855s != null) {
            if (zzbhiVarM4889w != null) {
                uri = Uri.parse(zzbhiVarM4889w.f7855s);
            }
            this.f9985B = uri;
            this.f9991H = 0;
            m5404D();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: l */
    public final void mo5412l() {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f9984A;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f9984A.release();
            this.f9984A = null;
            m5407G(0);
            this.f10000z = 0;
        }
        this.f9996v.m5481b();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: m */
    public final void mo5413m() {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView play");
        if (m5406F()) {
            this.f9984A.start();
            m5407G(3);
            this.f10005s.f10043c = true;
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcgv(this));
        }
        this.f10000z = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: n */
    public final void mo5414n() {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView pause");
        if (m5406F() && this.f9984A.isPlaying()) {
            this.f9984A.pause();
            m5407G(4);
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcgw(this));
        }
        this.f10000z = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: o */
    public final int mo5415o() {
        if (m5406F()) {
            return this.f9984A.getDuration();
        }
        return -1;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.f9988E = i2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView completion");
        m5407G(5);
        this.f10000z = 5;
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcgq(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = f9983L;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i3));
        String strM2451r = AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2451r);
        m5407G(-1);
        this.f10000z = -1;
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcgr(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = f9983L;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int defaultSize = View.getDefaultSize(this.f9986C, i2);
        int defaultSize2 = View.getDefaultSize(this.f9987D, i3);
        if (this.f9986C > 0 && this.f9987D > 0 && this.f9989F == null) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i7 = (this.f9987D * size) / this.f9986C;
                    if (mode2 == Integer.MIN_VALUE || i7 <= size2) {
                        defaultSize2 = i7;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i6 = (this.f9986C * size2) / this.f9987D;
                        if (mode != Integer.MIN_VALUE && i6 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i4 = this.f9986C;
                        i5 = this.f9987D;
                        if (mode2 == Integer.MIN_VALUE || i5 <= size2) {
                            i6 = i4;
                            size2 = i5;
                        } else {
                            i6 = (size2 * i4) / i5;
                        }
                        if (mode == Integer.MIN_VALUE && i6 > size) {
                            defaultSize2 = (i5 * size) / i4;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i6;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i8 = this.f9986C;
                int i9 = i8 * size2;
                int i10 = this.f9987D;
                int i11 = size * i10;
                if (i9 < i11) {
                    defaultSize = i9 / i10;
                } else {
                    if (i9 > i11) {
                        defaultSize2 = i11 / i8;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i7 = (this.f9987D * size) / this.f9986C;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i7;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i6 = (this.f9986C * size2) / this.f9987D;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i4 = this.f9986C;
                        i5 = this.f9987D;
                        if (mode2 == Integer.MIN_VALUE) {
                            i6 = i4;
                            size2 = i5;
                        } else {
                            i6 = i4;
                            size2 = i5;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i5 * size) / i4;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i6;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzchs zzchsVar = this.f9989F;
        if (zzchsVar != null) {
            zzchsVar.m5461a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView prepared");
        m5407G(2);
        zzchv zzchvVar = this.f9996v;
        if (zzchvVar.f10103i && !zzchvVar.f10104j) {
            zzbje.m5038a(zzchvVar.f10099e, zzchvVar.f10098d, "vfr2");
            zzchvVar.f10104j = true;
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcgp(this, mediaPlayer));
        this.f9986C = mediaPlayer.getVideoWidth();
        this.f9987D = mediaPlayer.getVideoHeight();
        int i2 = this.f9991H;
        if (i2 != 0) {
            mo5417q(i2);
        }
        if (this.f9997w && m5406F() && this.f9984A.getCurrentPosition() > 0 && this.f10000z != 3) {
            com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f9984A;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f9984A.start();
            int currentPosition = this.f9984A.getCurrentPosition();
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (m5406F() && this.f9984A.getCurrentPosition() == currentPosition) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.f9984A.pause();
            mo5408f();
        }
        int i3 = this.f9986C;
        int i4 = this.f9987D;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40 + String.valueOf(i4).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        com.google.android.gms.ads.internal.util.client.zzo.m3072e(sb.toString());
        if (this.f10000z == 3) {
            mo5413m();
        }
        mo5408f();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView surface created");
        m5404D();
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcgs(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f9984A;
        if (mediaPlayer != null && this.f9991H == 0) {
            this.f9991H = mediaPlayer.getCurrentPosition();
        }
        zzchs zzchsVar = this.f9989F;
        if (zzchsVar != null) {
            zzchsVar.m5462b();
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcgu(this));
        m5405E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdMediaPlayerView surface changed");
        int i4 = this.f10000z;
        boolean z = false;
        if (this.f9986C == i2 && this.f9987D == i3) {
            z = true;
        }
        if (this.f9984A != null && i4 == 3 && z) {
            int i5 = this.f9991H;
            if (i5 != 0) {
                mo5417q(i5);
            }
            mo5413m();
        }
        zzchs zzchsVar = this.f9989F;
        if (zzchsVar != null) {
            zzchsVar.m5461a(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcgt(this, i2, i3));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f9996v.m5482c(this);
        this.f10005s.m5452a(surfaceTexture, this.f9992I);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 35 + String.valueOf(i3).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        this.f9986C = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f9987D = videoHeight;
        if (this.f9986C == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f9981s.f9992I;
                if (zzchiVar != null) {
                    zzchiVar.onWindowVisibilityChanged(i2);
                }
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: p */
    public final int mo5416p() {
        if (m5406F()) {
            return this.f9984A.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: q */
    public final void mo5417q(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        if (!m5406F()) {
            this.f9991H = i2;
        } else {
            this.f9984A.seekTo(i2);
            this.f9991H = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: r */
    public final void mo5418r(float f2, float f3) {
        zzchs zzchsVar = this.f9989F;
        if (zzchsVar != null) {
            zzchsVar.m5463c(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: s */
    public final int mo5419s() {
        MediaPlayer mediaPlayer = this.f9984A;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: t */
    public final int mo5420t() {
        MediaPlayer mediaPlayer = this.f9984A;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcgy.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return AbstractC1456a.m2450q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: u */
    public final long mo5421u() {
        if (this.f9994K != null) {
            return (mo5423w() * ((long) this.f9988E)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: v */
    public final long mo5422v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: w */
    public final long mo5423w() {
        if (this.f9994K != null) {
            return ((long) mo5415o()) * ((long) this.f9994K.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: x */
    public final int mo5424x() {
        if (Build.VERSION.SDK_INT < 26 || !m5406F()) {
            return -1;
        }
        return this.f9984A.getMetrics().getInt("android.media.mediaplayer.dropped");
    }
}
