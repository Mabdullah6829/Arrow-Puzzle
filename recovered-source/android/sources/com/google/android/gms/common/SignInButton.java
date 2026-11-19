package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.common.internal.zaad;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public int f4168s;

    /* JADX INFO: renamed from: t */
    public int f4169t;

    /* JADX INFO: renamed from: u */
    public View f4170u;

    /* JADX INFO: renamed from: v */
    public View.OnClickListener f4171v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    /* JADX INFO: renamed from: a */
    public final void m3409a(int i2, int i3) {
        this.f4168s = i2;
        this.f4169t = i3;
        Context context = getContext();
        View view = this.f4170u;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f4170u = zaac.m3593c(context, this.f4168s, this.f4169t);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i4 = this.f4168s;
            int i5 = this.f4169t;
            zaad zaadVar = new zaad(context, null, android.R.attr.buttonStyle);
            Resources resources = context.getResources();
            zaadVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaadVar.setTextSize(14.0f);
            int i6 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaadVar.setMinHeight(i6);
            zaadVar.setMinWidth(i6);
            int iM3594a = zaad.m3594a(i5, com.arrow.puzzle.escape.maze.free.game.R.drawable.common_google_signin_btn_icon_dark, com.arrow.puzzle.escape.maze.free.game.R.drawable.common_google_signin_btn_icon_light, com.arrow.puzzle.escape.maze.free.game.R.drawable.common_google_signin_btn_icon_light);
            int iM3594a2 = zaad.m3594a(i5, com.arrow.puzzle.escape.maze.free.game.R.drawable.common_google_signin_btn_text_dark, com.arrow.puzzle.escape.maze.free.game.R.drawable.common_google_signin_btn_text_light, com.arrow.puzzle.escape.maze.free.game.R.drawable.common_google_signin_btn_text_light);
            if (i4 == 0 || i4 == 1) {
                iM3594a = iM3594a2;
            } else if (i4 != 2) {
                StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(i4, 21));
                sb.append("Unknown button size: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
            Drawable drawableWrap = DrawableCompat.wrap(resources.getDrawable(iM3594a));
            DrawableCompat.setTintList(drawableWrap, resources.getColorStateList(com.arrow.puzzle.escape.maze.free.game.R.color.common_google_signin_btn_tint));
            DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_ATOP);
            zaadVar.setBackgroundDrawable(drawableWrap);
            ColorStateList colorStateList = resources.getColorStateList(zaad.m3594a(i5, com.arrow.puzzle.escape.maze.free.game.R.color.common_google_signin_btn_text_dark, com.arrow.puzzle.escape.maze.free.game.R.color.common_google_signin_btn_text_light, com.arrow.puzzle.escape.maze.free.game.R.color.common_google_signin_btn_text_light));
            Preconditions.m3544h(colorStateList);
            zaadVar.setTextColor(colorStateList);
            if (i4 == 0) {
                zaadVar.setText(resources.getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_signin_button_text));
            } else if (i4 == 1) {
                zaadVar.setText(resources.getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_signin_button_text_long));
            } else {
                if (i4 != 2) {
                    StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2434a(i4, 21));
                    sb2.append("Unknown button size: ");
                    sb2.append(i4);
                    throw new IllegalStateException(sb2.toString());
                }
                zaadVar.setText((CharSequence) null);
            }
            zaadVar.setTransformationMethod(null);
            if (DeviceProperties.m3644b(zaadVar.getContext())) {
                zaadVar.setGravity(19);
            }
            this.f4170u = zaadVar;
        }
        addView(this.f4170u);
        this.f4170u.setEnabled(isEnabled());
        this.f4170u.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f4171v;
        if (onClickListener == null || view != this.f4170u) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i2) {
        m3409a(this.f4168s, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f4170u.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4171v = onClickListener;
        View view = this.f4170u;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        m3409a(this.f4168s, this.f4169t);
    }

    public void setSize(int i2) {
        m3409a(i2, this.f4169t);
    }
}
