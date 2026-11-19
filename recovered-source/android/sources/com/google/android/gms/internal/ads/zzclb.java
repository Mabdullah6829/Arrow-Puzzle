package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface zzclb extends com.google.android.gms.ads.internal.client.zza, zzdlg, zzcks, zzbst, zzcmi, zzcmn, zzbtf, zzbex, zzcmr, com.google.android.gms.ads.internal.zzn, zzcmu, zzcmv, zzchu, zzcmw {
    /* JADX INFO: renamed from: A */
    boolean mo5568A();

    /* JADX INFO: renamed from: A0 */
    void mo5569A0(boolean z);

    @Override // com.google.android.gms.internal.ads.zzcks
    /* JADX INFO: renamed from: B */
    zzfkn mo5565B();

    /* JADX INFO: renamed from: B0 */
    void mo5570B0(String str, Predicate predicate);

    /* JADX INFO: renamed from: C0 */
    void mo5571C0();

    /* JADX INFO: renamed from: D */
    void mo5572D();

    /* JADX INFO: renamed from: D0 */
    void mo5573D0();

    /* JADX INFO: renamed from: E */
    void mo5574E();

    /* JADX INFO: renamed from: E0 */
    void mo5575E0(boolean z);

    /* JADX INFO: renamed from: F */
    boolean mo5576F();

    @Override // com.google.android.gms.internal.ads.zzcmw
    /* JADX INFO: renamed from: H */
    View mo5577H();

    /* JADX INFO: renamed from: H0 */
    void mo5578H0(boolean z);

    /* JADX INFO: renamed from: I */
    void mo5579I();

    /* JADX INFO: renamed from: I0 */
    void mo5580I0(zzbly zzblyVar);

    /* JADX INFO: renamed from: J */
    Context mo5581J();

    /* JADX INFO: renamed from: K */
    zzclm mo5582K();

    /* JADX INFO: renamed from: M */
    String mo5583M();

    /* JADX INFO: renamed from: N */
    zzflk mo5584N();

    /* JADX INFO: renamed from: O */
    com.google.android.gms.ads.internal.overlay.zzm mo5585O();

    /* JADX INFO: renamed from: P */
    zzelv mo5586P();

    @Override // com.google.android.gms.internal.ads.zzcmi
    /* JADX INFO: renamed from: Q */
    zzfkq mo5587Q();

    /* JADX INFO: renamed from: R */
    void mo5588R();

    /* JADX INFO: renamed from: S */
    com.google.android.gms.ads.internal.overlay.zzm mo5589S();

    /* JADX INFO: renamed from: T */
    boolean mo5590T();

    /* JADX INFO: renamed from: V */
    void mo5591V();

    /* JADX INFO: renamed from: W */
    boolean mo5592W();

    /* JADX INFO: renamed from: Z */
    zzbly mo5593Z();

    /* JADX INFO: renamed from: a0 */
    void mo5594a0(zzduh zzduhVar);

    /* JADX INFO: renamed from: b0 */
    void mo5595b0(zzelt zzeltVar);

    /* JADX INFO: renamed from: c0 */
    void mo5596c0(int i2);

    boolean canGoBack();

    /* JADX INFO: renamed from: d0 */
    void mo5597d0(zzbgk zzbgkVar);

    void destroy();

    /* JADX INFO: renamed from: e0 */
    void mo5598e0();

    /* JADX INFO: renamed from: f */
    zzbjk mo5599f();

    /* JADX INFO: renamed from: f0 */
    zzbgk mo5600f0();

    /* JADX INFO: renamed from: g0 */
    void mo5601g0(zzelv zzelvVar);

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzchu
    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    @Override // com.google.android.gms.internal.ads.zzcmv, com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: h */
    VersionInfoParcel mo5472h();

    /* JADX INFO: renamed from: h0 */
    void mo5602h0(zzcnl zzcnlVar);

    /* JADX INFO: renamed from: i0 */
    ListenableFuture mo5603i0();

    boolean isAttachedToWindow();

    /* JADX INFO: renamed from: j0 */
    void mo5604j0(boolean z);

    /* JADX INFO: renamed from: k0 */
    void mo5605k0(int i2, boolean z);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* JADX INFO: renamed from: m0 */
    void mo5606m0(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    /* JADX INFO: renamed from: o */
    zzelt mo5607o();

    /* JADX INFO: renamed from: o0 */
    void mo5608o0(String str, String str2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcmt
    /* JADX INFO: renamed from: p */
    zzcnl mo5609p();

    /* JADX INFO: renamed from: p0 */
    void mo5610p0(Context context);

    @Override // com.google.android.gms.internal.ads.zzcmu
    /* JADX INFO: renamed from: q */
    zzbaw mo5611q();

    /* JADX INFO: renamed from: q0 */
    void mo5612q0(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    /* JADX INFO: renamed from: r0 */
    void mo5613r0(String str, zzbpx zzbpxVar);

    /* JADX INFO: renamed from: s0 */
    boolean mo5614s0();

    @Override // com.google.android.gms.internal.ads.zzchu
    void setBackgroundColor(int i2);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* JADX INFO: renamed from: t0 */
    void mo5615t0(boolean z);

    /* JADX INFO: renamed from: v0 */
    void mo5616v0(String str, zzbpx zzbpxVar);

    /* JADX INFO: renamed from: w */
    ArrayList mo5617w();

    /* JADX INFO: renamed from: w0 */
    void mo5618w0(zzfkn zzfknVar, zzfkq zzfkqVar);

    /* JADX INFO: renamed from: x0 */
    void mo5619x0(int i2);

    /* JADX INFO: renamed from: y */
    WebView mo5620y();

    /* JADX INFO: renamed from: y0 */
    boolean mo5621y0();

    /* JADX INFO: renamed from: z0 */
    boolean mo5622z0(int i2, boolean z);

    @Override // com.google.android.gms.internal.ads.zzchu
    zzcmh zzh();

    @Override // com.google.android.gms.internal.ads.zzchu
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzchu
    com.google.android.gms.ads.internal.zza zzk();
}
