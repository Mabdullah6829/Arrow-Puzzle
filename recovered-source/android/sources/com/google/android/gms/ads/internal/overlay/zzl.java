package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.zzbr;

/* JADX INFO: loaded from: classes.dex */
final class zzl extends com.google.android.gms.ads.internal.util.zzb {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzm f3343b;

    public /* synthetic */ zzl(zzm zzmVar) {
        this.f3343b = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    /* JADX INFO: renamed from: a */
    public final void mo3002a() {
        final BitmapDrawable bitmapDrawable;
        zzbr zzbrVar = com.google.android.gms.ads.internal.zzt.f3698C.f3723w;
        zzm zzmVar = this.f3343b;
        Bitmap bitmap = (Bitmap) zzbrVar.f3539a.get(Integer.valueOf(zzmVar.f3362u.f3293G.f3680x));
        if (bitmap != null) {
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.f3362u.f3293G;
            boolean z = zzlVar.f3678v;
            float f2 = zzlVar.f3679w;
            Activity activity = zzmVar.f3361t;
            if (!z || f2 <= 0.0f || f2 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f2);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                }
            }
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f3341s.f3343b.f3361t.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
