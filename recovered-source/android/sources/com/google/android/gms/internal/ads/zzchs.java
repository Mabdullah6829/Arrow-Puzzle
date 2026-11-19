package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import androidx.work.Data;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchs extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzchq {

    /* JADX INFO: renamed from: T */
    public static final float[] f10052T = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: A */
    public float f10053A;

    /* JADX INFO: renamed from: B */
    public float f10054B;

    /* JADX INFO: renamed from: C */
    public float f10055C;

    /* JADX INFO: renamed from: D */
    public int f10056D;

    /* JADX INFO: renamed from: E */
    public int f10057E;

    /* JADX INFO: renamed from: F */
    public SurfaceTexture f10058F;

    /* JADX INFO: renamed from: G */
    public SurfaceTexture f10059G;

    /* JADX INFO: renamed from: H */
    public int f10060H;

    /* JADX INFO: renamed from: I */
    public int f10061I;

    /* JADX INFO: renamed from: J */
    public int f10062J;

    /* JADX INFO: renamed from: K */
    public final FloatBuffer f10063K;

    /* JADX INFO: renamed from: L */
    public final CountDownLatch f10064L;

    /* JADX INFO: renamed from: M */
    public final Object f10065M;

    /* JADX INFO: renamed from: N */
    public EGL10 f10066N;

    /* JADX INFO: renamed from: O */
    public EGLDisplay f10067O;

    /* JADX INFO: renamed from: P */
    public EGLContext f10068P;

    /* JADX INFO: renamed from: Q */
    public EGLSurface f10069Q;

    /* JADX INFO: renamed from: R */
    public volatile boolean f10070R;

    /* JADX INFO: renamed from: S */
    public volatile boolean f10071S;

    /* JADX INFO: renamed from: s */
    public final zzchr f10072s;

    /* JADX INFO: renamed from: t */
    public final float[] f10073t;

    /* JADX INFO: renamed from: u */
    public final float[] f10074u;

    /* JADX INFO: renamed from: v */
    public final float[] f10075v;

    /* JADX INFO: renamed from: w */
    public final float[] f10076w;

    /* JADX INFO: renamed from: x */
    public final float[] f10077x;

    /* JADX INFO: renamed from: y */
    public final float[] f10078y;

    /* JADX INFO: renamed from: z */
    public final float[] f10079z;

    public zzchs(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f10063K = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(f10052T).position(0);
        this.f10073t = new float[9];
        this.f10074u = new float[9];
        this.f10075v = new float[9];
        this.f10076w = new float[9];
        this.f10077x = new float[9];
        this.f10078y = new float[9];
        this.f10079z = new float[9];
        this.f10053A = Float.NaN;
        zzchr zzchrVar = new zzchr(context);
        this.f10072s = zzchrVar;
        zzchrVar.f10051h = this;
        this.f10064L = new CountDownLatch(1);
        this.f10065M = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static final void m5456e(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + String.valueOf(iGlGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m5457f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f2 = fArr2[0] * fArr3[0];
        float f3 = fArr2[1];
        float f4 = fArr3[3];
        float f5 = fArr2[2];
        float f6 = fArr3[6];
        fArr[0] = f2 + (f3 * f4) + (f5 * f6);
        float f7 = fArr2[0];
        float f8 = fArr3[1] * f7;
        float f9 = fArr3[4];
        float f10 = fArr3[7];
        fArr[1] = f8 + (f3 * f9) + (f5 * f10);
        float f11 = f7 * fArr3[2];
        float f12 = fArr2[1];
        float f13 = fArr3[5];
        float f14 = fArr3[8];
        fArr[2] = f11 + (f12 * f13) + (f5 * f14);
        float f15 = fArr2[3];
        float f16 = fArr3[0];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        fArr[3] = (f15 * f16) + (f4 * f17) + (f18 * f6);
        float f19 = fArr2[3];
        float f20 = fArr3[1];
        fArr[4] = (f19 * f20) + (f17 * f9) + (f18 * f10);
        float f21 = fArr3[2];
        fArr[5] = (f19 * f21) + (fArr2[4] * f13) + (f18 * f14);
        float f22 = fArr2[6] * f16;
        float f23 = fArr2[7];
        float f24 = fArr3[3] * f23;
        float f25 = fArr2[8];
        fArr[6] = f22 + f24 + (f6 * f25);
        float f26 = fArr2[6];
        float f27 = f10 * f25;
        fArr[7] = f27 + (f23 * fArr3[4]) + (f20 * f26);
        fArr[8] = (f26 * f21) + (fArr2[7] * fArr3[5]) + (f25 * f14);
    }

    /* JADX INFO: renamed from: g */
    public static final void m5458g(float f2, float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f2;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* JADX INFO: renamed from: h */
    public static final void m5459h(float f2, float[] fArr) {
        double d = f2;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* JADX INFO: renamed from: i */
    public static final int m5460i(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        m5456e("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            m5456e("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            m5456e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            m5456e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i2);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                m5456e("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    /* JADX INFO: renamed from: a */
    public final void m5461a(int i2, int i3) {
        Object obj = this.f10065M;
        synchronized (obj) {
            this.f10057E = i2;
            this.f10056D = i3;
            this.f10070R = true;
            obj.notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5462b() {
        Object obj = this.f10065M;
        synchronized (obj) {
            this.f10071S = true;
            this.f10059G = null;
            obj.notifyAll();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5463c(float f2, float f3) {
        int i2 = this.f10057E;
        int i3 = this.f10056D;
        if (i2 <= i3) {
            i2 = i3;
        }
        float f4 = i2;
        this.f10054B -= (f2 * 1.7453293f) / f4;
        float f5 = this.f10055C - ((f3 * 1.7453293f) / f4);
        this.f10055C = f5;
        if (f5 < -1.5707964f) {
            this.f10055C = -1.5707964f;
            f5 = -1.5707964f;
        }
        if (f5 > 1.5707964f) {
            this.f10055C = 1.5707964f;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5464d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f10069Q;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f10066N.eglMakeCurrent(this.f10067O, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f10066N.eglDestroySurface(this.f10067O, this.f10069Q);
            this.f10069Q = null;
        }
        EGLContext eGLContext = this.f10068P;
        if (eGLContext != null) {
            this.f10066N.eglDestroyContext(this.f10067O, eGLContext);
            this.f10068P = null;
        }
        EGLDisplay eGLDisplay = this.f10067O;
        if (eGLDisplay != null) {
            this.f10066N.eglTerminate(eGLDisplay);
            this.f10067O = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f10062J++;
        Object obj = this.f10065M;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.f10059G == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("SphericalVideoProcessor started with no output texture.");
            this.f10064L.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f10066N = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f10067O = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f10066N.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.f10066N.eglChooseConfig(this.f10067O, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                z = false;
            } else {
                EGL10 egl11 = this.f10066N;
                EGLDisplay eGLDisplay = this.f10067O;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.f10068P = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                    z = false;
                } else {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.f10066N.eglCreateWindowSurface(this.f10067O, eGLConfig, this.f10059G, null);
                    this.f10069Q = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.f10066N.eglMakeCurrent(this.f10067O, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.f10068P)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        zzbio zzbioVar = zzbix.f8293R1;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        int iM5460i = m5460i(35633, !((String) zzbaVar.f3098c.m5030a(zzbioVar)).equals(zzbioVar.m5021e()) ? (String) zzbaVar.f3098c.m5030a(zzbioVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iM5460i == 0) {
            iGlCreateProgram = 0;
        } else {
            zzbio zzbioVar2 = zzbix.f8310S1;
            int iM5460i2 = m5460i(35632, !((String) zzbaVar.f3098c.m5030a(zzbioVar2)).equals(zzbioVar2.m5021e()) ? (String) zzbaVar.f3098c.m5030a(zzbioVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iM5460i2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                m5456e("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iM5460i);
                    m5456e("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iM5460i2);
                    m5456e("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    m5456e("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    m5456e("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        m5456e("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        m5456e("validateProgram");
                    }
                }
            }
        }
        this.f10060H = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        m5456e("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f10060H, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f10063K);
        m5456e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        m5456e("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        m5456e("genTextures");
        int i3 = iArr3[0];
        GLES20.glBindTexture(36197, i3);
        m5456e("bindTextures");
        GLES20.glTexParameteri(36197, Data.MAX_DATA_BYTES, 9729);
        m5456e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m5456e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m5456e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m5456e("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f10060H, "uVMat");
        this.f10061I = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i4 = this.f10060H;
        if (!z || i4 == 0) {
            String strValueOf = String.valueOf(GLUtils.getEGLErrorString(this.f10066N.eglGetError()));
            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
            String strConcat = "EGL initialization failed: ".concat(strValueOf);
            com.google.android.gms.ads.internal.util.client.zzo.m3070c(strConcat);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SphericalVideoProcessor.run.1", new Throwable(strConcat));
            m5464d();
            this.f10064L.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i3);
        this.f10058F = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f10064L.countDown();
        zzchr zzchrVar = this.f10072s;
        if (zzchrVar.f10050g == null) {
            SensorManager sensorManager = zzchrVar.f10044a;
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            if (defaultSensor == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("No Sensor of TYPE_ROTATION_VECTOR");
            } else {
                HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                handlerThread.start();
                zzgax zzgaxVar = new zzgax(handlerThread.getLooper());
                zzchrVar.f10050g = zzgaxVar;
                if (!sensorManager.registerListener(zzchrVar, defaultSensor, 0, zzgaxVar)) {
                    int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c("SensorManager.registerListener failed.");
                    zzchrVar.m5454b();
                }
            }
        }
        try {
            try {
                try {
                    this.f10070R = true;
                    while (!this.f10071S) {
                        while (this.f10062J > 0) {
                            this.f10058F.updateTexImage();
                            this.f10062J--;
                        }
                        float[] fArr = this.f10073t;
                        if (zzchrVar.m5455c(fArr)) {
                            if (Float.isNaN(this.f10053A)) {
                                float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                float f2 = fArr[0];
                                float f3 = fArr2[0];
                                float f4 = fArr[1];
                                float f5 = fArr2[1];
                                float[] fArr3 = {(fArr[2] * 0.0f) + (f4 * f5) + (f2 * f3), (fArr[5] * 0.0f) + (fArr[4] * f5) + (fArr[3] * f3), (fArr[8] * 0.0f) + (fArr[7] * f5) + (fArr[6] * f3)};
                                this.f10053A = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                            }
                            m5459h(this.f10053A + this.f10054B, this.f10078y);
                        } else {
                            m5458g(-1.5707964f, fArr);
                            m5459h(this.f10054B, this.f10078y);
                        }
                        float[] fArr4 = this.f10074u;
                        m5458g(1.5707964f, fArr4);
                        float[] fArr5 = this.f10075v;
                        m5457f(fArr5, this.f10078y, fArr4);
                        float[] fArr6 = this.f10076w;
                        m5457f(fArr6, fArr, fArr5);
                        float[] fArr7 = this.f10077x;
                        m5458g(this.f10055C, fArr7);
                        float[] fArr8 = this.f10079z;
                        m5457f(fArr8, fArr7, fArr6);
                        GLES20.glUniformMatrix3fv(this.f10061I, 1, false, fArr8, 0);
                        GLES20.glDrawArrays(5, 0, 4);
                        m5456e("drawArrays");
                        GLES20.glFinish();
                        this.f10066N.eglSwapBuffers(this.f10067O, this.f10069Q);
                        if (this.f10070R) {
                            GLES20.glViewport(0, 0, this.f10057E, this.f10056D);
                            m5456e("viewport");
                            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f10060H, "uFOVx");
                            int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.f10060H, "uFOVy");
                            int i8 = this.f10057E;
                            int i9 = this.f10056D;
                            if (i8 > i9) {
                                GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                                GLES20.glUniform1f(iGlGetUniformLocation3, (this.f10056D * 0.87266463f) / this.f10057E);
                            } else {
                                GLES20.glUniform1f(iGlGetUniformLocation2, (i8 * 0.87266463f) / i9);
                                GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                            }
                            this.f10070R = false;
                        }
                        try {
                            Object obj = this.f10065M;
                            synchronized (obj) {
                                try {
                                    if (!this.f10071S && !this.f10070R && this.f10062J == 0) {
                                        obj.wait();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (IllegalStateException unused2) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("SphericalVideoProcessor halted unexpectedly.");
                }
            } catch (Throwable th2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("SphericalVideoProcessor died.", th2);
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SphericalVideoProcessor.run.2", th2);
            }
            this.f10072s.m5454b();
            this.f10058F.setOnFrameAvailableListener(null);
            this.f10058F = null;
            m5464d();
        } catch (Throwable th3) {
            this.f10072s.m5454b();
            this.f10058F.setOnFrameAvailableListener(null);
            this.f10058F = null;
            m5464d();
            throw th3;
        }
    }
}
