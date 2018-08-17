package com.f22labs.darthensondemo;

import android.os.Parcelable;
import android.support.annotation.Nullable;

import dart.BindExtra;
import dart.DartModel;

// Model used to pass the values to DetailsActivity

@DartModel        // This annotation is necesary for all the navigation models
public class DetailsActivityNavigationModel {

	public @BindExtra    // Replaces @InjectExtra annotation
	boolean isSuccess = false;

	public @BindExtra
	Parcelable user;

	public @Nullable	// @Nullable works in the same way as before
	@BindExtra
	String extraText;
}
