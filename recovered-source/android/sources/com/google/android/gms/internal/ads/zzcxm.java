package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcxm extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: s */
    public final Context f11681s;

    /* JADX INFO: renamed from: t */
    public View f11682t;

    public zzcxm(Context context) {
        super(context);
        this.f11681s = context;
    }

    /* JADX INFO: renamed from: a */
    public static zzcxm m5861a(Context context, View view, zzfkn zzfknVar) {
        ViewTreeObserver viewTreeObserver;
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxm zzcxmVar = new zzcxm(context);
        List list = zzfknVar.f15956u;
        boolean zIsEmpty = list.isEmpty();
        Context context2 = zzcxmVar.f11681s;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfko zzfkoVar = (zzfko) list.get(0);
            float f2 = zzfkoVar.f15968a;
            float f3 = displayMetrics.density;
            zzcxmVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f2 * f3), (int) (zzfkoVar.f15969b * f3)));
        }
        zzcxmVar.f11682t = view;
        zzcxmVar.addView(view);
        zzcgl zzcglVar = com.google.android.gms.ads.internal.zzt.f3698C.f3700B;
        zzcgn zzcgnVar = new zzcgn(zzcxmVar, zzcxmVar);
        View view2 = (View) zzcgnVar.f9967s.get();
        ViewTreeObserver viewTreeObserver2 = null;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            zzcgnVar.m5403a(viewTreeObserver2);
        }
        zzcgl.m5402a(zzcxmVar, zzcxmVar);
        JSONObject jSONObject = zzfknVar.f15931h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcxmVar.m5862b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcxmVar.m5862b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcxmVar.addView(relativeLayout);
        return zzcxmVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m5862b(JSONObject jSONObject, RelativeLayout relativeLayout, int i2) {
        Context context = this.f11681s;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzayVar.f3086a;
        int iM3033b = com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, (int) dOptDouble);
        textView.setPadding(0, iM3033b, 0, iM3033b);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzayVar.f3086a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, (int) dOptDouble2));
        layoutParams.addRule(i2);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f11682t.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f11682t.setY(-iArr[1]);
    }
}
