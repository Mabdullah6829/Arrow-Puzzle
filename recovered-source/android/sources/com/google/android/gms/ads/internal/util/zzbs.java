package com.google.android.gms.ads.internal.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzfkn;
import com.google.android.gms.internal.ads.zzgtf;
import com.google.android.gms.internal.ads.zzgug;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzbs {
    /* JADX INFO: renamed from: a */
    public static boolean m3129a(int i2) {
        zzbio zzbioVar = zzbix.f8695p4;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            return ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8712q4)).booleanValue() || i2 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0115  */
    /* JADX WARN: Code duplicated, block: B:35:0x0121  */
    /* JADX WARN: Code duplicated, block: B:41:0x0132  */
    /* JADX WARN: Code duplicated, block: B:43:0x013a  */
    /* JADX WARN: Code duplicated, block: B:44:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145 A[Catch: JSONException -> 0x0149, TRY_ENTER, TryCatch #3 {JSONException -> 0x0149, blocks: (B:32:0x0118, B:49:0x0145, B:52:0x014b, B:53:0x0150), top: B:79:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x014b A[Catch: JSONException -> 0x0149, TryCatch #3 {JSONException -> 0x0149, blocks: (B:32:0x0118, B:49:0x0145, B:52:0x014b, B:53:0x0150), top: B:79:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0150 A[Catch: JSONException -> 0x0149, TRY_LEAVE, TryCatch #3 {JSONException -> 0x0149, blocks: (B:32:0x0118, B:49:0x0145, B:52:0x014b, B:53:0x0150), top: B:79:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0175 A[Catch: Exception -> 0x018e, TRY_LEAVE, TryCatch #0 {Exception -> 0x018e, blocks: (B:58:0x016f, B:60:0x0175), top: B:72:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static JSONObject m3130b(Context context, View view) {
        int i2;
        ViewParent parent;
        String str;
        ViewGroup.LayoutParams layoutParams;
        int iHashCode;
        int i3;
        JSONObject jSONObjectM3138j;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            int i4 = 1;
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i2 = i4;
                    try {
                        iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                        iArr2[i2] = Math.min(viewGroup.getMeasuredHeight(), iArr2[i2]);
                        parent2 = parent2.getParent();
                        i4 = i2;
                    } catch (Exception unused) {
                        int i5 = zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                            try {
                                str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                            } catch (IllegalAccessException e) {
                                e = e;
                                int i6 = zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (NoSuchMethodException unused2) {
                                str = "";
                            } catch (SecurityException e2) {
                                e = e2;
                                int i7 = zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                int i8 = zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        iHashCode = str.hashCode();
                        if (iHashCode != -2066603854) {
                            if (iHashCode != 2019754500) {
                                i3 = -1;
                            } else {
                                i3 = i2;
                            }
                        } else if (str.equals("small_template")) {
                            i3 = 0;
                        } else {
                            i3 = -1;
                        }
                        if (i3 != 0) {
                            jSONObject.put("native_template_type", i2);
                        } else if (i3 != i2) {
                            jSONObject.put("native_template_type", 0);
                        } else {
                            jSONObject.put("native_template_type", 2);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8480c9)).booleanValue()) {
                            try {
                                layoutParams = view.getLayoutParams();
                                if (layoutParams != null) {
                                    jSONObject.put("view_width_layout_type", m3139k(layoutParams.width) - 1);
                                    jSONObject.put("view_height_layout_type", m3139k(layoutParams.height) - 1);
                                }
                            } catch (Exception unused3) {
                                zze.m3150k("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8548g9)).booleanValue()) {
                            try {
                                jSONObject.put("alpha", view.getAlpha());
                            } catch (JSONException e4) {
                                int i9 = zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Could not log container view alpha signal to JSON", e4);
                            }
                        }
                        return jSONObject;
                    }
                }
                i2 = i4;
                JSONObject jSONObject2 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
                com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzayVar.f3086a;
                com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzayVar.f3086a;
                jSONObject2.put("width", zzfVar.m3046i(context, measuredWidth));
                jSONObject2.put("height", zzfVar2.m3046i(context, view.getMeasuredHeight()));
                jSONObject2.put("x", zzfVar2.m3046i(context, iArr[0]));
                jSONObject2.put("y", zzfVar2.m3046i(context, iArr[i2]));
                jSONObject2.put("maximum_visible_width", zzfVar2.m3046i(context, iArr2[0]));
                jSONObject2.put("maximum_visible_height", zzfVar2.m3046i(context, iArr2[i2]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put(TypedValues.AttributesType.S_FRAME, jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectM3138j = m3138j(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", zzfVar2.m3046i(context, iArr[0]));
                    jSONObject3.put("y", zzfVar2.m3046i(context, iArr[i2]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectM3138j = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectM3138j);
            } catch (Exception unused4) {
                i2 = i4;
            }
            parent = view.getParent();
            if (parent != null) {
                str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
            } else {
                str = "";
            }
            try {
                iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode != 2019754500 && str.equals("medium_template")) {
                        i3 = i2;
                    } else {
                        i3 = -1;
                    }
                } else if (str.equals("small_template")) {
                    i3 = 0;
                } else {
                    i3 = -1;
                }
                if (i3 != 0) {
                    jSONObject.put("native_template_type", i2);
                } else if (i3 != i2) {
                    jSONObject.put("native_template_type", 0);
                } else {
                    jSONObject.put("native_template_type", 2);
                }
            } catch (JSONException e5) {
                int i10 = zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Could not log native template signal to JSON", e5);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8480c9)).booleanValue()) {
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    jSONObject.put("view_width_layout_type", m3139k(layoutParams.width) - 1);
                    jSONObject.put("view_height_layout_type", m3139k(layoutParams.height) - 1);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8548g9)).booleanValue()) {
                jSONObject.put("alpha", view.getAlpha());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m3131c(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                zzbio zzbioVar = zzbix.f8413Y8;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8429Z8)).booleanValue()) {
                        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                        jSONObject.put("contained_in_scroll_view", zzs.m3202a(view) != 0);
                    }
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8446a9)).booleanValue()) {
                        zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                        jSONObject.put("scroll_view_type", zzs.m3202a(view));
                        return jSONObject;
                    }
                } else {
                    zzs zzsVar3 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m3132d(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                jSONObject.put("can_show_on_lock_screen", zzs.m3194M(view));
                boolean z = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z);
                return jSONObject;
            } catch (JSONException unused) {
                int i2 = zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m3133e(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        int[] iArr;
        JSONObject jSONObject;
        ViewGroup.LayoutParams layoutParams;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i2 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i2];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
                            jSONObject4.put("width", zzayVar.f3086a.m3046i(context, measuredWidth));
                            jSONObject4.put("height", zzayVar.f3086a.m3046i(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", zzayVar.f3086a.m3046i(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", zzayVar.f3086a.m3046i(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", "ad_view");
                            jSONObject3.put(TypedValues.AttributesType.S_FRAME, jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = m3138j(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", zzayVar.f3086a.m3046i(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", zzayVar.f3086a.m3046i(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", "ad_view");
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                zzbio zzbioVar = zzbix.f8463b9;
                                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8480c9)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject3.put("view_width_layout_type", m3139k(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", m3139k(layoutParams.height) - 1);
                                }
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8531f9)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8548g9)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused) {
                            int i3 = zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unable to get asset views information");
                        }
                    } catch (JSONException unused2) {
                        iArr = iArr2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i2 = 2;
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m3134f(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i2 = point2.x;
                    com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
                    com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzayVar.f3086a;
                    com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzayVar.f3086a;
                    jSONObject3.put("x", zzfVar.m3046i(context, i2));
                    jSONObject3.put("y", zzfVar2.m3046i(context, point2.y));
                    jSONObject3.put("start_x", zzfVar2.m3046i(context, point.x));
                    jSONObject3.put("start_y", zzfVar2.m3046i(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    int i3 = zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                int i4 = zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3135g(Context context, zzfkn zzfknVar) {
        if (!zzfknVar.f15903N) {
            return false;
        }
        zzbio zzbioVar = zzbix.f8565h9;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            return ((Boolean) zzbivVar2.m5030a(zzbix.f8615k9)).booleanValue();
        }
        String str = (String) zzbivVar2.m5030a(zzbix.f8582i9);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        Iterator it = zzgug.m7143a(zzgtf.m7124c(';')).m7146d(str).iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m3136h(Context context) {
        JSONObject jSONObject = new JSONObject();
        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        zzf zzfVar = zzs.f3626l;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i2 = displayMetrics.widthPixels;
            com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
            jSONObject.put("width", zzayVar.f3086a.m3046i(context, i2));
            jSONObject.put("height", zzayVar.f3086a.m3046i(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowManager.LayoutParams m3137i() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8598j9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* JADX INFO: renamed from: j */
    public static JSONObject m3138j(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i2 = rect.right - rect.left;
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
        jSONObject.put("width", zzayVar.f3086a.m3046i(context, i2));
        int i3 = rect.bottom - rect.top;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzayVar.f3086a;
        jSONObject.put("height", zzfVar.m3046i(context, i3));
        jSONObject.put("x", zzfVar.m3046i(context, rect.left));
        jSONObject.put("y", zzfVar.m3046i(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX INFO: renamed from: k */
    public static int m3139k(int i2) {
        if (i2 != -2) {
            return i2 != -1 ? 2 : 3;
        }
        return 4;
    }
}
