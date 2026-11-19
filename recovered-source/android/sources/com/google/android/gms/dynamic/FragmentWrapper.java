package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: s */
    public final Fragment f4712s;

    public FragmentWrapper(Fragment fragment) {
        this.f4712s = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: L3 */
    public final void mo3677L3(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m3697u0(iObjectWrapper);
        Preconditions.m3544h(view);
        this.f4712s.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: S */
    public final void mo3678S(boolean z) {
        this.f4712s.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: T */
    public final void mo3679T(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m3697u0(iObjectWrapper);
        Preconditions.m3544h(view);
        this.f4712s.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: T3 */
    public final void mo3680T3(boolean z) {
        this.f4712s.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: V */
    public final void mo3681V(boolean z) {
        this.f4712s.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: V1 */
    public final void mo3682V1(Intent intent, int i2) {
        this.f4712s.startActivityForResult(intent, i2);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: a */
    public final IFragmentWrapper mo3683a() {
        Fragment parentFragment = this.f4712s.getParentFragment();
        if (parentFragment != null) {
            return new FragmentWrapper(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: a1 */
    public final void mo3684a1(boolean z) {
        this.f4712s.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: b */
    public final ObjectWrapper mo3685b() {
        return new ObjectWrapper(this.f4712s.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: c */
    public final boolean mo3686c() {
        return this.f4712s.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: d */
    public final int mo3687d() {
        return this.f4712s.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: e */
    public final boolean mo3688e() {
        return this.f4712s.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: f */
    public final boolean mo3689f() {
        return this.f4712s.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: g */
    public final boolean mo3690g() {
        return this.f4712s.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: h */
    public final boolean mo3691h() {
        return this.f4712s.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: i */
    public final boolean mo3692i() {
        return this.f4712s.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: j */
    public final boolean mo3693j() {
        return this.f4712s.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: j3 */
    public final void mo3694j3(Intent intent) {
        this.f4712s.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* JADX INFO: renamed from: n */
    public final boolean mo3695n() {
        return this.f4712s.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzb() {
        return new ObjectWrapper(this.f4712s.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzc() {
        return this.f4712s.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzh() {
        return this.f4712s.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzi() {
        Fragment targetFragment = this.f4712s.getTargetFragment();
        if (targetFragment != null) {
            return new FragmentWrapper(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzj() {
        return this.f4712s.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzk() {
        return this.f4712s.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzl() {
        return new ObjectWrapper(this.f4712s.getView());
    }
}
