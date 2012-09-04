package com.duckduckgo.mobile.android.container;

import java.util.Set;

import com.duckduckgo.mobile.android.adapters.MainFeedAdapter;
import com.duckduckgo.mobile.android.tasks.MainFeedTask;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.widget.ArrayAdapter;

public class DuckDuckGoContainer {

	public boolean webviewShowing = false;
	public boolean prefShowing = false;
	
	public Drawable progressDrawable, searchFieldDrawable;
	
	public SharedPreferences sharedPreferences;
	
	public ArrayAdapter<String> recentSearchAdapter = null;
	public Set<String> recentSearchSet = null;
	
	public MainFeedAdapter feedAdapter = null;
	public MainFeedTask mainFeedTask = null;
	
	public boolean feedItemLoading = false;
}