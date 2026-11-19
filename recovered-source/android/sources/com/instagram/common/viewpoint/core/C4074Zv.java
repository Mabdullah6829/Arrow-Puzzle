package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4074Zv extends LinearLayout {
    public static final int A03 = (int) (AbstractC3926XX.A02 * 40.0f);
    public static final int A04 = (int) (AbstractC3926XX.A02 * 20.0f);
    public static final int A05 = (int) (AbstractC3926XX.A02 * 10.0f);
    public final C3392Ok A00;
    public final C4494gi A01;
    public final InterfaceC4058Zf A02;

    public C4074Zv(C4494gi c4494gi, C3392Ok c3392Ok, InterfaceC4058Zf interfaceC4058Zf, EnumC3977YM enumC3977YM) {
        this(c4494gi, c3392Ok, interfaceC4058Zf, null, enumC3977YM);
    }

    public C4074Zv(C4494gi c4494gi, C3392Ok c3392Ok, InterfaceC4058Zf interfaceC4058Zf, String str, EnumC3977YM enumC3977YM) {
        super(c4494gi);
        this.A01 = c4494gi;
        this.A00 = c3392Ok;
        this.A02 = interfaceC4058Zf;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            AbstractC3966YB.A0N(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View viewA00 = A00(enumC3977YM, this.A00.A03());
            viewA00.setPadding(0, A05, 0, A05);
            addView(viewA00, layoutParams);
        }
        C4080a1 c4080a1A03 = A03();
        c4080a1A03.setPadding(0, A05, 0, 0);
        addView(c4080a1A03, layoutParams);
    }

    private View A00(EnumC3977YM enumC3977YM, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(AbstractC3978YN.A01(enumC3977YM));
        TextView textView = new TextView(getContext());
        AbstractC3966YB.A0a(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(AbstractC3978YN.A01(EnumC3977YM.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new ViewOnClickListenerC4072Zt(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        AbstractC3966YB.A0a(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C4080a1 A03() {
        C4080a1 c4080a1 = new C4080a1(this.A01);
        for (C3392Ok c3392Ok : this.A00.A05()) {
            C4060Zh c4060Zh = new C4060Zh(this.A01);
            c4060Zh.setData(c3392Ok.A04(), null);
            c4060Zh.setOnClickListener(new ViewOnClickListenerC4073Zu(this, c4060Zh, c3392Ok));
            c4080a1.addView(c4060Zh);
        }
        return c4080a1;
    }
}
