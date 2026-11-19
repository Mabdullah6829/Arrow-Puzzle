package com.google.android.material.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.C5183R;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialSplitButton extends MaterialButtonGroup {
    private static final int DEF_STYLE_RES = C5183R.style.Widget_Material3_MaterialSplitButton;
    private static final int REQUIRED_BUTTON_COUNT = 2;

    public MaterialSplitButton(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addView$0(MaterialButton materialButton, MaterialButton materialButton2, boolean z) {
        ViewCompat.setStateDescription(materialButton, getResources().getString(z ? C5183R.string.mtrl_button_expanded_content_description : C5183R.string.mtrl_button_collapsed_content_description));
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(@NonNull View view, int i2, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        final MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i2, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            ViewCompat.setStateDescription(materialButton, getResources().getString(materialButton.isChecked() ? C5183R.string.mtrl_button_expanded_content_description : C5183R.string.mtrl_button_collapsed_content_description));
            materialButton.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() { // from class: com.google.android.material.button.e
                @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
                public final void onCheckedChanged(MaterialButton materialButton2, boolean z) {
                    this.f23375a.lambda$addView$0(materialButton, materialButton2, z);
                }
            });
        }
    }

    public MaterialSplitButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.materialSplitButtonStyle);
    }

    public MaterialSplitButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, DEF_STYLE_RES), attributeSet, i2);
    }
}
