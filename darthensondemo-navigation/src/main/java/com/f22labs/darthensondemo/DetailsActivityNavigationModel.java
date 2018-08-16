package com.f22labs.darthensondemo;

import android.os.Parcelable;
import android.support.annotation.Nullable;

import dart.BindExtra;
import dart.DartModel;

@DartModel
public class DetailsActivityNavigationModel {

	public @BindExtra boolean isSuccess = false;

	public @BindExtra
	Parcelable user;

	public @Nullable
	@BindExtra String extraText;
}
