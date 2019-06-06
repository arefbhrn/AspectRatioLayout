package com.arefbhrn.aspectratiolayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Written by "Aref Bahreini Nejad"
 * Version: 1.0.1
 * Date: 06/10/2018
 */

public class AspectRatioLayout extends RelativeLayout {

	private boolean isRatioHeightToWidth = true;
	private float aspectRatio = -1;

	public AspectRatioLayout(Context context) {
		super(context);
	}

	public AspectRatioLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(attrs);
	}

	public AspectRatioLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(attrs);
	}

	private void init(AttributeSet attrs) {
		TypedArray styledAttrs = getContext().obtainStyledAttributes(attrs, R.styleable.AspectRatioLayout);
		isRatioHeightToWidth = styledAttrs.getBoolean(R.styleable.AspectRatioLayout_isRatioHeightToWidth, true);
		aspectRatio = styledAttrs.getFloat(R.styleable.AspectRatioLayout_aspectRatio, 1);
		styledAttrs.recycle();
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		if (aspectRatio <= 0) {
			super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			return;
		}
		if (isRatioHeightToWidth) {
			int originalWidth = MeasureSpec.getSize(widthMeasureSpec);
			int calculatedHeight = (int) (originalWidth * aspectRatio);
			super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(calculatedHeight, MeasureSpec.EXACTLY));
		} else {
			int originalHeight = MeasureSpec.getSize(heightMeasureSpec);
			int calculatedWidth = (int) (originalHeight * aspectRatio);
			super.onMeasure(MeasureSpec.makeMeasureSpec(calculatedWidth, MeasureSpec.EXACTLY), heightMeasureSpec);
		}
	}

	public void setAspectRatio(float aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public void setRatioHeightToWidth(boolean ratioHeightToWidth) {
		isRatioHeightToWidth = ratioHeightToWidth;
	}

}
